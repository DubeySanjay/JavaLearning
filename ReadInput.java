/* Read input from stdin is by using the Scanner class and specifying the Input Stream as System.in
 * Alternatively, you can use the BufferedReader class.
 */
import java.util.Scanner;

public class ReadInput {
	public static void main(String[]args) {
		System.out.println("This program takes an input in form of String and Integer.");
		System.out.println();

    /* if you do not enter System.in or pass it as argument.
        * you would receive following error:
        * error: no suitable constructor found for Scanner()
        */

		Scanner parser=new Scanner(System.in);
		
		String name=parser.next();
		int age=parser.nextInt();
		
		System.out.println("Input for name:"+name);
		System.out.println("Input age:"+age);
		
		
	}
}

/*
 * Output: 

This program takes an input in form of String and Integer.

sanjay
28
Input for name:sanjay
Input age:28
*/
