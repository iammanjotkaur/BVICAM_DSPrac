import java.util.Scanner;
class Stack
{
    private int top;
    private int size;
    private int stack[];;
    public Stack()
    {
        top=-1;
        size=0;
        stack=new int[size];
        System.out.println("Empty stack");
    }
    public Stack(int size)
    {
        top=-1;
        this.size=size;
        stack=new int[size];
    }
    public void push(int ele)
    {
        if(top==size)
        {
            System.out.println("Stack full");
            System.exit(0);
        }
        top++;
        stack[top]=ele;
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
            System.exit(0);
        }
        top--;
    }
    public void display()
    {
        System.out.println("Stack is:");
        System.out.println(stack[top]+"<--");
        for(int i=top-1;i>=0;i--)
        {
             System.out.println(stack[i]);
        }
    }
}
class StackMain
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack(5);
        int choice=0,option=0,ele;
        do
        {
          System.out.println("Enter from follwoing: ");
          System.out.println("1.Push");
          System.out.println("2.Pop");
          System.out.println("3.Display");
          option=sc.nextInt();
           switch(option)
           {
               case 1: System.out.println("Enter element: ");
                        ele=sc.nextInt();
                        s.push(ele);
                        break;
               case 2:s.pop();
                    break;
               case 3: s.display();
                     break;
           }
             System.out.println("Do you want to continue: ");
          choice=sc.nextInt(); 
        }while(choice==1);
    
    }
}