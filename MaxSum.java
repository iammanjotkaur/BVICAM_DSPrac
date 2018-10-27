import java.util.Scanner;
class MaxSum
{
    
    public static void main(String[]args)
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter size: ");
        size=sc.nextInt();
        
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int gmax=0,lmax=0,sum=0;
        for(int i=0;i<size;i++)
        {
            lmax=lmax+arr[i];
            if(lmax>gmax)
                gmax=lmax;
            if(lmax<0)
                lmax=0;
            
        }
        System.out.println(gmax+"\n");
        for(int i=0;i<size;i++)
            sum=sum+arr[i];
        for(int i=0;i<size;i++)
        {
            arr[i]=arr[i]*-1;
            lmax=lmax+arr[i];
            if(lmax>gmax)
                gmax=lmax;
            if(lmax<0)
                lmax=0;
            
        }
        System.out.println(gmax+sum);
    }
}