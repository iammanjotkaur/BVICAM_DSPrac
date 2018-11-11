/*

Enter number of rows or col:
4
   1 
  2 2 
 3   3 
4     4 
 3   3 
  2 2 
   1 

*/
import java.util.Scanner;
class Pattern3_2
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter number of rows or col:");
        n=sc.nextInt();
        int row=2*n-1,col=0,space=n-1,k=0,num=1;
        for(int i=0;i<n;i++)
        {
            while(k<space)
            {
                System.out.print(" ");
                k++;
                col++;
            }
            System.out.print(num+" ");
           col=col+2;
            for(int j=col;j<=num+1;j++)
            {
                  System.out.print(" ");
            }
            if(num!=1)
                   System.out.print(num+" ");
            num++;
            k=0;
            space--;
            col=0;
            System.out.print("\n");
        }
        k=n-1;
        space=n-1;
        num=num-2;
        for(int i=0;i<n-1;i++)
        {
            col=0;
            while(k>=space)
            {
                System.out.print(" ");
                k--;
                col++;
            }
            System.out.print(num+" ");
           col=col+2;
            for(int j=col;j<=num+1;j++)
            {
                  System.out.print(" ");
            }
            if(num!=1)
                   System.out.print(num+" ");
            num--;
            k=n-1;
            space--;
            col=0;
            System.out.print("\n");
        }
    }
}