import java.lang.Math;
public class Pattern9 {
    public static void main(String args[]) {
        
       int n=25,k=1,row=(int)Math.sqrt(n),count=1;
       for(int i=0;i<row;i++)
       {   
           for(int j=0;j<k;j++)
           {
               System.out.print(count*count+" ");
               count++;
           }
           k+=2;
           System.out.print("\n");
       
       
           
       }
    }
}
