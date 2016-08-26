import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays; 


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        //go thorugh. 
        //for the amount of times, check. 
        int numTests = scan.nextInt(); //get the numTests 
        for (int i = 0; i < numTests; i++) {
            int numBiggerRows = scan.nextInt();
            int numBiggerCols = scan.nextInt();
             int[][] biggerArray = new int[numBiggerRows][numBiggerCols]; 
                for (int j = 0; j < numBiggerRows; j++) {
                    for(int k = 0 ; k < numBiggerCols; k++){
                    biggerArray[j][k] = scan.nextInt(); 
                }
                }
                int numSmallerRows = scan.nextInt(); 
                int numSmallerCols = scan.nextInt(); 
             int[][] smallerArray = new int[numSmallerRows][numSmallerCols]; 
                 for (int m = 0; m < numSmallerRows; m++) {
                    for(int n = 0 ; n < numSmallerCols; n++){
                    smallerArray[m][n] = scan.nextInt();  
                }
                }
                checkSubset(biggerArray, smallerArray);
            }
        }

  

    private void checkSubset(int[][] biggerArray, int[][] smallerArray){
        int row = 0; 
        int col = 0; 
        for(int i = 0; i < biggerArray.length;i++){
            for (int j = 0; j <biggerArray[0].length; j++) {
                if (biggerArray[i][j] == smallerArray[0][0]) {
                    row = i; 
                    col = j; 
                }
                    //mark the columns +rows. 
                    //if the biggerarray has the same instnac eof the smaller array., tehn check by row. 
                    //goign through thesmamller array. 
                    if (i-row < smallerArray.length && j-col < smallerArray[0].length) {
                            if (biggerArray[i][j] != smallerArray[i-row][j-col]) {
                               break;  
                            }
                            if ((i-row) = smallerArray.length-1 && (j - col) = smallerArray[0].length -1) {
                                return; 
                            }
                        }                     
                }
            }
            System.out.println("NO"); //there were no potential matchews found. 
        }


    }
      
