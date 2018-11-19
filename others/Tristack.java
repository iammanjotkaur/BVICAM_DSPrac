class Tristack
{
    int size;
    int arr[];
    int top1;
    int top2;
    innt top3;
    int end1;
    int end2;
    int end3;
    public Tristack()
    {
        size=0;
        arr=new int[size];
        top1=-1;
        top2=-1;
        top3=-1;
        end1=-1;
       end2=-1;
        end3=-1;
    }
    
    public Tristack(int size)
    {
        this.size=size;
        arr=new int[size];
        top1=-1;
        if(size%2!=0)
        {
            end1=(size+1)/3-1;
            end3=(size-1)-size/3;
        }
        else
        {
            end1=(size)/3;
            end3=(size)-size/3;
        }
        top3=end1-1;    
        
        top2=size;
        end2=end3; 
    }
    
    public void push1(int ele)
    {
         top1++;
        if(top1==end1)
        {
            top1--;
            System.out.println("\nStack1 full");
            return ;
        }
       
        arr[top1]=ele;
    }
    
    public void push2(int ele)
    {
        
        if(top2==end2)
        {
            System.out.println("\nStack2 full");
           return ;
        }
        top2--;
        arr[top2]=ele;
    }
    
    public void push3(int ele)
    {
         top3++;
        if(top3==end3)
        {
            top3--;
            System.out.println("\nStack3 full");
            return ;
        }
       
        arr[top3]=ele;
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
    public void pop3()
    {
        int part;
        if(size%2==0) 
        part=size/3;
        else
        part=size+1/3;
        if(top3==part)
        {
             System.out.println("\nStack 2 empty");
            System.exit(0);
        }
        top3--;
    }
    public void display()
    {
        System.out.println("\nStack 1");
        for(int i=top1;i>=0;i--)
        {
             System.out.println(arr[i]);
        }
         System.out.println("\nStack 2");
        for(int i=top2;i<size;i++)
        {
             System.out.println(arr[i]);
        }
        int initial;
        if(size%2!=0)
            initial=(size+1)/3-1;
        else
             initial=(size)/3;  
        System.out.println("\nStack 3");
        for(int i=top3;i>=initial;i--)
        {
             System.out.println(arr[i]);
        }
    }
    public static void main(String[]args)
    {
        Tristack t=new Tristack(6);  
        t.push1(5);
        t.push2(6);
        t.push3(9);
        t.display();
        t.push1(4);
        t.push2(7);
        t.push3(8);
        t.display();
        t.push1(10);
        t.push2(11);
        t.push3(12);
        t.display();
        t.pop1();
        t.pop2();
        t.pop3();
        t.display();
    }
}