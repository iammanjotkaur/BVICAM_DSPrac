import java.util.Scanner;
class Merge2sortarrays
{
    public static void main(String[]args)
    {
        int m,n,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter size of first array");
        m=sc.nextInt();
        System.out.println("\nEnter size of second array");
        n=sc.nextInt();
        int first[]=new int[m+n];
        int second[]=new int[n];
        System.out.println("\nEnter first array");
        for( i=0;i<m;i++)
        {
            first[i]=sc.nextInt();
        }
        System.out.println("\nEnter second array");
        for(i=0;i<n;i++)
        {
            second[i]=sc.nextInt();
            first[i+m]=second[i];
        }
         i=0;k=0;j=m;
        while(i<n)
        {
            if(first[j]>first[k])
            {
                second[i]=first[k];
                k++;
                i++;
            }
            else
            {
                second[i]=first[j];
                j++;
                i++;
            }
        }
        
        i=0;
        while((j<n+m)&&(k<n))
        {
            if(first[j]>first[k])
            {
                first[i]=first[k];
                k++;
                i++;
            }
            else
            {
                first[i]=first[j];
                i++;
                j++;
            }
        }
        for( j=m-1;j>=0;j--)
        {
            first[j+n]=first[j];
        }
        for(i=0;i<n;i++)
        {
            first[i]=second[i];
        }
        System.out.println("hdsv");
        
        for( i=0;i<n+m;i++)
            System.out.println(first[i]);
    }
}