import java.util.*;

public class q10_a1{

public static void main(String[] args) {
  // write your code here 
   Scanner scn = new Scanner(System.in);
    int n  = scn.nextInt();
      
      
 for(int div=2;div<=n;div++){
     while(n%div==0){
         n=n/div;
         System.out.println(div);
     }
 }
     
 }
}
