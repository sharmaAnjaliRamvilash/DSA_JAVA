public class practise{
      public static class TrieNode{
      }


  public static void main(String[] args) {
          
  }
}



























//     public static int helper(int val[],int wt[],int allowed,int i){
//            if(i==val.length ||   allowed<=0){
//                 return  0;
//            }
//            int max=0;
//            if(allowed>=wt[i]){
//                   int take = val[i]+helper(val, wt, allowed-wt[i], i+1);
//                   int notTake  = helper(val, wt, allowed, i+1);
//                     return  Math.max(take,notTake);
                  

//            }
//            return  helper(val, wt, allowed, i+1);
//     }
//     public  static int knapsackUsingMemo(int val[],int wt[],int allowed,int n,int dp[][],int i){
//                   if(i==n  || allowed==0){
//                         return  0; 
//                   }
//                    if(dp[i][allowed]!=-1){
//                          return  dp[i][allowed];
//                    }
//                     if(wt[i]<=allowed){
//                             int take = val[i]+knapsackUsingMemo(val, wt, allowed-wt[i], n, dp, i+1);
//                             int notTake = knapsackUsingMemo(val, wt, allowed, n, dp, i+1);
//                             return  dp[i][allowed] = Math.max(take, notTake);     
//                     }
//                     return dp[i][allowed] = knapsackUsingMemo(val, wt, allowed, n, dp, i+1);

//     }
//     public  static void knapsackUsingTabulation(int val[],int wt[],int allowed){
//         int n = val.length;
//         int dp[][] = new int[n+1][allowed+1];
//         for(int i=0;i<n+1;i++){
//                 dp[i][0]= 0;
//         }
//         for(int j=0;j<dp[0].length;j++){
//                  dp[0][j] = 0;
//         } 
//         for(int i=1;i<=n;i++){
//               for(int j=1;j<=allowed;j++){
//                         int v = val[i-1];
//                         int w = wt[i-1];
//                         if(j>=w){
//                                 int include = v+dp[i-1][j-w];
//                               int exclude = dp[i-1][j];
//                         dp[i][j] = Math.max(include,exclude);
//                         }else{
//                                  dp[i][j] = dp[i-1][j];
//                         }
//               }
//         }
//         print(dp);
//            System.out.print(dp[n][allowed]);
         
            

//     }
//     public static  boolean targetSum(int val[],int sum){
//        int n = val.length;
//        boolean dp[][] = new boolean[n+1][sum+1];
//        for(int i=0;i<=n;i++){
//                  dp[i][0] = true;
//        }
//        for(int i=1;i<=n;i++){
//               for(int j=1;j<=sum;j++){
//                      int v = val[i-1];
//                      if(v<=j  && dp[i-1][j-v]==true){
//                               dp[i][j] = true;
//                      }else if(dp[i-1][j]){
//                             dp[i][j] = true;
//                      }
//               }
//        }
//        print(dp);
//        return dp[n][sum];

//     }
//     public static void print(boolean  dp[][]){
//           for(int i=0;i<dp.length;i++){
//                for(int j=0;j<dp[0].length;j++){
//                      System.out.print(dp[i][j] +"  ");
//                }
//                System.out.println();
//           }
          
//     }
    public static void main(String args[]){
      //  System.out.println("Anjali".replace('j', ' '));
      //   String s1 = "Hello";
      //   String s2 = "Hello";
      //   System.out.println(s1==s2);
      //   System.out.println(s1.equals(s1));
      //   String s1 = new String("Hello");
      //   String s2  = new String("Hello");
      //   System.out.println(s1.equals(s2));
      //   System.out.println(s1==s2);
        
      // countVowels("anjali");
      //     int val[] = {15,14,10,45,30};
      //     int wt[] = {2,5,1,3,4};
      //     int allowed = 10;
      //      boolean ans =  targetSum(wt, allowed);
      //      System.out.print(ans );
       
        // int ans =   knapsackUsingMemo(val,wt,allowed,n,dp,0);
        // System.err.println("ans  " + ans);
        //   int ans = helper(val,wt,allowed,0);
        String s1 = "abc";
        String s2 = "bca";
        char ch[]  = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        String str1 = new String(ch);
        String str2 = new String(ch2);
        if(str1.equals(str2)){
               System.out.print("Anagrame");
        }else{
              System.out.print("Not Anagrame");
        }
      //   HashMap<Character,Integer> map = new HashMap<>();/
      //   for(char ch : s1.toCharArray()){
      //         map.put(ch,map.getOrDefault(ch, 0)+1);
      //   }
      //   for(char ch: s2.toCharArray()){
      //         if(map.containsKey(ch)){
      //             int freq =   map.get(ch);
      //             freq--;
      //             if(freq==0){
      //                      map.remove(ch);
      //             }
      //         }
      //   }
      //   if(map.isEmpty()){
      //         System.out.print("Anagrame");
      //   }else{
      //         System.out.println("Not anagrame");
      //   }


       
    }
}













// import java.util.*;
// public  class  practise{
//     public static int countWays(int n,int dp[]){
//               if(n==0){
//                      return 1;
//               }
//               if(n==1){
//                    return  1;
//               }
//               if(dp[n-1]!=-1){
//                    return  dp[n-1];
//               }
//               return  countWays(n-1, dp)+countWays(n-2, dp);
//     }
//     public   static void main(String args[]){
//           int n = 5;
//           int dp[] = new int[n+1];
          
//           Arrays.fill(dp,-1);
//           dp[0] = 1;
//           dp[1] = 1;
//        int ans =     countWays(n,dp);
//        System.out.print(ans);


//     }
// }






// public  class  practise{
//     public static int Stairs(int n){
//           if(n==0){
//               return 1;
//           }
//           if(n==1){
//                return  1;
//           }
//           return  Stairs(n-1)+Stairs(n-2);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(Stairs(n));
          
//     }
// }



// public class practise{
    //     public static void main(String args[]){
    //         int nums[] = {30,20,50,10,40};
    //         int n = nums.length;
    //         int dp[] = new int[n];
    //         dp[0] = 0;
    //         dp[1] = Math.abs(nums[1]-nums[0]);
    //         for(int i=2;i<n;i++){
    //             dp[i] = Math.min(dp[i-1]+Math.abs(nums[i]-nums[i-1]),dp[i-2]+Math.abs(nums[i]-nums[i-2]));
    //         }
    //         System.out.println(dp[n-1]);
    //     }
    // }











// import java.util.*;
// public class  practise{
//     public static int Fibo(int n,int dp[]){
//          if(n==0){
//                return 0;
//          }
//          if(n==1){
//              return 1;
//          }
//          if(dp[n-1]!=-1){
//                 return  dp[n-1];
//          }
//          return  dp[n-1] =  Fibo(n-1,dp)+Fibo(n-2,dp);
             
//     }
//     public static  void main(String args[]){
//         int dp[]  = new int[6];
//         Arrays.fill(dp, -1);
//         int ans =  Fibo(5,dp);
//         System.out.print(ans +"  ");

//     }
// }











// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.HashSet;
// public class  practise{
//     public static void helper(String word){
//              HashSet<Character> set = new HashSet<>();
//              int left=0;
//              int maxLength = 0;
//              for(int right=0;right<word.length();right++){
//                       if(set.contains(word.charAt(right))){
//                               set.remove(word.charAt(left));
//                               left++;
//                       }
//                       set.add(word.charAt(right));
//                       maxLength = Math.max(maxLength,right-left+1);
//              }
            
//     }
//     public static void maxSumSubArray(){
//           int nums[] = {2, 1, 5, 1, 3, 2};
//           int n = nums.length;
//           int k=3;
//           int max =0;
//           int windowSum = 0;
//             for(int i=0;i<k;i++){
//                     windowSum += nums[i];
//             }
//             max =  windowSum;
//             for(int i=k;i<n;i++){
//                      windowSum += nums[i]-nums[i-k];
//                      max = Math.max(max,windowSum);

//             }
//             System.out.print("MaxSumSubArray"+ max);
//     }
//     public static void maxSubArrayElement(){
//          int nums[] = {1, 3, -1, -3, 5, 3, 6, 7};
//          int k = 3;
//          int n = nums.length;
//          int result[] = new int[n-k+1];
//          Deque<Integer> dq = new ArrayDeque<>();
//             //3  3  5 5  6  7
//         for(int i=0;i<n;i++){
//             //       remove if not part of the current window
//             if(!dq.isEmpty()  && dq.peekFirst()<i-k+1){
//                               dq.pollFirst();
//             }
//             while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
//                      dq.pollLast();
//             }
//              dq.addLast(i);
//         }
//         int index=0;
//         while(!dq.isEmpty()){
//               nums[index] = dq.pollFirst();
//         }

//     }
//     public static int SumOfNNumber(int n){
//         if(n==1){
//               return n;
//         }
//         return  n+SumOfNNumber(n-1);

          
//     }
//     public static void main(String[] args) {
//             System.err.println(SumOfNNumber(5));
//         //   String word = "abcabcbb";
//         //   int n = word.length();
//         //   helper(word);
//     }
// }










// public  class  practise{
//     public static  class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//               this.data = data;
//               this.left = null;
//               this.right = null;
//         }
//     }
//     public static Node invertBinary(Node node){
//                 if(node==null){
//                       return null;
//                 }
//                 Node temp = node.left;
//                 node.left = node.right;
//                 node.right = temp;
//                 invertBinary(node.left);
//                 invertBinary(node.right);
//                 return  node;
//     }
//     public   static boolean  validateBinaryTree(Node node){
//            if(node==null){
//                return true;
//            }
           
//     }
//     public static void main(String[] args) {
            
//     }
// }










// import java.util.ArrayList;

// //    create the graph
// public  class  practise{
//     public static class Edge{
//         int src;
//         int des;
//         int wt;

//         public Edge(int src,int des,int wt) {
//             this.src = src;
//             this.des = des;
//             this.wt = wt;
//         }
//         public static void  createGraph(ArrayList<Edge> graph[]){
//                 for(int i=0;i<graph.length;i++){
//                          graph[i] = new ArrayList<>();
//                 }
//                 graph[0].add(new Edge(2,3,4));
//                 graph[1].add(new Edge(1,3,2));
//                 graph[2].add(new Edge(3,2,1));
//         }
        
//     }

//     public static void main(String[] args) {
        
//     }
// }


















// import java.util.HashSet;

// public  class practise{
//     public   static void main(String args[]){
//         String str= "abcabcbb";
//         int index =0;
//         HashSet<Character> set = new HashSet<>();
//         for(char ch: str.toCharArray()){
//                 char curr = ch;
                
//         }
//     }
// }
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// public  class  practise{
//      public static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//               this.data = data;
//               this.left  =null;
//               this.right = null;
//         }
//      }
//      public static ArrayList<Integer> helper(Node node){
//                ArrayList<Integer> ans = new ArrayList<>();
//                 Queue<Node> q = new LinkedList<>();
//                 q.add(node);
//                 while(!q.isEmpty()){
//                     int n = q.size();
//                     for(int i=0;i<n;i++){
//                             Node curr = q.poll();
//                             if(i==n-1){
//                                    ans.add(curr.data);
//                             }
//                             if(curr.left!=null){
//                                    q.add(curr.left);
//                             }
//                             if(curr.right!=null){
//                                    q.add(curr.right);
//                             }
//                     }
//                 }
//      }
//     public static void main(String[] args) {
          
//     }
// }



// public class practise{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//         public static int  findHeight(Node node){
//                if(node==null){
//                    return 0;
//                }
//                int leftHeight = findHeight(node.left)+1;
//                int rightHeight = findHeight(node.right)+1;
//                return  Math.max(leftHeight,rightHeight)+1;
//         }
        
//     }
//     public static void main(String[] args) {
        
//     }
// }