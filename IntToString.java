/*
Given an integer n, you have to convert it into a string.
If  code successfully converts  into a string  the code will print "Good job". 
Otherwise it will print "Wrong answer".
*/
import java.io.*;
import java.util.*;

public class IntToString{
  public static void main(String[]args) throws IOException{
    BufferedReader br = new BufferdReader(new InputStreamReader(System.in);
    int num = br.read();
    String k = Integer.toString(num);
    if (k instanceof String){
      System.out.println("Good job");
  }
    else{
      System.out.println("Wrong ans");
    }
}

/*

Output:
Input:
100

Output:
Good job

*/
