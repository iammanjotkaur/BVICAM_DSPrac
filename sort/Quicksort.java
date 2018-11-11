import java.util.Scanner;  
class Quicksort
{
    static void swap(int input [],int x,int y)
    {
        int temp=input[x];
        input[x]=input[y];
        input[y]=temp;
    }
    static void sort(int input[],int low,int high)
    {
       if(low<high)
       {
           int pi=partition(input,low,high);
           sort(input,low,pi-1);
           sort(input,pi+1,high);
       }
    }
   static int partition(int input[],int low,int high)
    {
        int pivot=input[high];
        int i=low-1;
        for(int j=low;j<=high;j++)
        {
            if(input[j]<pivot)
            {
                i++;
                swap(input,i,j);
            }
        }
        swap(input,i+1,pivot);
        return i+1;
    }
    public static void main(String[]args)
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter size:");
        size=sc.nextInt();
        int input[]=new int[size];
         int sorted[]=new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++)
        {
            input[i]=sc.nextInt();
        }
        sort(input,0,size-1);
        System.out.println("Sorted elements:");
        for(int i=0;i<size;i++)
        {
            System.out.println(sorted[i]);
        }
        
    }
}