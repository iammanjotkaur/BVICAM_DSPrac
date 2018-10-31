/*
    1
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6  
   5 6
    6
*/
class Pattern2_9
{
    public static void main(String []args)
    {
        int n=6,space=n-1;
        for(int i=0;i<n;i++)//O(n^2)
        {
            for(int j=0;j<space;j++)//O(n)
                System.out.print(" ");
            for(int k=1;k<=i+1;k++)//O(n)
                System.out.print(k+" ");
            space--;
            System.out.print("\n");
        }
        space=0;
        for(int i=1;i<=n;i++)//O(n^2)
        {
            for(int j=0;j<=space;j++)//0(n)
                System.out.print(" ");
            for(int k=i+1;k<=n;k++)//0(n)
                System.out.print(k+" ");
            space++;
            System.out.print("\n");
        }
        
    }

}
