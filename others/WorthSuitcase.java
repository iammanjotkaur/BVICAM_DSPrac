import java.util.Scanner;
import java.lang.Math;
class WorthSuitcase
{
    public static void swap(float arr[],int x,int y)
    {
        float temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void swap(int arr[],int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[]args)
    {
        int nofitems,suitcase;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nNumber of items:");
        nofitems=sc.nextInt();
        int space[]=new int[nofitems];
        int worth[]=new int[nofitems];
        System.out.println("\nEnter space of items:");
        for(int i=0;i<nofitems;i++)
        {
            space[i]=sc.nextInt();
        }
        System.out.println("\nEnter worth of items:");
        for(int i=0;i<nofitems;i++)
        {
            worth[i]=sc.nextInt();
        }
        System.out.println("\nEnter space of suitcase:");
         suitcase=sc.nextInt();
        float worthperspace[]=new float[nofitems];
        for(int i=0;i<nofitems;i++)
        {
            worthperspace[i]=worth[i]/(float)space[i];
        }
        
        for(int i=0;i<nofitems;i++)
        {
            for(int j=i;j<nofitems-1;j++)
            {
                if(worthperspace[j]<worthperspace[j+1])
                {
                    swap(worthperspace,j,j+1);
                    swap(space,j,j+1);
                }
            }
        }
        int tempspace=space[0],totalworth=0,k=0;
        while(tempspace<=suitcase)
        {
            totalworth=totalworth+(int)((worthperspace[k])*(float)space[k]);
            tempspace=tempspace+space[k+1];
            k++;
        }
        System.out.println("\nMaximum worth of suitcase is:"+totalworth);
        
    }
}