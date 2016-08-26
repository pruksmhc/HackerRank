import java.util.*;
public class Solution {
       
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //find, for the first coach, the first, third, and fifth highest, and then add them  together. 	
        ArrayList<Integer> numPoints = new ArrayList<Integer>(); 
        for (int i =0; i < 10; i++) {
              numPoints.add(in.nextInt());  //adding the numberpoints ot the arraylist. 
        }
        Collections.sort(numPoints); //sort the arraylist 
        Collections.reverse(numPoints); 
        int highestPoints = 0; 
        highestPoints += numPoints.get(0); 
        highestPoints += numPoints.get(2); 
        highestPoints += numPoints.get(4); 
        System.out.println(highestPoints); //this should be the highest combination of points. 

    }
}
