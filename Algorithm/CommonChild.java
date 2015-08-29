import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner ;
import java.lang.String ; 

/**  Non-optimized case 
public class Solution {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in); 
        String  lineOne = scan.next(); 
        String lineTwo = scan.next();       
        checkChild(lineOne, lineTwo); 


    }

    private static void checkChild(String lineOne, String lineTwo){ 
    	int placeholder = 0;  //A placeholder to keep in track of exactly where in the second string is 
    	//being examined. 
    	int maxNumCommonChild = 0; //T
    	for(int i = 0; i < lineOne.length() ; i++){ 
            int maxNumThisChild = 0; 
    		 if (lineTwo.contains(String.valueOf(lineOne.charAt(i)))){
    		 	placeholder = lineTwo.indexOf(String.valueOf(lineOne.charAt(i))); //the placeholder moves to the first occurance in line two.
    		 	maxNumThisChild++; 
    	//	 	System.out.println("THe local maxima is currently "+maxNumThisChild); 
                
  
    		 	for (int j = i+1; j < lineOne.length(); j++){ 
    		 		//CREATE OF AN OFFSET 
    		 	//	System.out.println("The value in line One being examined is "+ String.valueOf(lineOne.charAt(i))); 
    		 		String lineExamined = lineTwo.substring(placeholder, lineTwo.length()); //getting the substring. 

    		 	//	System.out.println("The line being examined is "+lineExamined); 
    		 		if (lineExamined.indexOf(String.valueOf(lineOne.charAt(j))) !=  -1){
    		 		   maxNumThisChild++; //maximum common child. 
    		 	//	   System.out.println("THe local maxima is currently "+maxNumThisChild); 
    		 		   placeholder = lineTwo.indexOf(String.valueOf(lineOne.charAt(j))); 
    		 	//	   System.out.println(lineOne.charAt(j) +
    		 		//    " of the j value of "+j + " is found  at index "
    		 		//    + placeholder +" in line two."); 
    		 		}
    		 	}
    		 }
    		// System.out.println("THe local maxima is "+maxNumThisChild +"and the lgobal maxima is "+ maxNumCommonChild); 
    		 if (maxNumThisChild > maxNumCommonChild){
    		 	maxNumCommonChild = maxNumThisChild; 
    		 }
  
    	}
        System.out.println(maxNumCommonChild); 


    }
}**/

//Optimized verison 
public class Solution {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in); 
        String  lineOne = scan.next(); 
        String lineTwo = scan.next();       
        System.out.println(checkCommonChild(lineOne, lineTwo)); 


    }

public static int checkCommonChild(String lineOne, String lineTwo) {

    int lineOneLength = lineOne.length();
    int lineTwoLength = lineTwo.length();
    int[][] table = new int[lineOneLength +1][lineTwoLength+1];

    for (int i = 0; i < lineOneLength; ++i) {
        for (int j = 0; j < lineTwoLength; ++j) { 
        	//using dynamic programming. 
            table[i+1][j+1] = (lineOne.charAt(i) == lineTwo.charAt(j)) ? table[i][j] + 1 : Math.max(table[i][j+1], table[i+1][j]);
        }
    }

    return table[lineOne][lineTwo];
}
}