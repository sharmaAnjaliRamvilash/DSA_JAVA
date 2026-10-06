public  class  TargetSumSubset{
      public static void main(String[] args) {
            int val[] = {15,14,10,45,30};
            int wt[] = {2,5,1,3,4};
            int n = val.length;
            int allowed = 7;
            int dp[][] = new int[n+1][allowed+1];
            for(int i=0;i<=n;i++){
                     dp[i][0]  = 0;
            }
            for(int i=0;i<=allowed;i++){
                     dp[0][i] = 0;
            }
            for(int i=1;i<=n;i++){
                    for(int j=1;j<=allowed;j++){
                          int v = val[i-1];
                          int w = wt[i-1];
                          if(w<=j){
                               dp[i][j] = Math.max(v+dp[i][j-w],dp[i-1][j]);
                          }else{
                                 dp[i][j] = dp[i-1][j];
                          }
                    }
            }
            for(int i=0;i<=n;i++){
                    for(int j=0;j<=allowed;j++){
                           System.out.print(dp[i][j] +"  ");
                    }
                    System.out.println();
            }
      }
}











// public class TargetSumSubset{
//       public static void main(String[] args) {
//              int nums[] = {4,2,7,1,3};
//              int n = nums.length;
//              int sum = 10;
//              boolean dp[][] = new boolean[n+1][sum+1];
//              for(int i=0;i<=n;i++){
//                      dp[i][0] = true;
//              }
//              for(int i=1;i<=n;i++){
//                    for(int j=1;j<=sum;j++){
//                            int val = nums[i-1];
//                            if(j>=val && dp[i-1][j-val]){
//                                    dp[i][j] = true;
//                            }
//                            else if(dp[i-1][j]){
//                                     dp[i][j] = true;
//                            }
//                    }
//              }
//              System.out.println(dp[n][sum]);
//       }

// }












// public  class  TargetSumSubset{
//      public static void main(String[] args) {
//             int numbers[] = {4,2,7,1,3};
//             int n = numbers.length;
//             int sum = 10;
//             boolean dp[][] = new boolean[n+1][sum+1];
//             for(int i=0;i<n+1;i++){
//                     dp[i][0] = true;
//             }
            
//             for(int i=1;i<n+1;i++){
//                   for(int j=1;j<sum+1;j++){
//                         int val = numbers[i-1];
                      
//                         if(j>=val && dp[i-1][j-val]){
//                                 dp[i-1][j-val] = true;
//                         }else if(dp[i-1][j]){
//                                   dp[i-1][j] = true;
//                         }
//                   }
//             }
//             System.out.println(dp[n][sum]);
//      }
// }