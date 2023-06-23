/*
Task :
Given an integer, N , perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.
Input Format
A single line containing a positive integer, n.

Constraints:
1<=n<=100

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

Imp: when importing input stream readers
Please make sure that BufferedReader is from java.io package while Scanner is from java.util package.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LogicalFlow {

	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		br.close();
		if ((N%2==1) || ((N%2!=1) && (6<=N && N<=20))){
            System.out.println("Weird");
        
        }
        if (((N%2!=1)&&(2<=N && N<=5))||((N%2!=1)&&(N>20))){
            System.out.println("Not Weird");
        }
	}
	
}

/*
Output:
In: 24
Out: Not Weird

In: 3
Out: Weird
*/
