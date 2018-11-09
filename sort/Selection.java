import java.util.Scanner;
class Selection
{
   public static int[] swap(int temp[],int x,int y)
   {
       int t=temp[x];
       temp[x]=temp[y];
       temp[y]=t;
       return temp;
   }
    public static void main(String[]args)
    {
         int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        size=sc.nextInt();
        int input[]=new int[size];
         int sorted[]=new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++)
        {
            input[i]=sc.nextInt();
        }
       for(int i=0;i<size-1;i++)
       {
           int min=i;
           for(int j=i+1;j<size;j++)
           {
               if(input[min]>input[j])
                   min=j;
               
           }
           sorted=swap(input,min,i);
       }
        System.out.println("Sorted elements:");
        for(int i=0;i<size;i++)
        {
         
            System.out.println(sorted[i]);
        }

    }
}