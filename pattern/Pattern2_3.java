/*
10101010
 101010
  1010
   10
   1
   0
   10
  1010
 101010
10101010
*/
class Pattern2_3
{
    public static void main(String[]args)
    {
        int n=4,space=0,row=(2*n)+2,times=n;
    for(int i=0;i<row;i++)//O(n^2)
    {
        
        
        if(i<row/2-1)
        {
            for(int j=0;j<space;j++)//O(n)
            System.out.print(" ");
            for(int k=0;k<times;k++)//O(n)
                System.out.print("10");
            space++;
            times--;
        }
        else if(i==row/2-1)
        {
             for(int j=0;j<space;j++)//O(n)
            System.out.print(" ");
            System.out.print("1");
        }
         else if(i==row/2)
        {
             for(int j=0;j<space;j++)//O(n)
            System.out.print(" ");
            System.out.print("0");
             times=1;
             space--;
        }
        else
        {
            
            for(int j=0;j<space;j++)//O(n)
            System.out.print(" ");
             for(int k=0;k<times;k++)//O(n)
                System.out.print("10");
            space--;
            times++;
        }
System.out.print("\n");
    }
    }
}
