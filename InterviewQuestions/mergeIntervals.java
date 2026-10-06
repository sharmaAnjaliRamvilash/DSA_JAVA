public  class  mergeIntervals{
    public static void main(String[] args) {
           int val[] = {15,14,10,45,30};
           int wt[] = {2,5,1,3,4};
           int n = val.length;
           int allowed = 7;
           int dp[][] = new int[n+1][allowed+1];
           for(int i=0;i<=allowed;i++){
                  dp[0][i] = 0;
           }
           for(int i=0;i<=n;i++){
                  dp[i][0] = 0;
           }
           for(int i=1;i<n+1;i++){
               for(int j=1;j<allowed+1;j++){
                      int v = val[i-1];
                      int w = wt[i-1];
                      if(j>=w){
                            int take = v+dp[i-1][j-w];
                            int notTake = dp[i-1][j];
                            dp[i][j] = Math.max(take,notTake);
                      }else{
                            dp[i][j] = dp[i-1][j];
                      }
               }
           }
           System.out.print(dp[n][allowed]);
        

    }
}