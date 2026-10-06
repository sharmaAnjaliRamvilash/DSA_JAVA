public class NumberOfIsland{
    public static void  dfs(int i,int j,int board[][],int n,int m){
                if(i<0  || j<0  || i>=n || j>=m || board[i][j]==0){
                        return ;
                }
                board[i][j] = 0; 
                dfs(i-1,j,board,n,m);
                dfs(i+1,j,board,n,m);
                dfs(i,j+1,board,n,m);
                dfs(i,j-1,board,n,m);
    }
    public  static void main(String args[]){
         int[][] board = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
        };


         int n = board.length;
         int m = board[0].length;
         int island = 0;
         for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                     if(board[i][j]==1){
                           island++;
                           dfs(i, j, board, n, m);
                     }
               }
         }
         System.err.println("number of Island " + island );
    }
}