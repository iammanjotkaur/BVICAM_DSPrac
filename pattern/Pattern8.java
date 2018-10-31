/*
1
123
12345 
1234567 
123456789 
1234567 
12345
123
1
*/
public class Pattern8 {
    public static void main(String args[]) {
        
       int n=9,k=1;
       for(int i=0;i<n;i++)//O(n^2)
       {     
         if(i<n/2)
           {for(int j=1;j<=k;j++)//O(n)
           {
               System.out.print(j);
               
           }k=k+2;}
           else
           
           {for(int j=1;j<=k;j++)//O(n)
           {
               System.out.print(j);
               
           }k=k-2;}
           System.out.print("\n");
       }
    }
}
