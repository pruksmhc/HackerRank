
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList<BigDecimal> decimals = new ArrayList<>(); 
        while(scan.hasNext()){       
               decimals.add(new BigDecimal(scan.next())); 
        }
        decimals.remove(0); 
        Collections.sort(decimals); 
        for (int i = decimals.size()-1; i > -1; i--){
                  System.out.println(decimals.get(i).toString());  
            //when inserting into th earray, check wher eit stands. 
    }
}
}