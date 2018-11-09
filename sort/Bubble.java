import java.util.Scanner;
class Bubble
{
    public static void main(String[]args)
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        size=sc.nextInt();
        int input[]=new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++)
        {
            input[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(input[j]>input[j+1])
                {
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted elements:");
        for(int i=0;i<size;i++)
        {
         
            System.out.println(input[i]);
        }

    }
}