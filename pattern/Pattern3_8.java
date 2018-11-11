/*
Enter number of rows or col:
5
0 
0 2 
0 3 6 
0 4 8 12 
0 5 10 15 20 
*/
import java.util.Scanner;
class Pattern3_8
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter number of rows or col:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.print("\n");
        }
        
    }
}