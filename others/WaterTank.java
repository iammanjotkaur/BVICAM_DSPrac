import java.util.Scanner;
class WaterTank
{
    public static void main(String []args)
    {
        int nofelevation;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter number of elevation");
        nofelevation=sc.nextInt();
        int waterlevel[]=new int[nofelevation];
        int temp[]=new int[nofelevation];
        System.out.println("\nEnter water level status");
        for(int i=0;i<nofelevation;i++)
        {
            waterlevel[i]=sc.nextInt();
        }
        if(waterlevel[0]<waterlevel[1])
            temp[0]=waterlevel[1];
        else
            temp[0]=waterlevel[0];
        for(int i=1;i<nofelevation;i++)
        {
            if(temp[i-1]>waterlevel[i])
                temp[i]=temp[i-1];
            else
                temp[i]=waterlevel[i];
        }
        for(int i=0;i<nofelevation;i++)
        {
           temp[i]=temp[i]-waterlevel[i];
        }
        for(int i=0;i<nofelevation;i++)
        {
           System.out.print(temp[i]);
        }
        int volume=0;
        /*for(int i=0;i<nofelevation;i++)
        {
           volume=volume+temp[i];
        }*/
        System.out.println("Total volume: "+volume);
    }
}