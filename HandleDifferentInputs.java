import java.io.*;
import java.util.*;

public class HandleDifferentInputs{

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        
        
        int N=Integer.parseInt(br.readLine().trim());
        
        double D= Double.parseDouble(br.readLine().trim());
        
        String S= br.readLine();
        
        System.out.println("String: "+ S);
        System.out.println("Double: "+ D);
        System.out.println("Int "+ N);
    }
}

/* 
Input: 
28
14.5
Welcome to Sanjay's Java Learning

Output:
String: Welcome to Sanjay's Java Learning
Double: 14.5
Int 28

*/
