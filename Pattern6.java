﻿public class Pattern6 {
    public static void main(String args[]) {
        
       int n=4,k=1;
       for(int i=n;i>=1;i--)
       {     
           for(int j=1;j<=n;j++)
           {
                if(j<=i)
                 System.out.print(j);
                 else
                  System.out.print("*");
                
           }
           for(int j=n;j>=1;j--)
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
