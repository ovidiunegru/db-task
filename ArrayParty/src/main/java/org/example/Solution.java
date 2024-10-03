package org.example;

import java.util.*;

class Solution {

    public int solution(int[] A) {
        Map<String, List<Integer>> pairMap = new HashMap<>();

        if (A == null || A.length < 2) {
            return -1;
        }
        // Create the map
        for (int num : A) {
            String key = getKey(num);

            if (!pairMap.containsKey(key)) {
                pairMap.put(key, new ArrayList<>());
            }

            pairMap.get(key).add(num);
        }

        int current, max = -1;

        //search for biggges between the pairs
        for (List<Integer> group : pairMap.values()) {
            if (group.size() > 1) {
                int biggest = Integer.MIN_VALUE;
                int secondBiggest = Integer.MIN_VALUE;

                for (int num : group) {
                    if (num > biggest) {
                        secondBiggest = biggest;
                        biggest = num;
                    } else if (num > secondBiggest) {
                        secondBiggest = num;
                    }
                }

                current = biggest + secondBiggest;
                max = Math.max(max, current);
            }
        }

        return max;
    }

    // Generate map key
    private String getKey(int nr) {
        return getFirst(nr) + "-" + (nr % 10);
    }

    // Get fist element
    private int getFirst(int nr) {
        while (nr >= 10) {
            nr /= 10;
        }
        return nr;
    }
}