/*
1
26
3 7 10
4 8 11 13
5 9 12 14 15
*/
import java.lang.Math;
public class Pattern10 {
    public static void main(String args[]) {
        
       int row=5,n=1,k=row-1;
       for(int i=1;i<=row;i++)//O(n^2)
       {   
           n=i;k=row-1;
           for(int j=1;j<=i;j++)//O(n)
           {
               System.out.print(n+" ");
               n=n+k;
               k--;
           }
           
           System.out.print("\n");
       
       
           
       }
    }
}
