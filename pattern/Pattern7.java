/*
11111 
1   1 
1   1 
1   1 
11111
*/
public class Pattern7 {
    public static void main(String args[]) {
        
       int n=4,k=1;
       for(int i=0;i<n;i++)//O(n^2)
       {     
           for(int j=0;j<n;j++)//O(n)
           {
               if((i==0)||(j==0)||(i==n-1)||(j==n-1))
                System.out.print("1");
                else
                System.out.print(" ");
               
           }
           System.out.print("\n");
       }
    }
}
