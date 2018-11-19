import java.lang.*;
import java.util.Scanner;
class ReverseWords
{
    public static void main(String []args)
    {
        String original=new String("Amit Singh Pundeer");
        System.out.println(original);
        int i=0,j=0,k=0,x=0;
        int len=original.length();
         
        while(x<len)
        {
            while((j<len)&&(original.charAt(j)!=' '))
            {
                j++;
                x++;
            }
            k=j-1;
            while(k>=i)
            {
                System.out.print(original.charAt(k));
                k--;
            }
            i=j+1;
            x++;
            j++;
        }
        System.out.print("\n");
    }
}