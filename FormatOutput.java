import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Java's System.out.printf function can be used to print formatted output. 
The purpose of this exercise is to test your understanding of formatting output using printf.
you must format and print the input to complete the solution.

Input Format:

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

Output Format:

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly 15 characters. 
The second column contains the integer, expressed in exactly 3 digits; 
if the original input has less than three digits, you must pad your output's leading digits with zeroes.

*/

/*
In the System.out.printf statement, the format specifier %-15s is used to format a string (str) 
as left-justified within a 15-character field. The - sign indicates left justification.

The format specifier %03d is used to format an integer (num) as a three-digit decimal number, 
padded with leading zeroes if necessary. The 0 specifies the padding character to be zero, 
and the 3 specifies the minimum width of the field as three characters.

The %n is platform-independent line separator. It inserts a newline character ('\n') to start a new line after the formatted output.

So, when you use System.out.printf("%-15s%03d%n", str, num);, it will format and print the string (str) left-justified 
in a 15-character field, followed by the integer (num) displayed as a three-digit number with leading zeroes if necessary. 
After that, a newline character is added to start a new line for the next output.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("================================");

        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(" ");
            String str = tokens[0];
            int num = Integer.parseInt(tokens[1]);
            System.out.printf("%-15s%03d%n", str, num);
        }

        System.out.println("================================");
        br.close();
    }
}

/* 
input: 
java 100
cpp 65
python 50

Output:
================================
java           100 
cpp            065 
python         050 
================================
*/
