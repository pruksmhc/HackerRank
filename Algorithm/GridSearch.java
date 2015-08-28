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
        //go thorugh. 
        //for the amount of times, check. 
        int numTests = Integer.parseInt(scan.next()); //get the numTests 
     //   System.out.println("Num tests "+ numTests); 
        for (int i = 0; i < numTests; i++) {
            int numBiggerRows = Integer.parseInt(scan.next());
        //      System.out.println("Num of rows in bigger is "+ numBiggerRows); 
            int numBiggerCols = Integer.parseInt(scan.next());
         //   System.out.println("Num of cols in bigger is "+ numBiggerCols); 
             int[][] biggerArray = new int[numBiggerRows][numBiggerCols]; 
                for (int j = 0; j < numBiggerRows; j++) {
                      String row = scan.next(); 
                  //      System.out.println("The line being examined is "+row); 
                    for(int k = 0 ; k < numBiggerCols; k++){                        
                 //       System.out.println("Instering"+ row.charAt(k) ); 
                    biggerArray[j][k] = Character.getNumericValue(row.charAt(k));  
                        
                    //    System.out.println("I have now inserted"+ biggerArray[j][k] ); 
                }
                }
                int numSmallerRows = Integer.parseInt(scan.next()); 
                int numSmallerCols = Integer.parseInt(scan.next()); 
             int[][] smallerArray = new int[numSmallerRows][numSmallerCols]; 
                 for (int m = 0; m < numSmallerRows; m++) {
                                             String row = scan.next(); 
                 //       System.out.println("The line being examined is "+row); 
                    for(int n = 0 ; n < numSmallerCols; n++){

                    smallerArray[m][n] = Character.getNumericValue(row.charAt(n)); 
            //            System.out.println("I have now inserted"+ smallerArray[m][n] );  
                }
                }
                checkSubset(biggerArray, smallerArray, numSmallerRows, numSmallerCols);
            }
        }

  

    private static void checkSubset(int[][] biggerArray, int[][] smallerArray, int smallerArrayRows, int smallerArrayCols){
        boolean isPotential = true; 
        int row = 0; 
        int col = 0; 
        for(int i = 0; i < biggerArray.length;i++){
            for (int j = 0; j <biggerArray[0].length; j++){ 
           //     System.out.println("Bigger array being examined is "+biggerArray[i][j]); 
                if(biggerArray[i][j] == smallerArray[0][0]){
               //     System.out.println("FOUND A POTENTIAL MATCH"); 
                 //    System.out.println("Bigger array being examined is "+biggerArray[i][j]); 
                     //get the row and columns 
                    row = i; 
                    col = j; 
                    //check if the rest of the smaller array matches with the bigger one. 
                    for(int m = 0 ; m < smallerArray.length; m++){
                        if(!isPotential){
                            isPotential = true; 
                      //      System.out.println("isPotential is true again:"); 
                            break; 
                        }
                        for(int n = 0; n < smallerArray[0].length; n++){
                     
                           // System.out.println("i is "+i +"and row is "+row); 
                             if((m < smallerArray.length) && (n < smallerArrayCols) && (m+row < biggerArray.length) &&(n+col < biggerArray[0].length)){ 
         //System.out.println("Comparing big array: "+ biggerArray[m+row][n+col]+" and small array's :"+smallerArray[m][n]); 
                       //          System.out.println("n is "+n + " and m is "+m); 
                           
                           if(biggerArray[m+row][n+col] != smallerArray[m][n]){ 
                       //         System.out.println("Should skip the rest of the way through, change isPotential to false."); 
                               isPotential = false; 
                           //     System.out.println("not a match, move on"); 
                               break;  
                             }
                             if((m == smallerArray.length-1) && (n == smallerArray[0].length -1)){
                                System.out.println("YES"); 
                                //has now parsed to the end of the smaller array, has bene successful. 
                                return; 
                             }
                                 
                            }
 
                        }
                    }
                }
                   
    }
        }
        System.out.println("NO"); 
    }
}
     