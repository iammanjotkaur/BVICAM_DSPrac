import java.util.Scanner;  
class Heapsort
{
    static int[] swap(int input[],int x,int y)
    {
        int temp=input[x];
        input[x]=input[y];
        input[y]=temp;
        return input;        
    }
   static int[] heapify(int input[],int n,int root)
    {
        int max=root;
        int left=2*root+1;
        int right=2*root+2;
        if(input[left]>input[max])
            max=left;
        else if(input[right]>input[max])
            max=right;
        if(max!=root)
        {
            input=swap(input,root,max);
            input=heapify(input,n,max);
        }        
    }
   static int[] sort(int input[],int n)
    {
        int parent=n/2-1;
        for(int i=parent;i>=0;i--)
            input=heapify(input,n,i);
        for(int j=n-1;j>=0;j--)
        {
            input=swap(input,j,0);
            input=heapify(input,j,0);
        }
        return input;
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
        sorted=sort(input,size);
        System.out.println("Sorted elements:");
        for(int i=0;i<size;i++)
        {
            System.out.println(sorted[i]);
        }
    }
        
}