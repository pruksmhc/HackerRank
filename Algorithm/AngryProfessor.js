import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays; 
import java.lang.Integer; 


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        //go thorugh. 
        //for the amount of times, check. 
        int numTests = Integer.parseInt(scan.next()); //get the numTests 
        System.out.println("Num tests "+ numTests); 
        for (int i = 0; i < numTests; i++) {
            int numBiggerRows = Integer.parseInt(scan.next());
              System.out.println("Num of rows in bigger is "+ numBiggerRows); 
            int numBiggerCols = Integer.parseInt(scan.next());
            System.out.println("Num of cols in bigger is "+ numBiggerCols); 
             int[][] biggerArray = new int[numBiggerRows][numBiggerCols]; 
                for (int j = 0; j < numBiggerRows; j++) {
                    for(int k = 0 ; k < numBiggerCols; k++){
                        System.out.println("Inserting "+Integer.parseInt(scan.next()); 
                    biggerArray[j][k] = Integer.parseInt(scan.next());  
                        System.out.println("Instering"+ biggerArray[j][k] ); 
                }
                }
                int numSmallerRows = Integer.parseInt(scan.next()); 
                int numSmallerCols = Integer.parseInt(scan.next()); 
             int[][] smallerArray = new int[numSmallerRows][numSmallerCols]; 
                 for (int m = 0; m < numSmallerRows; m++) {
                    for(int n = 0 ; n < numSmallerCols; n++){
                    smallerArray[m][n] = Integer.parseInt(scan.next());   
                }
                }
                checkSubset(biggerArray, smallerArray, numSmallerRows, numSmallerCols);
            }
        }

  

    private static void checkSubset(int[][] biggerArray, int[][] smallerArray, int smallerArrayRows, int smallerArrayCols){
        int row = 0; 
        int col = 0; 
        for(int i = 0; i < biggerArray.length;i++){
            for (int j = 0; j <biggerArray[0].length; j++){
                if(biggerArray[i][j] == smallerArray[0][0]){
                    System.out.println("FOUND A POTENTIAL MATCH"); 
                    row = i; 
                    col = j; 
                }
                    //mark the columns +rows. 
                    //if the biggerarray has the same instnac eof the smaller array., tehn check by row. 
                    //goign through thesmamller array. 
                    int differenceRows = i - row; 
                int differenceCols = j - col; 
                    if((differenceRows < smallerArray.length) && (differenceCols < smallerArrayCols)){
                       System.out.println("Not yet out of bounds for smaller array, which has length of "+ smallerArray.length +
                            "rows and "+smallerArrayCols +" columns, while i is "+i +"and j is "+ j); 
                            if(biggerArray[i][j] != smallerArray[i-row][j-col]){
                                System.out.println("not a match, move on"); 
                               break;  
                            }
                             System.out.println("Still a match"); 
                             if((differenceRows == smallerArray.length-1) && (differenceCols == smallerArray[0].length -1)){
                                System.out.println("YES"); 
                                //has now parsed to the end of th esmalelr array, has bene successful. 
                                return; 
                             }
                        }                     
                }
            }
            System.out.println("NO"); //there were no potential matchews found. 
        }


    }
      
