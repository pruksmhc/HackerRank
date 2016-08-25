import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays; 
import java.lang.Integer; 
import java.lang.Character;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numTests = Integer.parseInt(scan.next()); //get the numTests 
        for (int i = 0; i < numTests; i++) {
            int numBiggerRows = Integer.parseInt(scan.next());
            int numBiggerCols = Integer.parseInt(scan.next());
            int[][] biggerArray = new int[numBiggerRows][numBiggerCols]; 
            for (int j = 0; j < numBiggerRows; j++) {
                String row = scan.next(); 
                for (int k = 0 ; k < numBiggerCols; k++) {                        
                    biggerArray[j][k] = Character.getNumericValue(row.charAt(k));  
                }
            }
            int numSmallerRows = Integer.parseInt(scan.next()); 
            int numSmallerCols = Integer.parseInt(scan.next()); 
            int[][] smallerArray = new int[numSmallerRows][numSmallerCols]; 
            for (int m = 0; m < numSmallerRows; m++) {
                String row = scan.next(); 
                for (int n = 0 ; n < numSmallerCols; n++) {
                    smallerArray[m][n] = Character.getNumericValue(row.charAt(n)); 
                }
            }
            checkSubset(biggerArray, smallerArray);
        }
    }

  

    private static void checkSubset(int[][] biggerArray, int[][] smallerArray){
        boolean isPotential = true; 
        int row = 0; 
        int col = 0; 
        for (int i = 0; i < biggerArray.length; i++) {
            for (int j = 0; j < biggerArray[0].length; j++){ 
                if (biggerArray[i][j] == smallerArray[0][0]) {
                    row = i; 
                    col = j; 
                    for (int m = 0 ; m < smallerArray.length; m++) {
                        if (!isPotential) {
                            isPotential = true; 
                            break; 
                        }
                        for (int n = 0; n < smallerArray[0].length; n++) {
                            if ((m < smallerArray.length) &&
                                (n < smallerArrayCols) && (m+row < biggerArray.length) &&
                                (n+col < biggerArray[0].length
                            )) { 
                           if (biggerArray[m+row][n+col] != smallerArray[m][n]) { 
                               isPotential = false; 
                               break;  
                             }
                           if((m == smallerArray.length-1) && (n == smallerArray[0].length -1)){
                                return; 
                            }
                        }
                    }
                 }
            }
        }
    }
  }
}
     
