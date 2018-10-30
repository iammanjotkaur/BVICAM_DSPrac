public class MyClass {
    public static void main(String args[]) {
        
       int n=9,k=1;
       for(int i=0;i<n;i++)
       {     
         if(i<n/2)
           {for(int j=1;j<=k;j++)
           {
               System.out.print(j);
               
           }k=k+2;}
           else
           
           {for(int j=1;j<=k;j++)
           {
               System.out.print(j);
               
           }k=k-2;}
           System.out.print("\n");
       }
    }
}
