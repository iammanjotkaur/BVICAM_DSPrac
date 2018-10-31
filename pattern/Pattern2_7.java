/*
1
121
12321 
1234321 
123454321

*/
class Pattern2_7
{
    public static void main(String []args)
    {
        int n=5,k=1;
        for(int i=1;i<=n;i++)//O(n^2)
        {
            for(int j=1;j<=i;j++)//O(n)
            {
                System.out.print(j);
            }
            
            for(int j=i-1;j>=1;j--)//O(n)
            {
                System.out.print(j);
            }
            
            
			System.out.println();
        }
    }

}
