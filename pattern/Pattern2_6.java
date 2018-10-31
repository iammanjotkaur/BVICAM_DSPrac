class Pattern2_6
{
    public static void main(String []args)
    {
        int n=5,space=0;
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<=space;j++)
            System.out.print(" ");
            for(int k=0;k<n-i;k++)
            System.out.print("* ");
            space++;
			System.out.println();
        }
    }

}