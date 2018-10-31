/*

*/
class Pattern1 {
    public static void main(String args[]) {
        
       int n=7,k=0;
       for(int i=0;i<7;i++)
       {     k=n;
           for(int j=0;j<=i;j++)
           {
           
               System.out.print(k);
               k--;
           }
           System.out.print("\n");
       }
    }
}
