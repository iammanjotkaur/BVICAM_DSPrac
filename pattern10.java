import java.lang.Math;
public class MyClass {
    public static void main(String args[]) {
        
       int row=5,n=1,k=row-1;
       for(int i=1;i<=row;i++)
       {   
           n=i;k=row-1;
           for(int j=1;j<=i;j++)
           {
               System.out.print(n+" ");
               n=n+k;
               k--;
           }
           
           System.out.print("\n");
       
       
           
       }
    }
}
