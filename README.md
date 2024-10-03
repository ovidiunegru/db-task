# db-task

Add tasks for the assignments:

Define and implement a class(es), representing binary tree with integer-values nodes, e.g.

             5

           /       \

       3            2

    /     \

    10        11

Define and implement methods:

find maximum value
calculate tree depth




Exercitiul 2

2 threads ping-pong. One thread prints 'ping', another one prints' pong'. Stop after 5 seconds

Expected output is alternating ping-pong :

ping

pong

ping

pong

ping

pong



Exercitiul 3

There is an array A consisting of N integers. What is the maximum sum of two integers from A that share their first and last digits? For example, 1007 and 167 share their first (1) and last (7) digits, whereas 2002 and 55 do not.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the maximum sum of two integers that share their first and last digits. If there are no two integers that share their first and last digits, the function should return −1.

Examples:

1. Given A = [130, 191, 200, 10], the function should return 140. The only integers in A that share first and last digits are 130 and 10.

2. Given A = [405, 45, 300, 300], the function should return 600. There are two pairs of integers that share first and last digits: (405, 45) and (300, 300). The sum of the two 300s is bigger than the sum of 405 and 45.

3. Given A = [50, 222, 49, 52, 25], the function should return −1. There are no two integers that share their first and last digits.

4. Given A = [30, 909, 3190, 99, 3990, 9009], the function should return 9918.