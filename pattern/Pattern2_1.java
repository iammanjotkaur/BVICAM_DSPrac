class Pattern2_1
{
    public static void main(String []args)
    {
        int n=5,space=2,i=0;
        for(i=0;i<=n/2;i++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            space--;
            for(int k=0;k<i+1;k++)
				System.out.print("* ");
			System.out.println();
        }space=1;
        for(int m=i;m<n;m++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            space++;
            for(int k=0;k<n-m;k++)
				System.out.print("* ");
			System.out.println();
        }
    }

}