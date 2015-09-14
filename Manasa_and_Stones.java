/**https://www.hackerrank.com/challenges/manasa-and-stones*/ 

//the number of stones to count for is  n-1, where n is the amount of stones specified. 
//Find the max and min value that the nth stone can be. Then, subtract the bigger 
//of the two variables (a and b) with the other. 
//while the current value of the nth stone is less than the max, add 
//the difference to the sum. 


import java.util.*;
public class Solution {
       
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numExperiments = in.nextInt(); 
        for(int i = 0; i < numExperiments; i++){
        int numStones = in.nextInt()-1;
        int a = in.nextInt(); 
        int b = in.nextInt();  
        int biggerDifference = Math.max(a, b); 
        int smallerDifference = Math.min(a,b); 
        Integer currentValue = (Integer) smallerDifference * numStones; 
        Integer maxValue = (Integer) biggerDifference * numStones; 
        int difference  = biggerDifference - smallerDifference; 
        String valueOfStone = currentValue.toString();
         	while(currentValue < maxValue){
         		currentValue+= difference; 
         		valueOfStone+=" "+ currentValue.toString(); 

            }
         	System.out.println(valueOfStone); 
         }
        }
      
    }
