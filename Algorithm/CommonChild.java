import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner ;
import java.lang.String ; 

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
            table[i+1][j+1] = (lineOne.charAt(i) == lineTwo.charAt(j)) ? table[i][j] + 1 : Math.max(table[i][j+1], table[i+1][j]);
        }
    }

    return table[lineOne][lineTwo];
}
}
