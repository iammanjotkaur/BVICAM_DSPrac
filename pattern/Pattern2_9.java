class Pattern2_9
{
    public static void main(String []args)
    {
        int n=6,space=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<space;j++)
                System.out.print(" ");
            for(int k=1;k<=i+1;k++)
                System.out.print(k+" ");
            space--;
            System.out.print("\n");
        }
        space=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=space;j++)
                System.out.print(" ");
            for(int k=i+1;k<=n;k++)
                System.out.print(k+" ");
            space++;
            System.out.print("\n");
        }
        
    }

}