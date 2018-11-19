class MultiStack
{
    int size;
    int arr[];
    int top1;
    int top2;
    public MultiStack()
    {
        size=0;
        arr=new int[size];
        top1=-1;
        top2=-1;
    }
    public MultiStack(int size)
    {
        this.size=size;
        arr=new int[size];
        top1=-1;
        top2=size;
    }
    public void push1(int ele)
    {
        if(top1==top2-1)
        {
            System.out.println("\nBoth Stack full");
            System.exit(0);
        }
        top1++;
        arr[top1]=ele;
    }
    public void push2(int ele)
    {
        if(top1==top2-1)
        {
            System.out.println("\nBoth Stack full");
            System.exit(0);
        }
        top2--;
        arr[top2]=ele;
    }
    public void pop1()
    {
        if(top1==-1)
        {
             System.out.println("\nStack 1 empty");
            System.exit(0);
        }
        top1--;
    }
    public void pop2()
    {
        if(top2==size)
        {
             System.out.println("\nStack 2 empty");
            System.exit(0);
        }
        top2++;
    }
    public void display()
    {
        System.out.println("\nStack 1");
        for(int i=top1;i>=0;i--)
        {
             System.out.println(arr[i]);
        }
         System.out.println("\nStack 1");
        for(int i=top2;i<size;i++)
        {
             System.out.println(arr[i]);
        }
    }
    public static void main(String [ ]args)
    {
        MultiStack m =new MultiStack(5);
        m.push1(9);
        m.push1(8);
        m.push2(5);
        m.push2(4);
        m.display();
        m.pop1();
        m.pop2();
        m.display();
    }
}