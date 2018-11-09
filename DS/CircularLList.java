import java.util.Scanner;
class CircularLList
{
    private int front;
    private int rear;
    private int size;
    Scanner sc=new Scanner(System.in);
    int cqueue[];
    public CircularLList(int size)
    {
        front=-1;
        rear=-1;
        this.size=size;
        cqueue=new int[size];
    }
    public boolean isFull()
    {
        if((front==-1)&&(rear==size-1))
            return true;
       else if((rear==front-1)&&(front!=0))
           return true;
        else return false;
    }
    public boolean isEmpty()
    {
        if(front==-1)
            return true;
        else
            return false;
    }
    public void enqueue()
    {
        
        if(isFull())
        {
            System.out.println("Queue full");
        }
        else
        {
            int ele;
            System.out.println("Enter element");
            ele=sc.nextInt();
            if(front==-1)
            {
                front++;
                rear++;
            }
            else if((front!=0)&&(rear==size-1))
                rear=0;
            else
                rear++;
            cqueue[rear]=ele;
        }
        
        
    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue empty");
            
            System.out.println(front+rear);
           
        }
        else
        {
            System.out.println("Element dequeued is: ");           if(front==size-1)
            {
                System.out.println(cqueue[front]);
                front=0;
            }
            else if(front==rear)
            {
                System.out.println(cqueue[front]);
                front=-1;
                rear=-1;
            }
            else
                System.out.println(cqueue[front]);
                front++;
        }
    }
    public void display()
    {
        System.out.println("Queue is:");
         // System.out.println(front);
           
            for(int i=front;i<=rear;i++)
                System.out.println(cqueue[i]);
    }
    public static void main(String[]args)
    {
        CircularLList c=new CircularLList(5);
        Scanner sc=new Scanner(System.in);
        int choice=0,option=0,ele;
        do
        {
          System.out.println("Enter from follwoing: ");
          System.out.println("1.Enqueue");
          System.out.println("2.Dequeue");
          
          System.out.println("3.Display");
          option=sc.nextInt();
           switch(option)
           {
               case 1: 
                        c.enqueue();
                        break;
              case 2:c.dequeue();
                    break;
              
               case 3: c.display();
                     break;
           }
             System.out.println("Do you want to continue: ");
          choice=sc.nextInt(); 
        }while(choice==1);
        
        
    }
}
 