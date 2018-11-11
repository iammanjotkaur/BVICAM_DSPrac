/*
12344321 
123**321 
12****21
1******1

*/
public class Pattern6 {
    public static void main(String args[]) {
        
       int n=4,k=1;
       for(int i=n;i>=1;i--)//O(n^2)
       {     
           for(int j=1;j<=n;j++)//O(n)
           {
                if(j<=i)
                 System.out.print(j);
                 else
                  System.out.print("*");
                
           }
           for(int j=n;j>=1;j--)//O(n)
           {
                if(j<=i)
                 System.out.print(j);
                 else
                  System.out.print("*");
                
           }
           System.out.print("\n");
       }
    }
}
