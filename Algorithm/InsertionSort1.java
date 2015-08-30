import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList; 
import java.lang.String; 

public class Solution {
    
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); 
        //finding the amoutn of elements in the array. 
       ArrayList<Integer> ar = new ArrayList<Integer>() ;
        //getting the array. 
         for(int i =0; i <s; i++){
         ar.add(in.nextInt()); //insert the arrays.     
         }
        sortArray(ar);
    }
    
    
    private static void sortArray(ArrayList<Integer> arr) {
        int tempVar = arr.get(arr.size() -1); 
        //store in temporary value. 
      for(int n = arr.size()-1; n > 0; n--){
        if (arr.get(n-1) > tempVar){
            arr.set(n, arr.get(n-1)); //shift to the right.
             printArray(arr); 
      }else{
                  arr.set(n, tempVar);
              printArray(arr); 
         return;  
             }
        
         }
       arr.set(0, tempVar); 
          printArray(arr); 
      }
    
    private static void printArray(ArrayList<Integer> array){
         String str = ""; 
          for(int i = 0; i < array.size(); i++){ 
            str += String.valueOf(array.get(i))+" "; 
          }
         System.out.println(str);
    }
    
    
   
    
    
}
 