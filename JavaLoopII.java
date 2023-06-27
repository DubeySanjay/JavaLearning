/*
Problem: 
Use the integers a, b, and n to create the following series:
(a+2^0 * b),(a+2^0 * b+ 2^1 * b),(a+2^0 * b + 2^(n-1) *b)
You are given q queries in the form of a, b, and n. 
For each query, print the series corresponding to the given a, b, and  n values as a single line of n space-separated integers.

Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

*/


import java.io.*;
import java.util.*;

public class JavaLoopII {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            for (int j = 0; j < c; j++) {
                int value = a;
                for (int k = 0; k <= j; k++) {
                    value += Math.pow(2, k) * b;
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
        br.close();
    }
}

/*

nput (stdin):

2
0 2 10
5 3 5

Output:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

*/
