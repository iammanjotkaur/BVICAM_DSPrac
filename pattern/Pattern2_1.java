/*
	*
       * * 
      * * * 	
       * * 
	*
*/
class Pattern2_1
{
    public static void main(String []args)
    {
        int n=5,space=2,i=0;
        for(i=0;i<=n/2;i++)//O(n^2)
        {
            for(int j=0;j<space;j++)//O(n)
            {
                System.out.print(" ");
            }
            space--;
            for(int k=0;k<i+1;k++)//O(n)
				System.out.print("* ");
			System.out.println();
        }space=1;
        for(int m=i;m<n;m++)//O(n^2)
        {
            for(int j=0;j<space;j++)//O(n)
            {
                System.out.print(" ");
            }
            space++;
            for(int k=0;k<n-m;k++)//O(n)
				System.out.print("* ");
			System.out.println();
        }
    }

}
