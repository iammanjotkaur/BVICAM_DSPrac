/*
***** 
 ****
  *** 
   ** 
    * 
   ** 
  ***
 **** 
*****
*/
class Pattern2_4
{
    public static void main(String []args)
    {
        int n=6,space=0;
        for(int i=0;i<n;i++)//O(n^2)
        {
            for(int j=0;j<space;j++)//O(n)
                System.out.print(" ");
            for(int k=0;k<n-i;k++)//O(n)
                System.out.print("*");
            space++;
            System.out.print("\n");
        }space=n-2;
       for(int i=n-2;i>=0;i--)//O(n^2)
        {
            for(int j=0;j<space;j++)//O(n)
                System.out.print(" ");
            for(int k=0;k<n-i;k++)//O(n)
                System.out.print("*");
            space--;
            System.out.print("\n");
        }
        
    }

}
