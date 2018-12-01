class Knight
{
    private static int board[][]=new int[8][8];
    private static int n=8;
//    static
//    {
//        board=new int[8][8];
//        n=8;
//    }
    public static boolean solve(int row,int col,int count)
    {
       // System.out.println(count);
        
        board[row][col]=count;
        int moves[][]={{1,2},{2,1},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};;
        
        for(int i=0;i<8;i++)
        {
            int rtemp=row+moves[i][0];
            int ctemp=col+moves[i][1];
            if(valid(rtemp)&&valid(ctemp))
            {
                if(board[rtemp][ctemp]==0)
                {
                     board[row][col]=count;
                    if(solve(rtemp,ctemp,count+1))
                        return true;
                     else
                {
                    board[rtemp][ctemp]=0;
                }
                }
               
            }
        }
    if(count==(n*n)){
            return true;            
        }
        return false;
    }
    public static  boolean valid(int x)
    {
        if((x>=0)&&(x<n))
            return true;
        
        return false;
    }
    public static void main(String[]args)
    {
         System.out.println(solve(0,0,1));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%02d ",board[i][j]);
            }
            System.out.println();
        }
    }
}