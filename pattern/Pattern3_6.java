/*
Enter number of rows or col:
4
12344321
123**321
12****21
1******1


*/
import java.util.Scanner;
class Pattern3_6
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter number of rows :");
        n=sc.nextInt();
        int star=0,k,count;
        for(int i=0;i<n;i++)
        {
            k=0;
            count=1;
            for(int j=1;j<=n-star/2;j++)
            {
                System.out.print(count);
                count++;
            }
            while(k<star)
            {
                 System.out.print("*");
                k++;
            }
            for(int j=n-star/2;j>=1;j--)
            {
                System.out.print(j);
            }
            star=star+2;
             System.out.print("\n");

        }
    }
}