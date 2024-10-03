package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution instance;
    int[] testArr1 = {130, 191, 200, 10};
    int[] testArr2 = {405, 45, 300, 300};
    int[] testArray3 = {50, 222, 49, 52, 25};
    int[] testArray4 = {30, 909, 3190, 99, 3990, 9009};

    @BeforeEach
    void setUp(){
        instance = new Solution();
    }

    @Test
    void findMaxCorrectTest() {
        assertEquals(140, instance.solution(testArr1));
        assertEquals(600, instance.solution(testArr2));
        assertEquals(9918, instance.solution(testArray4));
    }

    @Test
    void findMaxIncorrectTest() {
        assertEquals(-1, instance.solution(testArray3));
    }

    @Test
    void findMaxEmptyTest() {
        int[] array = {};
        assertEquals(-1, instance.solution(array));
    }

    @Test
    void findMaxNullTest() {
        assertEquals(-1, instance.solution(null));
    }

    @Test
    void findMaxOneEkementTest() {
        int[] array = {100};
        assertEquals(-1, instance.solution(array));
    }
}