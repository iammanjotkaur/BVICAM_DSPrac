class Heapsort
{
    public int [] heapify(int input[],int n,int root)
    {
        int max=root;
        int left=2*n+1;
        int right=2*n+2;
    }
    public int[] sort(int input[],int n)
    {
        int parent=n/2-1;
        for(int i=parent;i>=0;i--)
            heapify(input,n,i);
        for(int j=n-1;j>=0.j--)
        {
            swap(input,j,0);
            hepaify(input,j,0);
        }
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
         
            System.out.println(sorted[i],size);
        }
    }
        
}