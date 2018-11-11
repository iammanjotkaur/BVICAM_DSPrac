/*
Enter number of rows or col:
4
1     1 
 2   2 
  3 3 
   4 
  3  3 
 2    2 
1      1 


*/
import java.util.Scanner;
class Pattern3_7
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter number of rows or col:");
        n=sc.nextInt();
        int space=n,k=n-1,num=1,col;
        for(int i=0;i<n;i++)
        {
            col=0;
            while(k>=space)
            {
                System.out.print(" ");
                k--;
                col++;
            }
            System.out.print(num+" ");
           col=col+1;
            for(int j=col;j<=n-i;j++)
            {
                  System.out.print(" ");
            }
            if(num!=n)
                   System.out.print(num+" ");
            num++;
            k=n-1;
            space--;
            col=0;
            System.out.print("\n");
        }
        num-=2;
        k=0;
        space=n-2;
         for(int i=0;i<n-1;i++)
        {
            col=0;
             while(k<space)
            {
                System.out.print(" ");
                k++;
                col++;
            }
            System.out.print(num+" ");
           col=col+1;
            for(int j=col;j<n+i;j++)
            {
                  System.out.print(" ");
            }
            if(num!=4)
                   System.out.print(num+" ");
            num--;
            k=0;
            space--;
            col=0;
            System.out.print("\n");
        }
    }
}