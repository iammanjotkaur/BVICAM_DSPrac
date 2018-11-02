import java.util.Scanner;
class  Deque
{
    private static int front;
    private static int rear;
    private static int size;
    private static int deque[];
    public Deque(int size)
    {
        front=-1;
        rear=-1;
        this.size=size;
        deque=new int[size];
    }
  static void insert_front()
    {
        Scanner sc=new Scanner(System.in);
        int ele;
        System.out.println("Enter element: ");
        ele=sc.nextInt();
        deque=new int[size];
        for(int i=size;i>front;i++)
        {
            deque[i]=deque[i-1];
        }
        if(front==-1)
        {
            front=rear=0;
        }
        
        deque[front]=ele;
    }
 static void insert_rear()
    {
        Scanner sc=new Scanner(System.in);
        int ele;
        System.out.println("Enter element: ");
        ele=sc.nextInt();
        if(front==-1)
        {
            front=rear=0;
        }
        else rear++;
        deque[rear]=ele;
    }
   static void delete_front()
    {
        front++;
    }
 static void delete_rear()
    {
        rear--;
    }
     public static void display()
    {
        System.out.println("Queue is:");
        System.out.println(deque[front]+"<--");
        for(int i=front+1;i<rear;i++)
        {
             System.out.println(deque[i]);
        }
        System.out.println(deque[rear]+"<--");
    }
    public static void inputRestricted()
    {
        Scanner sc=new Scanner(System.in);
        int choice,option; 
        do
        {
          System.out.println("Enter from follwoing: ");
          System.out.println("1.Insert_rear");
          System.out.println("2.Delete_rear");
       
          System.out.println("3.Delete_front");
          System.out.println("4.Display");
          option=sc.nextInt();
           switch(option)
           {
               case 1: 
                        insert_rear();
                        break;
               case 2:delete_rear();
                    break;
               
              
                       
                case 3: delete_front();
                     break;
               case 4: display();
                     break;
           }
             System.out.println("Do you want to continue: ");
          choice=sc.nextInt(); 
        }while(choice==1);
    }
 public static void outputRestricted()
    {
        Scanner sc=new Scanner(System.in);
        int choice,option; 
        do
        {
          System.out.println("Enter from follwoing: ");
          System.out.println("1.Insert_rear");
          System.out.println("2.Insert_front");
       
          System.out.println("3.Delete_front");
          System.out.println("4.Display");
          option=sc.nextInt();
           switch(option)
           {
               case 1: 
                    insert_rear();
                        break;
              case 2:insert_front();
                    break;
               
              
                       
                case 3: delete_front();
                     break;
               case 4: display();
                     break;
           }
             System.out.println("Do you want to continue: ");
          choice=sc.nextInt(); 
        }while(choice==1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int type;
        Deque d=new Deque(5);
        System.out.println("Enter from follwoing: ");
          System.out.println("1.Input restricted queue");
          System.out.println("2.Output restricted queue");
        type=sc.nextInt();
        switch(type)
        {
            case 1:d.inputRestricted();
                    break;
            case 2:d.outputRestricted();
                    break;
        }
    }
}