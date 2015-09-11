/** The problem is here: https://www.hackerrank.com/challenges/encryption**/ 

import java.util.*;
public class Solution {
       
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String unencryptedText = in.next(); 
        //the length the rows must exceed. 
        double length = Math.sqrt(unencryptedText.length()); 
      int numRows =0; 
      int numCols = 0; 
      //initialize rows and ocls
         if(Math.ceil(length) == length){
        	//if the square root of the text length is a whole number 
        	numRows = (int) length +1; 
        	 numCols = numRows+1; 
        }
        int textplaceholder = 0; 
        while(numRows * numCols <= unencryptedText.length()){
        	numRows++; 
        	numCols++; 
        }
        	//create a grid and place the text into it. 
        	String[][] grid = new String[numRows][numCols]; 
        	  for (int i  = 0; i < numRows; i++){
        	for (int j = 0; j < numCols; j++){

                if(textplaceholder<= unencryptedText.length()-1){ 
        		grid[i][j] = String.valueOf(unencryptedText.charAt(textplaceholder)); 
        		textplaceholder++; 

                }else{
                    grid[i][j] =""; //fill with blank string. 
            		
                }
        	}
        }

        	String encryptedText =""; 
 			for(int i = 0; i < numCols; i++){
 				//for the amount of cols 
                String colsText=""; 
 				for (int j =0; j <numRows; j++){
 				  colsText+=grid[j][i]; 
 				}
 				//after each column, add to the encrypted text 
 				encryptedText+= colsText+" "; 
 			}  
       
        }
    }