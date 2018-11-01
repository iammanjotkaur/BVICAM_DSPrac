import java.util.Scanner;
class DoublyLinkedList
{
    class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            next=null;
            prev=null;
        }
    }
    Node head;
    void insert_beg()
    {
        Scanner sc=new Scanner(System.in);
        int ele;
        System.out.println("Enter element: ");
        ele=sc.nextInt();
        if(head==null)
        {
            head=new Node(ele);
        }
        else
        {
            Node ptr=new Node(ele);
            ptr.next=head;
            head.prev=ptr;
        }
    }
    public void insert_end()
    {
        Scanner sc=new Scanner(System.in);
        int ele;
        System.out.println("Enter element: ");
        ele=sc.nextInt();
        if(head==null)
        {
            head=new Node(ele);
        }
        else
        {
            Node temp=head,ptr=new Node(ele);
            while(temp.next!=null)
                temp=temp.next;
            temp.next=ptr; 
            ptr.prev=temp;
        }
    }
     public void delete_beg()
    {
        Node temp=head;
         head=head.next;
         head.prev=null;
    }
    public void delete_end()
    {
        Node temp=head;
            while(temp.next.next!=null)
                temp=temp.next;
        temp.next=null;
                 
        
    }
     public void display()
    {
        Node temp=head;
        while(temp.next!=null)
        {
           System.out.print(temp.data+"->");
            temp=temp.next;
             
        }
        System.out.println(temp.data);
    }
    public static void main(String[]args)
    {
        DoublyLinkedList d=new DoublyLinkedList();
         Scanner sc=new Scanner(System.in);
        int choice=0,option=0,ele;
        do
        {
          System.out.println("Enter from follwoing: ");
          System.out.println("1.Insert_end");
          System.out.println("2.Delete_end");
          System.out.println("3.Insert_beg");
          System.out.println("4.Delete_beg");
          System.out.println("5.Display");
          option=sc.nextInt();
           switch(option)
           {
               case 1: 
                        d.insert_end();
                        break;
              case 2:d.delete_end();
                    break;
               
               case 3: 
                        d.insert_beg();
                        break;
                case 4: d.delete_beg();
                     break;
               case 5: d.display();
                     break;
           }
             System.out.println("Do you want to continue: ");
          choice=sc.nextInt(); 
        }while(choice==1);
    }
}