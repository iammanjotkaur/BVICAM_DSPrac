/*
7
76
765
7654
76543
765432 
7654321
*/
public class Pattern4 {
    public static void main(String args[]) {
        
       int n=7,k=1;
       for(int i=0;i<7;i++)//O(n^2)
       {     
           
           for(int j=0;j<k;j++)//0(n)
           {
           
               System.out.print("*");
               
           }k=k+2;
           System.out.print("\n");
       }
    }
}
