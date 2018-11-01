import java.util.Scanner;
class Queue
{
    private int front;
    private int rear;
    private int size;
    private int queue[];
    public Queue()
    {
        front=-1;
        rear=-1;
        size=0;
        queue=new int[size];
        System.out.println("Empty stack");
    }
    public Queue(int size)
    {
        front=-1;
        rear=-1;
        this.size=size;
        queue=new int[size];
    }
    public void enqueue(int ele)
    {
        if(rear==size)
        {
            System.out.println("Queue full");
            System.exit(0);
        }
        if(front==-1)
        {
            front++;
            rear++;
        }
        queue[rear]=ele;
    }
    public void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue empty");
            System.exit(0);
        }
        front--;
    }
    public void display()
    {
        System.out.println("Queue is:");
        System.out.println(queue[front]+"<--");
        for(int i=front+1;i<rear;i++)
        {
             System.out.println(queue[i]);
        }
        System.out.println(queue[rear]+"<--");
    }
}
class QueueMain
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue(5);
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
               case 1: System.out.println("Enter element: ");
                        ele=sc.nextInt();
                        q.enqueue(ele);
                        break;
               case 2:q.dequeue();
                    break;
               case 3: q.display();
                     break;
           }
             System.out.println("Do you want to continue: ");
          choice=sc.nextInt(); 
        }while(choice==1);
    
    }
}