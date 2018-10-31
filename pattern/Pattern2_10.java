class Pattern2_10
{
    public static void main(String []args)
    {
        int n=5,space=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            if(i<n)
                System.out.print("   ");
            else
                System.out.print("---");
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            space--;
			System.out.println();
        }space=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            if(i==0)
                 System.out.print("---");
               
            else
                System.out.print("   ");
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            space++;
			System.out.println();
        }
    }

}