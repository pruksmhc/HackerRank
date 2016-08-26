import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math; 

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan= new Scanner(System.in); 
         BigInteger inputZero = scan.nextBigInteger(); 
         BigInteger inputOne = scan.nextBigInteger();   
         int numToFound = scan.nextInt();    
    }

 

    private static BigInteger fibonaccirecurs(int num, BigInteger inputZero, BigInteger inputOne){
         if (num == 1){
        	return inputZero; 
         } else if(num == 2){
        	return inputOne; 
         } else {
            return (fibonaccirecurs(num-1, inputZero, inputOne)).multiply(fibonaccirecurs(num-1, inputZero, inputOne)).add(fibonaccirecurs(num-2, inputZero, inputOne));  //this should return the fibonnaci sequence. 
        }
    }

}
