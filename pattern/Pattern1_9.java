/*
1
4 9 16
25 36 49 64 81
100 121 144 169 196 225 256
289 324 361 400 441 484 529 576 625
*/
import java.lang.Math;
public class Pattern9 {
    public static void main(String args[]) {
        
       int n=25,k=1,row=(int)Math.sqrt(n),count=1;
       for(int i=0;i<row;i++)//O(n^2)
       {   
           for(int j=0;j<k;j++)//O(n)
           {
               System.out.print(count*count+" ");
               count++;
           }
           k+=2;
           System.out.print("\n");
       
       
           
       }
    }
}
