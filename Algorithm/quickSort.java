import java.util.*;
public class Solution {
       
          static void partition(int[] ar) {
              List smallerPartition = new ArrayList<Integer>(); 
              List biggerPartition = new ArrayList<Integer>(); 
              for(int i = 1; i < ar.length; i++){
                  if(ar[i] < ar[0]){
                      smallerPartition.add(ar[i]); 
                  }else if(ar[i] > ar[0]){
                      biggerPartition.add(ar[i]);                    
                  }
                  
              }
              
               smallerPartition.add(ar[0]); 
               smallerPartition.addAll(biggerPartition);
              int[] ret = new int[smallerPartition.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = (int) smallerPartition.get(i);
    }
             printArray(ret);
                    
       }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
