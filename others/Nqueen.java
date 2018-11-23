import java.util.Scanner;
class Nqueen
{
    static void display(int mat[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println("");
        }
    }
    static boolean solve(int mat[][],int row,int col,int n)
    {
        int i,j;
        for(i=0;i<col;i++)
        {if(mat[row][col]==1)
                return true;}
        for(i=row,j=col;i>=0 && j>=0;i--,j--)
        {if(mat[i][j]==1)
                return true;}
        for(i=row,j=col;i<=n && j>=0;i++,j--)
        {if(mat[i][j]==1)
                return true;}
    }
    static boolean solveNQueen(int mat[][],int col,int n)
    {
        if(col>=n)
            return true;
        
            for(int i=0;i<n;i++)
            {
                if(solve(mat,i,col,n))
                {
                    mat[i][col]=1;
                    if(solveNQueen(mat,col+1,n))
                        return true;
                    mat[i][col]=0;
                }
            }
        return false;
    }
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        n=sc.nextInt();
        int mat[][]=new int[n][n];
        if(solveNQueen(mat,0,n)==true)
            display(mat,n);
        else
            System.out.println("\nsolution does not exist");
    }
}