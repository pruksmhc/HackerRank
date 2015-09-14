/**https://www.hackerrank.com/challenges/sherlock-and-the-beast**/
//Decent number has oNLY 3 and 5 as digts, and the number of times 3 apears kis 5. 
//THe number of times 5 appears is divsibile by 3. 

//Is the numbe rof digits divisible by  3, if so, the digits are all 5. This can be a String. 
//If not divisible by 3,  then minus 5, and see if still divsible by 3. If so, make those digits 5, then the rest 3.
//Recursively do this , and if it is above 0, then you know it doesn't work. 
 
 //20 

import java.util.*;
public class Solution {

  public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
        int numExperiments = in.nextInt(); 
        for(int i = 0; i < numExperiments; i++){
        	int num_digits = in.nextInt(); 
        System.out.println(findDecimalInteger(num_digits)); 
       }
   }


 blic static String findDecimalInteger(int num_digits){
        int original_digits = num_digits; 
         int numFives = 0; 
         int numThrees = 0; 
        	StringBuilder s = new StringBuilder(); 
          if(num_digits < 3){
        	//if the number is les than three, off the bat, you know that ther eis 
        	//no possibility of there being a decimal. 
        	return "-1"; 
        } 
        else if(num_digits % 3 ==0){
         numFives = num_digits; 
     }else{ 
    while(num_digits >0){
        if(num_digits % 3 ==0){ 
 numFives  = num_digits;   
            break; 
       } else{ 
            //finally found the number of digits that is divisble by 3.
        num_digits -=5; 
        }
}
        }
  numThrees = original_digits - num_digits; 

          if (num_digits < 0 || numThrees % 5 != 0) {
        return "-1";
    }
		for(int i = 0; i < numFives; i++){
			s.append("5"); 
		}
		for(int i = 0; i <numThrees; i++){
			s.append("3");
		}
        String result = s.toString(); 
		return result; 

    }
}

/**  MORE EFFICIENT WAY 
 import java.util.*;
public class Solution {

  public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
        int numExperiments = in.nextInt(); 
        for(int i = 0; i < numExperiments; i++){
        	int num_digits = in.nextInt(); 
        System.out.println(findDecimalInteger(num_digits)); 
       }
   }



    public static String findDecimalInteger(int num_digits){
        int original_digits = num_digits; 
         int numFives = 0; 
         int numThrees = 0; 
        	StringBuilder s = new StringBuilder(); 
    while(num_digits >0){
        if(num_digits % 3 ==0){ 
 numFives  = num_digits;   
            break; 
       } else{ 
            //finally found the number of digits that is divisble by 3.
        num_digits -=5; 
        }
}
  numThrees = original_digits - num_digits; 

          if (num_digits < 0 || numThrees % 5 != 0) {
        return "-1";
    }
		for(int i = 0; i < numFives; i++){
			s.append("5"); 
		}
		for(int i = 0; i <numThrees; i++){
			s.append("3");
		}
        String result = s.toString(); 
		return result; 

    }
}**/







