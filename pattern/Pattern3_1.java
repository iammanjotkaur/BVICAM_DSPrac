/*

Enter number of rows or col:
10
1 2 3 4 5 6 7 8 9 10 
36 37 38 39 40 41 42 43 44 11 
35 64 65 66 67 68 69 70 45 12 
34 63 84 85 86 87 88 71 46 13 
33 62 83 96 97 98 89 72 47 14 
32 61 82 95 100 99 90 73 48 15 
31 60 81 94 93 92 91 74 49 16 
30 59 80 79 78 77 76 75 50 17 
29 58 57 56 55 54 53 52 51 18 
28 27 26 25 24 23 22 21 20 19 

*/
import java.util.Scanner;
class Pattern3_1
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter number of rows or col:");
        n=sc.nextInt();
        int i=0,j=9,k=9,m=0,row,col,num=1,space=0;
        int arr[][]=new int[n][n];
        while((i<=k)&&(m<=j))
        {
          col=m;
            while(col<=j)
            {
               arr[i][col]=num;
                num++;
                col++;
            }i++;
            
            
            row=i;
            while(row<=k)
            {
                
                arr[row][j]=num;
                num++;
                row++;
            }j--;
            col=j;
            while(col>=m)
            {
                arr[k][col]=num;
                num++;
                col--;
            }
            k--;
            row=k;
            while(row>=i)
            {
                
                arr[row][m]=num;
                num++;
                row--;
            }m++;
        }
        for(int x=0;x<=9;x++)
        {
            for(int y=0;y<=9;y++)
                System.out.print(arr[x][y]+" ");
            System.out.print("\n");
        }
    }
}