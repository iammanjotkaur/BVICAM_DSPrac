<<<<<<< HEAD
﻿class Pattern5
{
    public static void main(String []args)
    {
        
int n=7,k=1;
       for(int i=0;i<n;i++)
       {     
           
           for(int j=0;j<n;j++)
=======
/*
*
***
***** 
******* 
*********

*/
public class Pattern5 {
    public static void main(String args[]) {
        
       int n=7,k=1;
       for(int i=0;i<7;i++)//O(n^2)
       {     
           
           for(int j=0;j<k;j++)//O(n)
>>>>>>> 3cf33ccef4f8f6cb891c9411614bdbf8754953bf
           {
           
               System.out.print("*");
               
           }k=k+2;
           System.out.print("\n");
       }
    }

}