/*
A binary gap within a positive integer N is any maximal sequence of consecutive 
zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 
The number 20 has binary representation 10100 and contains one binary gap of length 1. 
The number 15 has binary representation 1111 and has no binary gaps. 
The number 32 has binary representation 100000 and has no binary gaps.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Solution {
    public static void main(String[]args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Integer num=Integer.parseInt(br.readLine());
        Solution s=new Solution();
        s.solution(num);
    }
    public int solution(int N) {
        String binary=Integer.toBinaryString(N);
        int len =0;
        int maxLength=0;
        int currentLength=0;
        boolean counts=false;
        while(len<binary.length()){
            if(binary.charAt(len)=='0'){
                currentLength++;
            }else{
                if(counts){

                    maxLength=Math.max(currentLength, maxLength);
                }
                currentLength=0;
                counts=true;
            }

            len++;
        }
        // Implement your solution here
        return maxLength;

    }
}
/*
input types: 1041 - to binary: 10000010001
Output: 5
*/
