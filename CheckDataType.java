/*
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. 
For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

Sample Input
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Sample Output
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

Explanation
 can be stored in a short, an int, or a long.
 is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.
*/
import java.io.*;
import java.util.*;
import java.math.BigInteger; // Import BigInteger class

public class CheckDataType{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            String input = scanner.next(); // Read input as a string
            BigInteger n = new BigInteger(input); // Convert input string to BigInteger

            List<String> compatibleDataTypes = new ArrayList<>();

            if (n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
                compatibleDataTypes.add("byte");
            }
            if (n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                compatibleDataTypes.add("short");
            }
            if (n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                compatibleDataTypes.add("int");
            }
            if (n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                compatibleDataTypes.add("long");
            }

            if (compatibleDataTypes.isEmpty()) {
                System.out.println(n + " can't be fitted anywhere.");
            } else {
                System.out.println(n + " can be fitted in:");
                for (String dataType : compatibleDataTypes) {
                    System.out.println("* " + dataType);
                }
            }
        }

        scanner.close();
    }
}


/*

Input:
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Output:
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

*/
