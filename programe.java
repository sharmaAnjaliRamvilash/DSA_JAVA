
// import java.util.*;
// public class programe{
//      public static int largestRectangleHist(){
//           int heights[] = {2,1,5,6,2,3};
//           int n = heights.length;
//           int maxHeight = 0;
//           for(int i=0;i<n;i++){
//                 int  currentHeight = 1;
//                 if(i==n){
//                       currentHeight = 0;
//                 }else{
//                        currentHeight = heights[i];
//                 }
//                 while(!st.isEmpty()  && currentHeight>heights[st.peek()]){
//                          int widht =1;
//                           int height = heights[st.peek()];
//                           if(st.isEmpty()){
//                                  width = 1;
//                           }else{
//                                  width = i-st.peek()-1;
//                           }
//                           int area = widht*height;
//                            maxHeight = Math.max(area,maxHeight);
//                 }
//           }
//           System.out.print(maxHeight);

//      }
//     public static void main(String args[]){
          
//     }
// }








// public  class programe{
//     public static void maxSlidingWindow(){
//         int nums[]   = {1,3,-1,-3,5,3,6,7};
//         int n = nums.length;
//         int k=3;
//         int max = 0;
//         for(int i=0;i<=n-k;i++){
//              for(int j=i;j<i+k;j++){
//                 max = Math.max(max,nums[j]);
//              }
//         }
//         System.out.print(max);
          
//     }
//     public static void main(String[] args) {
//         maxSlidingWindow();
           
//     }
// }






// import java.util.*;
// public class programe {

//     public static void main(String[] args) {
//         int val[] = {60, 100, 120};
//         int wt[] = {10, 20, 30};
//         int n = val.length;
//         int allowed = 50;
//         double ratio[][] = new double[n][2];
//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
//         for (int i = 0; i < n; i++) {
//             ratio[i][0] = i;
//             ratio[i][1] = val[i] / (double) wt[i];
//         }
//         int capacity = allowed;
//         int profit = 0;
//         for (int i = n - 1; i >= 0; i--) {
//             int index = (int) ratio[i][0];
//             if (capacity >= wt[index]) {
//                      profit += val[index];
//                      capacity-= wt[index];
//             }else{
//                      profit += (ratio[i][1]*capacity);
//                      capacity=0;
//                      break;
//             }
//         }
//         System.out.print(profit);

//     }
// }

// import java.util.PriorityQueue;
// public class programe{
//     public static class Pair{
//           int value;
//           int weight;
//         public Pair(int value,int weight) {
//               this.value = value;
//               this.weight = weight;
//         }
//     }
//     public static void maxProfit(){
//           int values[] = {60,100,120};
//           int wt[] = {10,20,30};
//           int allowed = 50;
//           PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.value-a.value);
//           for(int i=0;i<values.length;i++){
//                    pq.offer(new Pair(values[i],wt[i]));
//           }
//           int Profit = 0;
//           while(!pq.isEmpty()){
//                 Pair pair = pq.poll();
//                 int val = pair.value;
//                 int currentWt = pair.weight;
//                 if(allowed>=currentWt){
//                         //   take
//                         Profit += val;
//                         allowed-= currentWt;
//                 }
//           }
//           System.out.print(Profit);
//     }
//     public static void main(String[] args) {
//         maxProfit();
//     }
// }
// import java.util.*;
// public  class programe{
//     public static void main(String[] args) {
//         int start[]  = {1,3,0,5,8,5};
//         int end[] = {2,4,6,7,9,9};
//         int n = start.length;
//         ArrayList<Integer> ans = new ArrayList<>();
//         int endTime =  end[0];
//         int complet = 1;
//         for(int i=1;i<n;i++){
//                if(start[i]>=endTime){
//                           complet++;
//                           ans.add(i);
//                           endTime = end[1];
//                }
//         }
//         System.out.print(complet);
//     }
// }
// import java.util.*;
// public class programe{
//        public static int[] helper(int nums[]){
//                 int target = 9;
//                 HashMap<Integer,Integer> map  = new HashMap<>();
//                 for(int num : nums){
//                   int com = target-num;
//                      if(map.containsKey(num)){
//                           return new int[]{map.get(com),i};
//                      }
//                      map.put(com,i);
//                 }
//                 return new int[]{};
//        }
//        public static maxProfit(int nums[]){
//                  int minBuy  = nums[0];
//                  int maxProfit = 0;
//                  for(int i=1;i<nums.length;i++){
//                          minBuy = Math.min(minBuy,nums[i]);
//                          maxProfit = Math.max(maxProfit,minBuy-nums[i]);
//                  }
//                  System.out.print(maxProfit);
//        }
//       public  static void main(String args[]){
//       }
// }
// public class programe{
//     public static void mergeSort(int nums1[],int nums2[],int n1,int m1){
//              int i = n1-1;
//              int j = m1-1;
//              int k = n1+m1-1;
//              while(i>=0  && j>=0){
//                    if(nums1[i]>nums2[j]){
//                        nums1[k] = nums1[i];
//                         i--;
//                    }else{
//                      nums1[k] = nums1[j];
//                      j--;
//                    }
//                    k--;
//              }
//              for(int num : nums1){
//                   System.out.print(num +"  ");
//              }
//     }
//      public static List<List<Integer>> 3sum(int nums[]){
//              List<List<Integer>> ans  = new ArrayList<>();
//              Arrays.sort(nums);
//              for(int i=0;i<n;i++){
//                    if(i>0  && nums[i]==nums[i-1]){
//                          continue;
//                    }
//                    int left = i+1;
//                    int right = n-1;
//                    while(left<right){
//                     int sum = nums[i]+nums[left]+nums[right];
//                     if(sum==0){
//                             ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
//                             left++;
//                             right;
//                     }
//                           while(i<left  && nums[left]==nums[left-1]){
//                               left++;
//                           }
//                           while(left<right && nums[right]==nums[right+1]){
//                                right--;
//                           }
//                           left
//                    }
//              }
//      }
//     public static void main(String args[]){
//     }
// }
// public  class  programe{
//     public static int maxProfit(int nums[]){
//               int minPrice = Integer.MAX_VALUE;
//               int maxProfit = 0;
//               for(int price : nums){
//                    minPrice = Math.min(minPrice,price);
//                    int profit = minPrice-price;
//                    maxProfit = Math.max(maxProfit,profit);
//               }
//               System.out.print(maxProfit);
//     }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int[] helper(){
//                int nums[] = {2, 7, 11, 15};
//            int n = nums.length;
//            int target=9;
//            HashMap<Integer,Integer> map = new HashMap<>();
//            for(int i=0;i<n;i++){
//                 int complement = target-nums[i];
//                 if(map.containsKey(complement)){
//                          return new int[]{map.get(complement),i};
//                 }
//                 map.put(complement,i);
//            }
//            return new int[]{};
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public static void  reverseVowels(String s){
//               int left=0;
//               int right=s.length()-1;
//               char chArray[] = s.toCharArray();
//               while(left<right){
//                 while(left<right  && !isContains(chArray[left])){
//                     left++;
//                 }
//                 while(left<right && !isContains(chArray[right])){
//                         right--;
//                 }
//                 char temp = chArray[left];
//                 chArray[left] = chArray[right];
//                 chArray[right] = temp;
//                 left++;
//                 right--;
//               }   
//               System.out.print(new String(chArray));
//     }
//     public static boolean isContains(char ch){
//           return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
//     }
//     public static void main(String[] args) {
//               String s  = "leetcode";
//                        reverseVowels(s);
//             // String str =  "the sky is blue";
//             // String arr[] = str.trim().split("//s+");
//             // StringBuilder sb  = new StringBuilder();
//             // int n = arr.length;
//             // for(int i=n-1;i>=0;i--){
//             //         sb.append(arr[i]);
//             //         if(i!=0){
//             //                sb.append(" ");
//             //         }
//             // }
//             // System.out.print(sb.toString());
//     }
// }
// import java.util.*;
// public class programe{
//         public static int firstUnique(String str){
//                    int n = str.length();
//                    HashMap<Character,Integer> map = new HashMap<>();
//                    for(char ch : str.toCharArray()){
//                             map.put(ch,map.getOrDefault(ch,0)+1);
//                    }
//                    for(int i=0;i<n;i++){
//                             if(map.containsKey(str.charAt(i))  && map.get(str.charAt(i))==1){
//                                    return  i;
//                             }
//                    }
//                    return -1;
//         }
//         public static void main(String args[]){
//                 System.out.print(firstUnique("loveleetcode"));
//         }
// }
// / import java.util.*;
// public class programe{
//         public static int maxLength(String str){
//                   HashSet<Character> set = new HashSet<>();
//                   int left=0;
//                   int maxLength=0;
//                   for(int right=0;right<str.length();right++){
//                            while(set.contains(str.charAt(right))){
//                                       set.remove(set.charAt(left));
//                                       left++;
//                            }
//                            set.add(s.charAt(right));
//                            maxLength  = Math.max(maxLength,right-left+1);
//                   }
//                   return maxLength;
//         }
//         public static void main(String args[]){
//                 String str = "abcabcbb";
//                 int ans = maxLength(str);
//                 System.out.print(ans);
//         }
// }
// public class programe{
//         public static int trap(int height[]){
//                   int n = height.length;
//                   int left=0;
//                   int right =n-1;
//                   int maxWater = 0;
//                   while(left<right){
//                           int width = right-left;
//                           int height = Math.min(height[left],height[right]);
//                           maxWater = Math.max(maxWater,wight*height);
//                           if(height[left]<height[right]){
//                                   left++;
//                           }else{
//                                  right--;
//                           }
//                   }
//                   return maxWater;
//         }
//         public static void main(String args[]){
//         }
// }
// public static class programe{
//         public static int subArraySum(int nums[],int k){
//                     HashMap<Integer,Integer> map = new HashMap<>();
//                     map.put(0,1);
//                     int sum=0;
//                     int count=0;
//                     for(int num: nums){ 
//                             sum += num;
//                             if(map.containsKey(sum-k)){
//                                        count += map.get(sum-k);
//                             }
//                             map.put(sum,map.getOrDefault(sum,0)+1);
//                     }
//                     return count;
//         }
//         public static void main(String args[]){
//         }
// }
//                       mat[i][j] =  board;
//                       return found;              
//         }
//         public static boolean wordSearch(String word,char mat[][]){
//                 int start=0;
//                   for(int i=0;i<mat.length;i++){
//                          for(int j=0;j<mat[0].length;j++){
//                                     if(isExist(i,j,word,mat,start)){
//                                             return true;
//                                     }
//                          }
//                   }
//                   return false;
//         }
//         public static void main(String args[]){
//                 String word = "SEE";
//                 char mat[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//                  System.out.print(wordSearch(word,mat));
//         }
// }
//                         Queue<Pair>  q = new LinkedList<>();
//                         q.offer(new Pair(0,-1));
//                         vis[src] = true;
//                         while(!q.isEmpty()){
//                                  Pair curr = q.poll();
//                                  int node = curr.node;
//                                  int parent = curr.parent;
//                                  for(int nbr : adj.get(node)){
//                                              if(!vis[nbr]){
//                                                       vis[nbr] = true;
//                                              }else if(nbr!=parent){
//                                                   return true;
//                                              }
//                                  }
//                         }
//         }
//         public static boolean undirectedGraph(){
//                     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//                     boolean vis[] = new boolean[adj.size()];
//                     for(int i=0;i<adj.size();i++){
//                          if(vis[i]!=true){
//                                if(undirectedGraph(src,adj,vis)){
//                                           return true;
//                     }
//                     return false;
//         }
//         public static void main(String args[]){
//         }
// }
// import  java.util.*;
// public  class programe{
//                 int node;
//                 int cost;
//         }
//         }
//         public static int cheapestFlight(ArrayList<ArrayList<Integer>> adj,int k){
//                 int dist[] = new int[adj.size()];
//                 Arrays.fill(dist,Integer.MAX_VALUE);
//                 PriorityQueue<Pair> pq = new PriorityQueue<>();
//                 pq.offer(new Pair(0,0,0));
//                 while(!pq.isEmpty()){
//                           Pair curr = pq.poll();
//                           int node = curr.node;
//                           int stops = curr.stops;
//                           for(int nbr : adj.get(node)){
//                                   if(dist[nbr]!=Integer.MAX_VALUE  && stops<=k   && dist[node]+cost<dist[nbr]){
//                                                    dist[nbr] = dist[node]+cost;
//                                   }
//                           }
//                 }
//                 int min = 0;
//                 for(int num  :   dist){
//                             min = Math.min(num,min);
//                 }      
//                 return min;
//         }
//         public  static class Edge{
//                 int src;
//                 int des;
//                 int wt;
//                 Edge(int src,int des,int wt){
//                           this.src = src;
//                           this.des = des;
//                           this.wt = wt;
//                 }
//         }
//         public static void createGraph(int flights[][],ArrayList<Edge>list[]){
//                            for(int i=0;i<flights.length;i++){
//                                   list[i]  = new ArrayList<>();
//                            }
//                            for(int i=0;i<flights.length;i++){
//                                     int src = flights[i][0];
//                                     int des = flights[i][1];
//                                     int cost = flights[i][2];
//                                     list[src].add(new Edge(src,des,cost));
//                            }     
//         }
//         public static  void main(String args[]){
//                    int flights[][] = {{0,1,100},{2,1,200},{1,3,400}};
//                    ArrayList<Edge>list[] = new ArrayList[flights.length];
//                    createGraph(flights,list);
//                    for(int i=0;i<flights.length;i++){
//                             System.out.print(i +"  -> ");
//                             for(int list)
//                    }
//         }
// }
// import java.util.*;
// public class programe{
//         class ListNode{
//                 int data;
//                 ListNode next;
//         public ListNode(int data) {
//                 this.data = data;
//         }
//         public static void mergeList(ListNode lists[]){
//                 PriorityQueue<ListNode> pq = ne PriorityQueue<>();
//                 ListNode dummy = new ListNode(-1);
//                 for(ListNode list: lists){
//                             if(list!=null){
//                                       pq.add(list);
//                             }
//                            ListNode node = pq.poll();
//                            curr.next =node;
//                            curr = curr.next;
//                            if(curr.next!=null){
//                                    pq.add(curr.next);
//                            }
//                 }
//                 return dummy.next;
//         }
//         public static void main(String args[]){
//         }
// }
// import java.util.*;
// public class programe{
//                 ListNode next;
//                 this.data = data;
//                 this.next = null;
//         }
//         public static void mergeList(ListNode lists[]){
//                 PriorityQueue<ListNode> pq = ne PriorityQueue<>();
//                 ListNode dummy = new ListNode(-1);
//                 for(ListNode list: lists){
//                             if(list!=null){
//                                       pq.add(list);
//                             }
//                            ListNode node = pq.poll();
//                            curr.next =node;
//                            curr = curr.next;
//                            if(curr.next!=null){
//                                    pq.add(curr.next);
//                            }
//                 }
//                 return dummy.next;
//         }
//         public static void main(String args[]){
//         }
// }
//         public static void main(String args[]){
//                     int n = 5;
//                          for(int space=0;space<n-i-1;space++){
//                                      System.out.print(" ");
//                            System.out.println();
//                     }
//         }
// }
// import java.util.*;
// public  class programe{
//          public static int catlanMemo(int n,int dp[]){
//                         if(n==0  || n==1){
//                                   return  1;
//                              ans += catlanMemo(i,dp)*catlanMemo(n-i-1,dp);
//                         }
//                          dp[n] =   ans;
//                         return  dp[n];
//          }
//                 public static void main(String args[]){
//                           int n = 10;
//                           int dp[] = new int[n+1];
//                              Arrays.fill(dp,-1);
//                           System.out.print(ans);
// }
// import  java.util.*;
// public  class  programe{
//         public static void helper(int nums[]){
//                 int ans = 1;
//                 for(int i=0;i<n;i++){
//                                   }
//                           }
//                           ans = Math.max(ans,dp[i]);
//                 }
//                 System.out.print(ans);
//         }
//         public static void main(String[] args) {
//                 int nums[] = {10,9,2,5,3,7,101,18};
//                 helper(nums);
//         }
// }
// public  class programe{
//         public static void dfs(int i,int j,int newColor,int originalColor,int mat[][]){
//                   if(i<0  || j<0 || i>=mat.length || j>=mat[0].length  || mat[i][j]!=originalColor  || mat[i][j]==newColor){
//                           return;
//                   mat[i][j]  = newColor;
//                   dfs(i-1,j,newColor,originalColor,mat);
//         public static void main(String args[]){
//                   dfs(i, j, newColor, originalColor, mat);
//         }
// }
// import java.util.*;
// public class programe{
//           public static void main(String args[]){
//                   int n=5;
//                   for(int i=0;i<n;i++){
//                           for(int j=0;j<i+1;j++){
//                                    System.out.print("*");
//                           for(int k = n/2-i-1;k>0;k--){
//                                    System.out.print("*");
//                           System.out.println();
//                   }
//           }
// }
// public  class programe{
//         public static void main(String args[]){
//                  int n = 5;
//                  for(int i=0;i<n;i++){
//                           for(int k=0;k<n;k++){
//                                     if(i==k){
//                           }
//                           for(int j=n-i-1;j>=0;j--){
//                                      System.out.print("  ");
//                           }
//                           System.out.println("*  ");
//                  }
//         }
// }
//  import java.util.*;
//  class Graph{
//         int n ;
//     public Graph(int n) {
//         this.n = n;
//         for(int i=0;i<n;i++){
//                adj[i] = new ArrayList<>();
//         }
//              adj[u].add(v);
//              adj[v].add(u);
//      }
//      public void printGraph(){
//              for(int i=0;i<n;i++){
//                   System.out.print(i +"  ");
//                   for(int nbr: graph[i]){
//                   }
//                   System.out.println();
//              }
//      }
//                   Queue<Integer> q = new LinkedList<>();
//                   q.add(0);
//                   boolean vis[] = new boolean[n];
//                   while(!q.isEmpty()){
//                         int curr  = q.poll();
//                         for(int nbr: adj[curr]){
//                                  if(!vis[nbr]){
//                                              vis[nbr] = true;
//                                              q.offer(nbr);
//                                  }
//                         }
//                   }
//       }
//       public void dfsTraversal(int src,boolean vis[]){
//                     vis[src] = true;
//                     System.out.print(src);
//                     for(int nbr : adj[src]){
//                           if(!vis[nbr]){
//                                    dfsTraversal(nbr,vis);
//                           }
//                     }
//       }
//       public boolean  isCycleDFS(boolean vis[],int curr,int parent){
//                     vis[curr] = true;
//                     for(int nbr : graph[curr]){
//                             if(!vis[nbr]){
//                                   if(isCycleDFS(vis,nbr,curr)){
//                                             return true;
//                                   }
//                             }else if(parent!=nbr){
//                     }
//                     return false;
//       }
//       public boolean isCycleDFSHelper(){
//           boolean vis[] = new boolean[n];
//                   for(int i=0;i<n;i++){
//                             if(!vis[i]){
//                                     if(isCycleDFS(vis,i,-1)){
//                                            return true;
//                                     }
//                             }
//                   }
//                   return false;
//       }
//       public class Pair{
//         int node;
//         int parent;
//         Pair(int node,int parent){
//                  this.node = node;
//                  this.parent = parent;
//         }
//       }
//       public boolean isCycle(int src,boolean vis[]){
//              Queue<Pair> q = new LinkedList<>();
//               q.offer(new Pair(src,-1));
//               while(!q.isEmpty()){
//                     Pair pair = q.poll();
//                     int curr = pair.node;
//                     int currParent = pair.parent;
//                     for(int nbr : adj[curr]){
//                          if(!vis[nbr]){
//                                     vis[nbr] = true;
//                                     q.offer(new Pair(nbr,curr));
//                          }else if(nbr!=currParent){
//                                   return true;
//                          }
//                     }
//               }
//               return false;
//       }
//       public boolean isCycleHelper(){
//                 boolean vis[] = new boolean[n];
//                 Arrays.fill(vis,false);
//                 for(int i=0;i<v;i++){
//                           if(!vis[i]){
//                                    if(isCycle(i,vis)){
//                                    }
//                           }
//                 return false;
//       }
//       public void numberOfIsland(int i,int j,char grid[][],int n,int m){
//           if(i<0 || j<0  || i>=n  || j>=m  || grid[i][j]=='0'){
//                      return ;
//           }
//           grid[i][j] = '0';
//           numberOfIsland(i-1,j,grid,n,m);
//           numberOfIsland(i+1,j,grid,n,m);
//           numberOfIsland(i,j-1,grid,n,m);
//           numberOfIsland(i,j+1,grid,n,m);
//       }
//       public int numberOfIslandHelper(char grid[][]){
//         int n = grid.length;
//         int m = grid[0].length;
//         int ans = 0;
//         for(int i=0;i<n;i++){
//                  for(int j=0;j<m;j++){
//                          if(grid[i][j]=='1'){
//                               numberOfIsland(i,j,grid,n,m);
//                          }
//                  }
//         }
//         return ans;
//       }
//       public void mergeSort(int arr[],int start,int end){
//              if(start<end){
//                 int mid = start+(end-start)/2;
//                    mergeSort(arr, start, mid);
//                    merge(arr,start,mid,end);
//              }
//       }
//                  int i =0;
//                  int j = mid+1;
//                  int start=0;
//                  ArrayList<Integer> list = new ArrayList<>();
//                  while(i<=mid  && j<=end){
//                            if(arr[i]<arr[j]){
//                                   list.add(arr[i++]);
//                            }else{
//                            }
//                  }
//       }
// }
// public  class programe{
//         public static void main(String args[]){
//         }
//                   int n = a1.length;
//                   int m = a2.length;
//                   int j=0;
//                   int merge[] = new int[n+m];
//                   while(i<n && j<m){
//                            }else{
//                                      merge[k++] = a2[j++];
//                            }
//                   }
//                   while(i<n){
//                           merge[k++] =  a1[i++]; 
//                   }
//                   while(j<m){
//                           merge[k++] = a2[j++];
//                   }
//                   for(int i=0;i<n;i++){
//                           a1[i] = merge[i];
//                   }
//                   for(int j=0;j<m;j++){
//                            a2[j]  = merge[j];
//                   }
//         }
//         public static void main(String args[]){
//         }
// }
// public  class programe{
//         public static int countInversion(int arr[]){
//                  int n = arr.length;
//                           for(int j=i+1;j<n;j++){
//                                   if(arr[i]>arr[j]){
//                                   }
//                           }
//                  return count;
//         }
//         public static void mergeSort(int arr[],int start,int end){
//                  if(start<end){
//                          int mid = start+(end-start)/2;
//                          mergeSort(arr,start,mid);
//                          mergeSort(arr,mid+1,end);
//                          merge(arr,start,mid,end);
//                  }
//         }
//         public static void merge(int arr[],int start,int mid,int end){
//                         ArrayList<Integer> list = new ArrayList<>();
//                         int i=start;
//                         int j=mid+1;
//                         int start=0;
//                         while(i<=mid  && j<=end){
//                                 if(arr[i]>arr[j]){
//                                              list.add(arr[j--]);
//                                 }else{
//                                            list.add(arr[i++]);
//                                 }           
//                         }
//                         while(i<=mid){
//                                   list.add(arr[i++]);
//                         }
//                         int n = list.size();
//                         int ans[] = new int[n];
//                         int start = 0;
//                                   ans[start++]  =  list.get(i);
//                         }
//         }
//         public static void main(String args[]){
//                 int arr[] = {6,3,5,2,7};
//                  mergeSort(arr,0,arr.length-1);
//         }
// }
//   class ListNode{
//         int data;
//     public ListNode(int data) {
//         this.data = data;
//             int i=1;
//             while(i<=5){
//                    curr.next = new ListNode(i++);
//             }
//             curr = root;
//             while(curr!=null){
//                   System.out.print(curr.data +"   ");
//                   curr = curr.next;
//             }
//             return root;
//     }
//     void printList(ListNode curr){
//         ListNode ans = curr;
//                 while(ans!=null){
//                         System.out.print(ans.data +" ");
//                         ans = ans.next;     
//                 }          
//     }
//     ListNode reverseList(ListNode root){
//               ListNode prev = null;
//               ListNode curr = root;
//               while(curr!=null){
//                    ListNode next = curr.next;
//                    curr.next = prev;
//                    prev = curr;
//                    curr = next;
//               }
//               return prev;
//     }
// }
// public class programe{
//         public static void main(String args[]){
//                 ListNode  head = new ListNode(-1); 
//                 head.createList();
//                 head.reverseList();
//                 head.printList(head);
// }
// public class programe{
//         public static boolean detectCycle(int src,boolean vis[],boolean recPath[],int edges[][]){
//                                                             return  true;
//                                                 }
//                                             }else if(recPath[v]){
//                                                   return true; 
//                                             }
//                                     }
//                         }
//                         recPath[src] = false;
//         }
//         public static int[] courseSchedule2(int n,int numsCourses[][]){
//                       boolean vis[] = new boolean[n];
//                       boolean recPath[] = new boolean[n];
//                       int ans[] = new int[n];
//                       for(int i=0;i<numsCourses.length;i++){
//                          if(!vis[i]){
//                                     if(detectCycle(i, vis, recPath, numsCourses)){
//                                               return ans;   
//                                     }
//                          }
//                       }
//                 //          cycle doest not exist means you have to perfome the topoSort
//                            Stack<Integer> st = new Stack<>();
//                            boolean vis1[] = new boolean[n];
//                            for(int i=0;i<n;i++){
//                                   if(!vis1[i]){
//                                        topoSort(vis1,st,i, numsCourses);   
//                                   }    
//                            }
//                            int index = 0;
//                            while(!st.isEmpty()){
//                                   ans[index++] =  st.pop();
//                            }
//                            return  ans;
//         }
//         public static  void topoSort(boolean vis1[],Stack<Integer>st ,int src,int edges[][]){
//                         for(int i=0;i<edges.length;i++){
//                                   int v = edges[i][0];
//                                   int u = edges[i][1];
//                                   if(u==src){
//                                         if(!vis1[v]){
//                                                 topoSort(vis1, st, src, edges);
//                                         }      
//                                   }
//                         }
//                         st.push(src);
//         }
//         public static void dfs(int i,int j,int newColor,int oldColor,int mat[][]){
//                         if(i<0 || j<0 || i>=mat.length ||  j>=mat[0].length || mat[i][j]!=oldColor ){
//                                      return;
//                         }
//                         mat[i][j] =  newColor;
//                         dfs(i-1,j,newColor,oldColor,mat);
//                         dfs(i+1,j,newColor,oldColor,mat);
//                         dfs(i,j-1,newColor,oldColor,mat);
//                         dfs(i,j+1,newColor,oldColor,mat);
//         }
//         public static void floodFill(int mat[][],int sr,int sc,int newColor){
//                   int oldColor = mat[sr][sc];
//                        if(oldColor==newColor){
//                             return;
//                        }
//                        dfs(sr,sc,newColor,oldColor,mat);
//         }
//         public static void main(String args[]){
//         }
// }
// import java.util.*;
// public class programe{
//         public static boolean  isCycle(boolean vis[],boolean recPath[],int src,int edges[][]){
//                          vis[src] = true;
//                          recPath[src] =  true;
//                                  int v = edges[i][0];
//                                  int u = edges[i][1];
//                                             if(!vis[v]){
//                                                    if(isCycle(vis,recPath,v,edges)){
//                                                              return true;
//                                                    }
//                                             }else if(recPath[v]){
//                                                    return  true;
//                                             }
//                                  }
//                          }
//                          return false;
//         }
//         public static boolean canFinish(int n,int edges[][]){
//                         boolean vis[] = new boolean[n];
//                         boolean recPath[] = new boolean[n];
//                         for(int i=0;i<n;i++){
//                                    if(!vis[i]){
//                                           if(isCycle(vis,recPath,i,edges)){
//                                                     return false;
//                                           }
//                                    }
//                         }
//                         return true;
//         }
//         public static boolean isCycleDirectedGraph(int src,boolean vis[],boolean  recPath[],int edges[][]){
//                              vis[src] = true;
//                              recPath[src] =  true;
//                              for(int i=0;i<edges.length;i++){
//                                   int v = edges[i][0];
//                                   int u = edges[i][1];
//                                   if(src==u){
//                                           if(!vis[v]){
//                                                     if(isCycleDirectedGraph(v, vis, recPath, edges)){
//                                                            return true;
//                                                     }
//                                           }else if(recPath[v]){
//                                                 return true;
//                                           }
//                                   }
//                              }
//                              recPath[src] = false;
//                              return false;
//         }
//         public  static int[] courseSchedule2(int edges[][],int n){
//                   boolean vis[] = new boolean[n];
//                   boolean recPath[] = new boolean[n];
//                   int ans[] = new int[n];
//                   for(int i=0;i<n;i++){
//                           if(!vis[i]){
//                                    if(isCycleDirectedGraph(i,vis,recPath,edges)){
//                                            return ans;
//                                    }
//                           }
//                   }
//                   Stack<Integer> st = new Stack<>();
//                 //      topological sorting  perform
//                  boolean vis2[] = new boolean[n];
//                    for(int i=0;i<n;i++){
//                              if(!vis[i]){
//                                     topoSort(i, vis2, st, edges);
//                              }
//                    }
//                    while(!st.isEmpty()){
//                          ans[index++]  = st.pop();  
//                    }
//                    return ans;
//         }
//         public  static void topoSort(int src,boolean vis[],Stack<Integer> st,int edges[][]){
//                       vis[src] = true;
//                       for(int i=0;i<edges.length;i++){
//                            int v = edges[i][0];
//                            int u = edges[i][1];
//                            if(u==src){
//                                   if(!vis[v]){
//                                           topoSort(v, vis, st, edges);
//                       }
//                       st.add(src);
//         }
//         public static void main(String args[]){
//         }
// }
//         public static class ListNode{
//                 int data;
//                           return;
//                      }
//                      ListNode prev = null;
//                      ListNode curr = root;
//                           ListNode nextNode = curr.next;
//                           curr.next = prev;
//                           prev = curr;
//                           curr = nextNode;
//                      }
//                      while(prev!=null){
//                           System.out.print(prev.data);
//                           prev =  prev.next;
//                      }
//         }
//         void printList(ListNode root){
//                     while(root!=null){
//                            System.out.print(root.data +"   ");
//                            root = root.next;
//                     }
//         }
//         void middleLinkedList(ListNode root){
//                    if(root==null){
//                             return;
//                    }
//                    ListNode slow =  root;
//                    ListNode fast = root;
//                    while(  fast.next!=null && fast!=null  ){
//                               fast = fast.next.next;
//                               slow = slow.next;
//                    }
//                    System.out.println(slow.data  +"  ");
//         }
//         boolean detectCycle(ListNode root){
//                     if(root==null){
//                           return false;
//                     }
//                     ListNode slow = root;
//                     ListNode fast = root;
//                     while(fast!=null  &&  fast.next!=null){
//                               slow = slow.next;
//                               fast = fast.next.next;
//                               if(slow==fast){
//                                     return  true;
//                               }
//                     }
//                     return false;
//         }
//         ListNode detectCycleReturnStartingPoint(ListNode root){
//                      if(root==null){
//                          return  null;
//                      }
//                      ListNode fast = root;
//                      ListNode slow = root;
//                      while(fast!=null  && fast.next!=null){
//                           slow = slow.next;
//                           fast = fast.next.next;
//                           if(slow==fast){
//                                    fast = root;
//                                    while(fast!=slow){
//                                            fast = fast.next;
//                                            slow = slow.next;
//                                    }
//                                    return slow;
//                           }
//                      }
//                      return  null;
//         }
//         }
//         public static void main(String[] args) {
//                 ListNode node = new ListNode(-1);
//                 int i=0;
//                 ListNode curr = node;
//                 while(i<=5){
//                      curr.next = new ListNode(i);
//                      curr = curr.next;       
//                 }
//                 // System.out.print(node.detectCycle(node) );
//                System.out.print(node.detectCycleReturnStartingPoint(node));
//                 // node.reverseList(node);
//                 // node.middleLinkedList(node);
//         }
// }
// import  java.util.*;
// public class programe{
//                 int v;
//                 ArrayList<Integer>[]adj;
//                 }
//                 void addEdge(int u,int v){
//                             graph[u].add(v);
//                             graph[v].add(u);
//                 }
//                 void printGraph(){
//                             for(int i=0;i<v;i++){
//                                   System.out.print(i +"  ->  ");
//                                  for(int nbr: graph[i]){
//                                             System.out.print(nbr +" ");
//                                  }
//                                  System.out.println();
//                             }
//                 }
//                 void bfsTraversal(int src){
//                          Queue<Integer> q = new LinkedList<>();
//                          boolean vis[] = new boolean[v];
//                          q.offer(src);
//                          while(!q.isEmpty()){
//                                    int curr = q.poll();
//                                    System.out.print(curr);
//                                    for(int nbr: adj[curr]){
//                                               if(!vis[nbr]){
//                                                     vis[nbr] = true;
//                                                      q.offer(nbr); 
//                                               }
//                                    }
//                          }          
//                 }
//                 boolean bfsTraversalCycleDetection(){
//                           boolean vis[] = new boolean[v];
//                           for(int i=0;i<v;i++){
//                                   for(int nbr: adj[i]){
//                                           if(!vis[nbr]){
//                                                if(bfsTraversalCycleDetectionHelper(vis,nbr,-1)){
//                                                    return true;
//                                                }     
//                                           }
//                                   }
//                           }
//                           return false;
//                 }
//                 public static class Pair{
//                         int curr;
//                         int parent;
//                         Pair(int curr,int parent){
//                                   this.curr = curr;
//                                   this.parent = parent;
//                         }
//                 }
//                 boolean bfsTraversalCycleDetectionHelper(boolean vis[],int curr,int parent){
//                          q.offer(new Pair(curr,parent));
//                          vis[curr]   = true;
//                          while(!q.isEmpty()){
//                                    Pair currPair = q.poll();
//                                    int node = currPair.curr;
//                                    int currParent = currPair.parent;
//                                    for(int nbr: adj[node]){
//                                          if(!vis[nbr]){
//                                                    vis[nbr] = true;
//                                                    q.offer(new Pair(nbr,node));
//                                          }else if(currParent!=nbr){ 
//                                                    return true;
//                                          }
//                                    }
//                          }
//                                  return false;
//                 }
//                 boolean isCycleDirectedDfs(int curr,boolean vis[],boolean recPath[]){
//                                   vis[curr]  = true;
//                                   recPath[curr]=  true;
//                                   for(int nbr: adj[curr]){
//                                          if(!vis[nbr]){
//                                                    if(isCycleDirectedDfs(nbr,vis,recPath)){
//                                          }else if(recPath[nbr]){
//                                                     return true;
//                                          }
//                                   }
//                                   recPath[nbr] = false;
//                                   return false;
//                 }
//                 boolean isCycleDirectedDfsHelper(){
//                               int curr = 0;
//                               boolean vis[] = new boolean[v];
//                               boolean recPath[] = new boolean[v];
//                               for(int i=0;i<v;i++){
//                                   if(isCycleDirectedDfs(i,vis,recPath)){
//                                           return true;
//                                   }
//                               }
//                               return false;
//                 }
//                 void topoSort(){
//                           Stack<Integer> st = new Stack<>();
//                           boolean vis[] = new boolean[v];
//                           for(int i=0;i<v;i++){
//                                   if(!vis[i]){
//                                              dfsTopoSort(vis,i,st);
//                                   }
//                           }
//                           while(!st.isEmpty()){
//                                    System.out.print(st.poll());
//                           }
//                 }
//                 void dfsTopoSort(boolean vis[],int curr,Stack<Integer> st){
//                             vis[curr] = true;
//                             for(int nbr: adj[curr]){
//                                      if(!vis[nbr]){
//                                               dfsTopoSort(vis,nbr,st);
//                                      }
//                             }
//                             st.push(curr);
//                 }
//          }
//         public static void main(String args[]){
//         }
// }
//         }
//         public static int numberIsland(char grid[][]){
//                  int n = grid.length;
//                  int island = 0;
//                  int m  = grid[0].length;
//                  boolean vis[][] = new boolean[n][m];
//                  for(int i=0;i<n;i++){
//                           for(int j=0;j<m;j++){
//                                    if(grid[i][j]==1){
//                                    }
//                           }
//                  }
//                 return island;
//         }
//         public static void main(String[] args) {
//         }
// }
// public class programe{
//         public static class Pair{
//         }
//         }
//         public static int rottenOranges(int grid[][]){
//                   int n = grid.length;
//                   int m = grid[0].length;
//                   boolean vis[][] = new boolean[n][m];
//                   Queue<Pair> q = new LinkedList<>();
//                   for(int i=0;i<n;i++){
//                           for(int j=0;j<m;j++){
//                                  if(grid[i][j]==2){
//                                              vis[i][j]=  true;
//                                  }
//                           }
//                   }
//                   while(!q.isEmpty()){  
//                              Pair curr = q.poll();
//                              int i = curr.i;
//                              int j =curr.j;
//                              int time = curr.time;
//                              ans = Math.max(time,ans);
//                              if(i-1>0  && vis[i-1][j]!=true  && grid[i-1][j]==1){
//                                            q.offer(new Pair(i-1, j, time+time));
//                              }
//                              if(i+1<n  && vis[i+1][j]!=true  && grid[i+1][j]==1){
//                                         vis[i+1][j] = true;
//                                         q.offer(new Pair(i+1,j,time+1));
//                              }
//                              if(j-1>0  && vis[i][j-1]!=true  && grid[i][j-1]==1){
//                                       vis[i][j-1] = true;
//                                       q.offer(new Pair(i,j-1,time+1));
//                              }
//                              if(j+1<m  && vis[i][j+1]!=true  && grid[i][j+1]==1){
//                                          vis[i][j+1] = true;
//                                          q.offer(new Pair(i, j+1, time+1));
//                              }
//                   }
//                   for(int i=0;i<n;i++){
//                           for(int j=0;j<m;j++){
//                                   if(grid[i][j]==1  && vis[i][j]!=true){
//                                             return  -1;
//                                   }
//                           }
//                   }
//                   return ans;
//         }
//         public static void main(String[] args) {
//         }
// }
//            void gender();
// }
//           @Override
//           public void year(){
//                   System.out.println("Enter your age here");
//           }
// }
// public  class programe{
//          public static void main(String[] args) {
//                  person p = new person();
//                  p.year();
//                  p.gender();
//          }
// }
//         public static void main(String[] args) {
//                 Dog d = new Dog();
//         }
// }
// }
// public class programe{
//           public static void main(String[] args) {
//                   Dog d = new Dog();
//                   d.eat();
//                   d.sound();
//           }
// }
//         int v ;
//         ArrayList<Integer>[]graph;
//         adj(int v){
//                  this.v = v;
//                  this.graph = new ArrayList[v];
//                  for(int i=0;i<v;i++){
//                           graph[i] = new ArrayList<>();
//                  }
//         }
//         public  void addEdge(int u,int v){
//                     graph[u].add(v);
//                     graph[v].add(u);
//         }
//         public void printGraph(){
//                   for(int i=0;i<v;i++){
//                           System.out.print(i+" -> ");
//                          for(int nbr: graph[i]){
//                                 System.out.print(nbr +" ");
//                          }
//                          System.out.println();
//                   }
//         }
//         public  void bfsTravesal(int src){
//                   Queue<Integer> q = new LinkedList<>();
//                   boolean vis[] = new boolean[v];
//                   q.add(src);
//                   while(!q.isEmpty()){
//                          int curr = q.poll();
//                          System.out.print(curr +"  ");
//                          for(int nbr: graph[curr]){
//                                   if(!vis[nbr]){
//                                           vis[nbr] = true;
//                                            q.offer(nbr);
//                                   }
//                          }
//                   }
//         }
//         public void dfsTraversal(int src,boolean vis[]){
//               vis[src] = true;
//                System.out.print(src +"   ");
//               for(int nbr: graph[src]){
//                       if(!vis[nbr]){
//                             dfsTraversal(nbr,vis);
//                       }
//               }
//         public boolean bfsCycleUndirected(){
//             int v = 5;
//                 for(int i=0;i<v;i++){
//                         if(!vis[i]){
//                                if(bfsCycleUndirectedHelper(vis,i)){
//                                     return true;
//                                }
//                         }
//                 }
//                 return false;
//         }
//           public  boolean  bfsCycleUndirectedHelper(boolean vis[],int src){
//                       q.offer(new Pair(src,-1));
//                       for(int nbr: graph[src]){
//                                Pair curr =  q.poll();
//                                int node = curr.node;
//                                int parent =  curr.parent;
//                                if(!vis[node]){
//                                      vis[node] = true;
//                                        q.offer(new Pair(nbr,node));
//                                }else if(nbr!=parent){
//                                        return  true;
//                                }
//                       }
//                       return false;
//           }
//           public int numberIsland(char board[][]){
//             int n = board.length;
//             int m  = board[0].length;
//             int ans = 0;
//               for(int col[] :  vis){
//                      Arrays.fill(col,false);
//               }
//               for(int i=0;i<n;i++){
//                   for(int j=0;j<m;j++){
//                       ans++;
//                       dfs(i,j,n,m,board,vis);
//                   }
//               }
//               return ans;
//           }
//           public  void dfs(int i,int j,int n,int m,char board[][],boolean vis[][]){
//                  if(i<0 || j<0  || i>=n  || j>=m  || board[i][j]!='1' || vis[i][j]==true){
//                         return ;
//                  }
//                  vis[i][j] = true;
//                  dfs(i-1,j,n,m,board,vis);
//                  dfs(i,j+1,n,m,board,vis);
//                  dfs(i,j-1,n,m,board,vis);
//           }
//           public 
//     }
//     public static void main(String args[]){
//             //     object creating
//               adj ad = new adj(5);
//               ad.addEdge(1,3);
//               ad.addEdge(2,3);
//               ad.addEdge(0,2);
//                System.out.print(ad.bfsCycleUndirected());
//             //   boolean vis[] = new boolean[5]
//                 // ad.dfsTraversal(1,vis);
//             //   ad.printGraph();
//             //   ad.bfsTravesal(1);
//     }
// }
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static  void levelOrder(TreeNode root){
//                if(root==null){
//                }
//                Queue<TreeNode> q  = new LinkedList<>();
//                q.offer(root);
//                while(!q.isEmpty()){
//                     System.out.print(curr.data);
//                              q.offer(curr.left);
//                     }
//                     if(curr.right!=null){
//                            q.offer(curr.right);
//                     }
//                }
//     }
//     public static void main(String args[]){
//         TreeNode   root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.right.right = new TreeNode(5);
//         levelOrder(root);
// }
// import java.util.*;
//         int data;
//         Node next;
//         }
//     }
//     public static void copyListWithRandomPointer(Node root){
//                      if(root==null){
//                             return;
//                      }
//                      Node curr = root;
//                      while(curr!=null){
//                         map.put(curr,new Node(curr.data));
//                         curr = curr.next;
//                      }
//                     //    utani hi node  create karo jitani ki map ke andar exist karti h  then just  assign the pointer
//                     curr = root;
//                     Node newNode  = new Node(root.data);
//                      while(curr!=null){
//                           Node copy = map.get(curr);
//                           copy.next = map.get(curr.next);
//                           copy.random = map.get(curr.random);
//                         curr = curr.next;
//                      }
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.ArrayList;
//     public static void spiralMatrix(int mat[][]){
//          int m = mat[0].length;
//          int bottom  = m-1;
//          int  left =0;
//           while(left<=right  && top<=bottom){
//                           ans.add(mat[top][i]);
//                    }  
//                    top++;
//                    for(int i=top;i<=bottom;i++){ 
//                          ans.add(mat[i][right]);
//                    }
//                    right--;
//                    if(top<=bottom){
//                        for(int i =right;i>=left;i--){
//                             ans.add(mat[bottom][i]);
//                        }
//                        bottom--;
//                    }
//                    if(left<=right){
//                          for(int i =bottom;i>=top;i--){
//                                     ans.add(mat[i][left]);
//                          }
//                          left++;
//                    }
//          }
//     }
//       public   static void main(String args[]){
//       }
// }
// import java.util.*;
// public class programe{
//                     //      take
//                        list.add(nums[index]);
//                        CombinationSumHelper(nums, target-nums[index], index, ans, list);
//                        list.remove(list.size()-1);
//                        CombinationSumHelper(nums, target, index+1, ans, list);
//                   }
//     }
//     public static void CombinationSum(int nums[],int target){
//               ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//               ArrayList<Integer> list = new ArrayList<>();
//               CombinationSumHelper(nums, target,0,ans,list);
//               for(ArrayList<Integer> num: ans){
//                    for(int n: num){
//                           System.out.print(n +"  ");
//               }
//     public static void subsetHelper(String s ,int index,ArrayList<String> ans,StringBuilder sb){ 
//                 if(index==s.length()){
//                         ans.add(new String(sb));
//                         return;
//                 }
//                 //   take
//                 subsetHelper(s, index+1 ,ans, sb.append(s.charAt(index)));
//                 //    not take
//                 subsetHelper(s, index+1, ans, sb);
//     }
//     public static void main(String args[]){
//           String s = "abc";
//           int index=0;
//           ArrayList<String> ans = new ArrayList<>();
//           StringBuilder sb = new StringBuilder();
//                subsetHelper(s, index, ans, sb);
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//             int n = 5;
//             int m = 5;
//             for(int i=0;i<=n;i++){
//                   for(int j=0;j<=n;j++){
//                           System.out.print(" * ");
//                       }
//                     System.out.println();
//             }
//     }
// }
// public  class programe{
//     public static void main(String args[]){
//            int n = 5;
//            for(int i=1;i<=n;i++){
//               for(int j=1;j<=i;j++){
//                      System.out.println(j +"  ");
//               }
// import java.util.*;
// public class programe{
//     public static void  combinationSum(int nums[],int target,ArrayList<ArrayList<Integer>> ans,int index,ArrayList<Integer> list){
//                if(index>=nums.length){
//                     ans.add(new ArrayList<>(list));
//                     return ;
//                }
//                  list.add(nums[index]);
//                 combinationSum(nums, target, ans, index, list);
//     }
//     public static void helper(int nums[],int target){
//             ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//             ArrayList<Integer> list = new ArrayList<>();
//             combinationSum(nums,target,ans,0,list);
//             for(ArrayList<Integer> e : ans){
//                    for(int num: e){
//                        System.out.println();
//             }
//     }
//     public static void main(String[] args) {
//         int target =9;
//         helper(nums,target);
//     }
// }
// import java.util.*;
// public static void helper(int n,int nums[]){
// public static void helper(int i,ArrayList<String> ans ,String s,ArrayList<ArrayList<String>> list){
//            if(i==s.length()){
//                     list.add(new ArrayList<>(ans));
//                     return ;
//            }
//       //        take
//       helper(i+1,ans.add(s.charAt(i)),list);
//       helper(i+1,ans,list);   
// public static void main(String args[]){
//           ArrayList<ArrayList<String>> ans = new ArrayList<>();
//           ArrayList<String> list = new ArrayList<>();
//           helper(0,list,"abc",ans);
//           for(ArrayList<String> a: ans){
//               for(String ch: a){
//                        System.out.println(ch +"  ");
//               }
//           }
// import java.util.*;
// public class programe{
//       public static void main(String args[]){
//               int target=2;
//                     while(left<right){
//                           int sum = nums[left]+nums[right]+ nums[i];
//                           if(Math.abs(target-sum)<Math.abs(target-closestSum)){
//                                       closestSum = sum;
//                           }
//                           if(sum<target){
//                                  left++;
//                           }else if(target<sum){
//                                   right--;
//                           }else{
//                                    return sum;
//                           }
//                     }
//                }
//                return  closestSum;
//       }
// }
// import java.util.*;
// public class  programe{
//     public static List<List<Integer>> combinationSum(int nums[],int target){
//          List<List<Integer>> ans  = new ArrayList<>();
//          backTrack(ans,nums,target,0,new ArrayList<>());
//          return  ans;
//                 if(target==0){
//                         return ;
//                 }
//                 if( index==nums.length||target<0  ){
//                      return;
//                 }
//                 list.remove(list.size()-1);
//                 backTrack(ans, nums, target, index+1, list);
//     }
//     public static int networkDelay(int time[][],int n,int k){
//              List<List<int[]>> adj = new ArrayList<>();
//              for(int i=0;i<=n;i++){
//                    adj.add(new ArrayList<>());
//              }
//              for(int edge[]:time){
//                    adj.get(edge[0]).add(new int[]{edge[1],edge[2]});
//              }
//              PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
//              int dis[] = new int[n+1];
//              Arrays.fill(dis,Integer.MAX_VALUE);
//              dis[k] = 0;
//              pq.offer(new int[]{k,0});
//              while(!pq.isEmpty()){
//                    int curr[] = pq.poll();
//                    int node= curr[0];
//                    int t = curr[1];
//                          continue; 
//                    }
//                    for(int nbr[] : adj.get(node)){
//                            int nextNode = nbr[0];
//                            int nextTime = nbr[1];
//                            if(dis[nextNode]>t+nextTime){
//                                     dis[nextNode] = t+nextTime;
//                                     pq.offer(new int[]{nextNode,dis[nextNode]});
//                            }
//                    }
//              }
//              return -1;
//     }
//     public static List<List<Integer>> helper(int nums[],int index){
//                      List<List<Integer>> ans  = new ArrayList<>();
//                      subSetHelper(ans,nums,index,new ArrayList<>());
//                      return ans;
//     }
//     public static void subSetHelper(List<List<Integer>>ans,int nums[],int index,List<Integer> list){
//                        ans.add(new ArrayList<>(list));
//                      for(int i=index;i<nums.length;i++){
//                               subSetHelper(ans, nums, i+1, list);
//                               list.remove(list.size()-1);
//                      }
//     }
//     public static boolean isValid(){
//                    String s = "+-1";
//                    boolean isSymbol = false;
//                    for(int i=0;i<s.length();i++){
//                                char ch = s.charAt(i);
//                                if((ch=='+' || ch=='-') && (i>0)){
//                                          isSymbol = true;   
//                                }
//                    }
//     }
//     public static void main(String[] args) {
//               System.out.print(isValid());
//     }
// }
// public class  programe{
//     public static int helper(int nums[]){
//          int n = nums.length;
//          int max = Integer.MIN_VALUE;
//          for(int i=0;i<n;i++){
//          }
//          return max;
//     public static void secondLargest(int nums[]){
//           int largest = Integer.MIN_VALUE;
//           int second = Integer.MIN_VALUE;
//           int n = nums.length;
//           for(int num: nums){
//                 if(largest<num){
//                          second = largest;
//                          largest = num;
//                 }
//                  else if(second<num  && second!=num){
//                         second = num;
//                 }
//           }
//           System.out.print(second);
//     }
//     public static  void reverseArray(int nums[]){
//                  int n = nums.length;
//                  int left=0;
//                  int right=n-1;
//                  while(left<right){
//                   int temp = nums[left];
//                   nums[left] = nums[right];
//                   nums[right] = temp;
//                  }
//                   for(int num : nums){
//                        System.out.print(num +"  ");
//                   }
//     }
//     public static void moveZeroes(int nums[]){
//                 int j=0;
//                 int n = nums.length;
//                 for(int i=0;i<n;i++){
//                       if(nums[i]!=0){
//                             int temp = nums[i];
//                             nums[i] = nums[j];
//                             nums[j] = temp;
//                             j++;
//                       }
//                 }
//                 for(int num: nums){
//                       System.out.print(num +"  ");
//                     }
//     }
//      public static int removeDuplicate(int nums[]){
//               if(nums.length==0){
//                        return 0;
//               }
//               int n = nums.length;
//               int i=0;
//               for(int j=1;j<n;j++){
//                  if(nums[i]!=nums[j]){
//                     nums[i]= nums[j];
//                  }
//               }
//               return i+1;
//      }
//      public static int missingNumber(int nums[]){
//                  int n = nums.length;
//                  int expected = n*(n+1)/2;
//                  int actual = 0;
//                  for(int num: nums){
//                       actual += num;
//                  }
//                  return  expected-actual;
//      }
//      public static void maxWaterHelper(int nums[]){
//         int n = nums.length;
//         int left=0;
//         int right = n-1;
//         int maxWater = 0;
//         while(left<right){
//             int weight = right-left;
//             int height = Math.min(nums[left],nums[right]);
//             maxWater = Math.max(weight*height,mmaxWatera;xWater);
//               fif(nums[left]<nums[right]){
//                      left++;
//               }else{
//                     right--;
//               }
//         }
//         System.out.print(maxWater);
//      }
//      public static void spiralMatrix(int nums[][]){
//             ArrayList<Integer> list =new ArrayList<>();
//             int top=0;
//             int left=0;
//             int bottom = nums.length-1;
//             int right = nums[0].length;
//             while(top<=bottom  && left<=right){
//                    for(int i=left;i<=right;i++){
//                             list.add(nums[top][i]);
//                    }
//                    left++;
//                    for(int i=top;i<=bottom;i++){
//                            list.add(nums[i][right]);
//                    }
//                    top++;
//                    if(top<=right){
//                         for(int i=right;i>=left;i--){
//                             list.add(nums[bottom][i]);
//                    }
//                       bottom--;
//                    }
//                    if(left<=right){
//                            for(int i=bottom;i>=top;i--){
//                                   list.add(nums[i][left]);
//                            }
//                            left++;
//                    }
//             }
//             for(int num: nums){
//                      System.out.print(nums);
//             }  
//      }
//     public static void main(String args[]){
//         int nums[] = {1,0,-1,3,4,-5,0,0,5,9,0};
//               maxWaterHelper(nums);
//     }
// public  class  programe{
//     public static boolean canFinish(int preq[][],int numCourses){
//               List<List<Integer>> adj = new ArrayList<>();
//               for(int i=0;i<preq.length;i++){
//                     adj.add(new ArrayList<>());
//               }
//               for(int pr[]: preq){
//                    int u = pr[0];
//                    indegree[u]++;
//               }
//               Queue<Integer> q = new LinkedList<>();
//               for(int i=0;i<preq.length;i++){
//                           if(indegree[i]==0){
//                                 q.offer(i);
//                           }
//               }
//               int count=0;
//               while(!q.isEmpty()){
//                    int curr = q.poll();
//                    for(int next:adj.get(curr)){
//                                indegree[next]--;
//                                if(indegree[next]==0){
//                                      q.offer(next);
//                                }
//                    }
//               }
//                return  count==numCourses;   
//     }
//     public  static void main(String args[]){
//     }
// }
// import com.sun.source.tree.Tree;
// import java.util.PriorityQueue;
//     public static class Pair{
//         int node;
//         public Pair(int node,int wt) {
//             this.wt = wt;
//         }
//     public static int helper(ArrayList<ArrayList<Pair>> adj,int v){
//          boolean vis[] = new boolean[v];
//          PriorityQueue<Pair> pq = new PriorityQueue<>();
//          pq.offer(new Pair(0, 0));
//          while(!pq.isEmpty()){
//                Pair curr = pq.poll();
//                int node = curr.node;
//                int wt = curr.wt;
//                      vis[node] =  true;
//                      sum += wt;
//                      for(Pair  next :  adj.get(node)){
//                                 if(!vis[next.node]){
//                                          pq.offer(new Pair(next.node,next.wt));
//                                 }
//                      }
//                }
//                 return  sum;
//          }
//     }
//     public static void main(String args[]){
//     }
// }
// public class programe{
//               boolean vis[] = new boolean[v];
//               Stack<Integer> st = new Stack<>();
//                   if(!vis[i]){
//                           dfsHelper(adj,vis,i,st);
//               while(!st.isEmpty()){
//                       int curr = st.pop();
//                       ans[index++]  = curr;
//               }
//               for(int i=0;i<v;i++){
//                   Systme.out.print(ans[i]);
//               }
//     }
//     public static void dfsHelper(ArrayList<Integer> adj,boolean vis[],int i,Stack<Integer> st){
//                   vis[i] = true;
//                   for(int next: adj.get(i)){
//                        if(!vis[next]){
//                               dfsHelper(adj,vis,next,st);
//                        }
//                   }
//                   st.add(i);
//     }
//     public static void main(String args[]){
//     }
// }
//     public static void topoSort(int v,ArrayList<ArrayList<Integer>>adj){
//                int indegree[] = new int[v];
//             //       traversel on graph
//              for(int i=0;i<v;i++){
//              for(i=0;i<v;i++){
//                  if(indegree[i]==0){
//                           q.offer(i);
//                  }
//              }
//              int index=0;
//                 int ans[] = new int[v];
//                while(!q.isEmpty()){
//                   int node = q.poll();
//                   ans[index++]  = node;
//                        for(int next: adj.get(node)){
//                                indegree[next]--;
//                                if(indegree[next]==0){
//                                           q.offer(next);
//                                }
//                        }
//                }
//     }
//     public static void main(String args[]){
//     }
// }
// public  class programe{
//         int node;
//         Pair(int node,int wt){
//              this.node = node;
//         }
//      public static int helper(ArrayList<ArrayList<ArrayList<Integer>>> adj,int v){
//                  PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.wt-b.wt);
//                  pq.offer(new Pair(0,0));
//                 boolean vis[] = new boolean[v];
//                  vis[0]  = true;
//                  int shortestPath = 0;
//                  while(!pq.isEmpty()){
//                        if(!vis[curr.node]){
//                               vis[curr.node] = true;
//                                for(ArrayList<Integer> e : adj.get(curr.node)){
//                                 int edge = e.get(0);
//                                 int cost = e.get(1);
//                                 if(!vis[edge]){
//                                       pq.offer(new Pair(edge,cost));
//                                 }
//                                }
//                        }
//                  }
//                  return   shortestPath ;
//      }
//     }
// }
//     public static void main(String args[]){
//           Arrays.sort(g);
//           Arrays.sort(s);
//           int n = g.length;
//           int m = s.length;
//                 if(s[j]>=g[i]){
//                        i++;
//                        j++;
//                 }
//                 j++;
//           }
//           System.out.print(i);
//     }
// }
// import java.util.*;
// public class programe{
//     public static class Node{
//              Node left;
//              Node right;
//              Node(int data){
//                   this.data  = data;
//     }
//      public static Node LCA(Node root,Node p,Node q){
//            if(root==null  ||  p==null  || q==null){
//                return root;
//            }
//            Node left = LCA(root.left,p,q);
//            Node right = LCA(root.right,p,q);
//            if(left!=null  && right!=null){
//                   return root;
//            }
//              return (left==null)?right:left;
//      }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//         int data;
//         Node left;
//     }
//     public static List<List<Integer>> helper(Node root){
//         List<List<Integer>> ans = new ArrayList<>();
//         if(root==null){
//                     return ans;
//         }
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         while(!q.isEmpty()){
//               int size = q.size();
//               ArrayList<Integer> list = new ArrayList<>();
//               for(int i=0;i<size;i++){
//                       Node curr = q.poll();
//                       list.add(curr.data);
//                       if(curr.left!=null){
//                               q.offer(curr.left);
//                       }if(curr.right!=null){
//                             q.offer(curr.right);
//                       }
//               }
//               ans.add(list);
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
//     public static boolean  isValid(String s){
//            Stack<Character> st = new Stack<>();
//            for(char ch: s.toCharArray()){
//                    if(ch=='('|| ch=='{' || ch=='['){
//                        char top = st.pop();
//                        if((top!=')' && ch=='(' )|| (top!=']' && ch==']' ) || (top!='}'  && ch=='{')){
//                            return false;
//                        }
//                    }
//            }
//            return true;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public static Node{
//         int data;
//         Node(int data){
//               this.data = data;
//          if(head==null){
//                 return false;
//          }
//          HashSet<Integer> set = new HashSet<>();
//            Node curr = head;
//            while(curr!=null){
//                    if(set.contains(curr.data)){
//                        return true;
//                    }
//                    set.add(curr.data);
//                    head = head.next;
//            }
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//                if(root==null){
//                     return null;
//                }
//                Node prev = null;
//                Node curr = root;
//                while(curr!=null){
//                    Node next = curr.next;
//                    curr.next =prev;
//                    prev  = curr;
//                    curr = next;
//                }
//                return prev;
//      }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//                    }
//             }
//       }
//     public static void main(String args[]){
//     }
// public class programe{
//     public static void main(String args[]){
//                 for(int j=i+1;j<n;j++){
//                     bestSell  = nums[j];
//                         if(bestBuy<bestSell){
//                                  maxProfit = Math.max(maxProfit,bestSell-bestBuy);
//                         }
//                 }
//         }
//         System.out.print(maxProfit);
//     }
// }
// public class programe{
//     public static int[] 2Sum(){
//                   return new int[]{left,right};
//               }else if(sum>target){
//                        right--;
//               }else{
//                   left++;
//               }
//            }
//            return  new int[]{-1,-1};
//     }
//     public static void main(String args[]){
//     }
// }
//           }
//      }
//     public static ArrayList<String> helper(int n){
//             ArrayList<String> ans = new ArrayList<>();
//             helper(n,0,0,ans,"");
//             return ans;
//     }
//     public static void main(String[] args) {
// public class programe{
//         int data;
//         ListNode next;
//         public ListNode(int data) {
//             this.data = data;
//      public static ListNode helper(ListNode root){
//              if(root==null){
//                    return null;
//              }
//              ListNode curr = root;
//              while(curr!=null){
//                    ListNode next = curr.next;
//                    curr.next = prev;
//                    curr = next;
//              }
//              return prev;
//      }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
//       public static int helper(int edges[][],int src,int V){
//                  ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//                           int u = edge[1];
//                           adj.get(v).add(u);
//                           adj.get(u).add(v);
//                    }
//                    dis[src] =   0;
//                    Queue<Integer> q = new LinkedList<>();
//                      q.add(src);
//                      while(!q.isEmpty()){
//                           int  curr = q.poll();
//                           for(int nbr: adj.get(curr)){
//                                  if(dis[curr]+1 <dis[nbr]){
//                                          dis[nbr] = dis[curr]+1;
//                                  }
//                           }
//                      }
//                      int minValue = 0;
//                      for(int i=0;i<V;i++){
//                          if(dis[i]==Integer.MAX_VALUE){
//                                   dis[i] = -1;
//                          }else{
//                          }
//                      }
//       }
//       public static void main(String args[]){
//       }
// }
// public class programe{
//       public static class Pair{
//       }
//       public static int minCost(ArrayList<ArrayList<Pair>> adj,int v ){
//             PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.wt-b.wt);
//             boolean vis[]  = new boolean[v];
//             pq.add(new Pair(0,0));
//             while(!pq.isEmpty()){
//                      Pair curr = pq.poll();
//                      int first = curr.node;
//                      int second = curr.wt;
//                             continue;
//                      }
//                       vis[first] = true;
//                       sum += second;
//                       for(Pair nbr: adj.get(first)){
//                               if(!vis[nbr.node]){
//                                            pq.offer(new Pair(nbr.node,nbr.wt));
//                               }
//                       }
//             }
//             return sum;
//       }
//       public  static   void main(String args[]){
//       }
// }
// import java.util.*;
// public class programe{
//         Node right;
//         Node(int data){
//               this.left = null;
//               this.right = null;
//     }
//     public static boolean isMirror(Node root){
//                 return isMirrorHelper(root.left,root.right);
//     }
//     public static boolean isMirrorHelper(Node left,Node right){
//           if(left==null  && right==null){
//                  return true;
//           }
//           if(left==null  || right==null){
//                  return false;
//           }
//           if(left.data!=right.data){
//                 return false;
//           }
//           if(left.data==right.data){
//                 return true;
//           }
//           return isMirrorHelper(left.left,right.right)&& isMirrorHelper(left.right,right.left);
//     }
//     public static void main(String args[]){
//     }
// }
// public class programe{
//     public static class TrieNode{
//         TrieNode[] children;
//                   children = new TrieNode[26];
//                   isEnd = false;
//     }
//     public static TrieNode root;
//      public static void insert(String word){
//                   TrieNode curr = root;
//                             if(curr.children[index]==null){
//                                      curr.children[index]  = new TrieNode;
//                             }
//                   }
//                   curr.isEnd = true;        
//      }
//      public static boolean search(String word){
//                  TrieNode curr = root;
//                  for(char ch : word.toCharArray()){
//                       int index = ch-'a';
//                       if(curr.children[index]==null){
//                       }
//                       curr = curr.children[index];
//                  }
//                  return curr.isEnd==true;
//      }
//     public static void main(String args[]){
//     }
// }
// public class programe{
//         int  data;
//         TreeNode left;
//     }
//     public static boolean isValidBst(TreeNode root){
//            return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
//     }
//     public static boolean validate(TreeNode root,int min,int max){
//              if(root==null){
//                    return true;
//              }
//              if(root.data<=min  ||  root.data>=max){
//                            return false;
//              }
//              return validate(root.left,min,root.data) && validate(root.right,root.data,max);
//     }
//     public static void main(String args[]){
//     }
// }
// public class programe{
//     public static int findOrder(int prequisition[][],int courses){
//         int indegree[] = new int[courses];
//         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//               int second = pre[1];
//               adj.get(first).add(second);
//               indegree[second]++;
//          Queue<Integer> q  = new LinkedList<>();
//          int ans[]= new int[courses];
//          int i=0;
//          for(int i=0;i<courses;i++){
//                if(indegree[i]==0){
//                   q.offer(i);
//                }
//          }
//          while(!q.isEmpty()){
//              int curr = q.poll();
//              ans[i++]   = curr;
//              for(int nbr: adj.get(curr)){
//                          indegree[nbr]--;
//                          if(indegree[nbr]==0){
//                                 q.offer(nbr);
//                          }
//              }
//          }
//          if(index!=courses){
//                 return -1;
//          }
//     }
//     public static void main(String args[]){
// }
// import java.util.*;
//     public static boolean canFinish(int prequistion[][],int numCourses){
//           ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//                  int require = pre[1];
//                  adj.get(course).add(require);
//                  indege[require]++;
//           }
//           int start=0;
//           Queue<Integer> q = new LinkedList<>();
//           while(!q.isEmpty()){
//               int curr= q.poll();
//               start++;
//               for(int nbr: adj.get(curr)){
//                        indege[nbr]--;
//                        if(indege[nbr]==0){
//               }
//           }
//           return start==numCourses;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
//     public static boolean isCycle(ArrayList<ArrayList<Integer>> adj,int v){
//           int indegree[] = new int[v];
//               if(indegree[i]==0){
//                       q.offer(i);
//               }
//           }
//           int count=0;
//           while(!q.isEmpty()){
//               int curr = q.poll();
//                count++;
//                for(int nbr: adj.get(curr)){
//                       indegree[nbr]--;
//                       if(indegree[nbr]==0){
//                              q.offer(nbr);
//                       }
//                }
//           }
//           return count!=v;
//     }
//     public static void main(String args[]){
//     }
// }
// public class programe{
//                   vis[src] = true;
//                   pathVis[src]= true;
//                             }else if(pathVis[nbr]){
//                                     return true;
//                   }
//                   pathVis[src] = false;
//                   return false;
//     }
//     public static boolean isCycle(ArrayList<ArrayList<Integer>> adj,int v){
//             boolean visited[] = new boolean[v];
//             boolean pathVis[] = new boolean[v];
//             for(int i=0;i<v;i++){
//                   if(!visited[i]){
//                         if(dfs(i,visited,pathVis,adj)){
//                               return true;
//                         }
//                   }
//             }
//             return false;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public static boolean dfs(boolean visited[],ArrayList<ArrayList<Integer>> adj,int v,int i,int parent){
//                    visited[i] = true;
//                       if(!visited[nbr]){
//                             if(dfs(visited,adj,v,nbr,i)){
//                       }
//                  }
//           return false;
//     }
//     public static boolean helper(ArrayList<ArrayList<Integer>> adj,int v){
//             boolean visited[]  = new boolean[v];
//             for(int i=0;i<v;i++){
//                    if(!visited[i]){
//                         if(dfs(visited,adj,v,i,-1)){
//                                return true;
//                    }
//             }
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public   static class Pair{
//          int node;
//          public Pair(int node,int parent){
//                this.node = node;
//             boolean visited[] = new boolean[v];
//             for(int i=0;i<v;i++){
//                   if(!visited[i]){
//                             if(bfs(adj,v,visited,i)){
//                                        return true;
//                             }
//                   }
//             }
//             return false;
//     }
//     public static boolean bfs(ArrayList<ArrayList<Integer>> adj,int v,boolean visited[],int start){
//                         Queue<Pair> q  = new LinkedList<>();
//                         q.add(new Pair(start,-1));
//                         visited[start] = true;
//                         while(!q.isEmpty()){
//                                  Pair curr =  q.poll();
//                                  int node = curr.node;
//                                  int parent = curr.parent;
//                                  for(int nbr: adj.get(node)){
//                                          if(!vis[nbr]){
//                                                visited[nbr] = true;
//                                                q.offer(new Pair(nbr,node));
//                                          }else if(nbr!=parent){
//                                                   return true;
//                                          }
//                                  }
//                         }
//                         return false;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public static void dfs(int grid[][],int oldColor,int newColor,int sr,int sc){
//                   if(sr<0  ||  sc<0  || sc>=grid[0].length || sr>=grid.length  || grid[sr][sc]==0){
//                   }
//                    grid[sr][sc] = newColor;
//     }
//     public static void helper(int grid[][],int oldColor,int newColor,int sr,int sc){
//         if(grid[sr][sc]==newColor  || grid[sr][sc]==0){
//                   return;
//         }
//            dfs(grid,oldColor,newColor,sr,sc);
//     }
//     public static void main(String args[]){
//     }
// public  class programe{
//     public static  void dfs(char grid[][],int i,int j){
//            if(i<0  ||  j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
//            }
//            grid[i][j] = '0';
//            dfs(grid,i-1,j);
//            dfs(grid,i,j+1);
//     }
//     public static int helper(char grid[][]){
//          int n = grid.length;
//          int m = grid[0].length;
//          int island = 0;
//          for(int i=0;i<n;i++){
//               for(int j=0;j<m;j++){
//                   if(grid[i][j]=='1'){
//                           island++;
//                           dfs(grid,i,j);
//                   }
//               }
//          }
//     }
//     public static void main(String args[]){
//     }
// }
//                  st.push(ch);
//            }
//            while(!st.isEmpty() && k>0){
//                 st.pop();
//                 k--;
//            }
//            while(!st.isEmpty()){
//                  sb.append(st.pop());
//            }
//            sb.reverse();
//            int i=0;
//            while(i<sb.length() && sb.charAt(i)=='0'){
//                   i++;
//            }
//            String ans =   sb.substring(i);
//            if(ans.isEmpty()){
//                 System.out.print(-1);
//            }else{
//                    System.out.print(ans);
//            }
//     }
//     public static void main(String[] args) {
//     }
// }
// import java.util.*;
//     public static void main(String args[]){
//          int temp[] = {73,74,75,71,69,72,76,73};
//          Queue<Integer> q  = new LinkedList<>();
//          int ans[] =new int[n];
//                  }
//                  st.push(i);
//          }
//          for(int i=0;i<n;i++){
//               System.out.print(ans[i] +" ");
//          }
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//                 leftMax[i] = Math.max(leftMax[i-1],nums[i]);
//         }
//         for(int j=n-2;j>=0;j--){
//                rightMax[j] = Math.max(rightMax[j+1],nums[j]);
//         }
//         int water = 0;
//         for(int i=0;i<n;i++){
//         }
//         System.out.print(water);
//     }
// }
// public class programe{
//     public static  void productArray(int nums[]){
//            int n  =  nums.length;
//            int ans[] = new int[n];
//            prefix[0] = 1;
//            for(int i=n-2;i>=0;i--){
//                  suffix[i] = nums[i+1]*suffix[i+1];
//            }
//            for(int i=0;i<n;i++){
//             ans[i] = prefix[i]*suffix[i];
//            }
//            for(int i=0;i<n;i++){
//                System.out.print(ans[i] +"  ");
//            }
//     }
//     public static void main(String args[]){
//             //    product of the array except self
//     }
// }
// import java.util.*;
// public class programe{
//        public static class TreeNode{
//           int data;
//           TreeNode left;
//           TreeNode right;
//        }
//     public static boolean validPath(TreeNode root,int target){
//               if(root==null){
//                   return false;
//               }
//               if(root.data==target){
//                      return true;
//               }
//               return validPath(root.left,target-root.data)|| validPath(root.right,target-root.data);
//     }
//      public static boolean isBalanced(TreeNode root){
//      }
//      public static int height(TreeNode root){
//             if(root==null){
//                     return 0;
//             }
//             int leftHeight  = height(root.left);
//             if(leftHeight!=-1){
//                    return -1;
//             }
//             int rightHeight = height(root.right);
//             if(rightHeight!=-1){
//                   return -1;
//             }
//             if(Math.abs(leftHeight-rightHeight)>1){
//                       return -1;
//             }
//             return Math.max(leftHeight,rightHeight);
//      }
//     public static void main(String args[]){
//     }
// }
// public class programe{
//     public static class TreeNode{
//          TreeNode left;
//          TreeNode right;
//     }
//     public static void levelOrderTraversal(TreeNode root){
//              if(root==null){
//                   return;
//              }
//              Queue<TreeNode> q   = new LinkedList<>();
//              q.offer(root);
//              ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//              while(!q.isEmpty()){
//                 int level = q.size();
//                 ArrayList<Integer> list  = new ArrayList<>();
//                 for(int i=0;i<level;i++){
//                     TreeNode curr = q.poll();
//                         list.add(curr.data);
//                         if(curr.left!=null){
//                                  q.offer(curr.left);
//                         }
//                         if(curr.right!=null){
//                                q.offer(curr.right);
//                         }
//                 }
//                 ans.add(list);
//              }
//              for(ArrayList<Integer> val: ans){
//                   for(int num: val){
//                        System.out.print(num +"  ");
//                   }
//                   System.out.prinln();
//              }
//     }
//     public static void main(String args[]){
// }
// import java.util.*;
// public  class programe{
//     public static class TreeNode{
//         int data;
//         TreeNode left;
//         public TreeNode(int data) {
//     }
//     public static void rightSideView(TreeNode root){
//             if(root==null){
//                     return ;
//             }
//             Queue<TreeNode> q = new LinkedList<>();
//             q.offer(root);
//             while(!q.isEmpty()){
//                   for(int i=0;i<size;i++){
//                      TreeNode  curr = q.poll();
//                         if(i==size-1){
//                                  ans.add(curr.data);
//                         }
//                         if(curr.left!=null){
//                                 q.offer(curr.left);
//                         }else{
//                               q.offer(curr.right);
//                   }
//             }
//              for(int num: ans){
//                  System.out.print(num);
//              }
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
//                 return false;
//     }
//     public static boolean dfs(boolean visited[],int current,int parent,ArrayList<ArrayList<Integer>> graph){
//                    vis[current] = true;
//                   for(int nbr: graph.get(current)){
//                             if(!visited[nbr]){
//                                       if(dfs(visited,nbr,current,graph)){
//                                             return  true;
//                                       }
//                             }else if(nbr!=parent){
//                                         return true;
//                             }
//                   }
//                   return false;
//     }
//     public static void main(String args[]){
//     }
// }
// public class  programe{
//         int node;
//         int parent;
//      public static boolean cycleBfs(int edges[][]){
//                 ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//                 for(int i=0;i<edges.length;i++){
//                            graph.add(new ArrayList<>());
//                 for(int edge[]: edges){
//                         graph.get(edge[0]).add(edge[1]);
//                         graph.get(edge[1]).add(edge[0]);
//                 }
//                 for(int i=0;i<edges.length;i++){
//                           if(!vis[i]){
//                                if(checkCycle(vis,i,graph)){
//                                    return true;
//                                }
//                           }
//                 }
//                 return false;
//      }
//      public static boolean checkCycle(boolean vis[],int src,ArrayList<ArrayList<Integer>> graph){
//                 Queue<Pair> q = new LinkedList<>();
//                 q.add(new Pair(src,-1));
//                 while(!q.isEmpty()){
//                       int  curr = q.poll();
//                       int node = curr.node;
//                       int parent = curr.parent;
//                       for(int nbr: graph.get(node)){
//                            if(!vis[nbr]){
//                                 vis[nbr] = true;
//                                q.offer(new Pair(nbr,node));
//                            }else if(nbr!=parent){
//                                       return true;
//                            }
//                       }
//                 }
//                 return false;
//      }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//      public static int helper(int wt[],int val[],int allowed,int index){
//               if(index>=val.length  ||    allowed==0){
//                       return 0;
//               if(wt[index]<=allowed){
//                  int take = val[index]+helper(wt,val,allowed-wt[index],index+1);
//               return helper(wt,val,allowed,index+1);
//      }
//      public static int knapSack(int val[],int wt[],int allowed,int index,int dp[][]){
//         if(allowed==0  || index==val.length){
//               return 0;
//         }
//         if(dp[index][allowed]!=-1){
//                return dp[index][allowed];  
//         }
//         if(wt[index]<=allowed){
//                    dp[index][allowed] = Math.max(take,notTake);
//         }
//         dp[index][allowed]  =knapSack(val,wt,allowed,index+1,dp);
//         return dp[index][allowed];
//      }
//      public static int knapSackTabulation(int val[],int wt[],int allowed,int index){
//                 int dp[][] = new int[val.length+1][allowed+1];
//                 for(int d[]: dp){
//                         Arrays.fill(d,-1);
//                 }
//      }
//     public static void main(String args[]){
//           int  allowed  = 4;
//          int ans =   helper(wt,val,allowed,index);
//          System.out.print(ans);
//     }
// }
// import java.util.*;
// public class programe{
//     public static  void 4Sum(int nums[]){
//           ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//           for(int i=0;i<n-3;i++){
//                          continue;
//                   }
//                   int left = j+1;
//                   int right  = n-1;
//                   while(left<right){
//                         int sum = nums[i]+nums[j]+nums[left]+nums[right];
//                         if(sum==0){
//                                 ans.add(asList(nums[i],nums[j],nums[left],nums[right]));
//                                 left++;
//                                 right--;
//                                 while(left<right && nums[left]==nums[left-1]) {
//                                        left++;
//                                 }
//                                 while(left<right  &&  nums[right]==nums[right+1]){
//                                        right--;
//                                 }
//                         }else if(sum>0){
//                                 right--;
//                         }else{
//                               left++;
//                         }
//                   }
//           }
//           for(ArrayList<Integer> list : ans){
//                   for(int num: list){
//                        System.out.print(num + "  ");
//                   }
//                   System.out.println();
//           }
//     }
//     public static void main(String args[]){
//           int nums[] = {1,0,-1,0,-2,2};
//           int n =nums.length;
//           4Sum(nums);
//     }
// }
// import java.util.*;
//     public static  class Pair{
//              String str;
//              int freq;
//              Pair(String str,int freq){
//                    this.str = str;
//                    this.freq = freq;
//              }
//                  int n = str.length;
//                  HashMap<String,Integer> map = new HashMap<>();
//                  for(String word: str){
//                            map.put(word,map.getOrDefault(word,0)+1);
//                  }
//                  ArrayList<Pair> list = new ArrayList<>();
//                  for(Map.Entry<String,Integer>  e: map.entrySet()){
//                               list.add(new Pair(e.getKey(),e.getValue()));
//                  }
//                  ArrayList<String> ans = new ArrayList<>();
//                  Collections.sort(list,(a,b)->b.freq-a.freq);
//                  for(Pair p: list){
//                         ans.add(p.str);
//                  }
//                  for(String word: ans){
//                       System.out.print(word +"  ");
//                  }
//     }
//     public static void main(String args[]){
//               String str[] = {"i","love","leetcode","i","love","coding"};
//               int n =  str.length;
//              sortWordFreq(str);
//     }
// }
// import java.util.*;
// public class programe{
//          int freq;
//          public Pair(char ch,int freq){
//              HashMap<Character,Integer> map  = new HashMap<>();
//              for(char ch : str.toCharArray()){
//                   map.put(ch,map.getOrDefault(ch,0)+1);
//              }
//              PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.freq-a.freq);
//              for(Map.Entry<Character,Integer> e:  map.entrySet()){
//                          pq.offer(new Pair(e.getKey().e.getValue()));
//              }
//              StringBuilder sb  = new StringBuilder();
//              while(pq.size()>1){
//                   Pair first = pq.poll();
//                   Pair second = pq.poll();
//                   sb.appned(first.ch);
//                   sb.append(second.ch);
//                   first.freq--;
//                   second.freq--;
//                   if(first.freq>1){
//                          pq.offer(first);
//                   }
//                   if(second.freq>1){
//                          pq.offer(second);
//                   }
//              }
//              if(!pq.isEmpty()){
//                     sb.append(pq.poll().ch);
//              }
//     }
//     public static void main(String args[]){
//                String str = "aaabbc";
//                helper(str);
//     }
// import java.util.*;
// public class programe{
//            int nums[] = {3,3,2,2,1,1};
//            int n = nums.length;
//            int k = 3;
//            TreeMap<Integer,Integer> map = new TreeMap<>();
//            for(int num: nums){
//                 int curr =  map.getFirst();
//                  for(int i=0;i<k;i++){
//                         int next = curr+1;
//                         if(!map.containsKey(next)){
//                                  return false;
//                         }
//                         map.put(curr,map.get(curr)-1);
//                         if(map.get(curr)==0){
//                               map.remove(curr);
//                         }
//                  }
//            }
//            return true;
//     }
// }
// import java.util.ArrayList;
// public  class  programe{
//     }
//     public static boolean validPathHelper(boolean vis[],int src,int des,ArrayList<ArrayList<Integer>>graph){
//             if(src==des){
//                      return true;
//             }
//             vis[src] = true;
//             for(int nbr: graph.get(src)){
//                     if(!vis[nbr]){
//                                if(validPathHelper(vis,nbr,des,graph)){
//                                    return true;
//                     }
//             }
//             return false;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public  class  programe{
//     public static class Edges{
//           ArrayList<ArrayList<Integer>> graph;
//           public Edges(int vertex){
//                  graph = new ArrayList<>();
//                         graph.add(new ArrayList<>());
//                  }
//               this.src = src;
//               this.des = des;
//           }
//           public static void printGraph(ArrayList<ArrayList<Integer>> graph){
//                    for(int i=0;i<graph.size();i++){
//                           System.out.print(i +" -> ");
//                           for(int val: graph.get(i)){
//                                 System.out.print(val +"  ");
//                           }
//                           System.out.println();
//                    }
//           }
//           public static boolean checkPath(int edges[][],int src,int des){
//                ArrayList<ArrayList<Integer>>graph  = new ArrayList<>();
//                for(int edge[]: edges){
//                      graph.get(edge[0]).add(edge[1]);
//                      graph.get(edge[1]).add(edge[0]);
//                }
//                boolean visited[] = new boolean[edge.length];
//                return validPath(graph,visited,src,des);  
//           }
//                if(src==des){
//                    return true;
//                }
//                vis[src] = true;
//                for(int nbr: graph.get(src)){
//                         if(!vis[src]){
//                                 if(validPath(graph,nbr,des,vis)){
//                                         return true;
//                                 }
//                         }
//                }
//                return true;
//           }
//     }
//     public   static void main(String args[]){
//           Edges e =  new Edge(5);
//           e.addEdge(1,2);
//           e.addEdge(2,1);
//           e.addEdge(3,4);
//           e.addEdge(2,4);
//           e.printGraph();
// }
// import java.util.*;
// public  class programe{
//     public static boolean helper(){
//               int first =  map.firstKey();
//                 for(int i=0;i<k;i++){
//                        int next = first+1;
//                        if(!map.containsKey(next)){
//                            return false;
//                        }
//                         map.put(first,map.get(first)-1);
//                         if(map.get(first)==0){
//                                 map.remove(first);
//                         }
//                 }
//           }
//           return true;
//     }
//     public static void main(String args[]){
//     }
// }
// public class programe{public static boolean helper(){
//         int nums[] = {1,2,3,6,2,3,4,7,8};
//                    for(int i=0;i<size;i++){
//                           int next = curr+1;
//                           if(!map.containsKey(next)){
//                                    return false;
//                           }
//                           map.put(curr,map.get(curr)-1);
//                           if(map.get(curr)==0){
//                                 map.remove(curr);
//                           }
//                    }
//            }
//            return true;
//     }
//     public static void main(String args[]){
//           helper();
//     }
// }
// import java.util.*;
//     public  static class Pair{
//           char ch;
//           int freq;
//               this.freq = freq;
//           }
//            HashMap<Character,Integer> map = new HashMap<>();
//            for(char ch: s.toCharArray()){
//                    map.put(ch,map.getOrDefault(ch,0)+1);
//            }
//            PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.freq-a.freq);
//            for(Map.Entry<Character,Integer> e: map.entrySet()){
//                     pq.offer(new Pair(e.getKey(),e.getValue()));
//            } 
//            StringBuilder sb = new StringBuilder();
//            while(pq.size()>1){
//                   Pair first = pq.poll();
//                   Pair second = pq.poll();
//                   sb.append(first.ch);
//                   sb.append(second.ch);
//                    second.freq--;
//                    if(first.freq>0){
//                             pq.offer(first);
//                    }     
//                    if(second.freq>0){
//                          pq.offer(second);
//                    }
//            }
//            System.out.print(sb.toString());
//     }
//        public static void main(String args[]){
//                  String str = "aaabbc";
//                  int n =  str.length();
//                  helper(str);
// }
// import java.util.*;
// public class programe{
//     public static class Pair{
//         String str;
//         int freq;
//               this.str = str;
//               this.freq = freq;
//             HashMap<String,Integer> map  = new HashMap<>();
//             for(String  s: str){
//                   map.put(s,map.getOrDefault(s,0)+1);
//             }
//             ArrayList<Pair> list = new ArrayList<>();
//             for(Map.Entry<String,Integer> e: map.entrySet()){
//                         list.add(new Pair(e.getKey(),e.getValue()));
//             }
//             ArrayList<String> ans = new ArrayList<>();
//             Collections.sort(ans,(a,b)->b.freq-a.freq);
//             for(Pair p: list){
//                    ans.add(p.str);
//             }     
//     }
//     public static void main(String args[]){
//             String str[] = {"i","love","leetcode","i","love","coding"};
//             int n = str.length;
//             helper(str);
//     }
// }
//      public static void helper(String str){
//             HashMap<Character,Integer> map  = new HashMap<>();
//             for(char ch: str.toCharArray()){
//                   map.put(ch,map.getOrDefault(ch,0)+1);    
//             }
//             ArrayList<Pair> list = new ArrayList<>();
//             for(Map.Entry<Character,Integer> e: map.entrySet()){
//                     list.add(new Pair(e.getKey(),e.getValue()));
//             Collections.sort(list,(a,b)->b.fre-a.fre);
//             StringBuilder sb = new StringBuilder();
//             for(Pair p : list){
//                   for(int i=0;i<p.fre;i++){
//                         sb.append(p.ch);
//                   }
//             }
//             System.out.print(sb.toString());
//      }
//     public static void main(String args[]){
//            String ans = "cccaaa";
//            helper(ans);
//     }
// }
// import  java.util.*;
//            int nums[] = {1,1,2,2,2,3};
//            int k=2;
//            for(int num: map.keySet()){
//                     pq.offer(num);
//                     if(pq.size()>k){
//                             pq.poll();
//                     }
//            }
//            int ans[] = new int[k];
//            for(int i=k-1;i>=0;i--){
//                  ans[i] = pq.poll();
//            }
//            for(int  num: ans){
//                 System.out.print(num);
//            }
//     }
// }
// import java.util.*;
// public   class  programe{
//     public static class Pair implements  Comparable<Pair>{
//          int num ;
//          int freq;
//         public Pair(int nums,int freq) {
//              this.freq = freq;
//         }
//         public  int compareTo(Pair pair){
//            return   pair.freq -this.freq;
//         }
//     }
//     public static void helper(int nums[],int k){
//         for(int num: nums){
//                 map.put(num,map.getOrDefault(num, 0)+1);
//         }
//         ArrayList<Pair> list  = new ArrayList<>();
//         //  Collections.sort(list,(a,b)->b.freq-a.freq);
//          for(Map.Entry<Integer,Integer> e: map.entrySet()){
//                   Pair pair  = new Pair(e.getKey(),e.getValue());
//                   list.add(pair);
//          }  
//           Collections.sort(list,(a,b)->b.freq-a.freq);
//          int index=0;
//          int ans[] = new int[k];
//          for(Pair p: list){
//                ans[index++] = p.num;
//                if(index>=k){
//                     break;
//                }
//          }
//          for(int nu: ans){
//                 System.out.print(nu);
//          }
//     }
//     public static void main(String args[]){
//            int nums[] ={1,1,1,2,2,3,4,4,4,4};
//            helper(nums,3);
//     }  
// }
// import java.util.*;
// public  class programe{
//           List<List<Integer>> ans = new ArrayList<>();
//           for(int i=0;i<n-3;i++){
//                if(i>0  && nums[i]==nums[i-1]){
//                     continue;
//                }
//                for(int j=i+1;j<n-2;j++){
//                     }
//                     int left = j+1;
//                     int right = n-1;
//                     while(left<right){
//                           long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
//                           if(sum==0){
//                                  ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
//                                  left++;
//                                  right--;
//                                  while(left<right  && nums[left]==nums[left-1]){
//                                           left++;
//                                  }
//                                  while(left<right && nums[right]==nums[right+1]){
//                                     right--;
//                                  }
//                           }else if(sum<target){
//                                left++;
//                           }else {
//                           }
//                     }
//                }
//           }
//           return ans;
//     }
//     public static void main(String args[]){
//         int nums[] = {1,0,-1,0,-2,2};
//         int n = nums.length;
//         List<List<Integer>> ans = new ArrayList<>();
//         ans = helper(nums,n,0);
//         for(List<Integer> list: ans){
//                 System.out.print(list + "  ");
//         }
//     }
// import  java.util.*;
// public class  programe{
//     public static List<List<Integer>> helper(int nums[],int n){
//            List<List<Integer>>  ans = new ArrayList<>();
//            Arrays.sort(nums);
//            for(int i=0;i<n-2;i++){
//                 if(i<0 && nums[i]==nums[i-1]){
//                       continue;
//                 while(left<right){
//                       int sum = nums[left]+nums[right]+nums[i];
//                        if(sum==0){
//                            ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
//                            while(left<right &&  nums[left]==nums[left-1]){
//                                 left++;
//                            }
//                            while(left<right  && nums[right]==nums[right-1]){
//                                right--;
//                            }
//                            left++;
//                            right--;
//                        }else if(sum<0){
//                           left++;
//                        }else{
//                            right--;
//                        }
//                 }
//            }
//            return ans;
//     }
//     public static void main(String args[]){
//          int nums[] = {-4,-1,-1,0,1,2};
//          int n = nums.length;
//          List<List<Integer>> list = new ArrayList<>();
//         list =  helper(nums,n);
//         }
// }
// import java.util.*;
// public class programe{
//     public static int helper(){
//          int nums[] = {34,23,1,24,75,33,54,8};
//          int n = nums.length;
//          Arrays.sort(nums);
//          int left=0;
//              int sum = nums[left]+nums[right];
//               if(sum<k){
//                     max = Math.max(sum,max);
//                     left++;
//               }else{
//                   right--;
//               }
//          }
//          return max;
//     }
//     public static void  main(String args[]){
//          int ans = helper();
//            System.out.print(ans);
//     }
// }
// import  java.util.*;
// public  class  programe{
//     public static int[] helper(){
//          int nums[] = {2,7,11,15};
//          int  n = nums.length;
//          int target = 7;
//          int right = n-1;
//          while(left<=right){
//                         return new int[]{left,right};
//                  }else if(target>sum){
//                          right--;
//                  }else{
//                        left++;
//                  }
//          }
//          return new int[]{-1,-1};
//     }
//     public static void main(String args[]){
//                   int ans[] = new int[2];
//                   ans =  helper();
//                   for(int num: ans){
//                            System.out.print(num);
//                   }
//     }
// }
// public  class  programe{
//               if(wt[index]<=allowed){
//                   int ans1 = val[index]+helper(val,wt,allowed-wt[index+1],index+1);
//     }
//     public static int knapSackUsingMemo(int val[],int wt[],int allowed,int index,int dp[][]){
//              if(allowed==0 ||   index==val.length){
//                        return 0;
//              }
//              if(dp[index][allowed]!=-1){
//                   return dp[index][allowed];
//              }
//              if(wt[index]<=allowed){
//                     int ans1 = val[index]+knapSackUsingMemo(val,wt,allowed-wt[index],index+1,dp);
//                     int ans2 = knapSackUsingMemo(val,wt,allowed,index+1,dp);
//                     dp[index][allowed] = Math.max(ans1,ans2);
//              }
//               dp[index][allowed] = knapSackUsingMemo(val,wt,allowed,index+1,dp);
//              return dp[index][allowed];
//     }
//       public static int knapSackUsingTabulation(int val[],int wt[],int allowed,int index){
//                   int dp[][] = new int[index+1][allowed+1];
//                    for(int col[]: dp){
//                        Arrays.fill(col,-1);
//                    }
//                    for(int i=1;i<=val.length;i++){
//                        for(int j=1;j<=allowed;j++){
//                               if(dp[i][j]<=)
//                        }
//                    }
//       }
//     public static void main(String args[]){
//           int val[] = {10,32,1,4,7,8,2};
//           int wt[] = {1,2,4,2,5,6,1};
//           int allowed = 7;
//          int ans =   helper(val,wt,allowed,0);
//          System.out.print(ans);
//     }
// }
// import java.util.*;
// public class programe{
//                String text2 = "ace";
//                int n1 =  text1.length();
//                for(int j=0;j<=n2;j++){
//                     dp[0][j] = 0;
//                }
//                for(int i=1;i<=n1;i++){
//                   for(int j=1;j<=n2;j++){
//                       if(text1.charAt(i-1)==text2.charAt(j-1)){
//                                dp[i][j]  =  1+dp[i-1][j-1];
//                       }else{
//                              dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//                       }
//                   }
//                }
//                return dp[n1][n2];
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int helper(int i,int j,int n1,int n2,String text1,String text2){
//                 if(i==n1 ||  j==n2){
//                        return 0;
//                 }
//                 if(text1.charAt(i)==text2.charAt(j)){
//                     return 1+helper(i+1,j+1,n1,n2,text1,text2);
//               return Math.max(ans1,ans2);
//     }
//     public static void main(String[] args) {
//         String text1 = "abcde";
//         String text2 = "ace";
//         int n1 = text1.length();
//         int n2 = text2.length();
//        int ans =   helper(0,0,n1,n2,text1,text2);
//         System.out.print(ans);
// }
// import  java.util.*;
// public  class programe{
//              Arrays.fill(dp, -1);
//              int ans=1;
//                   }
//                    ans = Math.max(ans,dp[i]);
//              }
//              return ans;
//     }
//     public static void main(String[] args) {
//            int nums[] = {10,9,2,5,3,7,101,18};
//            int n = nums.length;
//            helper(nums,0,n);
//     }
// }
// public  class  programe{
//     public static int helper(int wt[],int val[],int n,int allowed){
//            if(n==0  ||  allowed==0){
//                 return 0;
//            }
//            if(wt[n-1]<=allowed){
//                  int ans1 = val[n-1]+helper(wt,val,n-1,allowed-wt[n-1]);
//     }
//     public static int knapSackUsingMemo(int wt[],int va[],int n,int allowed){
//     }
//     public static void main(String args[]){
//           int wt[] = {2,5,1,3,4};
//           int val[] = {15,14,10,45,30};
//           int n = val.length;
//           int allowed = 7;
//          int ans =   helper(wt,val,n,allowed);
//           System.out.print(ans);
//     }
// import  java.util.*;
// public class programe{
//                       graph.get(c).add(p);
//                       indegree[c]++;
//              }
//              Queue<Integer> q = new LinkedList<>();
//              for(int i=0;i<indegree.length;i++){
//                     if(indegree[i]==0){
//                            q.offer(i);
//                     }
//              }
//              int count=0;
//              while(!q.isEmpty()){
//                    int curr = q.poll();
//                    count++;
//                    for(int nbr: graph.get(curr)){
//                            indegree[nbr]--;
//                            if(indegree[nbr]==0){
//                               q.offer(nbr);
//                            }
//                    }
//              }
//              return count==courses;
//     }
//     public static void main(String args[]){
// import  java.util.*;
//             if(n==0){
//                    return 0;
//             Arrays.sort(points,(a,b)->Long.compare((long)a[1]-(long)b[1]));
//             int arrow=1;
//                   if(points[i][0]>pos){
//                         arrow++;
//                         pos = points[i][1];
//                   }
//           }
//           return arrow;
//     }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//          int start;
//          int end;
//             int n = st.length;
//            meeting  meet[] = new meeting[n];
//            for(int i=0;i<n;i++){
//                     meet[i] =  new meeting(st[i],e[i]);
//            }
//            Arrays.sort(meet,(a,b)->{
//                  if(a.end==b.end){
//                       return a.start-b.start;
//                  }
//                  return a.end-b.end;
//            });
//            int count = 1;
//            int lastEnd = meet[0].end;
//            for(int i=1;i<n;i++){
//                 if(meet[i].start>lastEnd){
//                          count++;
//                          lastEnd = meet[i].end;
//                 }
//            }
//            return count;
//     }
//     public static void main(String args[]){
//     }
// }
//     }
//      public static int activitySelection(int start[],int end[]){
//             int n =  start.length;
//                Activity[] act = new Activity[n];
//                for(int i=0;i<n;i++){
//                }
//                Arrays.sort(act,(a,b)->a.finish-b.finish);
//                int lastTime = act[0].finish;
//                int count=1;
//                         if(lastTime<=act[i].start){
//                              count++;
//                              lastTime = act[i].finish;
//                         }
//                }
//                return count;
//      }
//     public  static void main(String args[]){
//     }
// }
// public class programe{
//     public static int eraseOverLapInterval(int interval[][]){
//              Arrays.sort(interval,(a,b)->a[1]-b[1]);
//              int remove =0;
//              int prevEnd = interval[0][1];
//              for(int i=1;i<n;i++){
//                    if(interval[i][0]<prevEnd){
//                       prevEnd =  interval[i][1];
//                    }
//              }
//              return remove;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public  class  programe{
//     public  static int[][] merge(int interval[][]){
//            Arrays.sort(interval,(a,b)->a[0]-b[0]);
//            int start = interval[0][0];
//            int end = interval[0][1];
//                   }else{
//                          list.add(new int[]{start,end});
//                          start = interval[i][0];
//                          end = interval[i][1];
//                   }
//            }
//             list.add(new int[]{start,end});
//             return list.toArray(new int[list.size()][]);
//     }
//     public static void main(String[] args) {
//     }
// }
//           Queue<int[]> q = new LinkedList<>();
//           for(int i=0;i<n  && !found ; i++){
//               for(int j=0;j<m;j++){
//                      if(board[i][j]==1){
//                            found = true;
//                            dfs(i,j,board,vis,q);
//                             break;
//                      }
//               }
//           }
//           int level=0;
//            while(!q.isEmpty()){
//               int size = q.size();
//                while(size-->0){
//                         int curr[] = q.poll();
//                         int nr = nr+curr[0];
//                         int nc = nc+curr[1];
//                         if(nr<0|| nc<0||  nc>=n || nc>=m){
//                         }
//                         if(vis[nr][nc]){
//                               continue;
//                         }
//                         if(board[nr][nc]==1){
//                                 return level;
//                         }
//                         vis[nr][nc] = true;
//                         level++;
//                }
//            }
//            return    level;
//     }
//     public static void dfs(int i,int j,int board[][],int vis[][],Queue<int[]>q){
//             //     base case 
//              if(i<0  || j<0  ||  i>=board.length  ||  j>=board[0].length){
//                       return;
//              }
//               vis[i][j] = true;
//               q.offer(new int[]{i,j});
//               for(int d[]:dir){
//                      dfs(i+d[0],j+d[1],board,vis,q);
//               }
//     }
//     public static void main(String[] args) {
//     }
// }
// public class  programe{
//            int n = board.length;
//            int m = board[0].length;
//            return false;
//     }
//     public static boolean dfs(int i,int j,int index,String word,char board[][]){
//                 if(word.length()==index){
//                        return true;
//                 }
//                 if(i<0  || j<0  || i>=board.length  ||  j>=board[0].length || board[i][j]!=word.charAt(index)){
//                        return false;
//                 }
//                 char temp = board[i][j];
//                 boolean found = dfs(i+1,j,index+1,word,board)||dfs(i,j+1,index+1,word,board) ||dfs(i-1,j,index+1,word,board)||dfs(i,j-1,index+1,word,board);
//                      return found;
//     }
//     public static void main(String[] args) {
// }
// import  java.util.*;
// public  class  programe{
//              TrieNode children[] = new TrieNode[26];
//              boolean isEnd;
//     public static TrieNode root;
//             public void insert(String word){
//                              int index = ch-'a';
//                              if(curr.children[index]==null){
//                                      curr.children[index] =  new TrieNode();
//                              }
//                              curr = curr.children[index];
//                      curr.isEnd = true;
//             }
//             public static boolean  search(String word){
//                        TrieNode curr = root;
//                        for(char ch : word.toCharArray()){
//                              int index = ch-'a';
//                              if(curr.children[index]==null){
//                                          return false;
//                              }
//                              curr = curr.children[index];
//                        }
//             }
//             public static boolean startsWith(String prefix){
//                         TrieNode  curr  = root;
//                         for(char ch :  prefix.toCharArray()){
//                                 int index = ch-'a';
//                                 if(curr.children[index]==null){
//                                       return false;
//                                 }
//                                 curr = curr.children[index];
//                         }
//                         return curr.isEnd;
//             }
//     public static void main(String[] args) {
//     }
// }
// import java.util.*;
// public class meanFinder{
//       PriorityQueue<Integer> minHeap;
//       public meanFinder(){
//              minHeap = new PriorityQueue<>();
//       }
//       public void addNum(int num){
//              if(meanHeap.size()>maxHeap.size()){
//                      maxHeap.offer(minHeap());
//              }
//       }
//       public double findMedian(){
//                 if(maxHeap.size()>minHeap()){
//                         return maxHeap.poll();
//                 }
//                 return (minHeap.peek()+maxHeap.peek())/2.0;
//       }
// }
// import java.util.*;
// public class programe{
//     public static class ListNode {
//         int data;
//         ListNode next;
//         ListNode(int data){
//               this.next = null;
//         }
//              PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.data-b.data);
//              for(ListNode list: lists){
//                    if(list!=null){
//                        pq.add(list);
//                    }
//              }
//                ListNode dummy = new ListNode(-1);
//              ListNode tail  = dummy;
//               while(!pq.isEmpty()){
//                        tail = tail.next;
//                        if(curr.next!=null){
//                               pq.add(curr.next);
//                        }
//               }
//               return dummy.next;
//     }
//     public static void main(String[] args) {
//     }
// }
// public  class  programe{
//           for(int i=0;i<nums.length;i++){
//                int complement = target-nums[i];
//           return  new int[]{};
//     }
//     public static void main(String[] args) {
//     }
// }
//     public static int activitySelection(int start[],int end[]){
//           int n = start.length;
//           Activity act[] = new Activity[n];
//           Arrays.sort(act,(a,b)->a.end-b.end);
//           int count=1;
//           int lastEnd = act[0].end;
//           for(int i=1;i<n;i++){
//               if(act[i].start>=lastEnd){
//                     count++;
//               }
//           }
//           return lastEnd;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
//         int node;
//         int dest;
//     public static int networkDelayTime(int time[][],int k,int n){
//              ArrayList<ArrayList<int[]>> list = new ArrayList<>();
//              for(int i=0;i<=n;i++){
//                     list.add(new ArrayList<>());
//              }
//              for(int edge[]: time){
//                     list.get(edge[0]).add(new int[]{edge[1],edge[2]});
//              }
//              int dist[] = new int[n];
//              Arrays.fill(dist,Integer.MAX_VALUE);
//              dist[k] = 0;
//              PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dest-b.dest);
//              pq.offer(new Pair(k,0));
//              while(!pq.isEmpty()){
//                     Pair p = pq.poll();
//                     if(p.dest>k){
//                            continue;
//                     }
//                            int node = edge.node;
//                            int des = edge.dest;
//                            if(p.dest+nbr.des<dist[node]){
//                                  dist[node] =  p.dest+nbr.des;
//                                  pq.add(new Pair(node,dist[node]));
//                            }
//                     }
//              }
//              int 
//              for(int i=0;i<n;i++){
//                   if()
//              }
//     }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
//     public static class Pair{
//         int city;
//     }
//     public static findCheapestFlight(int flight[][],int src,int des,int k,int n){
//               ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
//               for(int i=0;i<n;i++){
//                      graph.add(new ArrayList<>());
//               }
//             for(int col[]: flight){
//                     graph.get(col[0]).add(new int[]{col[1],col[2]});
//             }
//             int dist[] = new int[n];
//             Arrays.fill(dist,Integer.MAX_VALUE);
//             dis[0] = 0;
//             Queue<Pair> q = new LinkedList<>();
//             q.offer(new Pair(src,0,0));
//             while(!q.isEmpty()){
//                   Pair p = q.poll();
//                    if(p.stops>k){
//                        continue;
//                    }
//                    for(int edge[]: graph.get(p.city)){
//                          int next = edge[0];
//                          int price = edge[1];
//                          if(p.cost+price<dis[next]){
//                                  dis[next] = p.cost+price;
//                                  q.offer(new Pair(next,dis[next],p.stops+1));
//                          }
//                    }
//             }
//             return dis[des]==Integer.MAX_VALUE? -1 : dis[des];
//     }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//            int nums[] = {2,0,2,1,1,0};
//            int n = nums.length;
//                       zero++;
//                  }else if(num==1){
//                        one++;
//                  }else{
//                        two++;
//                  }
//            }
//            while(zero-->0){
//                nums[index++] = 0;
//            }
//            while(one-->0){
//                nums[index++] = 1;
//            }
//            while(two-->0){
//                nums[index++] = 2;
//            }
//           System.out.print(num);
//       }
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.PriorityQueue;
// public  class  programe{
//     public static class Node{
//           int data;
//           Node next;
//             this.next = null;
//             this.data = data;
//     public static Node mergekSortedList(Node lists[]){
//          PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.data-b.data);
//          for(Node node: lists){
//               pq.offer(node);
//          }
//          Node curr = dummy;
//          while(!pq.isEmpty()){
//                  Node node = pq.poll();
//                  curr.next = node;
//                  curr = curr.next;
//                  if(node.next!=null){
//                         pq.add(node);
//                  }
//          }
//          return dummy.next;      
//     }
//     public static  void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int minDistance(String s,String t){
//             dp= new int[s.length()][t.length()];
//              if(j==t.length()){ 
//                   return s.length()-i;
//              }
//              if(dp[i][j]!=-1){
//                    return  dp[i][j];
//              }
//              if(s.charAt(i)==t.charAt(j)){
//                        return   solver(i+1,j+1,s,t);
//              }
//              int insert = 1+solver(i+1,j,s,t);
//              int delete = 1+solver(i,j+1,s,t);
//              int replace = 1+solver(i+1,j+1,s,t);
//              return  dp[i][j] = Math.min(insert,Math.min(delete,replace));
//     }
//     public static void main(String args[]){
//     }
// import java.util.*;
//     public static int bestTeam(int scores[], int ages[]) {
//             player[i][1] = ages[i];
//         }
//                if(a[0]==b[0]){
//                }else{ 
//                      return a[0]-b[0];
//         });
//         int dp[] = new int[n];
//         int ans = 0;
//         for(int i=0;i<n;i++){
//                  dp[i]   = player[i][1];
//                  for(int j=0;j<i;j++){
//                       if(player[j][1]<=player[i][1]){
//                                 dp[i] = Math.max(dp[i],dp[j]+player[i][1]);
//                       }
//                  }
//                  ans = Math.max(ans,dp[i]);
//         }
//         return  ans;
//     }
//     public static void main(String args[]) {
//     }
// }
// public class programe{
//               int n = pair.length;
//               Arrays.fill(dp,1);
//               for(int i=0;i<n;i++){
//                      for(int j=0;j<i;j++){
//                                   dp[i] = Math.max(dp[i],dp[j]+1);
//                            }
//                      }
//                    ans = Math.max(ans,dp[i]);
//               }
//               return ans;
//       }
//       public  static void main(String args[]){
//       }
// }
// import java.util.*;
// public class programe{
//       public static void main(String args[]){
//               int nums[] = {1, 101, 2, 3, 100};
//               int  n = nums.length;
//               int dp[] = new int[n];
//               int ans = 0;
//               for(int i=0;i<n;i++){
//                      dp[i] =  nums[i];
//                      for(int j=0;j<i;j++){
//                              if(nums[j]>nums[i]){
//                                  dp[i] =  Math.max(dp[i],dp[i]+nums[j]);
//                              }
//                      }
//                      ans = Math.max(ans,dp[i]);
//               }
//                 System.out.print(ans);
//       }
// }
// import  java.util.*;
// public class programe{
//       public static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
//       public static List<List<Integer>> helper(int height[][]){
//                    int n = height.length;
//                    int m = height[0].length;
//                    boolean pacific[][] = new boolean[n][m];
//                    boolean atlantic[][] = new boolean[n][m];
//                    for(int i=0;i<n;i++){
//                            dfs(0,i,pacific,height);
//                    }
//                    for(int i=0;i<m;i++){
//                           dfs(i,0,pacific,height);
//                    }
//                    for(int i=0;i<n;i++){
//                            dfs(m-1,i,atlantic,height);
//                    }
//                    for(int i=0;i<n;i++){
//                             dfs(i,n-1,atlantic,height);
//                    }
//                    List<List<Integer>> ans = new ArrayList<>();
//                    for(int i=0;i<n;i++){
//                           for(int  j=0;j<m;j++){
//                                  if(pacific[i][j]  &&  atlantic[i][j]){
//                                           list.add(Arrays.asList(i,j));
//                                  }
//                           }
//                    }
//                    return ans;
//       }
//       public static void dfs(int i,int j,boolean visited[][],int height[][]){
//                if(visited[i][j]){
//                     return ;
//                }
//                visited[i][j] = true;
//               for(int d[]: dir){
//                       int nr =  i+d[0];
//                       int nc = j+d[1];
//                       if(nr<0  || nc<0 || nr>=height.length  || nc>=height[0].length){
//                              continue;
//                       }
//                       if(height[nr][nc]>=height[i][j]){
//                              dfs(nr,nc,visited,height);
//                       }
//               }
//       }
//       public static void main(String args[]){
//       }
// }
// public  class  programe{
//       public static int findTargetInArray(){
//                int nums[] = {6,7,8,1,2,3,4,5};
//               int n = nums.length;
//               int target=3;
//               int left=0;
//               int right = n-1;
//               while(left<=right){
//                    int mid = left+(right-left)/2;
//                   //    chekc whicch part is sorted
//                   if(nums[mid]==target){
//                           return mid;
//                   }
//                   if(nums[left]<nums[mid]){
//                           if(nums[left]<=target  &&   target<nums[mid]){
//                                      right = mid-1;
//                           }else{
//                                 left = mid+1;
//                           }
//                   }else{
//                            if(nums[mid]<=target  && target<nums[right]){
//                                    left =mid+1;
//                            }else{
//                                  right = mid-1;
//                            }
//                   }
//               }
//                 return -1;
//       }
//       public static void main(String args[]){
//             System.out.print(findTargetInArray());
//       }
// }
// public  class  programe{
//       public static class Node{
//             int data;
//             Node left;
//             Node right;
//             Node(int data){
//                    this.data = data;
//                    this.left  = null;
//                    this.right = null;
//             }
//       }
//       public static int index  = 0;
//       public   static Node buildTree(int preOrder[],int inOrder[]){
//               return buildTreeFromProrder(preOrder,inOrder,0,inOrder.length-1);
//       }
//       public  static  Node buildTreeFromProrder(int preOrder[],int inOrder[],int start,int end){
//                if(start>end){
//                       return  null;
//                }
//                Node root = new Node(inOrder[index++]);
//                root.left = buildTreeFromProrder(preOrder, inOrder, start, index-1);
//                root.right = buildTreeFromProrder(preOrder,inOrder,index+1,endd;er,index+1,end);
//       }
//       public static Node buildTree(int nums[]){
//             return helper(nums,0,nums.length-1);
//       }
//       public static Node helper(int nums[],int start,int end){
//                    if(start>end){
//                           return null;
//                    }
//                    int mid = start+(end-start)/2;
//                    Node root = new Node(nums[mid]);
//                    root.left = helper(nums,start,mid);
//                    root.right = helper(nums, mid+1,end);
//                    return  root;
//       }
//       public   static Node buildMaxTree(int nums[],int start,int end){
//                   if(start>end){
//                           return null;
//                   }
//                   int max  =  start;
//                   for(int i=start;i<=end;i++){
//                            if(nums[max]<nums[i]){
//                                  max = i;
//                            }
//                   }
//                   Node root = new Node(nums[max]);
//                   root.left = buildMaxTree(nums,start,max-1);
//                   root.right = buildMaxTree(nums,max+1, end);
//                   return    root;
//       }
//       public  static  void main(String args[]){
//       }
// }
// import  java.util.*;
// public  class  programe{
//     public static int helper(){
//           int nums[] = {1,4,2,1,4};
//           Arrays.sort(nums);
//           int  n = nums.length;
//           int low =0;
//           int target=4;
//           int high = n-1;
//           while(low<=high){
//              int mid = low+(high-low)/2;
//               if(nums[mid]==target){
//                    return mid;
//               }else if(nums[mid]>target){
//                     high = mid-1;
//               }else{
//                   low = mid+1;
//               }
//           }
//           return -1;
//     }
//     public   static int binarySearch(){
//               int  nums[] = {1,3,6,8,9,10};
//               int target=10;
//               int low =0;
//               int high = nums.length-1;
//             return  searchUsingRecursion(nums,target,low,high);
//     }
//     public static int searchUsingRecursion(int nums[],int target,int low,int high){
//             if(low>high){
//                     return -1;
//             }
//             int mid = low+(high-low)/2;
//             if(nums[mid]==target){
//                   return  mid;
//             }
//             if(nums[mid]>=target){
//                    return searchUsingRecursion(nums,target,low,mid);
//             }
//             return searchUsingRecursion(nums,target,mid+1,high);
//     }
//     public  static void main(String args[]){
//           System.out.print(helper());
//     }
// }
// public class programe{
//      public static int dir[][] = {
//         {-1,0},
//         {0,1},
//         {1,0},
//         {0,-1}
//      };
//      public static int maxArea(int grid[][]){
//           int n = grid.length;
//           int m = grid[0].length;
//           int   area =0;
//           for(int i=0;i<n;i++){
//               for(int j=0;j<m;j++){
//                 area = Math.max(area,dfs(i,j,grid));
//               }
//           }
//      }
//      public  static void dfs(int row,int col,int grid[][]){
//           if(row<0 ||  col<0  ||   row>=grid.length  ||  col>=grid[0].length || grid[row][col]!=0){
//                  return  ;
//           }
//         int area = 1;
//         grid[row][col]  = 0;
//          area += dfs(row+1,col,grid) ||  dfs(row-1,col,grid)  ||  dfs(row,col+1,grid) ||  dfs(row,col-1,grid);
//              grid[row][col] = 1;
//             return area;
//      }
//     public static void main(String[] args) {
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int direction[][] = {
//         {0,-1},
//         {0,1},
//         {1,0},
//         {-1,0}
//     };
//     public static int maxArea(int grid[][]){
//              int   area = 0;
//              for(int i=0;i<grid.length;i++){
//                   for(int j=0;j<grid[0].length;j++){
//                        if(grid[i][j]==1){
//                              area = Math.max(area,dfs(grid,i,j));
//                        }
//                   }
//              }
//              return area;
//     }
//       public static int  dfs(int grid[][],int i,int j){
//             if(i<0  || j<0  || i>=grid.length  || j>=grid[0].length ||   grid[i][j]==0){
//                 return  0;
//             }
//             int area=1;
//              grid[i][j] = 0;
//             for(int dir[]: direction){
//                    area += dfs(grid,i+dir[0],j+dir[1]);
//             }
//             return area;
//       }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe {
//     public static boolean dfs(String word, char board[][], int row, int col, int index) {
//         if (index == word.length()) {
//             return true;
//         }
//         if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) {
//             return false;
//         }
//         char temp = board[row][col];
//         board[row][col] = '#';
//         boolean found = dfs(word, board, row + 1, col, index + 1) || dfs(word, board, row - 1, col, index + 1) || dfs(word, board, row, col + 1, index + 1) || dfs(word,board,row,col-1,index+1);
//         return   found;
//     }
//     public static boolean isExist(String word, char board[][]) {
//         int row = board.length;
//         int col = board[0].length;
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 if (dfs(word, board, i, j, 0)) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]) {
//         String word = "ABCCED";
//         int n = word.length();
//         char board[][] = {{}};
//         boolean found = isExist(word, board);
//         System.out.print(found);
//     }
// }
// import java.util.*;
// public class programe{
//     public static int minimumSemester(int edges[][]){
//             List<List<Integer>> list = new ArrayList<>();
//             int n = edges.length;
//             for(int i=0;i<n;i++){
//                 list.add(new ArrayList<>());      
//             }
//              int indegree[] = new int[n];
//             for(int edge[]: edges){
//                   int p1 = edge[0];
//                   int p2 = edge[1];
//                   list.get(p1).add(p2);
//                   indegree[p1]++;
//             }
//             Queue<Integer> q = new LinkedList<>();
//              for(int i=0;i<n;i++){
//                     if(indegree[i]==0){
//                             q.add(i);
//                     }
//              }
//              int sem = 0;
//              int completed=0;
//              while(!q.isEmpty()){
//                   int size = q.size();
//                   sem++;
//                   while(size-- > 0){
//                           int curr = q.poll();
//                           completed++;
//                           for(int next : list.get(curr)){
//                                   indegree[next]--;
//                                   if(indegree[next]==0){
//                                       q.add(next);
//                                   }
//                           }    
//                   }
//              }
//              return completed==n ? sem:-1;
//     }
//     public static void main(String[] args) {
//            int edges[][]= {{}};
//            minimumSemester(edges);
//     }
// }
// import  java.util.*;
// public class programe{
//     public static boolean canShip(int capacity,int nums[],int days){
//              int day = 1;
//              int current = 0;
//              for(int num:  nums){
//                    if(current+num<=capacity){
//                            current  += num;
//                    }else{
//                           day++;
//                           current = num;
//                    }
//              }
//              return  day<=days;
//     }
//     public static void main(String args[]){
//          int nums[] ={3,2,2,4,1,4};
//          int n = nums.length;
//          int low = 0;
//          int days = 5;
//          int high = 0;
//          for(int num: nums){
//                 low = Math.max(num,low);
//                 high += num;
//          }
//          while(low<=high){
//              int mid = low+(high-low)/2;
//                if(canShip(mid,nums,days)){
//                      high = mid;
//                }else{
//                   low = mid+1;
//                }
//          }
//          System.out.print(low);
//     }
// }
// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//          int nums[] = {2,3,4,5,1};
//          int n = nums.length;
//          int low = 0;
//          int high = n-1;
//          while(low<high){
//               int mid = low+(high-low)/2;
//               if(nums[mid]<=nums[high]){
//                      high = mid;
//               }else{
//                    low = mid+1;
//               }
//          } 
//          System.out.print(nums[low]);
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//           int nums[] = {1,2,3,1};
//           int n = nums.length;
//           int low = 0;
//           int high = n-1;
//           while(low<high){
//              int mid  = low+(high-low)/2;
//              if(nums[mid]<nums[mid+1]){
//                      low = mid+1;
//              }else{
//                   high = mid;
//              }
//           }
//           System.out.print(nums[low]);
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//           int n = 5;
//           int dp[] = new int[n+1];
//           dp[2] = 1;
//           for(int i=3;i<=n;i++){
//               for(int j=1;j<i;j++){
//                    dp[i] = Math.max(dp[i] , Math.max(j*(i-j),j*dp[i-j]));
//               }
//           }
//           System.out.print(dp[n]);
//     }
// }
// import java.util.*;
// public class  programe{
//     public static boolean canShip(int capacity,int days,int weights[]){
//                  int day =1;
//                  int curr =0;
//                  for(int i=0;i<weights.length;i++){
//                             if(weights[i]+curr<capacity){
//                                         curr  +=   weights[i];
//                             }else{
//                                    day++;
//                                    curr = weights[i];
//                             }
//                  }
//                  return day<=days;
//     }
//     public static boolean  helper(int weights[],int days){
//                  int low =0;
//                  int high = weights.length;
//                  while(low<high){
//                     int mid = low+(high-low)/2;
//                     if(canShip(mid,days,weights)){
//                                high = mid-1;
//                     }else{
//                            low = mid+1;
//                     }
//                  }
//     } 
//     public static void main(String[] args) {
//         int weights[] = new int[5];
//         int n = weights.length;
//         int days = 4;
//           boolean ans =  helper(weights,days);
//           System.out.print(ans);
//     }
// }
// import java.util.*;
// public  class  programe{
//     public static void dfs(int node,ArrayList<ArrayList<Integer>> list,int vis[]){
//              vis[node] = true;
//              for(int nbr: list.get(node)){
//                    if(vis[nbr]!=0){
//                         dfs(nbr,list,vis);
//                    }
//              }
//     }
//     public  static int connectedComponent(int edge[][]){
//           int n =  edge.length;
//           int m = edge[0].length;
//           ArrayList<ArrayList<Integer>> list =new ArrayList<>();
//           int vis[] = new int[n];
//           int ans = 0;
//           for(int curr[]: edge){
//                int  src = curr[0];
//                int des = curr[1];
//                list.get(src).add(des);
//                list.get(des).add(src);
//           }
//           for(int i=0;i<n;i++){
//             if(vis[i]!=0){
//                       dfs(i,list,vis);
//                       ans++;
//             }
//           }
//           return ans;
//     }
//     public static void main(String[] args) {
//           int edge[][]=  new int[4][4];
//           connectedComponent(edge);
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int  dfs(char board[][],int row,int col){
//             if(row<0  ||  row>=board.length  ||  col<0  ||  col>=board[0].length  || board[row][col]=='0'){
//                      return 0;
//             }
//             board[row][col] = '0';
//             int area = 1;
//             area += dfs(board,row+1,col);
//             area += dfs(board,row-1,col);
//             area += dfs(board,row,col-1);
//             area += dfs(board,row,col+1);
//             return area;
//     }
//     public static int maxArea(char board[][],int n,int m){
//         int area = 0;
//         for(int i=0;i<n;i++){
//               for(int j=0;j<m;j++){
//                    if(board[i][j]=='1'){
//                          area = Math.max(area,dfs(board,i,j));
//                    }
//               }
//         }
//         return area;
//     }
//     public static void main(String[] args) {
//           char board[][]= {{}};
//           int n = board.length;
//           int m = board[0].length;
//          int area =  maxArea(board,n,m);
//           System.out.print(area);
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int numIsland(char grid[][]){
//           int n = grid.length;
//           int m = grid[0].length;
//           int island =0;
//           for(int i=0;i<n;i++){
//              for(int j=0;j<m;j++){
//                   if(grid[i][j]=='1'){
//                        island ++;
//                        dfs(grid,i,j);
//                   }
//              }
//           }
//           return island;
//     }
//     public static void dfs(char grid[][],int i,int j){
//              if(i<0  || i>=grid.length  || j<0   || j>=grid[0].length ||  grid[i][j]=='0'){
//                      return;
//              }
//              grid[i][j] =  '0';
//               dfs(grid,i+1,j);
//               dfs(grid,i-1,j);
//               dfs(grid,i,j+1);
//               dfs(grid,i,j-1);
//     }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//     public static void findBurstBalloon(int point[][]){
//          int n = point.length;
//          Arrays.sort(point,(a,b)->a[1]-b[1]);
//          int count=1;
//          int last = point[0][1];
//          for(int i=1;i<n;i++){
//                if(point[i][0]>=last){
//                   count++;
//                   last = point[i][1];
//                }
//          }
//          System.out.print(count);
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public  class  programe{
//     public static int nonOverlapingInterval(int interval[][]){
//            int n = interval.length;
//            int count=1;
//            Arrays.sort(interval,(a,b)->a[1]-b[1]);
//            int lastEnd = interval[0][1];
//            for(int i=1;i<n;i++){
//                if(interval[i][0]>=lastEnd){
//                       count++;
//                       lastEnd = interval[i][1];
//                }
//            }
//             return n-count;
//     }
//     public static void main(String[] args) {
//     }
// }
// import java.util.*;
// public  class  programe{
//     public static class meeting{
//         int start;
//         int end;
//         public meeting(int start,int end) {
//              this.start = start;
//              this.end = end;
//         }
//     }
//     public static int meetingRoom(int start[],int end[]){
//           int n = start.length;
//           List<meeting> list = new ArrayList<>();
//           for(int i=0;i<n;i++){
//                list.add(new meeting(start[i],end[i]));
//           }
//           list.sort((a,b)->a.end-b.end);
//           int count=1;
//           int lastTime = list.get(0).end;
//           for(int i=1;i<n;i++){
//                   if(list.get(i).start>=lastTime){
//                          count++;
//                          lastTime = list.get(i).end;
//                   }
//           }
//           System.out.print(count);
//     }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int activitySelection(int start[],int end[]){
//                int n = start.length;
//                int selection[][] =  new int[n][2];
//                for(int i=0;i<n;i++){
//                     selection[i][0] = start[i];
//                     selection[i][1] = end[i];
//                }
//                Arrays.sort(selection,(a,b)->a[1]-b[1]);
//                int count=1;
//                int lastTime = selection[0][1];
//                for(int i=0;i<n;i++){
//                         if(selection[i][0]>=lastTime){
//                                 count++;
//                                 lastTime = selection[i][1];
//                         } 
//                }
//                System.out.print(count);
//     }
//     public   static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//     public static String helper(String s,int n){
//           Stack<Integer> st = new Stack<>();
//            int k = 3;
//           for(char ch: s.toCharArray()){
//                int  num = ch-'0';
//                while(!st.isEmpty() && st.peek()>num  && k>0){
//                            st.pop();
//                            k--;
//                }
//                st.add(num);
//           }
//           StringBuilder sb = new StringBuilder sb();
//           while(!st.isEmpty()){
//                   sb.append((char)st.pop()+'0');
//           }
//           sb.reverse();
//             if(sb.length()>1 &&   && sb.charAt(0)=='0'){
//                         sb.deleteCharAt(0);
//             }
//               if(sb.length()==0){
//                     return "0";
//               }
//                return sb.toString();
//     }
//     public static void main(String args[]){
//            String str = "1432219";
//            int n = str.length();
//            helper(str,n);
//     }
// }
// public  class  programe{
//     public static  void main(String args[]){
//          int nums[] ={73,74,75,71,69,72,76,73};
//          int n  = nums.length;
//          int ans[] = new int[n];
//          for(int i=0;i<n;i++){
//                 for(int j=i+1;j<n;j++){
//                         if(nums[i]<nums[j]){
//                               ans[i] = j-i;
//                               break;
//                         }
//                 }
//          }
//          for(int num: ans){
//                System.out.print(num +"  ");
//          }
//     }
// }
// import java.util.*;
// public class programe{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//               this.data = data;
//               this.left = null;
//               this.right = null;
//         }
//     }
//     public static Node  helper(Node root,Node p,Node q){
//             if(root==null  || root==p || root==q){
//                    return root;
//             }
//             Node left = helper(root.left,p,q);
//             Node right = helper(root.right,p,q);
//             if(left!=null  &&  right!=null){
//                    return root;
//             }
//              return (left==null)?right:left;
//     }
//     public static List<Integer> list = new ArrayList<>();
//     public static int kthSmallest(Node root,int k){
//           if(root==null){
//               return null;
//           }
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public static void helper(String s,String p){
//         List<Integer> list  = new ArrayList<>();
//              if(s.length()<p.length()){
//                     return ;
//              }
//              int sCount[] = new int[26];
//              int pCount[] = new int[26];
//              for(int i=0;i<p.length();i++){
//                     pCount[p.charAt(i)-'a']++;
//              }
//              int n = s.length();
//              int k = p.length();
//              for(int right=0;right<n;right++){
//                       sCount[s.charAt(right)-'a']++;
//                       if(right>=k){
//                            sCount[s.charAt(right-k)-'a']--;
//                       }
//                      if(Arrays.equals(pCount,sCount)){
//                              list.add(right-k+1);
//                      }
//              }
//              for(int ans: list){
//                   System.out.print(ans);
//              }
//     }
//     public static void main(String args[]){
//         String s = "abab";
//         String p = "ab";
//         helper(s,p);
//     }
// }
// import java.util.*;
// public class programe{
//     public static boolean helper(String s,String t){
//           if(s.length()!=t.length()){
//                 return false;
//           }
//           char s1[] = s.toCharArray();
//           char t1[] = t.toCharArray();
//           Arrays.sort(s1);
//           Arrays.sort(t1);
//           if(s1.equals(t1)){
//                 return true;
//           }
//           return false;
//     }
//     public static void main(String args[]){
//           String s = "anagram";
//           String t = "nagaram";
//         boolean ans =   helper(s,t);
//         System.out.print(ans);
//     }
// }
// public class programe{ 
//        public static class Node{
//          int val;
//          Node next;
//          Node(int val){
//              this.val = val;
//              this.next = null;
//          }
//        }
//        public  static int MaxSumOfList(Node head){
//           if(head==null){
//               return 0;
//           }
//           if(head.next==null){
//               return head.val;
//           }
//           Node slow = head;
//           Node fast = head;
//           while(fast!=null  && fast.next!=null){
//                  slow = slow.next;
//                  fast = fast.next.next;
//           }
//           Node second  = slow.next;
//           slow.next = null;
//           Node prev = null;
//           while(second!=null){
//                 Node next = second.next;
//                 second.next   = prev;
//                 prev = second;
//                 second = next;
//           }
//           Node secondHead = prev;
//           Node first = head;
//           int max =0;
//           while(secondHead!=null){
//               int sum = first.val;
//                   sum +=  secondHead.val;
//                   max = Math.max(max,sum);
//                    first = first.next;
//                    secondHead = secondHead.next;
//           }
//           return  max;
//        }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//       public static boolean  canShip(int capacity,int nums[],int days){
//                      int daysNeeded = 1;
//                      int load =0;
//                      for(int num: nums){
//                             if(load+num>capacity){
//                                    daysNeeded++;
//                                    load = num;
//                             }else{
//                                     load+= num;
//                             }
//                      }
//                      return daysNeeded<=days;
//       } 
//       public static void helper(int nums[],int days){
//             int low = 0;
//             int high = 0;
//             for(int num: nums){
//                      low= Math.max(num,low);
//                      high += num;
//             }
//             while(low<high){
//                     int mid = low+(high-low)/2;
//                     if(canShip(mid,nums,days)){
//                             high = mid;
//                     }else{
//                           low = mid+1;
//                     }
//             }
//             System.out.print(low);
//       }
//       public static void main(String args[]){
//                int nums[] = { 1,2,3,4,5,6,7,8,9,10};
//                int n = nums.length;
//                int days = 3;
//                 helper(nums,days);
//       }
// }
// import  java.util.*;
// public class programe{
//       public static void helper(char arr[],int idx){
//             if(idx==arr.length){
//                     System.out.print(new String(arr));
//                     return;
//             }
//             for(int i=idx;i<arr.length;i++){
//                     swap(i,idx,arr);
//                     helper(arr,idx+1);
//                     swap(i,idx,arr);
//             }
//       }
//       public static void swap(int i,int j,char arr[]){
//                  char temp = arr[i];
//                  arr[i] = arr[j];
//                  arr[j] = temp;
//       }
//       public static void main(String args[]){
//             char arr[] = {'a','b','c'};
//             helper(arr,0);
//       }
// }
//  .................................................   intersections point 
// public class programe{
//       public static void main(String[] args) {
//              int nums1[] = {1,2,3,0,0,0};
//              int nums2[] = {2,5,6};
//              int n  = 3;
//              int m = 3;
//              int k = n+m-1;
//              int i=n-1;
//              int j=m-1;
//              while(i>=0  && j>=0){
//                    if(nums1[i]>=nums2[j]){
//                             nums1[k--] = nums2[j--];
//                    }else{
//                           nums1[k--] = nums1[i--];
//                    }
//              }
//              while(j>=0){
//                     nums1[k--] = nums2[j--];
//              }
//       }
// }
// import java.util.*;
// public  class programe{
//       public static class Node{
//             int val;
//             Node random;
//             Node next;
//             Node(int val){
//                     this.val  = val
//                     this.random = null;
//                     this.next = null;
//             }
//       }
//       public static void helper(Node head){
//                 if(head==null){
//                     return;
//                 }
//                 HashMap<Node,Node> map = new HashMap<>();
//                 Node curr = head;
//                 while(curr!=null){
//                      map.put(curr,new Node(curr.val));
//                      curr = curr.next;
//                 }
//                 curr = head;
//                 while(curr!=null){
//                       map.get(curr).next = map.get(curr).next;
//                       map.get(curr).random = map.get(curr).random;
//                       curr = curr.next;
//                 }
//       }
//       public static void main(String[] args) {
//       }
// }
// import  java.util.*;
// public class programe{
//         public static void helper(char board[][],ArrayList<ArrayList<String>> ans,int n,int row){
//                       if(row==n){
//                               ans.add(construct(board));
//                               return ;
//                       }
//                        for(int col=0;col<n;col++){
//                                 if(isSafe(board,row,col,n)){
//                                        board[row][col] = 'Q';
//                                        helper(board,ans,n,row+1);
//                                        board[row][col] = '.';
//                                 }
//                        }
//         }
//         public static ArrayList<String> construct(char board[][]){
//                        ArrayList<String> ans = new ArrayList<>();
//                        for(char col[]: board){
//                                  ans.add(new String(col));
//                        }
//                        return ans;
//         }
//         public static boolean isSafe(char board[][],int row,int col,int n){
//                   for(int i=row;i>=0;i--){
//                          if(board[i][col]=='Q'){
//                                return  false;
//                          }
//                   }
//                   for(int i=col;i>=0;i--){
//                         if(board[row][i]=='Q'){
//                                 return false;
//                         }
//                   }
//                   for(int i=row,j=col;i>=0&& j>=0 ;i--,j--){
//                            if(board[i][j]=='Q'){
//                                  return false;
//                            }
//                   }
//                   for(int i=row,j=col;i>=0 && j<n;i--,j++){
//                          if(board[i][j]=='Q'){
//                                return  false;
//                          }
//                   }
//                   return  true;
//         }
//        public  static void main(String args[]){
//                  int n = 4;
//                  int m = 4;
//                  char board[][] = new char[n][m];
//                  for(char col[]:board){
//                           Arrays.fill(col,'.');
//                  }
//                    ArrayList<ArrayList<String>> ans = new ArrayList<>();
//                    helper(board,ans,n,0);
//                    for(List<String> list: ans){
//                              for(String s:  list){
//                                        System.out.print(s +"  ");
//                              }
//                              System.out.println();
//                    }
//        }
// }
// import java.util.*;
// public class programe{
//     public static int helper(int edges[][],int k,int n){
//             List<List<int[]>> list = new ArrayList<>();
//              for(int i=0;i<=n;i++){
//                     list.add(new ArrayList<>());
//              }
//              for(int edge[]: edges){
//                   int u = edge[0];
//                   int v =  edge[1];
//                   int w = edge[2];
//                   list.get(u).add(new int[]{v,w});  
//              }
//              PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
//              pq.add(new int[]{k,0});
//              int dis[] = new int[n];
//              Arrays.fill(dis,Integer.MAX_VALUE);
//              while(!pq.isEmpty()){
//                     int  curr[] = pq.poll();
//                     int node = curr[0];
//                     int time = curr[1];
//                      if(time>dis[node]){
//                              continue;
//                      }
//                      for(int e[] :list.get(node)){
//                                int des =   e[0];
//                                int wt =  e[1];
//                                if(dis[des]>time+wt){
//                                      dis[des] =  time+wt;
//                                      pq.add(new int[]{des,dis[des]});
//                                }  
//                      }
//                      int ans = 0;
//                      for(int i=0;i<n;i++){
//                           if(dis[i]==Integer.MAX_VALUE){
//                                  i++;
//                           }
//                           ans = Math.max(ans,dis[i]);
//                      }
//                      System.out.print(ans);
//              }
//     }
//     public static void main(String[] args) {
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//           int nums[] = {2,1,5,1,3,2};
//           int n = nums.length;
//           int k=2;
//           int windowSum = 0;
//           int maxSum=0;
//           for(int i=0;i<k;i++){
//                windowSum += nums[i];
//           }
//            for(int i=k;i<n;i++){
//                  windowSum += nums[i];
//                  windowSum-=nums[i-k];
//                  maxSum = Math.max(maxSum,windowSum);
//            }
//            System.out.print(maxSum);
//     }
// }
// import java.util.*;
// public  class programe{
//     public static void main(String[] args) {
//            int nums[] = {100,200,300,400};
//            int n = nums.length;
//            int prefix =0;
//            int max=0;
//            int k=2;
//            for(int num: nums){
//                  prefix+=num;
//                     k--; 
//                     if(k==0){
//                           max = Math.max(max,prefix);  
//                  }
//            }
//            System.out.print(max);
//     }
// }
// import java.util.*;
// public class programe{
//        public static void main(String args[]){
//              int nums[] ={10,9,2,5,3,7,101,18};
//              int n = nums.length;
//              int dp[] = new int[n];
//              Arrays.fill(dp,1);
//              int ans=1;
//              for(int i=1;i<n;i++){
//                  for(int j=0;j<i;j++){
//                         if(nums[i]>nums[j]){
//                              dp[i] = Math.max(dp[i],dp[j]+1);
//                         }
//                  }
//                  ans = Math.max(ans,dp[i]);
//              }
//              System.out.print(ans);
//        }
// }
// import java.util.*;
// public  class  programe{
//     public static boolean validPath(int edges[][],int source,int destination){
//               ArrayList<Integer> list[] = new ArrayList[edges.length];
//               for(int i=0;i<edges.length;i++){
//                      list[i] = new ArrayList<>();
//               }
//               for(int col[]: edges){
//                    int u = col[0];
//                    int v= col[1];
//                     list[u].add(v);
//                     list[v].add(u);
//               }
//               int n = edges.length;
//               boolean vis[] = new boolean[n];
//               return dfs(list,vis,source,destination);
//     }
//     public static boolean  dfs(ArrayList<Integer> list[],boolean vis[],int source,int destination){
//                     if(source==destination){
//                            return true;
//                     }
//                vis[source] = true;
//                  for(int nbr : list[source]){
//                            if(!vis[nbr]){
//                                   if(dfs(list,vis,nbr,destination)){
//                                        return true;
//                                   }
//                            }
//                  }
//                  return false;
//     }
//      public static boolean bfs(ArrayList<Integer>list[],boolean vis[],int source,int destination){
//                   Queue<Integer> q =  new LinkedList<>();
//                   q.offer(source);
//                   while(!q.isEmpty()){
//                        int curr =  q.poll();
//                        if(curr==destination){
//                               return true;
//                        }
//                        for(int nbr: list[curr]){
//                             if(!vis[nbr]){
//                                     vis[nbr] = true;
//                                     q.offer(nbr);
//                             }
//                        }
//                   }
//                   return false;
//      }
//     public  static void  main(String args[]){
//     }
// }
// import java.util.*;
// public class programe {
//     public static int helper(int edges[][]) {
//         int n = edges.length;
//         int m = edges[0].length;
//         int effort[][] = new int[n][m];
//         int dir[] = {-1, 1, 0, 0};
//         int dic[] = {0, 0, -1, 1};
//         for (int e[] : effort) {
//             Arrays.fill(e, Integer.MAX_VALUE);
//         }
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
//         pq.offer(new int[]{0, 0, 0});
//         effort[0][0] = 0;
//         while (!pq.isEmpty()) {
//             int curr[] = pq.poll();
//             int row = curr[0];
//             int col = curr[1];
//             int currEffort = curr[2];
//             if (row == m - 1 && col == n - 1) {
//                 return currEffort;
//             }
//             for (int i = 0; i < 4; i++) {
//                 int nextRow = row + dir[i];
//                 int nextCol = col + dic[i];
//                 if (nextRow < 0 || nextRow > n - 1 || nextCol < 0 || nextRow > m - 1) {
//                     continue;
//                 }
//                 int diff = Math.abs(edges[row][col] - edges[nextRow][nextCol]);
//                 int newEffort = Math.max(diff, currEffort);
//                 if(newEffort<effort[nextRow][nextCol]){
//                           effort[nextRow][nextCol] = newEffort;
//                           pq.add(new int[]{nextRow,nextCol,newEffort});
//                 }
//             }
//            }
//            return 0;
//     }
// public static void main(String args[]){
// }
// }
// import java.util.*;
// public class programe{
//     public static int networkDelay(int time[][],int k,int n){
//                ArrayList<int[]>list[] = new ArrayList[n+1];
//               PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
//               for(int i=0;i<n;i++){
//                     list[i] = new ArrayList<>();
//               }
//               for(int col[]:time){
//                       int v = col[0];
//                       int u = col[1];
//                       int wt = col[2];
//                       list[u].add(new int[]{v,wt});
//               }
//                  pq.offer(new int[]{k,0});
//                 int dis[] = new int[n+1];
//                 Arrays.fill(dis,Integer.MAX_VALUE);
//                 while(!pq.isEmpty()){
//                          int curr[] =  pq.poll();
//                          int currNode = curr[0];
//                          int currTime = curr[1];
//                           if(currTime>dis[currNode]){
//                               continue;
//                           }
//                           for(int nbr[] : list[curr]){
//                                 int nextNode = nbr[0];
//                                 int wt = nbr[1];
//                                 if(dis[nextNode]>time+wt){
//                                         dis[nextNode] = time+wt;
//                                         pq.add(new int[]{nextNode,dis[nextNode]});
//     }
//     }
// import java.util.*;
// public  class  programe{
//     public static  class Node{
//          int data;
//          Node next;
//          Node random;
//          Node(int  data){
//               this.next = null;
//               this.random = null;
//          }
//     }
//         if(head==null){
//         }
//          Node curr = head;
//         HashMap<Node,Node> map = new HashMap<>();
//         while(curr!=null){
//                map.put(curr,new Node(curr.data));
//                curr = curr.next;
//         }      
//         curr = head;
//         while(curr!=null){
//               map.get(curr).next = map.get(curr).next;
//               map.get(curr).random = map.get(curr).random;
//               curr = curr.next;
//         }
//     }
//     }
// public  class programe{
//     public static void main(String[] args) {
//            int nums[] = {1,2,5};
//            int n = nums.length;
//            int amount = 11;
//            int dp[] = new int[amount+1];
//            Arrays.fill(dp,amount+1);
//            dp[0] = 0;
//            for(int i=1;i<=amount;i++){
//                for(int coin:   nums){
//                     if(coin<=i){
//                       dp[i] = Math.min(dp[i],dp[i-coin]+1);
//                     }
//                }
//            }
//            System.out.print(dp[amount]);
//     }
// import java.util.*;
// public class programe{
//     public static int helper(){
//           int nums[] = {1,7,3,6,5,6};
//            int n = nums.length;
//            int total =0;
//            for(int num: nums){
//               total  += num;
//            }
//            int leftSum =0;
//            for(int i=0;i<n;i++){
//               int rightSum = total-leftSum-nums[i];
//               if(leftSum==rightSum){
//                      return i;
//               }
//               leftSum += nums[i];
//            }
//            return -1;
//     }
//     public static void main(String args[]){
//     }
// import java.util.*;
// public class programe{
//     public static boolean helper(){
//          int nums[] = {1,3,2};
//           Stack<Integer> st = new Stack<>();
//           int n = nums.length;
//           int second = Integer.MIN_VALUE;
//           for(int i=n-1;i>=0;i--){
//                  if(nums[i]<second){
//                        return true;
//                  }
//                  while(!st.isEmpty()  && st.peek()<nums[i]){
//                          second = st.pop();
//                  }
//                  st.push(nums[i]);
//           }
//           return  false;
//     }
//                     System.out.print(helper());
//     }
// import  java.util.*;
// public class programe{
//     public static boolean helper(){
//            Stack<Integer> st = new Stack<>();
//             int nums[] = {1,3,2};
//             int n = nums.length;
//             int second = Integer.MIN_VALUE;
//             for(int i=nums.length-1;i>=0;i--){
//                    if(second>nums[i]){
//                        return  true;
//                    }
//                    while(!st.isEmpty()  &&   st.peek()<nums[i]){
//                           second = st.pop();
//                    }
//             }
//                return false;
//     }
//     public static void main(String args[]){
//     }
// import java.util.*;
// public  class programe{
//     public static void main;(String args[]){
//            String num =  "1432219";
//            int n = num.length();
//            int k=3;
//            for(char ch: num.toCharArray()){
//                   int number = ch-'0';
//                   while(!st.isEmpty() && st.peek()>number  && k>0){
//                          st.pop();
//                          k--;
//                   }
//                   st.push(number);
//            }
//            while(!st.isEmpty()  && k>0){
//                  st.pop();
//                  k--;
//            }
//            StringBuilder sb = new StringBuilder();
//            while(!st.isEmpty() ){
//                      char ch = (char)(st.pop()+'0');
//                      sb.append(ch);
//            }
//              sb.reverse();
//              while(sb.length()>0 && sb.charAt(0)=='0'){
//                     sb.deleteCharAt(0);
//              }
//              if(sb.length()==0){
//                    return "0";
//              }
//     }
// import java.util.*;
// public  class  programe{
//     public static void main(String args[]){
//             int heights[] = {2,1,5,6,2,3};
//             int n = heights.length;
//             int left[] = new int[n];
//             int right[] = new int[n];
//             Stack<Integer> st = new Stack<>();
//             for(int i=0;i<n;i++){
//                    while(!st.isEmpty()  && heights[st.peek()]>=heights[i]){
//                        st.pop();
//                    }
//                    if(st.isEmpty()){
//                             left[i] = -1;
//                    }else{
//                             left[i] = st.peek();
//                    }
//             }
//               st.clear();
//               for(int i=n-1;i>=0;i--){
//                         while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
//                                  st.pop();
//                         }
//                         if(st.isEmpty()){
//                                 right[i] = -1;
//                         }else{
//                               right[i] = st.peek();
//                         }
//                         st.push(i);
//               }
//               int maxWidth=0;
//               for(int i=0;i<n;i++){
//                     int width  =  right[i]-left[i]-1;
//                     int area = width*heights[i];
//                     maxWidth  = Math.max(area,maxWidth);
//               }
//     }
// import java.util.*;
// public class  programe{
//     public class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//              this.data = data;
//              this.left = null;
//              this.right = null;
//     }
//     public static int depth(Node root){
//                 int height  = 0;
//                 Queue<Node> q = new LinkedList<>();
//     }
//     }
// public class programe{
//     public static class Node{
//         int data;
//         Node left;
//         public Node(int data) {
//              this.data = data;
//              this.left = null;
//              this.right = null;
//         }
//         public static int depthBinaryTree(Node root){
//                 if(root==null){
//                       return 0;
//                 }
//                 int left = depthBinaryTree(root.left);
//                 int right = depthBinaryTree(root.right);
//                 return 1+Math.max(left,right);
//         }
//     }
//     public static void main(String[] args) {
//     }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//         int nums[] = {1,1,2,2,3,4,5};
//         int k = 3;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int num: nums){
//                  map.put(num,map.getOrDefault(num,0)+1);
//         }
//         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
//         for(int num : map.keySet()){
//                 pq.add(num);
//                 if(pq.size()>k){
//                       pq.poll();
//                 }
//         }
//         int res[] = new int[k];
//         for(int i=0;i<k;i++){
//                res[i] = pq.poll();
//         }
//         for(int num: res){
//               System.out.print(num +"  ");
//         }
//     }
// import java.util.*;
// public  class programe{
//     public static void main(String[] args) {
//           int nums[] = {100,4,200,1,3,2};
//           int n = nums.length;
//           HashSet<Integer> set = new HashSet<>();
//           for(int num: nums){
//                set.add(num);
//           }
//           for(int num:set){
//                 if(!set.contains(num-1)){
//                       int count=1;
//                       while(set.contains(current+1)){
//                              count++;
//                              current++;
//                       }
//                       longest = Math.max(longest,count);
//           }
//           System.out.print(longest);
//     }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//             String str[] = {"2","3","C","D","+"};
//             int n = str.length;
//             Stack<Integer> st = new Stack<>();
//             for(String word: str){
//                     if(word.equals("+")){
//                            int top = st.pop();
//                            int newTop = top+st.peek();
//                            st.push(top);
//                            st.push(newTop);
//                     }else if(word.equals("D")){
//                           st.push(2*st.peek());
//                     }else if(word.equals("C")){
//                            st.pop();
//                     }else{
//                           st.push(Integer.parseInt(word));
//                     }
//             }
//             while()
//     }
// .................................................................
// import java.util.*;
// public  class programe{
//     public static void helper(){
//           int nums1[] = {4,1,2};
//           int nums2[]   = {1,3,4,2};
//           int n = nums2.length;
//           Stack<Integer> st = new Stack<>();
//           int ans[] = new int[n];
//           ans[n-1] = -1;
//           st.push(nums2[n-1]);
//           for(int i=n-2;i>=0;i--){
//               while(!st.isEmpty()  && st.peek()<nums2[i]){
//                         st.pop();
//              ans[i] =  st.isEmpty()?-1:st.peek();
//           }
//           HashMap<Integer,Integer> map = new HashMap<>();
//           for(int i=0;i<n;i++){
//                map.put(nums2[i],ans[i]);
//           }
//           int finalAns[] = new int[nums1.length];
//           for(int i=0;i<nums1.length;i++){
//                  finalAns[i] = map.get(nums1[i]);
//     }
//     public  static void main(String args[]){
//     }
// ........................................... find the next greater element int the arrat
// import  java.util.*;
// public class programe{
//     public static int[][] intervalIntersection(int firstList[][],int secondList[][]){
//             List<int[]> ans = new ArrayList<>();
//             int i=0;
//             int j=0;
//             while(i<firstList.length  && j<secondList.length){
//                      int first  = Math.max(firstList[i][0],secondList[j][0]);
//                      int second = Math.min(firstList[i][1],secondList[j][1]);
//                      if(first<=second){
//                           ans.add(new int[]{first,second});
//                      }
//                      if(firstList[i][1]<secondList[j][1]){
//                            i++;
//                      }else{
//                           j++;
//                      }
//             }
//             return ans.toArray(new int[ans.size()][]);
//     }
//     }
// import java.util.*;
// public class programe{
//     public static  int[][] mergeIntervals(int input[][]){
//            List<int[]> ans = new ArrayList<>();
//            int first = input[0][0];
//            int second = input[0][1];
//            Arrays.sort(input,(a,b)->a[0]-b[0]);
//                 if(input[i][0]<=second){
//                        second = Math.max(second,input[i][1]);
//                 }else{
//                        ans.add(new int[]{first,second});
//                        first = input[i][0];
//                        second = input[i][1];
//                 }
//            }
//            ans.add(new int[]{first,second});
//            return  ans.toArray(new int[ans.size()][]);
//     }
//     public static void main(String args[]){
//          int input[][] = new int[][]{{1,3},{2,6},{8,10},{15,18}};
//          mergeIntervals(input);
//     }
// ..............................................   alien dictionary.............................
// import java.util.*;
// public  class programe{
//     public static String  helper(String words[]){
//             HashMap<Character,HashSet<Character>> adj = new HashMap<>();
//             HashMap<Character,Integer> indegree  = new HashMap<>();
//             for(String word: words){
//                   for(char ch : word.toCharArray()){
//                          adj.putIfAbsent(ch,new HashSet<>());
//                          indegree.put(ch,0);
//                   }
//             }
//             for(int i=0;i<words.length-1;i++){
//                 String w1 = words[i];
//                 String w2 = words[i+1];
//                 int len = Math.max(w1.length(),w2.length());
//                 for(int j=0;j<len;j++){
//                       char ch1 = w1.charAt(j);
//                       char ch2 = w2.charAt(j);
//                       if(ch1!=ch2){
//                             if(!adj.get(ch1).contains(ch2)){
//                                     adj.get(ch1).add(ch2);
//                                     indegree.put(ch1,indegree.get(ch1)+1);
//                             }
//                       }
//                       break;
//                 }
//                  Queue<Character> q = new LinkedList<>();
//                  for(char ch : indegree.keySet()){
//                         if(indegree.get(ch)==0){
//                                q.add(ch);
//                         }
//                  }
//                   StringBuilder sb = new StringBuilder();
//                   while(!q.isEmpty()){
//                      char ch = q.poll();
//                      sb.append(ch);
//                      for(char c : adj.get(ch)){
//                           indegree.put(c,indegree.get(c)-1);
//                           if(indegree.get(c)==0){
//                               q.add(c);
//                           }
//                      }
//             }
//            return  sb.toString();
//     }
//     }
// }
// ..............................................................
// public  class  programe{
//     public  static boolean helper(int preq[][],int numCourses){
//            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//            for(int i=0;i<numCourses;i++){
//                 adj.add(new ArrayList<>());
//            }
//            int indegree[] = new int[numCourses];
//            for(int pre[]: preq){
//                 int a = pre[0];
//                 int b = pre[1];
//                 adj.get(b).add(a);
//                 indegree[a]++;
//            }
//            Queue<Integer> q = new LinkedList<>();
//            for(int i=0;i<numCourses;i++){
//                   if(indegree[i]==0){
//                         q.add(i);
//                   }
//            }
//            int count=0;
//            while(!q.isEmpty()){
//                 int curr = q.poll();
//                 count++;
//                 for(int nbr:adj.get(curr)){
//                         indegree[nbr]--;
//                         if(indegree[nbr]==0){
//                                   q.add(nbr);
//                         }
//            }
//     }
//     public static void main(String args[]){
//           int preq[][] = {{}};
//           int numCourses = 4;
//        boolean isComplete =    helper(preq,numCourses);
//        System.out.print(isComplete);
//     }
// import  java.util.*;
// public class programe{
//     public static int countCharacters(){
//             String str[] = {"cat","bt","hat","tree"};
//               String chars = "atach";
//                int n = chars.length();
//               int freq[] = new int[26];
//               for(int i=0;i<n;i++){
//                      freq[chars.charAt(i)-'a']++;
//               }
//               int ans= 0;
//               for(String word: str){
//                   int temp[] = freq.clone();
//                   boolean isTrue = true;
//                   for(char ch: word.toCharArray()){
//                            if(temp[ch-'a']==0){
//                                 isTrue = false;
//                                 break;
//                            }
//                            temp[ch-'a']--;
//                   }
//                   if(isTrue){
//                           ans += word.length();
//               }
//     }
//     public static void main(String args[]){
//         int ans =   countCharacters(); 
//         System.out.print(ans);          
//     }
// ................................................................       find word that can be performed using the characters
// import  java.util.*;
// public class programe{
//     public static boolean helper(){
//          String ransonNote = "aa";
//            String magazine = "aab";
//            int freq[] = new int[26];
//            for(int i=0;i<magazine.length();i++){
//                freq[magazine.charAt(i)-'a']++;
//            }
//            for(int i=0;i<ransonNote.length();i++){
//                 char ch = ransonNote.charAt(i);
//                 if(freq[ch-'a']==0){
//                       return false;
//                 }
//                 freq[ch-'a']--;
//            }
//            return true;
//     }
//     }
// import  java.util.*;
// public class programe{
//     public static boolean helper(){
//           String s = "abba";
//           String t  = "dog cat cat dog";
//           char sChar[] = s.toCharArray();
//           String tStr[] = t.split(" ");
//           HashMap<Character,String> map1 = new HashMap<>();
//           HashMap<String,Character> map2 = new HashMap<>();
//           for(int i=0;i<sChar.length;i++){
//                    char ch  = sChar[i];
//                    String  st = tStr[i];
//                    if(map1.containsKey(ch)){
//                       if(!map1.get(ch).equals(st)){
//                              return false;
//                       }
//                    }else{
//                         map1.put(ch,st);
//                    }
//                    if(map2.containsKey(st)){
//                          if(map2.get(st)!=ch){
//                                return   false;
//                          }
//                    }else{
//                       map2.put(st,ch);
//                    }
//           }
//           return  true;
//     }
//     }
// import  java.util.*;
// public class programe{
//     public  static boolean isMatch(String word,String pattern){
//                HashMap<Character,Character> map1 = new HashMap<>();
//                HashMap<Character,Character> map2 = new HashMap<>();
//                for(int i=0;i<word.length();i++){
//                           char ch1 = word.charAt(i);
//                           char ch2 = pattern.charAt(i);
//                           if(map1.containsKey(ch1)){
//                               if(map1.get(ch1)!=ch2){
//                                   return false;
//                               }
//                           }else{
//                           }
//                           if(map2.containsKey(ch2)){
//                                 if(map2.get(ch2)!=ch1){
//                                         return false;
//                                 }
//                           }else{
//                               map2.put(ch2, ch1);
//                }
//                return  true;
//     }
//     public static void helper(){
//          String words[] = {"abc","deq","mee","aqq","dkd","ccc"};
//          int n = words.length;
//          String pattern = "abb";
//           ArrayList<String> list = new ArrayList<>();
//           for(String word: words){
//                   if(isMatch(word,pattern)){
//                          list.add(word);
//                   }
//           }
//           for(String word: list){
//               System.out.println(word);
//           }
//     }
//     public static void main(String args[]){
//     }
//  ................................................ Find and Replace Pattern
// import java.util.*;
// public class programe{
//     public static boolean isomorphicString(){
//           String s1 = "egg";
//           String s2 = "add";
//           HashMap<Character,Character> map1 = new HashMap<>();
//           HashMap<Character,Character> map2 = new HashMap<>();
//             for(int i=0;i<s1.length();i++){
//                     char ch1 = s1.charAt(i);
//                     char ch2 = s2.charAt(i);
//                     if(map1.containsKey(ch1)){
//                               if(map1.get(ch1)!=ch2){
//                                      return false;
//                               }
//                     }else{
//                             map1.put(ch1,ch2);
//                     }
//                     if(map2.containsKey(ch2)){
//                            if(map2.get(ch2)!=ch1){
//                                  return  false;
//                            }
//                     }else{
//                                map2.put(ch2,ch1);
//             }
//     }
//     }
// import java.util.*;
// public class programe{
//     public static void helper(){
//            int nums[] = {2,7,9,3,1};
//            int n  = nums.length;
//            int dp[] = new int[n];
//            dp[0] = nums[0];
//            dp[1] = Math.max(nums[0],nums[1]);
//            for(int i=2;i<n;i++){
//                  dp[i] =  Math.max(dp[i-1],dp[i-2]+nums[i]);
//            }
//     }
//     public static void main(String args[]){
//         int nums[] = {2,7,9,3,1};
//         int n = nums.length;
//         int prev1 = 0;
//         int prev2 = 0;
//         for(int num: nums){
//                int curr = Math.max(prev1,prev2+num);
//                prev1 = prev2;
//                prev2 = curr;
//         }
//         System.out.print(prev1);
//     }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//          int nums[] ={7,1,5,3,6,4};
//          int n = nums.length;
//          int bestBuy = nums[0];
//          int profit = 0;
//          for(int i=1;i<n;i++){
//                   if(bestBuy>nums[i]){
//                        profit = Math.max(profit,nums[i]-bestBuy);
//                   }
//                   bestBuy = Math.min(bestBuy,nums[i]);
//          }
//          System.out.print(bestBuy +"  " + profit);
//     }
// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//           int nums[] = {5,-3,5};
//           int n = nums.length;
//           int maxSum = nums[0];
//           int minSum = nums[0];
//           int total =0;
//           int currMin = 0;
//           int currMax = 0;
//           for(int sum : nums){
//                   currMin = Math.min(currMin,currMin+sum);
//                   minSum = Math.min(currMin,minSum);
//                   currMax = Math.max(currMax,currMax+sum);
//                   maxSum = Math.max(currMax,maxSum);
//                     total += sum;
//           }
//           if(maxSum<0){
//           }
//     }
// import  java.util.*;
// public  class programe{
//     public static void helper(){
//           int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
//           int n = nums.length;
//           int curr = nums[0];
//           int maxSum = nums[0];
//           for(int i=1;i<n;i++){
//              curr =  Math.max(nums[i],curr+nums[i]);
//           }
//           System.out.print(maxSum);
//     }
//     public static void main(String args[]){
//     }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//            String str = "abbaca";
//            int n = str.length();
//            for(char ch: str.toCharArray()){
//                      if(st.size()>0  && st.peek()==ch){
//                             st.pop();
//                      }else{
//                            st.push(ch);
//            }
//            StringBuilder sb = new StringBuilder();
//              while(st.size()>0){
//                   sb.append(st.pop());
//              }
//              System.out.print(sb.reverse().toString());
//     }
// import  java.util.*;
// public class programe{
//     public static void helper(String s){
//         StringBuilder sb = new StringBuilder();
//               int i=0;
//               int n = s.length();
//               while(i<n){
//                 int start =i;
//                    while(s.charAt(start)!='['){
//                          start++;
//                    }
//                    int len = Integer.parseInt(s.substring(i,start));
//                    start++;
//                    int end = start;
//                    while(s.charAt(end)!=']'){
//                         end++;
//                    }
//                    String sub =  s.substring(start,end);
//                    for(int j=0;j<len;j++){
//                           sb.append(sub);
//                    }
//                    i = end+1;
//               }
//     }
//     public static void main(String args[]){
//           helper(str);
//     }
// import  java.util.*;
// public class  programe{
//     public static String encode(String arr[]){
//             StringBuilder sb = new StringBuilder();
//             for(String str: arr){
//                    sb.append(str.length());
//                    sb.append("#");
//                    sb.append(str);
//             }
//     }
//     public static void decode(){
//           String arr[] = {"hi","abc"};
//             String str =   encode(arr);
//               ArrayList<String> list = new ArrayList<>();
//               int i=0;
//               int n = str.length();
//               while(i<n){
//                 int j = i;
//                 while(str.charAt(j)!='#'){
//                         j++;
//                 }
//                 int len = Integer.parseInt(str.substring(i,j));
//                 j++;
//                 String subStr  = str.substring(j,j+len);
//                 list.add(subStr);
//               }
//               for(String s: list){
//                   System.out.print(s);
//               }
//     }
//           decode();
//     }
// import  java.util.*;
// public class  programe{
//     public static String helper(){
//            String str[] = {"Hello", "World"};
//         int len = str.length;
//         HashMap<String,Integer> map = new HashMap<>();
//         for(int i=0;i<len;i++){
//                 map.put(str[i],str[i].length());
//         }
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<len;i++){
//                 int n =  map.get(str[i]);
//                 sb.append(n);
//                 sb.append("/:");
//                 sb.append(str[i]);
//         }
//          return sb.toString();
//     }
//     public static ArrayList<String> decoding(String s){
//               ArrayList<String> list = new ArrayList<>();
//               int i=0;
//               while(i<s.length()){
//                     int len = (int)s.charAt(i);
//                     String newString = s.substring(i+1,len);
//                     list.add(newString);
//                     i+=len;
//               }
//     }
//     }
// import java.util.*;
// public class  programe{
//     public static String helper(String s){
//               HashMap<Character,Integer> map  = new HashMap<>();
//               for(char ch : s.toCharArray()){
//                     map.put(ch,map.getOrDefault(ch, 0)+1);
//               }
//               StringBuilder sb = new StringBuilder();
//               for(char ch: map.keySet()){
//                       sb.append(ch);
//                       int freq =  map.get(ch);
//                       if(freq>1){
//                             sb.append(freq);
//                       }   
//               }
//     }
//     public static void main(String[] args) {
//             String s = "abbcccddd";
//             int n = s.length();
//     }
// import  java.util.*;
// public class programe{
//          public static int helper(int nums[]){
//              int n  = nums.length;
//              int dp[] = new int[n];
//              Arrays.fill(dp,-1);
//              dp[n-1] = 0;
//              for(int i=n-2;i>=0;i--){
//                   int ans = Integer.MAX_VALUE;
//                   int steps = nums[i];
//                   for(int j=i+1;j<steps+i && j<n;j++){
//                         if(dp[j]!=-1){
//                               ans =  Math.min(ans,dp[j]+1);
//                         }
//                   }
//                   if(ans!=Integer.MAX_VALUE){
//                        dp[i]  = ans;
//              }
//              return dp[0];
//          }
//     public static void main(String args[]){
//         int nums[] = {2,3,1,1,4};
//         int n = nums.length;
//         int ans = helper(nums);
//     }
// 1.........................................................  day 1 problem: 1    18/5/2026;
// import java.util.*;
// public class programe{
//     public static int minimumPartioning(int nums[]){
//           int n = nums.length;
//           int sum = 0;
//           for(int i=0;i<n;i++){
//             sum += nums[i];
//           }
//           int w = sum/2;
//           int dp[][] = new int[n+1][w+1];
//           for(int i=1;i<=n;i++){
//               for(int j=1;j<=w;j++){
//                     if(nums[i-1]<=j){
//                            dp[i][j] =  Math.max(nums[i-1]+dp[i-1][j-nums[i-1]],dp[i-1][j]);
//                     }else{
//                           dp[i][j] =  dp[i-1][j];
//                     }
//               }
//           }
//           return dp[n][w];
//     }
//     public static void main(String args[]){
//          int nums[] = {1,11,5,6};
//          System.out.print(minimumPartioning(nums));
//     }
// import  java.util.*;
// public class programe{
//     public static void findOrder(String str[],int n,int k){
//               ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//                for(int i=0;i<str.length;i++){
//                      adj.add(new ArrayList<>());
//                }
//                 for(int i=0;i<n-1;i++){
//                        String s1 = str[i];
//                        String s2 = str[i+1];
//                        int len = Math.min(s1.length(),s2.length());
//                        for(int j=0;j<len;j++){
//                             if(s1.charAt(j)!=s2.charAt(j)){
//                                   int u = s1.charAt(j)-'a';
//                                   int v = s2.charAt(j)-'a';
//                                   adj.get(u).add(v);
//                                   break;
//                             }
//                 }
//                 Queue<Integer> q = new LinkedList<>();
//                 int indegree[] = new int[k];
//                 for(int i=0;i<k;i++){
//                       if(indegree[i]==0){
//                              q.offer(i);  
//                       }
//                 }
//                   StringBuilder ans = new StringBuilder();
//                  while(!q.isEmpty()){
//                        int curr = q.poll();
//                        ans.append((char)curr+'a');
//                          for(int neigh : adj.get(curr)){
//                                 indegree[neigh]--;
//                                 if(indegree[neigh]==0){
//                                        q.add(neigh);
//                                 }  
//                          }
//     }
//     }
// } 
// public class  programe{
//     public static boolean  canFinish(int numCourses,int prequistion[][]){
//              ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//              boolean vis[] = new boolean[numCourses];
//              boolean visPath[] = new boolean[numCourses];
//              for(int i=0;i<numCourses;i++){
//                     adj.add(new ArrayList<>());
//              }
//              for(int edge[]: prequistion){
//                     adj.get(edge[1]).add(edge[0]);
//              }
//              for(int i=0;i<numCourses;i++){
//                   if(!vis[i]){
//                        if(dfs(i,vis,visPath,adj)){
//                              return false;
//                        }
//                   }
//              }
//              return true;
//     }
//     public static boolean dfs(int curr,boolean vis[],boolean visPath[],ArrayList<ArrayList<Integer>> adj){
//                  vis[curr]  = true;
//                  visPath[curr] = true;
//                  for(int neighbour : adj.get(curr)){
//                          if(!vis[neighbour]){
//                                  if(dfs(neighbour,vis,visPath,adj)){
//                                        return  true;
//                                  }
//                          }else if(visPath[neighbour]){
//                                 return true;
//                          }
//                  }
//                  return false;
//     }
//     }
// ............................................. Edit distance
// import  java.util.*;
// public class programe{
//     public static int minDistance(String s1,String s2){
//             int n = s1.length();
//             int m = s2.length();
//             int dp[][] = new int[n+1][m+1];
//             for(int i=0;i<=n;i++){
//                   dp[i][0]  = i;
//             }
//             for(int j=0;j<=m;j++){
//                     dp[0][j] = j;
//             }
//             for(int i=1;i<=n;i++){
//                  for(int j=1;j<=m;j++){
//                       if(s1.charAt(i-1)==s2.charAt(j-1)){
//                            dp[i][j] = dp[i-1][j-1];
//                       }else{
//                            int insert = dp[i-1][j];
//                            int delete  = dp[i][j-1];
//                            int replace = dp[i-1][j-1];
//                            dp[i][j] = Math.min(insert,Math.min(delete,replace))+1;
//                       }
//                  }
//             }
//             return dp[n][m];
//     }
//     public static void main(String args[]){
//            System.out.print(minDistance("horse","ros"));
//     }
// }
// .................................................  LCS
// public  class  programe{
//     public static int helper(String s1,String s2){
//            int n = s1.length();
//            int m = s2.length();
//            int dp[][] = new int[n+1][m+1];
//            for(int i=1;i<=n;i++){
//               for(int j=1;j<=m;j++){
//                   if(s1.charAt(i-1)==s2.charAt(j-1)){
//                         dp[i][j] = 1+dp[i-1][j-1];
//                   }else{
//                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//                   }
//               }
//             }
//     }
//     public static void main(String[] args) {
//         System.out.print(helper("abcde", "ace"));       
//     }
// import  java.util.*;
// public class programe{
//     public static int helper(int grid[][]){
//         int n = grid.length;
//         int m = grid[0].length;
//         int ans = 0;
//         for(int i=0;i<n;i++){
// //              for(int j=0;j<m;j++){
// grid[i][j]==2){
//                   }
//              }
//         }
//         for(int i=0;i<n;i++){
//              for(int j=0;j<m;j++){
//                   if(grid[i][j]==1){
//                         return -1;
//                   }
//                   ans = Math.max(ans,grid[i][j]);
//              }
//         }
//     }
//     public static void dfs(int grid[][],int i,int j,int time){
//              if(i>=0  ||  j>=0  || i<grid.length  || j<grid[0].length){
//                       return ;
//              }
//              if(grid[i][j]==0){
//                   return;
//              }
//              if(grid[i][j]!=1   && grid[i][j]<time){
//                      return;
//              }
//              grid[i][j] = time;
//              dfs(grid,i-1,j,time+1);
//              dfs(grid,i+1,j,time+1);
//              dfs(grid,i,j+1,time+1);
//     }
//     public static void main(String args[]){
//           int grid[][] = new int[4][4];
//          int ans =  helper(grid);
//          System.out.print(ans);
//     }
// 
// import  java.util.*;
// public class programe{
//     public static class Pair{
//         int node;
//         int wt;
//         public Pair(int node,int wt){
//              this.node = node;
//              this.wt = wt;
//     }
//     public static  void helper(int V,ArrayList<ArrayList<Pair>> adj,int src){
//                   int dis[] = new int[V];
//                   Arrays.fill(dis,Integer.MAX_VALUE);
//                    dis[src] = 0;
//                    PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a->a.wt));
//                    pq.add(new Pair(src,0));
//                    while(!pq.isEmpty()){
//                        Pair p = pq.poll();
//                        int u = p.node;
//                        for(Pair curr :  adj.get(u)){
//                                int v = curr.node;
//                                int wt = curr.wt;
//                                if(dis[u]+wt<dis[v]  &&  dis[u]!=Integer.MAX_VALUE){
//                                        dis[v] = dis[u]+wt;
//                                }  
//                        }
//                    }
//                  for(int val: dis){
//                       System.out.print(val +"  ");
//                  }
//     }
//     }
// }
// import  java.util.*;
// public class programe{
//     public static class Edge{
//         int u;
//         int v;
//         int wt;
//         Edge(int u,int v,int wt){
//                 this.u = u;
//                 this.v = v;
//                 this.wt = wt;
//         }
//     }
//         public static void helper(int v,ArrayList<Edge> edges,int src){
//                  int dis[] = new int[v];
//                  Arrays.fill(dis,Integer.MAX_VALUE);
//                   dis[src] = 0;
//                   for(int i=0;i<v;i++){
//                        for(Edge e: edges){
//                           if(dis[e.u]+e.wt<dis[e.v]){
//                                  dist[e.v]  = dist[e.u]+e.wt;
//                           }
//                        }   
//                   }
//                   for(int val:dis){
//                       System.out.print(val + "")
// ;                  }
//        public static void main(String args[]){
//            ArrayList<Edge> list = new ArrayList<>();
//            int v = 5;
//            list.add(new Edge(1,2,3));
//            list.add(new Edge(2,1,3));
//        }
// import java.util.*;
//        public static int climbingStairs(int n,int dp[]){
//                   if(n<=1){
//                        return n;
//                   }
//                   if(dp[n]!=-1){
//                        return dp[n];
//                   }
//                   dp[n]  = climbingStairs(n-1,dp)+climbingStairs(n-2,dp);
//        }
//        public static void main(String args[]){
//               int n = 5;
//               int dp[] = new int[n+1];
//               Arrays.fill(dp,-1);
//            int ans =  climbingStairs(n,dp);
//            System.out.print(ans);
//        }
// import java.util.*;
// public class  programe{
//      public static HashSet<ArrayList<Integer>> ans = new HashSet<>();
//      public static ArrayList<ArrayList<Integer>> solver(int nums[]){
//             Arrays.sort(nums);
//             helper(nums,0,new ArrayList<>());
//      }
//      public static void helper(int nums[],int i,ArrayList<Integer> list){
//             if(i==nums.length){
//                   ans.add(new ArrayList<>(list));
//                   return ;
//             }
//             list.add(nums[i]);
//             helper(nums,i+1,list);
//             list.remove(list.size()-1);
//      }
//      public static void main(String args[]){
//             int nums[]   = {1,2,2};
//             ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//           list =  solver(nums);
//           for(ArrayList<Integer> an: list){
//                  System.out.print(an +" ");
//      }
// import java.util.*;
// public class programe{
//      public static void helper(int nums[],int n,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> ans,int i){
//              if(i==n){
//                  ans.add(new ArrayList<>(curr));
//                  return;
//              }
//                curr.add(nums[i]);
//                helper(nums, n, curr, ans, i+1);
//                curr.remove(curr.size()-1);
//                helper(nums,n,curr,ans,i+1);
//      }
//      public static void main(String args[]){
//             int nums[] = {1,2,2};
//             int n = nums.length;
//             ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//             ArrayList<Integer> curr = new ArrayList<>();
//             helper(nums,n,curr,ans,0);
//             for(ArrayList<Integer> an:  ans){
//                      System.out.print(an);
//      }
// import  java.util.*;
// public class programe{
//      public static List<String> construct(char board[][]){
//               List<String> ans = new ArrayList<>();
//               for(char b[]:board){
//               }
//     }
//     public static void backtrack(char board[][],ArrayList<ArrayList<String>> ans,int n,int row){
//               if(row==n){
//                   ans.add(construct(board));
//                   return ;
//               }
//               for(int col=0;col<n;col++){
//                     if(isSafe(col,row,board)){
//                            board[row][col] = 'Q';
//                            backtrack(board,ans,col,row+1);
//                            board[row][col] = '.';
//                     }
//                 }
//     }
//     public static boolean isSafe(int row,int col,char board[][]){
//               for(int i=0;i<row;i++){
//                   if(board[i][col]=='Q'){
//                        return false;
//                   }
//               }
//               for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
//                   if(board[i][j]=='Q'){
//                        return false;
//                   }
//               }
//               for(int i=row-1,j=col+1;i>=0 && j<board.length ;i--,j++){
//                    if(board[i][j]=='Q'){
//                         return false;
//                    }
//               }
//     public static void  main(String args[]){
//          int n = 5;
//          ArrayList<ArrayList<String>> ans = new ArrayList<>();
//          char board[][] = new char[n][n];
//          for(char b[]:board){
//               Arrays.fill(b, '.');
//          }
//     }
// import java.util.*;
// public  class  programe{
//      public static  void helper(int numCourses,int prequistion[][]){
//               ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//                for(int i=0;i<numCourses;i++){
//                       adj.add(new ArrayList<>());
//                }
//                int indegree[] = new int[numCourses];
//                for(int p[] : prequistion){
//                      int course = p[0];
//                      int preq = p[1];
//                      adj.get(preq).add(course);
//                       indegree[course]++;
//                }
//                Queue<Integer> q = new LinkedList<>();
//                for(int i=0;i<numCourses;i++){
//                        if(indegree[i]==0){
//                            q.add(i);
//                }
//                int ans[] = new int[numCourses];
//                int index=0;
//                while(!q.isEmpty()){
//                         int node = q.poll();
//                          ans[index++] = node;
//                         for(int neighbour: adj.get(node)){
//                                  indegree[neighbour]--;
//                                  if(indegree[neighbour]==0){
//                                      q.add(neighbour);
//                                  }
//                }
//      }
//      }
// ....................................................................
// import java.util.*;
// public class programe{
//      public static List<Integer> topoSort(int v,ArrayList<ArrayList<Integer>> adj){
//           int indegree[] = new int[v];
//           for(int i=0;i<v;i++){
//                  for(int neighbour:adj.get(i)){
//                         indegree[neighbour]++;
//                  }
//           }
//           Queue<Integer> q = new LinkedList<>();
//           for(int i=0;i<v;i++){
//                  if(indegree[i]==0){
//                        q.add(i);
//                  }
//           }
//           List<Integer> list = new ArrayList<>();
//           while(!q.isEmpty()){
//                  int node=  q.poll();
//                  list.add(node);
//                   for(int neighbour: adj.get(node)){
//                         indegree[neighbour]--;
//                         if(indegree[neighbour]==0){
//                             q.add(neighbour);
//                         }
//                   }
//           }
//      }
//      }
// import java.lang.reflect.Array;
// import  java.util.*;
// public class programe{
//     public static int helper(int prices[],int wt[],int i,int allowed){
//              if(i>=prices.length){
//                    return 0;
//              }
//              int max=0;
//              if(allowed>=wt[i]){
//                   int take =  prices[i]+helper(prices,wt,i+1,allowed-wt[i]);
//                   int notTake = helper(prices,wt,i+1,allowed);
//                   int maxProfit = Math.max(take,notTake);
//                   max = Math.max(maxProfit,max);
//              }
//     }
//      public static int  knapSackWithDp(int prices[],int wt[],int allowed){
//           int dp[][] =  new int[n+1][allowed+1];
//           for(int i=0;i<dp.length;i++){
//                dp[i][0] = 0;
//           }
//            for(int i=0;i<dp[0].length;i++){
//                dp[0][i] = 0;
//            }
//            for(int i=1;i<n;i++){
//             int max = 0;
//               for(int j=1;j<allowed;j++){
//                     if(allowed>=wt[j]){
//                          max = Math.max(prices[i-1],prices[i]);
//                     }
//                    dp[i][j] = max;
//            }
//      }
//     public static void main(String args[]){
//           int prices[] = {15,14,10,45,30};
//           int w[] = {2,5,1,3,4};
//           int n = prices.length;
//           int m = w.length;
//           int allowed = 7;
//         //   int i=0;
//         //   int ans = helper(prices,w,i,allowed);
//         //   System.out.print(ans);
//        int an  =    knapSackWithDp(prices,w,allowed);
//     }
// import java.util.*;
// public class programe{
//            Stack<Character> st = new Stack<>();
//            for(char ch:nums.toCharArray()){
//                 while(!st.isEmpty()  &&  st.peek()>ch && k>0){
//                          st.pop();
//                          k--;
//                 }
//                 st.add(ch);
//              StringBuilder sb = new StringBuilder();
//              while(!st.isEmpty()){
//                     sb.append(st.pop());
//                     if( st.size()>0 && st.peek()=='0'){
//                            continue;
//                     }
//              }
//                   System.out.print(sb.reverse().toString());           
//     }
//     public static void main(String args[]){
//          String nums= "1432219";
//          int n = nums.length();
//          int k=3;
//          helper(nums,k);
//     }
// import java.util.*;
// public class programe{
//     public static class TreeNode{
//            int data;
//            TreeNode left;
//         public TreeNode(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//     }
//     public static void inorder(TreeNode root,ArrayList<Integer> list){
//               if(root==null){
//                   return;
//               }
//                 inorder(root.left, list);
//                 list.add(root);
//                 inorder(root.right, list);
//     }
//     public static ArrayList<Integer>  mergeTwoSortedList(ArrayList<Integer>a,ArrayList<Integer> b){
//            ArrayList<Integer> result = new ArrayList<>();
//            int i=0;
//            int j=0;
//            while(i<a.size()  && j<b.size()){
//                 if(a.get(i)<=b.get(j)){
//                          result.add(a.get(i));
//                          i++;
//                 }else{
//                        result.add(b.get(j));
//                        j++;
//                 }
//            }
//            while(i<a.size()){
//                 result.add(a.get(i));
//                 i++;
//            }
//            while(j<b.size()){
//               result.add(b.get(j));
//               j++;
//            }
//            return  result;
//     }
//     public static TreeNode buildTree(ArrayList<Integer> result,int start,int end){
//         if(start>end){
//             return null;
//         }
//         int mid =  start+(end-start)/2;
//         TreeNode root = new TreeNode(result.get(mid));
//          root.left = buildTree(result,start,mid);
//          root.right = buildTree(result, mid+1, end);
//          return   root;             
//     }
//     public static TreeNode  mergeBst(TreeNode root1,TreeNode root2){
//              ArrayList<Integer> result1 = new ArrayList<>();
//              ArrayList<Integer> result2 = new ArrayList<>();
//              inorder(root1,result1);
//              inorder(root2,result2);
//                ArrayList<Integer> result  =  mergeTwoSortedList(result1,result2);
//                return buildTree(result,0,result.size()-1);
//     }
// public class  programe{
//     }
//     public static boolean isSmae(String s1,String s2){
//            int n1 = s1.length();
//            int n2 = s2.length();
//            int k = s1.length();
//            if(n1>n2){
//                 return false;
//            }
//            int count1[] = new int[n1];
//            int count2[] = new int[n2];
//            for(int i=0;i<n1;i++){
//                  count1[s1.charAt(i)-'a']++;
//            }
//            for(int i=0;i<n2;i++){
//                   count2[s2.charAt(i)-'a']++;
//                   if(i>=k){
//                        count2[s2.charAt(i-k)-'a']--;
//                   }
//                   if(matches(count1,count2)){
//                        return true;
//                   }
//            }
//     }
//     }
// }
// public  class  programe{
//     public static void bfs(int start,List<List<Integer>> graph){
//            boolean vis[] = new boolean[graph.size()];
//            Queue<Integer> q = new LinkedList<>();
//            vis[start] = true;
//            q.add(start);
//            while(!q.isEmpty()){
//                int node = q.poll();
//                for(int neighbour: graph.get(node)){
//                       if(!vis[neighbour]){
//                             vis[neighbour] = true;
//                              q.add(neighbour);
//                       }
//                }
//     }
//     public static void dfs(int start,List<List<Integer>>graph){
//          boolean  vis[] = new boolean[graph.size()];
//          vis[start] = true;
//          System.out.print(start + " " );
//          for(int neighbour: graph.get(start)){
//               if(!vis[neighbour]){
//                   dfs(neighbour, graph);
//               }
//     }
//      public static boolean cycleDetection(int parent,int current,List<List<Integer>>graph,boolean vis[]){
//               vis[current] = true;
//               for(int neighbour : graph.get(current)){
//                       if(!vis[neighbour]){
//                             if(cycleDetection(current, neighbour, graph, vis)){
//                                    return true;
//                             }
//                       }else if(neighbour!=parent){
//                             return true;
//                       }
//               }
//               return false;
//      }
//      public static boolean cycleUtil(){
//            List<List<Integer>> graph = new ArrayList<>();
//            boolean vis[] = new boolean[graph.size()];
//            int parent = -1;
//            int current = 0;
//            for(int i=0;i<graph.size();i++){
//                if(cycleDetection(current,i,graph,vis)){
//                    return true;
//                }
//            }
//      }
//     }
// import  java.util.*;
// public class programe{
//     public static class TreeNode{
//         int data;
//         TreeNode left;
//         public TreeNode(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//     }
//     public static void iterativePreorder(TreeNode root){
//         if(root==null){
//               return ;
//         }
//         Stack<TreeNode> st = new Stack<>();
//         st.add(root);
//         while(!st.isEmpty()){
//                TreeNode node = st.pop();
//                System.out.print(node.data);
//                if(node.right!=null)  st.add(node.right);
//                if(node.left!=null)  st.add(node.left);
//     }
//     public static boolean isSame(TreeNode root){
//          if(root==null){
//               return true;
//          }
//          return isSymatric(root.left,root.right);
//     }
//     public static boolean isSymatric(TreeNode root1,TreeNode root2){
//         if((root1==null) && (root2==null)){
//                return  true;
//         }
//            if((root1==null) || (root2==null)){
//                return false;
//            }
//         return (root1.data==root2.data) && isSymatric(root1.left, root2.right)&& isSymatric(root1.right,root2.left);
//     }
//     public static boolean isBalanced(TreeNode root){
//           return height(root)!=-1?true:false;
//     }
//     public static int height(TreeNode root){
//           if(root==null){
//             return 0;
//           }
//           int left = height(root.left);
//           if(left==-1){
//               return -1;
//           int right = height(root.right);
//           if(right==-1){
//               return -1;
//           }
//            if(Math.abs(left-right)>1){
//                  return -1;
//            }
//            return Math.max(left,right)+1;
//     }
//     public static boolean isSubTree(TreeNode root,TreeNode subTree){
//         if(root==null){
//               return false;
//         }
//         if(isSame(root,subTree)){
//               return true;
//         }
//     }
//     public static boolean isSame(TreeNode root,TreeNode subTree){
//           if((root==null)  && (subTree==null)){
//               return true;
//           }
//           if((root==null) || (subTree==null)){
//                 return  false;
//           }
//           return (root.data==subTree.data)&& isSame(root.left,subTree.left) && isSame(root.right, subTree.right);
//     }
//       public static void main(String args[]){
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(4);
//         root.left.left = new TreeNode(5);
//     }
// public class programe{
//     public static  class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//              this.data = data;
//              this.left = null;
//              this.right = null;
//         }
//     }
//     public static boolean validateBst(Node root){
//           return helper(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
//     }
//     public static boolean  helper(Node root,int min,int max){
//           if(root==null){
//              return true;
//           }if(root.data<=min  || root.data>=max){
//              return false;
//           }
//           return helper(root.left,min,root.data)  && helper(root.right,root.data,max);
//     }
//      public static Node  createTree(){
//          Node root = new Node(2);
//         root.left = new Node(3);
//         root.right = new Node(4);
//         root.left.left = new Node(5);
//         return root;
//      }
//     public static void main(String args[]){
//        Node  root =  createTree();
//        boolean validate =  validateBst(root);
//     }
// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//         List<Integer> list = new ArrayList<>();
//         String s = "cbaebabacd";
//         String  p = "abc";
//         int k = p.length();
//         int n = s.length();
//         char pchar[] = p.toCharArray();
//         Arrays.sort(pchar);
//         String pString  = new String(pchar);
//         for(int i=0;i<n-k;i++){
//               char temp[] = s.substring(i,i+k).toCharArray();
//               Arrays.sort(temp);
//               String sString = new String(temp);
//                 if(pString.equals(sString)){
//                           list.add(i);  
//                 }
//         }
//     }
// import java.util.*;
// public class programe{
//       public static int containerWater(int heights[]){
//               int n = heights.length;
//               int left=0;
//               int right=n-1;
//               int max =0;
//               while(left<right){
//                   int h = Math.min(heights[left],heights[right]);
//                   int w = right-left;
//                   max = Math.max(max,h*w);
//                   if(heights[left]<heights[right]){
//                           left++;
//                   }else{
//                            right--;
//                   }
//               }
//               return max;
//       }
//       public static void main(String[] args) {
//             int heights[] = {2,1,4,6,7,2};
//             int ans = containerWater(heights);
//       }
// ......................................................  container with most water
// import java.util.*;
// public class programe{
//     public static int helper(String s,int k){
//           int freCount[] = new int[26];
//           int left=0;
//           int count=0;
//           int unique=0;
//           for(int right=0;right<s.length();right++){
//                   freCount[s.charAt(right)-'a']++;
//                   if(freCount[s.charAt(right)-'a']==1){
//                          unique++;
//                   }
//                   while(unique>k){
//                         freCount[s.charAt(left)-'a']--;
//                         if(freCount[s.charAt(left)-'a']==0){
//                         }
//                   }
//           }
//           return count;
//     }
//     public static void main(String args[]){
//            String s = "abc";
//            int k=2;
//            int ans = helper(s,k);
//            System.out.print(ans);
//     }
// import java.util.*;
// public class programe{
//     public static int helper(String s,int k){
//           HashMap<Character,Integer> map = new HashMap<>();
//           int max=0;
//           int left=0;
//           for(int right=0;right<s.length();right++){
//                  char ch   =  s.charAt(right);
//                  map.put(ch,map.getOrDefault(ch,0)+1);
//                  while(map.size()>k){
//                       char leftChar =  s.charAt(left);
//                       map.put(leftChar,map.get(leftChar)-1);
//                       if(map.get(leftChar)==0){
//                            map.remove(leftChar);
//                       }
//                       left++;
//                  }
//           }
//           return max;
//     }
//     public static void main(String args[]){
//           String s = "eceba";
//        int ans =   helper(s,3);
//     }
// ........................................................
// public class programe{
//     public static int longestSubString(String s,int n){
//            HashSet<Character> set =  new HashSet<>();
//            int max=0;
//            int left=0;
//            for(int right=0;right<n;right++){
//                    while(set.contains(s.charAt(right))){
//                          set.remove(s.charAt(left));
//                          left++;
//                    }
//                     set.add(s.charAt(right));
//                     max = Math.max(max,right-left+1);
//            }
//            return max;
//     }
//     public static void main(String args[]){
//         String str =  "abcabcbb";
//          int n = str.length();
//         int ans = longestSubString(str, n);
//     }
// import  java.util.*;
// public class programe{
//     public static int trap(int height[]){
//         Stack<Integer> st = new Stack<>();
//         int water=0;
//         for(int i=0;i<height.length;i++){
//                 while(!st.isEmpty() && height[i]>height[st.peek()]){
//                            if(st.isEmpty()){
//                               break;
//                            }
//                            int left = st.peek();
//                            int width = i-left-1;
//                            int h = Math.min(height[i],height[left]-height[bottom]);
//                            water +=  h*width;
//                 } 
//                 System.out.print(water);
//     }
//     }
// import java.util.*;
// public class programe{
//     public static void helper(int heights[]){
//         Stack<Integer> st = new Stack<>();
//         int max=0;
//         int n = heights.length;
//         for(int i=0;i<=n;i++){
//               int h = (i==n)?0:heights[i];
//               while(!st.isEmpty() && h<heights[st.peek()]){
//                      int height = heights[st.pop()];
//                      int width ;
//                      if(st.isEmpty()){
//                             width = i;
//                      }else{
//                            width = i-st.peek()-1;
//                      }
//               }
//               st.push(i);
//         }
//         System.out.print(max);
//     }
//     public static void main(String args[]){
//         int heights[] = {2, 1, 5, 6, 2, 3};
//     }
// import  java.util.*;
// public class programe{
//       public class Edge{
//             int src;
//             int des;
//             int wt;
//             public Edge(int src,int des,int wt){
//                    this.src = src;
//                    this.des = des;
//                    this.wt = wt;
//             }
//       }
//       public int[] bellmanFord(int src,ArrayList<Edge> edge,int v){
//               int dis[] = new int[v];
//                Arrays.fill(dis,Integer.MAX_VALUE);
//                dis[src] = 0;
//                for(int i=1;i<v;i++){
//                    for(Edge e: edge){
//                          int s = e.src;
//                          int d = e.des;
//                    }
//                }
//       }
//       }
// import java.util.*;
// public class programe{
//       public class pair{
//             int node;
//             int dis;
//             public pair(int node,int dis){
//                    this.node = node;
//                    this.dis  = dis;
//             }
//       }
//       public int shortestPath(int src,ArrayList<ArrayList<int[]>>graph,int v){
//                for(int i=0;i<v;i++){
//                     graph.add(new ArrayList<>());
//                }
//                int dis[] = new int[v];
//                Arrays.fill(dis, Integer.MAX_VALUE);
//                PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->a.dis-b.dis);
//                dis[src] = 0;
//                pq.add(new pair(src,0));
//                while(!pq.isEmpty()){
//                     pair p = pq.poll();
//                     int node = p.node;
//                     int weight = p.dis;
//                     for(int nbr[]:graph.get(node)){
//                         int next  = nbr[0];
//                         int d = nbr[1];
//                         if(dis[next]>d+weight){
//                                   dis[next] = d+weight;
//                                   pq.offer(new pair(next,d+weight));  
//                         }
//                     }
//                }
//                int min = 0;
//                for(int num:dis){
//                     min = Math.min(num,min);
//                }
//       }
//       }
// import java.util.*;
// public class programe{
//        public class pair{
//             int node;
//             int cost;
//             int stops;
//             public pair(int node,int cost,int stops){
//                    this.node = node;
//                    this.cost = cost;
//                    this.stops =stops;
//             }
//        } 
//        public int cheapestFlight(int flight[][],int src,int des,int k,int n){
//                   ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
//                   for(int i=0;i<n;i++){
//                           graph.add(new ArrayList<>());
//                   }
//                   for(int f[]:flight){
//                           graph.get(f[0]).add(new int[]{f[1],f[2]});
//                   }
//                   Queue<pair> q =  new LinkedList<>();
//                   int dis[] = new int[n];
//                   Arrays.fill(dis, Integer.MAX_VALUE);
//                   dis[src] = 0;
//                   q.add(new pair(src,0,0));
//                   while(!q.isEmpty()){
//                          pair p = q.poll();
//                          int node = p.node;
//                          int cost = p.cost;
//                          int stop = p.stops;
//                          if(stop>k) continue;
//                          for(int nbr[]: graph.get(node)){
//                               int  next = nbr[0];
//                               int price = nbr[1];
//                               if(dis[next]>cost+price){
//                                    dis[next] = cost+price;
//                                    q.offer(new pair(next,dis[next],stop+1));
//                          }
//                   } 
//                   return dis[des]==Integer.MAX_VALUE?-1:dis[des];
//        }
//       }
// }
// import java.util.*;
// public class programe{
//       public static void helper(){
//             int nums[] = {10, 9, 2, 5, 3, 7, 101, 18};
//             int n = nums.length;
//             int dp[] = new int[n];
//             Arrays.fill(dp,1);
//             for(int i=1;i<n;i++){
//                     for(int j=0;j<i;j++){
//                            if(nums[j]<nums[i]){
//                               dp[i] = Math.max(dp[i],dp[j]+1);
//                            }
//             }
//             int max = 0;
//             for(int num: dp){
//                     max = Math.max(num,max);
//             }
//       }
//       public static void LDS(){
//             int nums[]   = {9, 4, 3, 2, 5, 4, 3, 2};
//             int n = nums.length;
//             int dp[] = new int[n];
//             Arrays.fill(dp,1);
//               for(int i=1;i<n;i++){
//                     for(int j=0;j<i;j++){
//                           if(nums[j]>nums[i]){
//                                  dp[i] = Math.max(dp[i],dp[j]+1);
//                           }
//                     }
//               }
//               int max =0;
//               for(int num:dp){
//                      max = Math.max(max,num);
//               }
//       }
//       public static void maxSumLIS(){
//                int nums[] ={1, 101, 2, 3, 100, 4, 5};
//                int n = nums.length;
//                int dp[] = new int[n];
//                for(int i=0;i<n;i++){
//                      dp[i] = nums[i];
//                }
//                for(int i=1;i<n;i++){
//                     for(int j=0;j<i;j++){
//                           if(nums[i]>nums[j]){
//                                 dp[i] = Math.max(dp[i],nums[i]+dp[j]);
//                           }
//                     }
//                }
//                int max =0;
//                for(int num:dp){
//                     max = Math.max(max,num);
//                }
//                System.out.print(max);
//       }
//       public static void LBS(){
//              int nums[] = {1, 11, 2, 10, 4, 5, 2, 1};
//              int n = nums.length;
//              int LIS[] = new int[n];
//              int LDS[] =new int[n];
//              Arrays.fill(LIS,1);
//              for(int i=0;i<n;i++){
//                   LDS[i] = nums[i];
//       }
//       public boolean isCycle(int v,List<List<Integer>> adj){
//                int indegree[] = new int[v];
//                for(int i=0;i<v;i++){
//                      for(int nbr:adj.get(i)){
//                            indegree[nbr]++;
//                      }
//                }
//                Queue<Integer> q = new LinkedList<>();
//                for(int i=0;i<v;i++){
//                    if(indegree[i]==0){
//                            q.add(i);
//                    }
//              }
//                int count=0;
//                while(!q.isEmpty()){
//                      int node = q.poll();
//                      count++;
//                      for(int nbr : adj.get(node)){
//                             indegree[nbr]--;
//                             if(indegree[nbr]==0){
//                                 q.add(nbr);
//                             }
//                      }
//                }
//       }
//       public boolean cycleUndirected(int v,List<List<Integer>>adj){
//                boolean visited[] = new boolean[v];
//                for(int i=0;i<v;i++){
//                     if(visited[i]!=true){
//                            if(dfs(i,adj,visited,-1)){
//                                  return true;
//                            }
//                     }
//                }
//                return  false;
//       }
//        public boolean dfs(int node,List<List<Integer>> adj,boolean visited[],int parent){
//                 visited[node] = true;
//                 for(int nbr:adj.get(node)){
//                       if(!visited[nbr]){
//                            if(dfs(nbr,adj,visited,node)){
//                                  return true;
//                            }
//                       }else if(nbr!=parent){
//                            return  true;
//                       }
//                 }
//                 return false;
//       public static void main(String args[]){
//       }
// import  java.util.*;
// public class programe{
//     public class ListNode{
//         int data;
//         ListNode next;
//         ListNode(int data){
//                 this.data = data;
//                 this.next = null; 
//         }
//     }
//     public ListNode removeNthNode(ListNode head,int n){
//         ListNode dummy = new ListNode(-1);
//         dummy.next = head;
//         ListNode slow = dummy;
//         ListNode fast = dummy;
//         for(int i=0;i<n;i++){
//                fast = fast.next;
//         }
//         while(fast!=null){
//               fast = fast.next;
//               slow = slow.next;
//         }
//         slow.next = slow.next.next;
//     }
//     public ListNode deleteNode(ListNode head){
//           ListNode dummy = head;
//           while(dummy!=null && dummy.next!=null){
//                 if(dummy.data==dummy.next.data){
//                       dummy.next = dummy.next.next;
//                 }else{
//                        dummy = dummy.next;
//                 }
//           }
//           return dummy;
//     }
//     public ListNode removeDuplicatUnsorted(ListNode head){
//                   if(head==null){
//                        return null ;
//                   }
//                   HashSet<Integer> set = new HashSet<>();
//                   ListNode curr = head;
//                   ListNode prev = null;
//                   while(curr!=null){
//                      if(set.contains(curr.data)){
//                             prev.next = curr.next;
//                      }else{
//                            set.add(curr.data);
//                             prev = curr;
//                      }
//                      curr = curr.next;
//     }
//     public boolean detectCycle(ListNode head){
//           ListNode slow = head;
//           ListNode fast = head;
//           while(fast!=null  && fast.next!=null){
//                 slow = slow.next;
//                 fast = fast.next.next;
//                 if(slow==fast){
//                      return true; 
//                 } 
//           }
//           return false;
//     }
//     public  static ListNode merge2List(ListNode l1,ListNode l2){
//               ListNode dummy = new ListNode(-1);
//              ListNode tail = dummy;
//              while(l1!=null  && l2!=null){
//                    if(l1.data<l2.data){
//                          tail.next = l1;
//                          l1 = l1.next;
//                    }else{
//                       tail.next = l2;
//                       l2 = l2.next;
//                    }
//                    tail = tail.next;
//              }
//              if(l1==null)tail.next=l2;
//              if(l2==null)tail.next=l1;
//              return dummy.next;
//     }
//     }
// import java.util.*;
// public class programe{
//       public static int  helper(int grid[][]){
//               Queue<int[]> q = new LinkedList<>();
//               int fresh=0;
//               int time=0;
//               int n = grid.length;
//               int m = grid[0].length;
//               for(int i=0;i<n;i++){
//                    for(int j=0;j<m;j++){
//                         if(grid[i][j]==2){
//                                 q.add(new int[]{i,j});
//                         }
//                         if(grid[i][j]==1){
//                                  fresh++;
//                         }
//                    }
//               }
//               int dir[][] = {{0,1},{-1,0},{0,-1},{1,0}};
//               while(!q.isEmpty()  && fresh>0){
//                      int curr[] = q.poll();
//                      time++;
//                      for(int d[]:dir){
//                           int x = d[0]+curr[0];
//                           int y = d[1]+curr[1];
//                           if(x>=0  && y>=0  && x<n && y<m && grid[x][y]==1){
//                                 fresh--;
//                           }
//                      }
//               }
//       }
//       }
// import java.util.*;
// public class programe{
//       public static int[][] floodFill(int grid[][],int sr,int sc,int color){
//                int original = grid[sr][sc];
//                if(original==color){
//                     return grid;
//                }
//                dfs(grid,sr,sc,color,original);
//                return grid;
//       }
//       public static void dfs(int grid[][],int sr,int sc,int color,int original){
//               if(sr<0  || sc<0 || sr>=grid.length || sc>=grid[0].length  || grid[sr][sc]!=original){
//                       return;
//               }
//               grid[i][j] = color;
//               dfs(grid,sr+1,sc,color,original);
//               dfs(grid,sr-1,sc,color,original);
//               dfs(grid,sr,sc+1,color,original);
//       }
//       }
// import java.util.*;
// public class programe{
//       public static int helper(char grid[][]){
//               int count=0;
//               for(int i=0;i<grid.length;i++){
//                    for(int j=0;j<grid[0].length;j++){
//                           if(grid[i][j]=='1'){
//                                  count++;
//                                  dfs(grid,i,j);
//                           }
//                    }
//               }
//               return count;
//       }
//       public static void dfs(char grid[][],int i,int j){
//             if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!='1'){
//                     return ;
//             }
//             grid[i][j] = '0';
//             dfs(grid,i+1,j);
//             dfs(grid,i-1,j);
//             dfs(grid,i,j+1);
//       }
//       }
// import  java.util.*;
// public class programe{
//       public boolean isExist(String word,char board[][]){
//             int n = board.length;
//             int m = board[0].length;
//             int index=0;
//             for(int i=0;i<n;i++){
//                    for(int j=0;j<m;j++){
//                           if(dfs(board,i,j,word,index)){
//                                 return true;
//                           }
//                    }
//             }
//             return false;
//       }
//       public static boolean dfs(char board[][],int i,int j,String word,int index){
//                 if(word.charAt(index)==board[i][j]){
//                     return true;
//                 }
//                 if(i<0  || j<0 || i>=board.length || j>=board[0].length || word.charAt(index)!=board[i][j]){
//                         return false;
//                 }
//                 char temp = board[i][j];
//                 boolean ans = dfs(board,i+1,j,word,index+1)|| dfs(board,i,j+1,word,index+1)|| dfs(board,i-1,j,word,index+1)|| dfs(board,i,j-1,word,index+1);
//                 board[i][j] = temp;
//                 return ans;
//       }
//       }
// }
// import java.util.*;
// import javax.naming.spi.DirStateFactory;
// public class programe{
//       public static List<List<Integer>> helper(int nums[],int target){
//                 List<List<Integer>> result = new ArrayList<>();
//                 List<Integer> list = new ArrayList<>();
//                 int start=0;
//                 subHelper(nums, target,start,list,result);
//                 return result;
//       }
//       public static void subHelper(int nums[],int target,int start,List<Integer>list,List<List<Integer>>result){
//                  if(target==0){
//                         result.add(new ArrayList<>(list));
//                           return;
//                  }         
//                  for(int i=start;i<nums.length;i++){
//                      if(nums[i]>target) continue;
//                      list.add(nums[i]);
//                      subHelper(nums,target-nums[i],i,list,result);
//                      list.remove(list.size()-1);
//                  }
//       }
//       public static void main(String args[]){
//       }
// }
// import java.util.*;
// public class programe{
//     public static int helper(int gas[],int cost[]){
//           int totalGas=0;
//           int totalCost=0;
//           int currentGas=0;
//           int start=0;
//           for(int i=0;i<gas.length;i++){
//                 totalCost += cost[i];
//                 totalGas += gas[i];
//                 currentGas += gas[i]-cost[i];
//                 if(currentGas<0){
//                       currentGas = 0;
//                       start = i+1;
//                 }
//           }
//           return totalGas>=totalCost?start:-1;
//     }
//     public static void main(String args[]){
//     }
// }
// public class programe{
//          int n = nums.length;
//          int maxReach =0;
//          for(int i=0;i<n;i++){
//               if(i>maxReach){
//                    return false;
//               }
//               maxReach = Math.max(maxReach,nums[i]+i);
//          }
//          return  true;
//     }
//     public static void main(String args[]){
//         boolean ans = helper();
//         System.out.print(ans);
//     }
// }
// public class programe{
//     public static int helper(){
//           int nums[] = {1,1,2,2,3,4,4};
//         int n = nums.length;
//         for(int j=1;j<n;j++){
//              if(nums[i]!=nums[j]){
//                    i++;
//                    nums[i]= nums[j];
//              }
//         }
//         return i+1;
//     }
//     public static void main(String[] args) {
//         int ans = helper();
//         System.out.print(ans);
//     }
// public  class  programe{
//     public static void stringCompression(){
//             char ch[] = {'a','a','b','b','c','c','c'};
//               int index=0;
//               int i=0;
//                   char current = ch[i];
//                   int count=0;
//                   while(i<n  &&  ch[i]==current){
//                       count++;
//                       i++;
//                   }
//                   ch[index++] = current;
//                     if(count>1){
//                          String cnt = String.valueOf(count);
//                          for(char c : cnt.toCharArray()){
//                                   ch[index++] = c;
//                          }
//                     }
//               }
//            for(char c: ch){
//               System.out.print(c +"  ");
//            }
//     }
//     }
// }
// import java.util.*;
//         int data;
//         ListNode next ;
//         public ListNode(int data) {
//             this.data =  data;
//         }
//     }
//            if(lists.length==0){
//               return null;
//            }
//            return merge(lists,0,lists.length-1);
//     }
//     public static void frequentElement(){
//           int nums[] = {1,1,1,2,2,3};
//           int k=3;
//           int n = nums.length;
//           HashMap<Integer,Integer> map = new HashMap<>();
//           for(int num: nums){
//                 map.put(num,map.getOrDefault(num,0)+1);
//           }
//           for(int num:map.keySet()){
//             pq.add(num);
//                 if(pq.size()>k){
//                       pq.poll();
//                 }
//           }
//           int result[] = new int[k];
//           for(int i=0;i<k;i++){
//               result[i] = pq.poll();
//           }
//           for(int i=0;i<k;i++){
//           }
//     }
//     public static ListNode merge(ListNode lists[],int left,int right){
//                if(left==right){
//                     return lists[left];
//                }
//                ListNode l2 = merge(lists,mid+1,right);
//                return mergeLists(l1,l2);
//     }
//        public static ListNode mergeLists(ListNode l1,ListNode l2){
//              ListNode dummy = new ListNode(-1);
//              ListNode tail = dummy;
//              while(l1!=null && l2!=null){
//                     if(l1.data<l2.data){
//                            tail.next = l1;
//                            l1 = l1.next;
//                     }else{
//                           tail.next = l2;
//                           l2 = l2.next;
//                     }
//                     tail = tail.next;
//              }
//              tail.next = (l1==null)?l2:l1;
//              return dummy.next;
//        }
//     public static int peakElement(){
//             int nums[] = {1, 2, 3, 1};
//             int n = nums.length;
//             int left=0;
//             int right = n-1;
//             while(left<right){
//                  int mid = left+(right-left)/2;
//                  if(nums[mid]<nums[mid+1]){
//                        left = mid+1;
//                  }else{
//                        right = mid;
//                  }
//             }
//             return  nums[left];
//     }
//     public static void nextGreaterElement(){
//          int nums[]  = {4, 5, 2, 10};
//          int n = nums.length;
//          int result[] = new int[n];
//          Stack<Integer> st = new Stack<>();
//          for(int i=n-1;i>=0;i--){
//                while(!st.isEmpty() && st.peek()<=nums[i]){
//                             st.pop();
//                }
//                result[i] = st.isEmpty()?-1:st.peek();
//                st.add(nums[i]);
//          }
//          for(int num:result){
//               System.out.print(num +" ");
//          }
//     }
//     public static void helper() {
//         //     buy and sell stock problem
//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         int n = prices.length;
//                if(price<minPrice){
//                    minPrice = price;
//                }else{
//                     int profit = price-minPrice;
//                     maxProfit = Math.max(profit,maxProfit);
//                }
//         }
//         System.out.print(maxProfit);
//     }
//     public static boolean isPalindrome() {
//         String str = "aadam";
//         int n = str.length();
//         int i = 0;
//         while (i <= j) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public static String frequencySort(){
//             String str = "tree";
//           HashMap<Character,Integer> map = new HashMap<>();
//           for(char ch : str.toCharArray()){
//                 map.put(ch,map.getOrDefault(ch,0)+1);
//           }
//           List<Character> list = new ArrayList<>(map.keySet());
//           list.sort((a,b)->map.get(b)-map.get(a));
//            StringBuilder sb = new StringBuilder();
//            for(char ch: list){
//                 int fre = map.get(ch);
//                 while(fre-->0){
//                          sb.append(ch);
//                 }
//            }
//            return sb.toString();
//     }
//     public static String frequencySort1(){
//              String str ="tree";
//              int n = str.length();
//              HashMap<Character,Integer> map = new HashMap<>();
//              for(char ch: str.toCharArray()){
//                      map.put(ch,map.getOrDefault(ch,0)+1);
//              }
//              List<Character> list = new ArrayList<>(map.keySet());
//              list.sort((a,b)->map.get(b)-map.get(a));  
//              StringBuilder sb = new StringBuilder();
//              for(char ch : list){
//                    int fre = map.get(ch);
//                    while(fre-->0){
//                        sb.append(ch);
//                    }
//              }
//              return sb.toString();
//     }
//     public static List<List<String>> groupAnagrame(){
//         String strs[] = {"eat","tea","tan","ate","nat","bat"};
//         int n   = strs.length;
//            HashMap<String,List<String>> map = new HashMap<>();
//            for(String str : strs){
//                 Arrays.sort(ch);
//                 String key = ch.toString();
//                 map.putIfAbsent(key,new ArrayList<>());
//                  map.get(key).add(str);
//            }
//            return new ArrayList<>(map.values());
//     }
//        public static boolean helper(String s1,String s2){
//                if(s1.length()>s2.length()){
//                     return false;
//                }
//                int window[] = new int[26];
//                        count1[ch-'a']++;
//                }
//                int k = s1.length();
//                for(int j=0;j<s2.length();j++){
//                         window[s2.charAt(j)-'a']++;
//                         if(j>k){
//                               window[s2.charAt(j-k)-'a']--;
//                         }
//                         if(Arrays.equals(count1,window)){
//                                return true;
//                         }
//                } 
//                return false;
//        }
//        public static int 
//     public static void main(String[] args) {
//             String ans = frequencySort1();
//             System.out.print(ans);
//         // System.out.print(peakElement());
//         //  helper();
//         //  nextGreaterElement();
//         // boolean ans = isPalindrome();
//         // System.out.print(ans);
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//           int  n = nums.length;
//           boolean swap ;
//               swap = false;
//                for(int j=0;j<n-i-1;j++){
//                    if(nums[j]>nums[j+1]){
//                       int temp = nums[j];
//                       nums[j] = nums[j+1];
//                       nums[j+1] = temp;
//                       swap = true;
//                    }
//                }
//                if(swap==false){
//                     break;
//                }
//           }
//           for(int num: nums){
//              System.out.print(num +" ");
//           }
//     }
// }
// public class programe{
//     public static void main(String args[]){
//           int nums[] = {0,2,1,4,5,9};
//           int n = nums.length;
//           boolean swap;
//           for(int i=0;i<n-1;i++){
//              swap = false;
//              for(int j=0;j<n-i-1;j++){
//                     if(nums[j]>nums[j+1]){
//                            int temp = nums[j];
//                            nums[j] = nums[j+1];
//                            nums[j+1] = temp;
//                            swap = true;
//                     }
//              }
//              if(swap==false){
//                     break;
//              }
//           }
//            for(int num : nums){
//               System.out.print(num);
//            }
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String[] args) {
//           int nums[] ={64,25,12,22,11};
//           int n = nums.length;
//           for(int i=0;i<n;i++){
//              int min  = i;
//              for(int j=i+1;j<n;j++){
//                  if(nums[min]>nums[j]){
//                        min = j;
//                  }
//              }
//              int temp = nums[min];
//              nums[min] = nums[i];
//              nums[i]  = temp;
//           }
//           for(int num: nums){
//              System.out.print(num +"  ");
//           }
//     }
// }
// ......................................................................
// import  java.util.*;
// public class programe{
//     public static void helper(){
//              int[][] mat =
//                         {{10, 20, 30, 40},
//                         {15, 25, 35, 45},
//                         {24, 29, 37, 48},
//                         {32, 33, 39, 50}};
//                         int n = mat.length;
//                         int m = mat[0].length;
//                         int k=3;
//                         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//                         for(int i=0;i<n;i++){
//                              for(int j=0;j<m;j++){
//                                   int curr = mat[i][j];
//                                   pq.add(curr);
//                                   if(pq.size()>k){
//                                       pq.poll();
//                                   }
//                              }
//                         }
//                         System.out.print(pq.peek());
//     }
//     public static void main(String[] args) {
//         helper();                
//     }
// }
// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//         int nums1[] = {1,5,10,20,30};
//         int nums2[] = {5,13,15,20};
//         int nums3[] = {5,20};
//         ArrayList<Integer> result = new ArrayList<>();
//         int n = nums1.length;
//          HashSet<Integer> set1 = new HashSet<>();
//          HashSet<Integer> set2 =  new HashSet<>();
//            for(int nums: nums2){
//               set1.add(nums);
//            }
//            for(int nums:nums2){
//                 set2.add(nums);
//            }
//             for(int i=0;i<n;i++){
//                    if(set1.contains(nums1[i])  &&  set2.contains(nums1[i])){
//                             result.add(nums1[i]);
//                    }
//             }
//             System.out.print(result);
//     }
// }
// import java.util.*;
// public  class  programe{
//     public static String insertPosition(String s,char ch , int pos){
//                  StringBuilder sb = new StringBuilder();
//                  int n = s.length();
//                  for(int i=0;i<n;i++){
//                       if(i==pos){
//                            sb.append(ch);
//                       }  
//                        sb.append(s.charAt(i));
//                  }
//                  if(pos>=n){
//                         sb.append(ch);
//                  }
//                 return sb.toString();
//     }
//     public static void main(String[] args) {
//     }
// }
// import java.util.*;
// public class programe{
//     public  class TrieNode{
//            TrieNode children[] = new TrieNode[26];
//            boolean isEnd = false;
//     }
//     public  class spellChecker{
//           TrieNode root = new TrieNode();
//            public  void insert(String word){
//                  TrieNode node = root;
//                   for(char ch : word.toCharArray()){
//                       int index = ch-'a';
//                        if(node.children[index]==null){
//                              node.children[index] = new TrieNode();
//                        }
//                        node = node.children[index];
//                   }
//                   node.isEnd = true;
//            }
//             public boolean search(String word){
//                       TrieNode node = root;
//                       for(char ch : word.toCharArray()){
//                           int index = ch-'a';
//                           if(node.children[index]==null){
//                               return false;
//                           }
//                           node  = node.children[index];
//                       }
//                       return node.isEnd;
//             }
//             public void suggestion(TrieNode node,String prefix,List<String>res){
//                        if(node.isEnd){
//                            res.add(prefix);
//                        }
//                        for(int i=0;i<26;i++){
//                           if(node.children[i]!=null){
//                                  char ch = (char)(i+'a');
//                                  suggestion(node.children[i],prefix+ch,res);
//                           }
//                        }
//             }
//              public List<String> getSuggestion(String prefix){
//                 List<String> res = new ArrayList<>();
//                 TrieNode node = root;
//                 for(char ch : prefix.toCharArray()){
//                       int index = ch-'a';
//                       if(node.children[index]==null){
//                            return res;
//                       }
//                       node = node.children[index];
//                 }
//                 suggestion(node, prefix, res);
//                 return res;
//              }
//     }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int helper(int intervals[][]){
//            if(intervals.length==0){
//                return 0;
//            }
//            Arrays.sort(intervals,(a,b)->a[1]-b[1]);
//            int count=1;
//            int n = intervals.length;
//            int prevEnd = intervals[0][1];
//             for(int i=1;i<n;i++){
//                     if(prevEnd<=intervals[i][0]){
//                           count++;
//                           prevEnd = intervals[i][1];
//                     }
//             }
//             System.out.print(prevEnd);
//     }
//     public static void main(String[] args) {
//     }
// }
// import java.util.*;
// public class programe{
//     public static class Job{
//         int id;
//         int deadline;
//         int profit;
//         public Job(int id,int deadline,int profit){
//               this.id = id;
//               this.deadline = deadline;
//               this.profit = profit;
//         }
//     }
//     public static void helper(Job jobs[]){
//                 int totalProfit=0;
//                 int maxDeadline = 0;
//                 for(Job job : jobs){
//                          maxDeadline = Math.max(maxDeadline,job.deadline);
//                 }
//                 int slot[] = new int[maxDeadline+1];
//                 Arrays.sort(jobs,(a,b)->b.profit-a.profit);
//                 Arrays.fill(slot,-1);
//                 for(Job job : jobs){
//                       for(int j=job.deadline;j>0;j--){
//                                 if(slot[j]==-1){
//                                        slot[j] = job.id;
//                                        totalProfit += job.profit;
//                                        break;
//                                 }
//                       }
//                 }
//                 System.out.print(totalProfit);
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String[] args) {
//            int start[] = {1, 3, 0, 5, 8, 5};
//            int end[] = {2, 4, 6, 7, 9, 9};
//            int n = start.length;
//            int activity[][] = new int[n][2];
//            for(int i=0;i<n;i++){
//                   activity[i][0] = start[i];
//                   activity[i][1]  = end[i];
//            }
//            Arrays.sort(activity,(a,b)->a[1]-b[1]);
//            int count=1;
//            int prevEnd = activity[0][1];
//            for(int i=1;i<n;i++){
//                if(activity[i][0]>=prevEnd){
//                       count++;
//                       prevEnd = activity[i][1];
//                } 
//            }
//            System.out.print(count);
//     }
// }
// .....................................................
// import java.util.*;
// public class programe{
//     public static class TrieNode{
//              TrieNode children[] = new TrieNode[26];
//              boolean isEnd ;
//     }
//     public static class Trie{, 3, 0, 5, 8, 5
//           public static TrieNode root = new TrieNode();
//           public static void insert(String word){
//               TrieNode node = root;
//               for(char ch : word.toCharArray()){
//                    int index = ch-'a';
//                    if(node.children[index]==null){
//                       node.children[index] = new TrieNode();
//                    }
//                    node = node.children[index];
//               }
//               node.isEnd = true;
//           }
//           public static boolean search(String word){
//                    TrieNode node = root;
//                    for(char ch: word.toCharArray()){
//                          int index = ch-'a';
//                          if(node.children[index]==null){
//                                return false;
//                          }
//                          node = node.children[index];
//                    }
//                     return  node.isEnd;
//           }
//           public static boolean startwith(String prefix){
//                   TrieNode node = root;
//                   for(char ch :prefix.toCharArray()){
//                         int index = ch-'a';
//                         if(node.children[index]==null){
//                               return false;
//                         }
//                         node = node.children[index];
//                   }
//                   return true;
//           }
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//       public static boolean exist(char board[][],String word){
//            for(int i=0;i<board.length;i++){
//              for(int j=0;j<board[0].length;j++){
//                   if(board[i][j]==word.charAt(0)){
//                           dfs(board,i,j,0,word);
//                           return true;
//                   }
//              }
//            }
//            return false;
//       }
//       public static boolean dfs(char board[][],int i,int j,int index,String word){
//                if(index==word.length()){
//                      return true;
//                }
//                if(i<0  || j<0 || i>=board.length  || j>=board[0].length || board[i][j]!=word.charAt(index)){
//                       return false;
//                }
//                  char ch = board[i][j];
//                  board[i][j] = '#';
//                  boolean found = dfs(board,i+1,j,index+1,word)||dfs(board,i,j+1,index+1,word)|| dfs(board,i-1,j,index+1,word)||dfs(board,i,j-1,index+1,word);
//                 board[i][j] = ch;
//                  return found;
//       }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public static void helper(char board[][],int n,List<List<String>>res){
//                   if(n==board.length){
//                       res.add(construct(board));
//                       return;
//                   }  
//                   for(int col=0;col<board.length;col++){
//                           if(isSafe(n,col,board)){
//                              board[n][col] = 'Q';
//                              helper(board,n+1,res);
//                              board[n][col]  = '.';
//                           }
//                   }
//     }
//     public static boolean isSafe(int row,int col,char board[][]){
//                  for(int i=0;i<row;i++){
//                       if(board[i][col]=='Q'){
//                            return false;
//                       }
//                  }
//                  for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
//                          if(board[i][j]=='Q'){
//                                return false;
//                          }
//                  }
//                  for(int i=row-1,j=col+1;i>=0 && j<board.length ; i--,j++){
//                        if(board[i][j]=='Q'){
//                            return false;
//                        }
//                  }
//                  return true;
//     }
//     public static List<String> construct(char board[][]){
//                 List<String> list = new ArrayList<>();
//                 for(char row[]:board){
//                        list.add(new String(row));
//                 }
//                 return list;
//     }
//      public static List<List<String>>  QueensSolver(char board[][],int n){
//             List<List<String>> res = new ArrayList<>();
//             for(char row[]:board){
//                   Arrays.fill(row, '.');
//             }
//             helper(board,n,res);
//             return res;
//      }
//     public static void main(String args[]){
//           int n = 4;
//           char board[][] = new char[n][n];
//           QueensSolver(board,n);
//     }
// }
// import java.util.*;
// public class programe{
//     public static List<List<String>> helper(int n){
//             List<List<String>> res = new ArrayList<>();
//             char board[][] = new char[n][n];
//             for(char row[]:board){
//                   Arrays.fill(row, '.');
//             }
//             backtrack(0,board,res);
//             return res;       
//     }
//     public static void backtrack(int row,char board[][],List<List<String>> res){
//         if(row==board.length){
//               res.add(construct(board));
//         }
//         for(int col=0;col<board[0].length;col++){
//               if(isSafe(row,col,board)){
//                    board[row][col] = 'Q';
//                    backtrack(row+1,board,res);
//                    board[row][col] = '.';
//               }
//         }
//     }
//      public static boolean  isSafe(int row,int col,char board[][]){
//             for(int i=0;i<row;i++){
//                     if(board[i][col]=='Q'){
//                            return false;
//                     } 
//             }
//             for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
//                     if(board[i][j]=='Q'){
//                            return false;
//                     }
//             }
//             for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
//                    if(board[i][j]=='Q'){
//                       return false;
//                    }
//             }
//                 return true;
//      }
//     public static List<String> construct(char board[][]){
//         List<String> res = new ArrayList<>();
//             for(char row[]:board){
//                    res.add(new String(row));
//             }
//             return res;
//     }
//     public static void main(String args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//     public static int dfs(int grid[][],int i,int j){
//           if(i<=0 || j<=0  || i>grid.length || j>grid[0].length  || grid[i][j]==0){
//                         return 0;
//           }
//               grid[i][j] = 0;
//               int ans = 1;
//               ans += dfs(grid,i+1,j);
//               ans += dfs(grid,i-1,j);
//               ans+= dfs(grid,i,j+1);
//               ans += dfs(grid,i,j-1);
//               return ans;   
//     }
//     public static int numberOfIsland(int grid[][]){
//         int max =0;
//           for(int i=0;i<grid.length;i++){
//               for(int j=0;j<grid[0].length;j++){
//                     if(grid[i][j]==1){
//                          max = Math.max(max,dfs(grid,i,j));   
//                     }
//               }
//           }
//           return max;
//     }
//     public static void main(String args[]){
//     }
// }
//   find the  number of island
// ............................................  clone graph
// import java.util.*;
// public class programe{
//     public static int helper(int grid[][]){
//          Queue<int[]> q = new LinkedList<>();
//          int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
//          int n =  grid.length;
//          int m = grid[0].length;
//          int fresh =0;
//          for(int i=0;i<n;i++){
//              for(int j=0;j<m;j++){
//                     if(grid[i][j]==2){
//                           q.add(new int[]{i,j});
//                     }else if(grid[i][j]==1){
//                            fresh++;
//                     }
//              }
//          }
//          int time=0;
//          while(!q.isEmpty() && fresh>0){
//                int size = q.size();
//                time++;
//                for(int i=0;i<size;i++){
//                      int pair[] = q.poll();
//                      for(int d[]:dir){
//                            int currentRow  = d[0]+pair[0];
//                            int currentCol = d[1]+pair[1];
//                             //  check karo ki ye valid postion me ho aur ye bhi check karo ki ye 1 ho
//                             if(currentRow>=0 && currentCol>=0  && currentRow<n  && currentCol<m  && grid[currentRow][currentCol]==2){
//                                               grid[currentRow][currentCol] = 2;
//                                               fresh--;
//                                               q.add(new int[]{currentRow,currentCol});
//                             }
//                      }
//                }
//          }
//          return fresh==0?time:-1;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//         public static int maxLandArea(int grid[][]){
//                int maxArea =0; 
//                for(int i=0;i<grid.length;i++){
//                     for(int j=0;j<grid[0].length;j++){
//                           if(grid[i][j]==1){
//                                 maxArea = Math.max(maxArea,dfs(i,j,grid));
//                           }
//                     }
//                }
//                return  maxArea;
//         }
//             public static int dfs(int i,int j,int grid[][]){
//                      if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0){
//                                     return 0;
//                      }
//                          grid[i][j]  =0;
//                          int ans = 1;
//                          ans+= dfs(i+1,j,grid);
//                          ans+= dfs(i-1,j,grid);
//                          ans+= dfs(i,j+1,grid);
//                          ans+= dfs(i,j-1,grid);
//                          return ans;
//             }
//      public static void main(String args[]){
//      }
// }
// 
// import  java.util.*;
// public  class programe{
//     public static class Node{
//         int val;
//         List<Node> nbr;
//         public Node(int val){
//              this.val = val;
//              this.nbr = new ArrayList<>();
//         }
//     }
//     public static HashMap<Node,Node> map  = new HashMap<>();
//     public static Node cloneGraph(Node node){
//               if(node==null){
//                  return  null;
//               }
//                if(map.containsKey(node)){
//                     return map.get(node);
//                }
//               Node clone = new Node(node.val);
//               map.put(node,clone);
//               for(Node neighbour:node.nbr){
//                     clone.nbr.add(cloneGraph(neighbour));
//               }
//                     return node;
//     }
//     public static void main(String args[]){
//     }
// }
// import java.util.*;
// public class programe{
//     public static class Node{
//         int val;
//         List<Node> nbr;
//         Node(int val){
//              this.val = val;
//              this.nbr = new ArrayList<>();
//         }
//     }
//      public static HashMap<Node,Node>map = new HashMap<>();
//      public static Node cloneGraph(Node node){
//          if(node==null){
//               return null;
//          }
//           if(map.containsKey(node)){
//                return map.get(node);
//           }
//           Node clone = new Node(node.val);
//           map.put(node,clone);
//            for(Node neighbour : node.nbr){
//                clone.nbr.add(cloneGraph(neighbour));
//            }
//            return clone;
//      }
//     public static  void main(String  args[]){
//     }
// }
// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//              int n=5;
//              for(int i=0;i<n;i++){
//                     for(int j=n-i;j>=0;j--){
//                          System.out.print("  ");
//                     }
//                     for(int j=n;j>=0;j--){
//                           System.out.print("* ");
//                     }
//                     System.out.println();
//              }
//     }
// }
//   ...................................................  butterfly priting ..........................
// import  java.util.*;
// public class programe{
//     public static void main(String[] args) {
//          int n =8;
//          for(int i=1;i<=n;i++){
//               for(int star=1;star<=i;star++){
//                  System.out.print("*");
//               }
//                for(int space=1;space<2*(n-i);space++){
//                   System.out.print(" ");
//                }
//               for(int star=1;star<=i;star++){
//                  System.out.print("*");
//               }
//               System.out.println();
//          }
//          for(int i=n;i>=0;i--){
//               for(int star=1;star<=i;star++){
//                  System.out.print("*");
//               }
//                for(int space=1;space<2*(n-i);space++){
//                   System.out.print(" ");
//                }
//               for(int star=1;star<=i;star++){
//                  System.out.print("*");
//               }
//               System.out.println();
//          }
//     }
// }
// import java.util.*;
// public class programe{
//     public static int climbingStair(int n){
//            if(n<=1){
//                 return  1;
//            }
//           int dp[] = new int[n];
//           dp[0] = 1;
//           dp[1]  = 1;
//           for(int i=2;i<n;i++){
//                int prev = dp[i-1];
//                int current = dp[i-1];
//                dp[i] = prev+current;
//           }
//           return dp[n-1];
//     }
//     public static void main(String args[]){
//          System.out.print(climbingStair(5));
//     }
// }
// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//           int nums[] = {10,9,2,5,3,7,101,18};
//           int n = nums.length;
//           int dp[]  = new int[n];
//           Arrays.fill(dp, 1);
//           int ans =1;
//           for(int i=1;i<n;i++){
//              for(int j=0;j<i;j++){
//                    if(nums[j]<nums[i]){
//                       dp[i] = Math.max(dp[i],dp[j]+1);
//                    }
//              }
//              ans = Math.max(ans,dp[i]);
//           }
//           System.out.print(ans);
//     }
// }
// .........................................................
// import java.util.*;
// public class programe{
//     public static int helper(){
//          int nums[] =  {2,7,9,3,1};
//           if(nums.length==1){
//               return nums[0];
//           }
//           int dp[]= new int[nums.length];
//           dp[0] = nums[0];
//           dp[1] = Math.max(nums[0],nums[1]);
//           for(int i=2;i<nums.length;i++){
//                 dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
//           }
//           System.out.print(dp[nums.length-1]);
//           return -1;
//     }
//     public static void main(String[] args) {
//          helper();
//     }
// }
// ..................................
// import  java.util.*;
// public class programe{
//     public static int solve(int nums[],int i){
//             //  handle the base case
//             if(i>=nums.length){
//                  return 0;
//             }
//             int rob =  nums[i]+solve(nums,i+2);
//             int skip = solve(nums,i+1);
//             return Math.max(rob,skip);
//     }
//     public static void main(String args[]){
//          int nums[] = {2,7,9,3,1};
//          int n = nums.length;
//          System.out.print(solve(nums,0));
//     }
// }
// import java.util.*;
// public class programe{
//     public static int helper(){
//          int coins[] = {1,2,5};
//             int n = coins.length;
//             int amount = 11;
//             int dp[] = new int[amount+1];
//             Arrays.fill(dp,amount+1);
//             dp[0] = 0;
//             for(int i=1;i<=amount;i++){
//                  for(int coin : coins){
//                        if(i-coin>=0){
//                             dp[i] = Math.min(dp[i],dp[i-coin]+1);
//                        }
//                  }
//             }
//             return  dp[amount]>amount? -1 : dp[amount];
//     }
//     public  static void main(String args[]){
//             System.out.print(helper());           
//     }
// }
// ........................................... coin change using the dp
// import java.util.*;
// public class programe{
//     public static int helper(int coins[],int amount){
//           if(amount==0){
//                 return  0;
//           }
//            if(amount<0){
//                return Integer.MAX_VALUE;
//            }
//            int min = Integer.MAX_VALUE;
//             for(int coin:coins){
//                   int res = helper(coins,amount-coin);
//                   if(res!=Integer.MAX_VALUE){
//                          min = Math.min(res+1,min);
//                   }
//             }
//             return  min;
//     }
//     public static void main(String args[]){
//            int coins[] = {1,2,5};
//            int n = coins.length;
//            int amount=11;
//            int ans = helper(coins,amount);
//            if(ans==Integer.MAX_VALUE){
//                  System.out.print(-1);
//            }else{
//                System.out.print(ans);
//            }
//     }
// }
// .................................................................
// import java.util.*;
// public class programe{
//       public static void main(String args[]){
//               int nums[] = {3,1,2,4};
//               int n = nums.length;
//               int sum=0;
//               for(int i=0;i<n;i++){
//                     int min = nums[i];
//                     for(int j=i;j<n;j++){
//                          min = Math.min(min,nums[j]);
//                          sum  += min;
//                     }
//               }
//               System.out.print(sum);
//       }
// }
// ...............................................................
// import  java.util.*;
// public class programe{
//       public static void largestRectangleHistograme(int heights[]){
//               Stack<Integer> st = new Stack<>();
//               int maxArea = 0;
//               int n = heights.length;
//               for(int i=0;i<n;i++){
//                   int current = (i==n)?0:heights[i];
//                    while(!st.isEmpty()  && current<heights[st.peek()]){
//                            int height = heights[st.pop()];
//                            int width ;
//                            if(st.isEmpty()){
//                                  width =i;
//                            }else{
//                                  width = i-st.peek()-1;
//                            }
//                            maxArea = Math.max(maxArea,height*width);
//                    }
//               }
//               System.out.print(maxArea);
//       }
//       public static void main(String[] args) {
//       }
// }
// .............................................................. largest rectangle in histograme
// import java.util.PriorityQueue;
// public class programe{
//       public static class Node{
//             int data;
//             Node next;
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//       }
//         public static Node mergeList(Node head1,Node head2){
//               Node dummy = new Node(-1);
//               Node curr = dummy;
//               while(head1!=null  && head2!=null){
//                       if(head1.data<=head2.data){
//                            curr.next = head1;
//                            head1 = head1.next;
//                       }else{
//                          curr.next = head2;
//                          head2 = head2.next;
//                       }
//                       curr = curr.next;
//               }
//                 if(head1!=null){
//                     curr.next = head1;
//                 }
//                 if(head2!=null){
//                     curr.next = head2;
//                 }
//                 return  dummy.next;
//         }
//          public static Node mergeList(Node lists[]){
//                if(lists==null  || lists.length==0){
//                     return null;
//                }
//                Node dummy = new Node(-1);
//                Node curr = dummy;
//                PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.data-b.data);
//                for(Node node : lists){
//                    pq.add(node);
//                }
//                while(!pq.isEmpty()){
//                     Node small = pq.poll();
//                       curr.next = small;
//                       curr = curr.next;
//                       if(small.next!=null){
//                           pq.add(small.next);
//                       }
//                }
//               return dummy.next;
//          }
//       public static void main(String[] args) {
//             Node head  = new Node(1);
//             head.next = new Node(2);
//             head.next.next = new Node(3);
//             head.next.next.next = new Node(4);
//             head.next.next.next.next = new Node(5);
//             head.next.next.next.next.next = new Node(6);
//             while(head!=null){
//                     System.out.print(head.data +"  ");
//                      head = head.next;
//             }
//       }
// }
// import java.util.*;
// public class programe{
//       public static void helper(){
//                String s = "ADOBECODEBANC";
//              String t = "ABC";
//              HashMap<Character,Integer> s_count = new HashMap<>();
//              HashMap<Character,Integer> t_count = new HashMap<>();
//              int n1 = s.length();
//              int n2 = t.length();
//              int minLen = Integer.MAX_VALUE;
//              int start=0;
//              int left=0;
//              if(n1<n2){
//                   return;    
//              }
//              for(char ch : t.toCharArray()){
//                      t_count.put(ch,t_count.getOrDefault(ch, 0)+1);
//              }
//              int have=0;
//              int need = n2;
//              for(int right=0;right<n2;right++){
//                    char ch  = s.charAt(right);
//                    s_count.put(ch,s_count.getOrDefault(ch, 0)+1);
//                    if(s_count.get(ch).intValue()==t_count.get(ch).intValue() ){
//                            have++;
//                    }
//                    while(have==need){
//                           if(right-left+1<minLen){
//                                 minLen = right-left+1;
//                                 start = left;
//                           }
//                           char remove = s.charAt(left);
//                           if(t_count.containsKey(remove) && s_count.get(remove)<t_count.get(remove)){
//                                   have--;
//                           }
//                           left++;
//                    }
//              }
//       }
//       public static void main(String args[]){
//       }
// }
// .......................................................
// import java.util.*;
// public class programe{
//       public static void main(String args[]){
//             String str=  "abcabcbb";
//             int n = str.length();
//             HashSet<Character> set = new HashSet<>();
//             int left=0;
//             int maxLen =0;
//             for(int right=0;right<n;right++){
//                     while(set.contains(str.charAt(right))){
//                               set.remove(str.charAt(right));
//                               left++;
//                     }
//                     set.add(str.charAt(right));
//                     maxLen = Math.max(maxLen,right-left+1);
//             }
//             System.out.print(maxLen);
//       }
// }
// ...............................................................
// import java.util.*;
// public class programe{
//       public static void main(String args[]){
//             int nums[] = {100,2,4,6,200};
//             int n = nums.length;
//             int current =1;
//             int max = 1;
//             Arrays.sort(nums);
//              for(int i=1;i<n;i++){
//                   if(nums[i]==nums[i-1]){
//                           continue;
//                   }
//                   if(nums[i]==nums[i-1]+1){
//                           current++;
//                   }else{
//                           max = Math.max(max,current);
//                           current = 1;
//                   }
//              }
//               System.out.print(Math.max(max,current));
//       }
// }
//   find the longest consecutive subsequance
// import  java.util.*;
// public class programe{
//       public static void main(String args[]){
//             int nums[] = {1,2,3,4};
//             int n = nums.length;
//             int ans[] = new int[n];
//             ans[0] = 1;
//             for(int i=1;i<n;i++){
//                    ans[i] = ans[i-1]*nums[i-1];
//             }
//             int right = 1;
//             for(int i=n-1;i>=0;i--){
//                   ans[i] = ans[i]*right;
//                   right *= nums[i];
//             }
//             for(int num:ans){
//                    System.out.print(num +" ");
//             }
//       }
// }
// ...........................................................
// import java.util.*;
// public class programe{
//       public static class Node{
//              public int val;
//              public List<Node>nbr;
//       }
//       public static Node cloneGraph(Node node){ 
//               if(node==null){
//                    return null;
//               }
//               return dfs(node);
//       }
//        public static HashMap<Node,Node> map = new HashMap<>();
//        public static Node dfs(Node node){
//              if(map.containsKey(node)){
//                   return map.get(node);
//              }
//              Node clone = new Node();
//              clone.val = node.val;
//              clone.nbr = new ArrayList<>();
//              for(Node neighbour : node.nbr){
//                     clone.nbr.add(neighbour); 
//              }
//              return clone;
//        }
//       public static void main(String args[]){
//       }
// }
// ................................................... clone graph
// import java.util.*;
// public class programe{
//       public static class Node{
//               public int val;
//               public List<Node> nbr;
//       }
//       public static HashMap<Node,Node> map = new HashMap<>();
//       public static Node cloneGraph(Node node){
//              if(node==null){
//                    return  null;
//              }
//                   dfs(node);
//       }
//       public static Node dfs(Node node){
//                  if(map.containsKey(node)){
//                        return map.get(node);
//                  }
//                  Node clone = new Node();
//                  clone.val = node.val;
//                  clone.nbr = new ArrayList<>();
//                  map.put(node,clone);
//             //        now call the left part
//             for(Node neighbour : node.nbr){
//                      clone.nbr.add(dfs(neighbour)); 
//             }
//             return clone;
//       }
//       public static void main(String args[]){
//       }
// }
///////////.................................................................   print the node from source to destination valid path
// import java.util.*;
// public class programe{
//       //   build the graph first
//       public static boolean validPath(int src,int des,int edges[][],int n){
//               ArrayList<Integer>[] graph = new ArrayList[n];
//               for(int i=0;i<n;i++){
//                     graph[i] = new ArrayList<>();
//               }
//               for(int edge[]: edges){
//                      graph[edge[0]].add(edge[1]);
//                      graph[edge[1]].add(edge[0]);
//               }
//               boolean visited[] = new boolean[n];
//               return dfs(src,des,graph,n,visited);

//       }
//       public static boolean dfs(int src,int des,ArrayList<Integer>graph[],int n,boolean visited[]){
//                   if(src==des){
//                          return true;
//                   }
//                   visited[src] = true;
//                   for(int neighbour : graph[src]){
//                            if(!visited[neighbour]){
//                                  if(dfs(neighbour,des,graph,n,visited)){
//                                        return true;
//                                  }
//                            }
//                   }
//                   return false;
//       }
//       public static void main(String args[]){
//             int edges[][] = {{0,1},{1,2},{2,0}};
//             int src = 0;
//             int des = 2;
//          boolean ans=   validPath(src,des,edges,edges.length);
//          System.out.print(ans);
            

//       }
// }
// ...............................................................
// import java.util.*;
// public class programe{
//       public static int[][] floodfill(int sr,int sc,int image[][],int newColor){
//                  int oldColor = image[sr][sc];
//                  if(oldColor==newColor){
//                      return image;
//                  }
//                  dfs(sr,sc,image,newColor,oldColor);
//                  return image;

//       }
//       public static void dfs(int sr,int sc,int image[][],int newColor,int oldColor){
//             if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length){
//                         return;
//             }
//             if(image[sr][sc]!=oldColor){
//                    return ;
//             }
//             image[sr][sc] = newColor;
//             dfs(sr+1,sc,image,newColor,oldColor);
//             dfs(sr-1,sc,image,newColor,oldColor);
//             dfs(sr,sc-1,image,newColor,oldColor);
//             dfs(sr,sc+1,image,newColor,oldColor);


//       }
//       public static void main(String[] args) {
            

//       }
// }
// import java.util.*;
// public class programe{
//       public static int[] helper(){
//                 int nums[] = {2,7,11,15};
//              int n = nums.length;
//              Arrays.sort(nums);
//              int target=9;
//               HashMap<Integer,Integer> map = new HashMap<>();
//               for(int i=0;i<n;i++){
//                     int left = target-nums[i];
//                     if(map.containsKey(left)){
//                           return new int[]{map.get(left),i};
//                     }else{
//                           map.put(nums[i],i);
//                     }
//               }
//               return new int[]{-1,-1};
//       }
//       public static List<List<String>> groupAnagrame(){
//              String str[] = {"eat","tea","tan","ate","nat","bat"};
//               int n = str.length;
//               HashMap<String,List<String>> map = new HashMap<>();
//               for(String word:str){
//                    char ch[] = word.toCharArray();
//                    Arrays.sort(ch);
//                    String key = new String(ch);
//                    map.putIfAbsent(key, new ArrayList<>());
//                    map.get(key).add(word);
//               }
//                return new ArrayList<>(map.values());
             
//       }
//       public static List<List<String>> findAnagrame(){
//               String str[]  = {"eat","tea","tan","ate","nat","bat"};
//               int n = str.length;
//               HashMap<String,List<String>> map = new HashMap<>();
//               for(int i=0;i<n;i++){
//                     char ch[] = str[i].toCharArray();
//                     Arrays.sort(ch);
//                     String key = new String(ch);
//                     map.putIfAbsent(key,new ArrayList<>());
//                     map.put(key).add(word);

//               }
//               return new ArrayList<>(map.values());
//       }
//       public static void main(String args[]){
//       //     int ans[]  =    helper();
//           System.out.print(groupAnagrame());
           
//       }
// }
// import java.util.*;
// public class programe{
//      public static  class Pair{
//                     int val;
//                     int freq;
//                     Pair(int val,int freq){
//                           this.val = val;
//                           this.freq  = freq;
//                     }
               
//      }    
//      public static void main(String[] args) {
//            int nums[] = {1,1,1,2,2,3};
//            int n = nums.length;
//           int k=2;
//            HashMap<Integer,Integer> map = new HashMap<>();
//            for(int num:nums){
//                  map.put(num,map.getOrDefault(num, 0)+1);
//            }
//            PriorityQueue<Pair> pq  = new PriorityQueue<>((a,b)->b.freq-a.freq);
//           //     travese on the HashMap
//           for(Map.Entry<Integer,Integer> e: map.entrySet()){
//                 pq.add(new Pair(e.getKey(),e.getValue()));
//                  if(pq.size()>k){
//                      pq.poll(); 
//                  }

//           }
//           ArrayList<Integer> list = new ArrayList<>();
//             for(int i=0;i<k;i++){
//                  list.add(pq.poll().val);
//             }
//             System.out.print(list);

//      }
// }

// /................................................................... frequent K element
// ...........................................................................
// import java.util.*;
// public class programe{
//      public static void main(String[] args) {
//            int n=5;
//            int m=5;
//            for(int i=0;i<n;i++){
//                  for(int j=0;j<i;j++){
//                       if((i+j)%2==0){
//                             System.out.print("1");
//                       }else{
//                           System.out.print("0");
//                       }
//                  }
//                  System.out.println();
//            }
//      }
// }


// import java.util.*;
// public class programe{
//      public static void main(String[] args) {
//          int index=1;
//           for(int i=0;i<5;i++){
//                for(int j=0;j<i;j++){
//                        System.out.print(index +" ");
//                        index++;

//                }
//                System.out.println();
//           }
            
//      }
// }
// import java.util.*;
// public class programe{
//      public static void main(String args[]){
//              for(int i=0;i<5;i++){
//                  for(int space=5-1-i;space>=0;space--){
//                       System.out.print("  ");
//                  }
//                  for(int star=1;star<i;star++){
//                         System.out.print("*");
//                  }
//                  System.out.println();
//              }
//      }
// }
// ........................................................
// import  java.util.*;
// public class programe{
//      public static void main(String[] args) {
//           for(int i=0;i<5;i++){
//                 for(int j=1;j<5-i+1;j++){
//                       System.out.print(j);
//                 }
//                 System.out.println();
//           }

//      }
// }

// ........................................inverted  & rotated pyramid

// import java.util.*;
// public class programe{
//      public static void main(String[] args) {
//            int n = 5;
//            int m = 5;
//            for(int i=1;i<n;i++){
//                 for(int j=1;j<m;j++){
//                       if(i==1 || j==1 || i==n-1 || j==m-1){
//                              System.out.print("*");
//                       }else{
//                              System.out.print(" ");
//                       }
//                 }
//                 System.out.println();
//            }
//      }
// }
// .........................................................   Hollow rectangle pattern


// import  java.util.*;
// public class programe{
//      public static void helper(){
//           String s = "())(";
//           int n = s.length();
//           int open = 0;
//           int add=0;
//            for(char ch: s.toCharArray()){
//                 if(ch=='('){
//                     open++;  
//                 }else{
//                       if(open>0){
//                            open--;
//                       }else{
//                           add++;
//                       }
//                 }
//            }
//            System.out.print(add);
//      }
//      public static void main(String args[]){
     
//      }
// }
// ............................................................. min add to make peranthisis

// import  java.util.*;
// public class programe{
//      public static boolean helper(){
//               String s = "()[]{}";
//               Stack<Character> st = new Stack<>();
//               for(char ch : s.toCharArray()){
//                    if(ch=='(' || ch=='['  || ch=='{'){
//                         st.push(ch);
//                    }else{
//                           if(st.isEmpty()){
//                                  return false;
//                           }
//                           char c  = st.pop();
//                           if(ch=='(' && c!=')'  || ch=='[' && c!=']'  || ch=='{'  && c=='}'){
//                                   return false;
//                           }
                          
//                    }
//               }
//               return st.isEmpty()?true:false;
//      }
//      public static void main(String args[]){
          
//      }
// }





// ...............................................................  valid peranthsises
// import java.util.
// public class programe{
//        public static void helper(int nums[]){
//                   int slow = nums[0];
//                   int fast = nums[0];
//                   do{
//                        slow = nums[slow];
//                        fast = nums[nums[fast]];

//                   }while(slow!=fast);
//                   slow = nums[0];
//                   while(slow!=fast){
//                        slow = nums[slow];
//                        fast  = nums[fast];
//                   }
//                   System.out.print(slow);
//        }
//        public static void main(String args[]){
//                 int nums[] = {1,3,4,2,2};
//                 int n = nums.length;
               
//                 helper(nums);

//        }
// }
// ..............................................................largest product 
// import java.util.*;
// public class programe{
//          public static void  maxProduct(int nums[]){
//                 int max = nums[0];
//                 int min  = nums[0];
//                 int ans = nums[0];
//                 for(int i=1;i<nums.length;i++){
//                        int curr = nums[i];
//                        if(curr<0){
//                               int temp =  max;
//                               max = min;
//                               min = temp;
//                        }
//                        max = Math.max(curr,max*curr);
//                        min  = Math.min(curr,min*curr);
//                        ans = Math.max(max,ans);
                      
//                 }
//                  System.out.print(ans);
//          }
//        public static void main(String[] args) {
//                int nums[] = {2, 3, -2, 4};
//                maxProduct(nums);
             
//        }
// }
// ...................................................... prefix sum
// import java.util.*;
// public class programe{
//        public static int prefix[];
//        public static void helper(int nums[]){
//               int n = nums.length;
//                prefix = new int[n];
//                prefix[0] = nums[0];
//                for(int i=1;i<n;i++){
//                       prefix[i] = prefix[i-1]+nums[i];
//                }
//        }
//        public static int rangeSum(int left,int right){
//                   if(left==0){
//                           return  prefix[right];
//                   }
//                   return prefix[right]-prefix[left-1];
//        }
//        public static void main(String args[]){
               
//        }
// }
// ...................................................... product of an array except self

// import java.util.*;
// public  class programe{
//        public static void main(String args[]){
//                  int nums[] = {1,2,3,4};
//                  int n = nums.length;
//                  int result[] = new int[n];
//                  result[0] = 1;
//                  for(int i=1;i<n;i++){
//                        result[i] = result[i-1]*nums[i-1];
//                  }
//                  int right=1;
//                  for(int i=n-1;i>=0;i--){
//                        result[i] = result[i]*right;
//                        right  = right*nums[i];
//                  }
//                  for(int num: result){
//                       System.out.print(num +" ");
//                  }

//        }
// }
// public class programe{
//       public static class Node{
//             int data;
//             Node next;
//             Node(int data){
//                    this.data = data;
//                    this.next = null;
//             }
//       }
//       public static Node reverseNode(Node head,int left,int right){
//                if(head==null || left==right){
//                       return head;
//                }
//                Node dummy = new Node(0);
//                dummy.next = head;
//                Node prev = dummy;
//                 for(int i=0;i<left;i++){
//                     prev = prev.next;
//                 }
//                 Node curr = prev.next;
//                 for(int i=0;i<right-left;i++){
//                        Node temp = curr.next;
//                        curr.next = temp.next;
//                        temp.next = prev.next;
//                        prev.next = temp;
//                 }
//                 return dummy.next;
//       }
//       public static void main(String args[]){
             
//       }
// }

// import  java.util.*;
// public class programe{
//     public static class Node{
//         int data;
//         Node next;
//         Node random;
//         Node(int data){
//              this.data = data;
//              this.next = null;
//              this.random = null;
//         }
//     }
//      public static Node linkEvenOdd(Node head){
//           Node odd = head;
//           Node even = head.next;
//           Node evenHead = even;
//           while(even!=null  && even.next!=null){
//                 odd.next = even.next;
//                 odd = odd.next;
//                 even.next = odd.next;
//                 even  = even.next;
//           }
//           odd.next = evenHead;
//           return  head;
//      }
//     public static Node deleteDuplicate(Node head){
//               Node curr = head;
//               while(curr!=null && curr.next!=null){
//                     if(curr.data==curr.next.data){
//                              curr.next = curr.next.next;
//                     }else{
//                           curr = curr.next;
//                     }
//               }
//               return  head;
     
//     }
//     public static Node swapNodes(Node head){
//                         Node dummy = new Node(1);
//                         dummy.next = head;
//                         Node curr = dummy;
//                         while(curr.next!=null  && curr.next.next!=null){
//                                  Node first = curr.next;
//                                  Node second = curr.next.next;
//                                  first.next = second.next;
//                                  second.next = first;
//                                  curr = first;
//                         }
//                         return dummy.next;
//     }
//     public static Node mergeList(Node head,Node head2){
//            Node dummy = new Node(-1);
//            Node tail = dummy;
//            while(head!=null && head2!=null){
//                 if(head.data<=head2.data){
//                        tail.next = head;
//                        head = head.next;
                    
//                 }else{
//                       tail.next = head2;
//                       head2 = head2.next;
//                 }
//                 tail = tail.next;
//            }
//               if(head!=null){
//                     tail.next = head;
//               }else{
//                   tail.next =head2;
//               }
//             return dummy.next; 
           
//     }
//     public static  void reverseLinkedList(Node root){
//            Node prev = null;
//            Node curr = root;
//            while(curr!=null){
//               Node next = curr.next;
//               curr.next = prev;
//               prev = curr;
//               curr = next;
//            }
//     }
//     public static void reorderList(Node head){
//             //     find middle
//             Node slow = head;
//             Node fast = head;
//             while(fast!=null && fast.next!=null){
//                    slow = slow.next;
//                    fast = fast.next.next;
//             }
//             //   reverse the second half
//             Node prev =null;
//             Node curr = slow.next;
//             while(curr!=null){
//                   Node next = curr.next;
//                   curr.next = prev;
//                   prev = curr;
//                   curr = next;
//             }
//             Node first = head;
//             Node second = prev;
//             while(second!=null){
//                   Node temp1 = first.next;
//                   Node temp2 = second.next;
//                   first.next = second;
//                   second.next = temp1;
//                   first = temp1;
//                   second = temp2;
//             }


//     }
//     public static boolean isPalindrome(Node head){
//             //    find middle
//             Node slow = head;
//             Node fast = head;
//             while(fast!=null  &&  fast.next!=null){
//                    slow = slow.next;
//                    fast = fast.next.next;
//             }
//             Node prev = null;
//             Node curr = slow.next;
//             while(curr!=null){
//                    Node next = curr.next;
//                    curr.next = prev;
//                    prev = curr;
//                    curr = next;
//             }
//             Node left = head;
//             Node secondHead = prev;
//             while(secondHead!=null){
//                  if(left.data!=secondHead.data){
//                         return false;
//                  }
//                  left = left.next;
//                  secondHead = secondHead.next;
//             }
//               return true;

            
//     }
//         public static Node copyListWithRandomPointer(Node head){
//               if(head==null  || head.next==null) return;
//               HashMap<Node,Node> map  = new HashMap<>();
//                Node curr = head;
//                while(curr!=null){
//                    map.put(curr,new Node(curr.data));
//                    curr = curr.next;
//                }
//                curr = head;
//                while(curr!=null){
//                     Node copy = map.get(curr);
//                     copy.next = map.get(curr.next);
//                     copy.random = map.get(curr.random);
//                     curr = curr.next;
//                }
//                return map.get(curr);
               

//         }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.next = new Node(2);
//         root.next.next = new Node(3);
//         root.next.next.next = new Node(3);
//         root.next.next.next.next = new Node(5);
//         Node root2 = new Node(2);
//         root2.next = new Node(3);
//         root2.next.next = new Node(4);
//         root2.next.next.next = new Node(5);
//         while(root!=null){
//                  System.out.print(root.data);
//                  root = root.next;
//         }
//         mergeList(root,root2);
        
          
//     }
// }
// ............................................................Reverse linked list

// import java.util.*;
// public class programe{
//     public static int houseRob(int nums[],int start,int end){
//                int prev2=0;
//                int prev1=0;
//                for(int i=start;i<end;i++){
//                     int curr = Math.max(prev1,prev2+nums[i]);
//                     prev2 = prev1;
//                     prev1 = curr;
//                }
//                return  prev1;
//     }
//     public static int helper(int nums[],int n){
//             if(n==1){
//                  return nums[0];
//             }
//             int case1 = houseRob(nums,0,n-2);
//             int case2 = houseRob(nums,1,n-1);
//             return Math.max(case1,case2);


//     }
//     public static void main(String args[]){
//            int nums[] = {2,3,2};
//            int n = nums.length;
//            int ans = helper(nums,n);
//            System.out.print(ans);
           
//     }
// }
// .................................................................   House robber 2
// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//           int nums[] = {2,7,9,3,1};
//           int n = nums.length;
//           int dp[] = new int[n];
//           dp[0] = nums[0];
//           dp[1] = Math.max(nums[0],nums[1]);
//           for(int i=2;i<n;i++){
//                  dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
//           }
//            System.out.print(dp[n-1]);
          
//     }
// }

// ................................................................ House robber

// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//           String s = "abcabcbb";
//           int n = s.length();
//           Set<Character> set = new HashSet<>();
//           int left=0;
//           int max=0;
//           for(int right=0;right<n;right++){
//               if(set.contains(s.charAt(right))){ 
//                        set.remove(s.charAt(left));
//                        left++;
//               }
//               set.add(s.charAt(right));
//                max = Math.max(max,right-left+1);

//           }
//           System.out.print(max);

//     }
// }
// /..............................................maximum subarray  without repeating character
// import java.util.*;
// public class programe{
//     public static void helper(int nums[],int n){
//            int k = 3;
//            int window=0;
//            int max=0;
//            for(int i=0;i<k;i++){
//                window+=nums[i];
//            }
//            max = window;
//            for(int j=k;j<n;j++){
//                window += nums[j];
//                 window -= nums[j-k];
//                 max = Math.max(max,window);
              
//            }
//            System.out.print(max);
//     }
//     public static void main(String[] args) {
//           int nums[] = {2,1,5,1,3,2};
//           int n = nums.length;
//          helper(nums,n);
         
//     }
// }

// .................................................................... window sum maximum
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//          int nums[] = {10,9,2,5,3,7,101,18};
//          int n = nums.length;
//          int dp[] = new int[n];
//          Arrays.fill(dp,1);
//          int max = 1;
//          for(int i=0;i<n;i++){
//               for(int j=0;j<i;j++){
//                     if(nums[i]>nums[j]){
//                            dp[i] = Math.max(dp[i],dp[j]+1);
//                     }
//               }
//                max = Math.max(max,dp[i]);
//          }
//          System.out.print(max);

//     }
// }
// ...................................... longest increasing subbsequance
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//          int nums[] = {10,9,2,5,3,7,10,8};
//          int n = nums.length;
//          int max = 0;
//          int count=0;
//          for(int i=1;i<n;i++){
//                if(nums[i]>nums[i-1]){
//                  count++;
//                  max = Math.max(max,count);
                    
//                }else{
//                   count=0;
//                }
//          }
//          System.out.print(max+1);
//     }
// }
// ...........................................................longest increasing subsequance
// import  java.util.*;
// public class programe{
//     public static void main(String args[]){
//             String str = "cbaebabacd";
//             int n = str.length();
//             String anagrame = "abc";
//             int k = anagrame.length();
//             ArrayList<Integer> list = new ArrayList<>();
//             char arr2[] = anagrame.toCharArray();
//             Arrays.sort(arr2);
//             for(int i=0;i<n-k;i++){
//                    int j=i;
//                    while(j<k){
//                         String sub  = str.substring(j,k);
//                         char arr[] = sub.toCharArray();
//                         Arrays.sort(arr);
//                         if(Arrays.equals(arr,arr2)){
//                                 list.add(j);
//                         }

//                             j++;

//                    }
//             }
//             System.out.print(list);
//     }
// }



// ....................................................  find the all angrams exist in string
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//           String s1 = "anhgram";
//           String s2 = "nagaram";
//           int n1  = s1.length();
//           int n2 = s2.length();
//           if(n1!=n2){
//               System.out.print("Not Angrame");

//             }
//             char ch1[] = s1.toCharArray();
//             char ch2[] = s2.toCharArray();
//             Arrays.sort(ch1);
//             Arrays.sort(ch2);
//             System.out.print(Arrays.equals(ch1, ch2));
//     }
// }

// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//          int nums[] = {-1, 0, 1, 2, -1, -4};
//          int n = nums.length;
//          int target=4;
//          List<List<Integer>> list = new ArrayList<>();
//          Arrays.sort(nums);
//          for(int i=0;i<n;i++){
//                if(i>0  && nums[i]==nums[i-1]) continue;
//                for(int j=i+1;j<n;j++){
//                    if(j>i+1 && nums[j]==nums[j-1]){
//                        continue;
//                    }
//                     int left = j+1;
//                     int right = n-1;
//                     while(left<right){
//                          int sum = nums[i]+nums[j]+nums[left]+nums[right];
//                          if(sum==target){
//                                 list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
//                                 while(left<right  && nums[left]==nums[left+1]){
//                                       left++;
//                                 }
//                                 while(left<right   && nums[right]==nums[right-1]){
//                                       right--;
//                                 }
//                                 left++;
//                                 right--;
//                          }else if(sum<target){
//                                 left++;
//                          }else{
//                              right--;
//                          }
//                     }

//                }
//          }
//          System.out.print(list);
//     }
// }


// ....................................................... 4sum

// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//         int nums[] = {-1, 0, 1, 2, -1, -4};
//         int n = nums.length;
//         List<List<Integer>> list = new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//                if(i>0  &&  nums[i]==nums[i-1]) continue;
//                int left=i+1;
//                int right=n-1;
//                while(left<right){
//                   int sum = nums[i]+nums[left]+nums[right];
//                      if(sum==0){
//                          list.add(Arrays.asList(nums[left],nums[i],nums[right]));
//                          while(left<right  && nums[left]==nums[left+1]){
//                              left++;
//                          }
//                          while(left<right && nums[right]==nums[right-1]){
//                              right--;
//                          }
//                          left++;
//                          right--;
//                      }else if(sum<0){
//                           left++;
//                      }else{
//                          right--;
//                      }
//                }
//         }
//         System.out.print(list);

//     }
// }




// import java.util.*;
// public class programe{
//     public static int[] helper(){
//            int nums[] = {1,3,2,5,6};
//            int n = nums.length;
//            int target=11;
//            HashMap<Integer,Integer> map = new HashMap<>();
//            for(int i=0;i<n;i++){
//               int left = target-nums[i];
//                if(map.containsKey(left)){
//                   return  new int[]{map.get(left),i};
//                }
//                map.put(nums[i],i);
//            }
//            return new int[]{};
//     }
//      public static void main(String args[]){
//          int ans[] = new int[2];
//          ans = helper();
//           for(int num:ans){
//              System.out.print(num +" ");
//           }
          
//      }
// }



// import  java.util.*;
// public class programe{
//      public static void backtrack(int nums[],int n,boolean vis[],ArrayList<ArrayList<Integer>>list,ArrayList<Integer>result){
//             if(result.size()==n){
//                    list.add(new ArrayList<>(result));
//                     return;
//             }
//             for(int i=0;i<n;i++){
//                 if(vis[i]){
//                       continue;
//                 }
//                  vis[i] = true;
//                  result.add(nums[i]);
//                  backtrack(nums,n,vis,list,result);
//                   vis[i] = false;
//                   result.remove(result.size()-1);
//             }

            
//      }
//     public static void main(String args[]){
//         int nums[] = {1,2,3};
//         int n  = nums.length;
//         boolean vis[] =  new boolean[n];
//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         ArrayList<Integer> result = new ArrayList<>();
//         backtrack(nums,n,vis,list,result);
//         System.out.print(list);
         
//     }
// }
// ...................................................................

// import java.util.*;
// public class programe{
//     public static class Edge{
//         int u;
//         int v;
//         int wt;
//         public Edge(int u,int v,int wt){
//              this.u = u;
//              this.v = v;
//              this.wt = wt;
//         }
//     }
//     public static  void BellmanFord(int v,ArrayList<Edge>edges,int s){
//             int dis[] = new int[v];
//             Arrays.fill(dis,Integer.MAX_VALUE);
//             dis[s] = 0;
//             for(int i=0;i<v;i++){
//                   for(Edge e : edges){
//                        int src = dis[e.u];
//                        int des = dis[e.v];
//                        if(src+e.wt<des  && dis[e.v]!=Integer.MAX_VALUE){
//                            dis[e.v] = dis[e.u]+e.wt;
//                        }
                       
//                   }
//             }

//     }
//     public static void main(String args[]){

//     }
// }

// import java.util.*;
// public class programe{
//     public static class Edge{
//         int u;
//         int v;
//         int wt;
//         public Edge(int u,int v,int wt){
//              this.u = u;
//              this.v = v;
//              this.wt = wt;
//         } 
//     }
//     public static class BellmanFord{
//           public static void BellmanFordAlgo(int v,ArrayList<Edge>Edges,int src){
//                  int dis[] = new int[v];
//                  Arrays.fill(dis, Integer.MAX_VALUE);
//                   dis[src] = 0;
//                   for(int i=0;i<v;i++){
//                      for(Edge e : Edges){
//                          if(dis[e.u]!=Integer.MAX_VALUE  && dis[e.u]+e.wt<dis[e.v]){
//                                       dis[e.v] = dis[e.u]+e.wt;
//                          }
//                      }
//                   }
//                    for(Edge e: Edges){
//                        if(dis[e.u]+e.wt <dis[e.v] &&  dis[e.u]!=Integer.MAX_VALUE){

//                                 System.out.print("Negative cycle");
//                                 return;
//                        }
//                    }

//                    for(int i:dis){
//                        System.out.print(i +" ");
//                    }

             
//           }
//     }

// import  java.util.*;
// public class programe{
//       public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data= data;
//             this.left = null;
//             this.right= null;
//         }
        
//       }
//       public static boolean hasPath(Node root,int target){
//                   if(root==null){
//                       return false;
//                   }
//                   if(root.left==null  && root.right==null){
//                         return root.data == target;
//                   }
//                   return hasPath(root.left,target-root.data)||  hasPath(root.right, target-root.data);
//       }
//     public static void main(String args[]){
//         Node root = new Node(3);
//         root.left = new Node(4);
//         root.left.left = new Node(5);
//         root.right.right = new Node(6);
//         root.left.left.left = new Node(7);
//         int target = 20;
//          System.out.print(hasPath(root,target));
         
//     }
// }
// // ..........................................  find  the diameter of the tree
// import java.util.*;
// public class programe{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//              this.data = data;
//              this.left = null;
//              this.right = null;
//         }
        
//     }
//     public static int diameter = 0;
//     public static int findDiameter(Node root){
//            height(root);
//            return diameter;
//     }
//     public static int height(Node root){
//            if(root==null){
//               return  0;
//            }
//            int left = height(root.left);
//            int right = height(root.right);
//            diameter = Math.max(diameter,left+right);
//            return  Math.max(left,right)+1;
//     }
//      public static void main(String args[]){
//          Node root = new Node(1);
//          root.left = new Node(2);
//          root.right = new Node(3);
//          root.left.left = new Node(4);
//          root.right.right = new Node(5);
//           System.out.print(findDiameter(root));
         

//      }
// }

// import java.util.*;
// public class programe{
//     public static void main(String[] args) {
//            String str = "abcabcbb";
//            int n = str.length();
//            int max = 0;
//            int left=0;
//            Set<Character> set = new HashSet<>();
//            for(int right=0;right<n;right++){
//                  if(set.contains(str.charAt(right))){
//                         set.remove(str.charAt(left));
//                         left++;
//                  }
//                    set.add(str.charAt(right));
//                    max = Math.max(max,right-left+1);
//            }
//            System.out.print(max);
//     }
// }

// import  java.util.*;
// public  class programe{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//              this.data = data;
//              this.left = null;
//              this.right = null;
//         }
        
//     }
//     public static int  diameter =0;
//     public static int diameterHeight(Node root){
//         height(root);
//         return  diameter;
          
//     }
//     public static int height(Node root){
//            if(root==null){
//              return 0;
//            }
//            int leftHeight = height(root.left);
//            int rightHeight = height(root.right);
//            diameter  =  Math.max(diameter,leftHeight+rightHeight);
//              return Math.max(leftHeight,rightHeight)+1;
//     }
//     public static void main(String[] args) {
          
//     }
// }

//  diameter of the tree


// import java.util.*;
// public class programe{
//     public static class Pair{
//        int node;
//        int dist;
//        public Pair(int node,int dist){
//          this.node = node;
//          this.dist = dist;
//        }
//     }
//     public static void  helper(ArrayList<ArrayList<Pair>> graph,int V,int src){
//            int ans[] = new int[V];
//            PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
//            pq.add(new Pair(src,0));
//            Arrays.fill(ans,Integer.MAX_VALUE);
//            ans[src] = 0;
//            while(!pq.isEmpty()){
//                Pair curr = pq.poll();
//                int u = curr.node;
//                for(Pair nbr : graph.get(u)){
//                      int v = nbr.node;
//                      int wt = nbr.dist;
//                        if(ans[u]+wt<ans[v] &&  ans[v]!=Integer.MAX_VALUE){
//                                ans[v] = ans[u]+wt;
//                        }

//                }
                  
//            }
//            for(int a: ans){
//              System.out.print(a +"  ");
//            }


//     }
//     public static void main(String args[]){
           
//     }
// }
// .....................................    Dijkstra algorithm


// import java.util.*;
// public class programe{
//     public static class Pair{
//         int node;
//         int dist;
//         public Pair(int node,int dist){
//               this.node = node;
//               this.dist = dist;
//         }
//     }
//     public  static class Edge{
//           int u;
//           int v;
//           int wt;

//         public Edge(int u,int v,int wt) {
//             this.u = u;
//             this.v = v;
//             this.wt = wt;

//         }
      
//     }
//       public static void helper(ArrayList<ArrayList<Pair>>graph,int v,int src){
//             int distance[] = new int[v];
//             Arrays.fill(distance,Integer.MAX_VALUE);
//             PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
//                pq.add(new Pair(src,0));
//                 distance[src] = 0;
//                  while(!pq.isEmpty()){
//                       Pair p = pq.poll();
//                         int node = p.node;
//                           for(Pair curr: graph.get(node)){
//                                 int newDistance = p.dist+p.dist;
//                                  if(distance[curr.node]>newDistance){
//                                           distance[curr.node] = newDistance;
//                                           pq.add(new Pair(curr.node,newDistance));
//                                  }
                                
//                           }
                      
//                  }
         
//       }
//     public static void main(String[] args) {

          
//     }
// }
//     ..................................................

// // ........................................... Dijkstra Algorithm
// import java.util.*;tt
// public class programe{
//     public static class Pair{
//         int node;
//         int dis;
//         public Pair(int node,int dis){
//               this.node = node;
//               this.dis = dis;

//         }
//     }
//     public static class Edge{
//         int u;
//         int v;
//         int dis;
//         public Edge(int u,int v,int dis){
//               this.u = u;
//               this.v = v;
//               this.dis = dis;
//         }
//     }
//     public  static void shortestPath(ArrayList<ArrayList<Pair>> graph,int v,int src){
//         int distance[] = new int[v];
//          Arrays.fill(distance,Integer.MAX_VALUE);
//          distance[src] = 0;
//          PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dis-b.dis);
//          pq.add(new Pair(src,0));
//          while(!pq.isEmpty()){
//               Pair p = pq.poll();
//                int node  = p.node;
//                   for(Pair curr : graph.get(node)){
//                          int newDis = curr.dis+p.dis;
//                           if(newDis<distance[curr.dis]){
//                                 distance[curr.dis] = newDis;
//                                 pq.add(new Pair(curr.node,newDis));
//                           }
                           
//                   }

//          }
         
             
//     }
//     public static void main(String[] args) {
         
//     }
// }



// import java.util.*;
// public class programe{
//     public static void helper(char board[][],int i,int j){
//             if(i<0  || j<0 || i>=board.length  || j>=board[0].length || board[i][j]=='0'){
//                       return;
//             }
//             board[i][j] = '0';
//             helper(board,i+1,j);
//             helper(board,i-1,j);
//             helper(board,i,j+1);
//             helper(board,i,j-1);
//     }
//     public static void dfs(){
//         char board[][] = new char[5][6];
//         for(int i=0;i<board.length;i++){
//               for(int j=0;j<board[0].length;j++){
//                     if(board[i][j] =='1'){
//                            helper(board, i, j);
//                     }
//               }
//         }
//     }
//     public static void main(String args[]){
//         //       number of island

//     }
// }

// import  java.util.*;
// public static class programe{
//     public static void jump(int nums[]){
//           int newJump = 0;
//           int end =0;
//           int aage =0;
//           for(int i=0;i<nums.length;i++){
//                 aage = Math.max(aage,nums[i]+i);
//                 if(i==end){
//                       newJump++;
//                       end = aage;
//                 }
//           }
//           System.out.print(newJump);
          
//     }
//     public static void main(String args[]){
//         int nums[] = {1,3,5,2,1};
//         jump(nums);
           
//     }
// }

// // ..................................................  number of island
// import java.util.*;
// public class programe{
//      public static void dfs(char grid[][],int i,int j){
//               if(i<0  || j<0 || i>=grid.length ||  j>=grid[0].length || grid[i][j]=='0'){
//                     return ;
//               }
//                grid[i][j] = '0';
//               dfs(grid,i+1,j);
//               dfs(grid,i,j+1);
//               dfs(grid,i-1,j);
//               dfs(grid,i,j-1);

//      }
//     public static int numIsland(char grid[][]){
//          int count=0;
//          for(int i=0;i<grid.length;i++){
//               for(int j=0;j<grid[0].length;j++){
//                      if(grid[i][j]=='1'){
//                           dfs(grid,i,j);
//                           count++;
//                      }
//               }
//          }
//          return count;

//     }
//     public static void main(String args[]){

//     }
// }

// import java.util.*;
// public class programe{
//     public static class pair{
//           int node;
//           int dis;
//            public pair(int node,int dis){
//                this.node = node;
//                this.dis = dis;
//            }
//            public static class Dijkstra{
//             public static void Dijkstra(int v,ArrayList<ArrayList<pair>> graph,int src){
//                   int distance[] = new int[v];
//                   Arrays.fill(distance,Integer.MAX_VALUE);
//                   PriorityQueue<pair>  pq = new PriorityQueue<>((a,b)->a.dis-b.dis);
//                      distance[src] = 0;
//                      pq.add(new pair(src,0));
//                      while(!pq.isEmpty()){
//                           pair p = pq.poll();
//                           int node = p.node;
//                            for(pair curr : graph.get(node)){
//                                int newDis = p.dis+curr.dis;
//                                if(newDis<distance[curr.node]){
                                    


//                                }
//                            }
//                      }


                  


                  
//             }
//            }
//     }
//     public static void main(String args[]){

//     }
// }

// import java.util.*;
// public class programe{
//     public static class Edge{
//         int u;
//         int v;
//         int wt;
//         public Edge(int u,int v,int wt){
//              this.u = u;
//              this.v = v;
//              this.wt = wt;
//         } 
//     }
//     public static class BellmanFord{
//           public static void BellmanFordAlgo(int v,ArrayList<Edge>Edges,int src){
//                  int dis[] = new int[v];
//                  Arrays.fill(dis, Integer.MAX_VALUE);
//                   dis[src] = 0;
//                   for(int i=0;i<v;i++){
//                      for(Edge e : Edges){
//                          if(dis[e.u]!=Integer.MAX_VALUE  && dis[e.u]+e.wt<dis[e.v]){
//                                       dis[e.v] = dis[e.u]+e.wt;
//                          }
//                      }
//                   }
//                    for(Edge e: Edges){
//                        if(dis[e.u]+e.wt <dis[e.v] &&  dis[e.u]!=Integer.MAX_VALUE){

//                                 System.out.print("Negative cycle");
//                                 return;
//                        }
//                    }

//                    for(int i:dis){
//                        System.out.print(i +" ");
//                    }

             
//           }
//     }
//     public static void main(String args[]){
          
//     }
// }

// .................................................    Bellman ford algorithm


// // .............................................
// import java.util.*;
// public static class programe{
//     public  class Pair{
//         int node;
//         int weight;
//         public Pair(int node,int weight){
//               this.node = node;
//               this.weight = weight;
//         }
//     }
//     public  class Prim{
//           public   void primsAlgo(ArrayList<ArrayList<Pair>> list,int v){
//                boolean vis[] = new boolean[v];
//                PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.weight-b.weight);
//                 pq.add(new Pair(0,0));
//                 int total =0;
//                 while(!pq.isEmpty()){
//                           Pair p = pq.poll();
//                           if(vis[p.node])  continue;
//                           vis[p.node] = true;
//                           total  += p.weight;
//                           for(Pair curr : list.get(p.node)){
//                                    if(!vis[curr.node]){
//                                         pq.add(new Pair(curr.node,curr.weight));
//                                    }
//                           }

//                 }
//                 System.out.print(total);
               


//           }
//     }
//     public static void main(String args[]){
          
//     }
// }



// import  java.util.*;
// public class programe{
//     public static class Edge{
//         int wt;
//         int src;
//         int des;
//         Edge(int wt,int src,int des){
//               this.wt = wt;
//               this.src = src;
//               this.des = des;
//         }
//     }
//     public  static void dfs(ArrayList<Edge>graph[],boolean vis[],int curr){
//             vis[curr] = true;
//              System.out.print(curr);
//             for(Edge e : graph[curr]){
//                      if(!vis[e.des]){
//                             dfs(graph,vis,e.des);
//                      }
//             }
            
//     }
//     public static boolean hasCycle(ArrayList<Edge>graph[],int v){
//         boolean vis[] = new boolean[v];
//           for(int i=0;i<v;i++){
//                  if(vis[i]!=true){
//                         if(cycleDetection(graph,vis,-1,i)){
//                               return true;
//                         }
//                  }
//           }
//           return false;
//     }
//     public static boolean cycleDetection(ArrayList<Edge>graph[],boolean vis[],int parent,int current){
//                  vis[current] = true;
//                  for(int node: graph[current]){
//                       if(!vis[node]){
//                           if(cycleDetection(graph, vis, current, node)){
//                                 return true;
//                           }
//                       }else if(node!=parent){
//                              return true;
//                       }
//                  }
//                  return false;
//     }
//     public static void topoSort(ArrayList<Integer>list[],int v){
//            int indegree[] = new int[v];
//             for(int i=0;i<v;i++){
//                   for(int curr: list[i]){
//                        indegree[curr]++;
//                   }
//             }
//             Queue<Integer> q = new LinkedList<>();
//             for(int i=0;i<indegree.length;i++){
//                   if(indegree[i]==0){
//                         q.add(i);
//                   }
//             }
//             while(!q.isEmpty()){
//                   int curr = q.poll();
//                    System.out.print(curr);
//                    for(int node: list[curr]){
//                           indegree[node]--;
//                           if(indegree[node]==0){
//                                q.add(node);
//                           }
//                    }
//             }

//     }
    //  public static void topoSort(int v,ArrayList<Edge>list[]){
    //         int indegree[] = new int[v];
    //         //   calculate the indgree
    //         for(int i=0;i<v;i++){
    //               for(int j : list[i]){
    //                     indegree[j]++;
    //               }
    //         }
    //         Queue<Integer> q = new LinkedList<>();
    //         for(int i: indegree){
    //               if(i==0){
    //                    q.add(i);
    //               }
    //         }
    //         while(!q.isEmpty()){
    //               int removed = q.poll();
    //                   System.out.print(removed);
    //                   for(int nbr:list[removed]){
    //                        indegree[nbr]--;
    //                        if(indegree[nbr]==0){
    //                            q.add(nbr);
    //                        }
    //                   }
                      
    //         }
    //  }
//     public static void main(String args[]){
          
//     }
// }
// ................................................  max sum subarray


// ......................................................
// import  java.util.*;
// public class programe{
//     public static boolean isPalindrome(String s){
//                 int i=0;
//                 int n = s.length();
//                 int j=n-1;
//                 while(i<j){
//                       if(s.charAt(i)!=s.charAt(j)){
//                             return false;
//                       }
//                       i++;
//                       j--;
//                 }
//                 return true;
//     }
//     public static void main(String args[]){
//           String s = "madam";
//           System.out.print(isPalindrome(s));

//     }
// }
//   check the palindrome

//          int nums[] = {1,2,3,4,5};
//          int n  = nums.length;
//          int left =0;
//          int right = n-1;
//          while(left<right){
//                int temp = nums[left];
//                nums[left]  = nums[right];
//                 nums[right] = temp;
//                 left++;
//                 right--;
//          }
//          for(int num:nums){
//              System.out.print(num);
//          }
//     }
// }


// import java.util.*;
// public class programe{
//     public static int[] helper(){
//          int nums[] = new int[]{1,3,4,5,7};
//          int target = 12;
//          HashMap<Integer,Integer> map = new HashMap<>();
//          for(int i=0;i<nums.length;i++){
//               int diff = target-nums[i];
//                 if(map.containsKey(diff)){
//                        return new int[]{map.get(diff),i};
//                 }
//                  map.put(nums[i],i);
//          }
//          return new int[]{-1,-1};
//     }
//     public static void main(String args[]){
          

         
//     }
// }


// //     flattern tree into the linked list
// import  java.util.*;
// public class programe{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
        
//     }
//     public static void flattern(Node root){
//           Node curr = root;
//           while(curr!=null){
//                  if(curr.left!=null){
//                       Node prev = curr.left;
//                       while(curr.right!=null){
//                             curr = curr.right;
//                       }
//                       prev.right = curr.right;
//                       curr.right =  curr.left;
//                       curr.left = null;
//                  }
//                    curr  = curr.right;
                 
//           }
//     }
//     //  binary tree to double linked list
//      public static class BinaryToLinked{
//            Node prev = null;
//            Node head = null;
//            public static  Node inOrder(Node root){
//                    inOrder(root);
//                    return head;
//            }
//            public 

//      }
//     public static void main(String[] args) {
           
//     }
// }




// import java.util.*:
// public class programe{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//              this.data = data;
//              this.left = null;
//              this.right = null;
//         }
        
//     }
//     public static boolean isLeaf(Node root){
//              return (root.left==null)&&(root.right==null);
//     }
//     public static void leftOrder(Node root,ArrayList<Integer> list){
//            Node curr = root.left;
//              while(curr!=null){
//                    if(!isLeaf(curr)){
//                         list.add(curr.data);  
//                    }
//                    if(curr.left!=null){
//                           curr = curr.left;
//                    }
//                    else{
//                       curr = curr.right;
//                    }
//              }       
//     }
//     public static void rightOrder(Node root,ArrayList<Integer>list){
//               Node curr = root;
//               Stack<Integer> st = new Stack<>();
//               while(curr!=null){
//                      if(!isLeaf(curr)){
//                           st.add(curr.data);
//                      }
//                      if(curr.right!=null){
//                                curr  = curr.right;
//                      }else{
//                           curr = curr.left;
//                      }
//               }
//               while(!st.isEmpty()){
//                     int val = st.pop();
//                       list.add(val);
//               }
//     }
//     public static void addLeaves(Node root,ArrayList<Integer> list){
//              if(isLeaf(root)){
//                   list.add(root.data);
//                   return;  
//              }
//              if(root.left!=null){
//                    addLeaves(root.left, list);
//              }
//              if(root.right!=null){
//                   addLeaves(root.right, list);
//              }
//     }
//     public static void boundryLevel(Node root,ArrayList<Integer>list){
//                   if(!isLeaf(root)){
//                         list.add(root.data);
//                   }
//                   leftOrder(root, list);
//                   addLeaves(root,list);
//                   rightOrder(root, list);
                  

                  
//     }
//     public static void main(String args[]){
          
//     }
// }



// import java.util.*;
// public  class  programe{
//      public static class Node{
//           int data;
//           Node left;
//           Node right;
//           public Node(int data){
//                   this.data = data;
//                   this.left = null;
//                   this.right = null;
//           }
//      }
//      public static class pair{
//            Node node;
//            int index;
//            public pair(Node node,int index){
//                  this.node = node;
//                  this.index = index;
//            }
//      }
//      public static void maxWidth(Node root){
//              if(root==null){
//                  return;
//              }
//              Queue<pair> q = new LinkedList<>();
//              q.add(new pair(root,0));
//              int maxWidth =0;
//              while(!q.isEmpty()){
//                    int size = q.size();
//                    int index = q.peek().index;
//                    int first =0;
//                    int last =0;
//                    for(int i=0;i<size;i++){
//                        pair p = q.poll();
//                        int currentIndex = p.index-index;
//                        if(index==0){
//                           first = currentIndex;
//                        }
//                        if(index==size-1){
//                            last  =  currentIndex;
//                        }

//                        if(p.node.left!=null){
//                              q.add(new pair(p.node.left,2*currentIndex+1));
//                        }
//                        if(p.node.right!=null){
//                            q.add(new pair(p.node.right,2*currentIndex+2));
//                        }
//                    }
//                    maxWidth =  Math.max(maxWidth,last-first+1);
//              }
//                System.out.print(maxWidth);

//      }
//      public static void main(String args[]){
//           Node root = new Node(1);
//           root.left = new Node(2);
//           root.left.left = new Node(3);
//           root.left.right = new Node(4);
//           root.left.left.right = new Node(5);
           
          
//      }
// }




// .................................................  
// import  java.util.*;
// public class programe{
//      public static  class Node{
//          int data;
//          Node left ;
//          Node right;
//          Node(int data){
//               this.data = data;
//               this.left = null;
//               this.right = null;
//          }
//      }
//        public static class pair{
//             Node node;
//             int hd;
//             pair(Node node,int hd){
//                   this.node = node;
//                   this.hd = hd;
//             }

//        }
//        public static void topView(Node root){
//             if(root==null){
//                   return;
//             }
//             Queue<pair> q = new LinkedList<>();
            

//        }

//      public  static void leftView(Node root){
//                 if(root==null){
//                        return ;
//                 }
//                 Queue<Node> q = new LinkedList<>();
//                 q.add(root);
//                 while(!q.isEmpty()){
//                       int size = q.size();
//                       for(int i=0;i<size;i++){
//                            Node curr = q.poll();
//                            if(i==0){
//                                System.out.print(curr.data +"  ");
//                            }
//                            if(curr.left!=null){
//                                 q.add(curr.left);
//                            }
//                            if(curr.right!=null){
//                                q.add(curr.right);
//                            }

//                       }
//                 }
          
//      }
       
//     public static void main(String[] args) {
//         Node  root = new Node(3);
//         root.left  = new Node(1);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.left.left.left = new Node(6);
//         root.right.right.right = new  Node(7);
//         leftView(root);
          
//     }
// }


// // ........................................    Zig zag travesal
// import  java.util.*;
// public  class programe{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data0) {
//              this.data = data;
//              this.left = null;
//              this.right = null;
//         }
        
//     }
//     public static class ZigZag{
//           public static void zigzagTravesal(Node root){
//                if(root==null){
//                      return ;
//                }
//                Queue<Node> q = new LinkedList<>();
//                q.add(root);
//                  boolean left = true;
//                  while(!q.isEmpty()){
//                       int size = q.size();
//                       ArrayList<Integer> list = new ArrayList<>();
//                        for(int i=0;i<size;i++){
//                                Node curr = q.poll();
//                                if(left){
//                                     list.add(curr.data);
//                                }else{
//                                   list.add(0,curr.data);
//                                }
//                                if(curr.left!=null){
//                                    q.add(curr.left);
//                                }if(curr.right!=null){
//                                    q.add(curr.right);
//                                }
//                                System.out.print(list);
//                                left = !left;
//                        }
//                     }
//           }
//           public static void MaxLevel(Node root){
//                   if(root==null){
//                        return;
//                   }
//                   Queue<Node> q = new LinkedList<>();
//                   q.add(root);
//                     while(!q.isEmpty()){ 
//                          int size = q.size();
//                          int max = Integer.MIN_VALUE;
//                           for(int i=0;i<size;i++){
//                                 Node curr = q.poll();
//                                  max = Math.max(curr.data,max);
//                                  if(curr.left!=null){
//                                        q.add(curr.left);
//                                  }if(curr.right!=null){
//                                         q.add(curr.right);
//                                  }

//                           }
//                           System.out.print(max);
//                     }
//           }
//     }
//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.right = new Node(4);
//         root.right.right = new Node(5);
//         root.left.left.left = new Node(6);
//         if(root==null){
//                        return;
//                   }
//                   Queue<Node> q = new LinkedList<>();
//                   q.add(root);
//                     while(!q.isEmpty()){ 
//                          int size = q.size();
//                          int max = Integer.MIN_VALUE;
//                           for(int i=0;i<size;i++){
//                                 Node curr = q.poll();
//                                  max = Math.max(curr.data,max);
//                                  if(curr.left!=null){
//                                        q.add(curr.left);
//                                  }if(curr.right!=null){
//                                         q.add(curr.right);
//                                  }

//                           }
//                           System.out.print(max);
//                     }
       

           
//     }
// }



// import java.util.*;
// public class programe{
//     public static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//              this.data = data;
//                this.left = null;
//                this.right =null;
//           }
//     }
//     public static void main(String args[]){
//         Node 
          
//     }
// }


// ....................................................... Preorder Treavesal
// public class  programe{
//     public  static class Node{
//            int data;
//            Node left;
//            Node right;
//            public Node(int data){
//               this.data = data;
//               this.left = null;
//               this.right = null;
//            }
//            public  static int index=-1;
//            public static  Node BinaryTree(int nodes[]){
//                 index++;
//                 if(nodes[index]==-1  || index==nodes.length-3){
//                       return null;
//                 }
//                 Node newNode = new Node(nodes[index]);
//                 newNode.left = BinaryTree(nodes);
//                 newNode.right  = BinaryTree(nodes);
//                 return  newNode;

//            }
//     }
//     public static void main(String[] args) {
//              int nodes[] = {1,2,3,-1,-1,3,5,-1,-1,4,2,-1,-1};
//              Node root = new Node(nodes[0]);
//               Node root1  =  root.BinaryTree(nodes);
//                System.out.print(root1.data);


//     }
// }
// .............................................    build tree from the preOrder Travesal

// import java.awt.geom.CubicCurve2D;

// // ..................................................   create the Trie Data structure
// public class programe{
//     public static class Node{
//         Node children[] = new Node[26];
//         boolean end = false;

//         public Node() {
//             for(int i=0;i<26;i++){
//                     children[i] = null;
//             }
//         }
//         public static Node root = new Node();
//         public static void insert(String word){
//                Node curr =  root;
//                for(int i=0;i<26;i++){
//                     int index = word.charAt(i)-'a';
//                     if(curr.children[index]==null){
//                               curr.children[index] = new Node();
//                     }
//                     curr = curr.children[index];
//                }
//                curr.end = true;
//         }
//         public  static boolean search(String word){
//                  Node curr = root;
//                  for(int i=0;i<word.length();i++){
//                         int index =word.charAt(i)-'a';
//                         if(curr.children[index]==null){
//                             return false;
//                         }
//                  }
//                  return curr.end = true;
//         }
             
//     }
//     public static boolean wordBreak(String key){
//           if(key.length()==0){
//               return  true;
//           }
//              for(int i=1;i<key.length();i++){
//                   if(search(key.substring(0,i)) &&   wordBreak(key.substring(i))){
//                        return true;
//                   }
//              }
//              return false;
//     }
//     public static void main(String args[]){
//          String str[] = {"i","like","sam","samsung","mobile","ice"};
//          int n = str.length;
//          for(int i=0;i<n;i++){
//              insert(str[i]);
//          }

//           String key  = "ilikesamsung";
        



        
//     }
// }






// import java.util.*;
// public class programe{
//       public  static class Node{
//           int data;
//           Node left;
//           Node right;
//           public Node(int data){
//               this.data = data;
//               this.left = null;
//               this.right = null;
//           }
//       }
//       public static Node createTrees(){
//               Node head = new Node(2);
//               head.left = new Node(3);
//               head.left.left = new Node(5);
//               head.right.right = new Node(6);
//               head.left.right = new Node(7);
//               head.right.left = new Node(8);
//                return   head;
//       }
//   public static void main(String args[]){
//             createTrees();
                  
//   }
// }
//    create the binary treess  

// ....................................................


// import  java.util.*;
// public class programe{
//     public static class Edge{
//         int src;
//         int des;
//         int wt;
//         public Edge(int src,int des,int wt){
//                this.src = src;
//                this.des = des;
//                this.wt = wt;
//         }
//     }
//       public static void createGraph(ArrayList<Edge>list[]){
//                for(int i=0;i<list.length;i++){
//                   list[i] = new ArrayList<>();
//                }
//                list[1].add(new Edge(1,2,3));
//                list[0].add(new Edge(2,1,3));
//                list[0].add(new Edge(4,1,2));
//                list[2].add(new Edge(1,4,2));
//                list[3].add(new Edge(3,2,1));
//       }
//         public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
//                   vis[curr] = true;
//                     System.out.print(curr +" ");
//                       for(Edge e : graph[curr]){
//                               if(vis[e.des]!=true){
//                                       dfs(graph,e.des,vis);
//                               }
//                       }
//         }
//     public static void main(String args[]){
//           ArrayList<Edge>graph[] = new ArrayList[5];
//           createGraph(graph);
//             for(int i=0;i<graph.length;i++){
//                      System.out.print(i +" ->");
//                       for(Edge e : graph[i]){
//                               System.out.print(e.des +"  ");
//                       }
//                       System.out.println();
//             }
//             boolean vis[] = new boolean[5];
//             dfs(graph, 0, vis);

          
//     }
//      public  static boolean  cycleDetect(ArrayList<Edge>graph[],int curr,int parent,boolean vis[]){
//                           vis[curr] = true;
//                         //     Traverse on the neighbour
//                         for(Edge e : graph[curr]){
//                               int neighbour = e.des;
//                               if(!vis[neighbour]){
//                                   if(cycleDetect(graph, neighbour, curr, vis)){
//                                        return true;
//                                   }
//                               }else{
//                                     if(neighbour!=parent){
//                                          return  true;
//                                     }
//                               }
//                         }
//                         return false;
//     }
// }

// import  java.util.*;
// public class programe{
//     public static class Edge{
//          int src;
//          int des;
//          int wt;
//          public Edge(int src,int des,int wt){
//               this.src = src;
//               this.des = des;
//               this.wt = wt;
//          }
//     }
//     public static void dfs(int src,boolean  vis[], ArrayList<Edge> list[]){
//           System.out.print(src);
//             vis[src] = true;
           
//              for(Edge e : list[src]){
//                    if(!vis[e.des]){
//                         dfs(e.des , vis, list);
//                    }
//              }
                
//     }
//     public static boolean cycleDetect(int src,int parent,boolean  vis[],ArrayList<Edge>list[]){
//              vis[src] = true;
//               System.out.print(src);
//               for(Edge e : list[src]){
//                       if(!vis[e.des]){
//                            if(cycleDetect(e.des,src,vis,list)){
//                            return  true;
//                       }
//                       }else if(e.des!=parent){
//                               return  true;
//                       }
//               }
//               return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Edge>list[] = new ArrayList[5];
//         for(int i=0;i<5;i++){
//             list[i] =  new ArrayList<>();
//         }
//         list[0].add(new Edge(1,3,4));
//         list[1].add(new Edge(1,5,3));
//         list[3].add(new Edge(1,3,2));
//         list[2].add(new Edge(4,2,1));
//         list[2].add(new Edge(1,5,7));
//         for(int  i=0;i<list.length;i++){
//                for(Edge e : list[i]){
//                      System.out.print(i +"   " + e.src +"   " +  e.des);

//                }
//         }
//         boolean  vis[] = new boolean[5];
//         dfs(0,vis,list);
           
//     }
// }

// import java.util.*;
// public  class programe{
//     public static class Edge{
//         int src;
//         int des;
//         int wt;
//         public Edge(int src,int des,int wt){
//               this.src = src;
//               this.des = des;
//               this.wt = wt;
//         }
//     }
//      public static boolean isCycle(int src,int parent,boolean vis[]){
//         ArrayList<ArrayList<Edge>> list = new ArrayList<>();
//             vis[src] = true;
//             for(Edge e : list.get(src)){
//                       if(!vis[e.des]){
//                              if(isCycle(parent,e.des,vis)){
//                                    return true;
//                              }
//                              else{
//                                     if(src!=parent){
//                                             return true;
//                                     }
//                              }
//                       }
//             }

//      }
//     public  static void main(String args[]){
          
//     }
// }
//   cycle detection in undirected graph


// //  ............................................ Number of the island
// import  java.util.*;
// public class programe{
//     public static void dfs(char board[][],int i,int j){
//                 if(i<0 || j<0  || i>=board.length || j>=board[0].length || board[i][j]=='0'){
//                          return ;  
//                 }
//                 board[i][j] ='0';
//                 dfs(board,i+1,j);
//                 dfs(board,i-1,j);
//                 dfs(board,i,j+1);
//                 dfs(board,i,j-1);
//     }
//     public static void helper(char board[][]){
//          int count=0;
//            for(int i=0;i<board.length;i++){
//               for(int j=0;j<board[0].length;j++){
//                      if(board[i][j]=='1'){
//                             count++;
//                             dfs(board,i,j);
//                      }
//               }
//            }
//            System.out.print(count);

//     }
//     public static  void main(String args[]){
          
//     }
// }

// import  java.util.*;
// public class  programe{
//     public static void main(String args[]){
//           int nums[] = {1,1,1,2,2,3};
//           int n = nums.length;
//           int k=3;
//           HashMap<Integer,Integer> map = new HashMap<>();
//           for(int i=0;i<n;i++){
//               map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
//           }
//           int i=0;
//           int result[] = new int[k];
//            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
//              for(int num: map.keySet()){
//                     pq.add(num);
//                     if(pq.size()>k){
//                           pq.poll();

//                     }
//                     result[i++] = pq.peek();
//              }
//              for(int num: result){
//                   System.out.print(num);
//              }       
//     }
// }
// import java.util.*;
// public class  programe{
//     public static void main(String[] args) {
//            int nums[] = {3,4,5,1,2};
//            int n = nums.length;
//            int count=0;
//            int pivot =-1;
//            for(int i=n-2;i>=0;i--){
//                  if(nums[i]>nums[i+1]){
//                       pivot = nums[i];
//                       break;
//                  }
//            }
//            System.out.print(pivot);
//     }
// }
//   find the rotation in sorted rotated array
//  find the minimum value in the sorted rotated array

// ..................................................   

// import java.util.*;
// public class programe{
//       public static boolean helper( char board[][]){
//             int count=0;
//              for(int i=0;i<board.length;i++){
//                   for(int j=0;j<board[0].length;j++){
//                          if(board[i][j]=='1'){
//                              count++;
//                              dfs(board,i,j);

//                          }
//                   }
//              }
//              return count;
            
             
//       }
//       public static void dfs(char board[][],int i,int j){
//             if(i<0  || j<0  || i>=board.length ||  j>=board[0].length){
//                       return ;
//             }
//             board[i][j] = '0';
//             dfs(board,i-1,j);
//             dfs(board,i+1,j);
//             dfs(board,i,j-1);
//             dfs(board,i,j+1);

               
//       }
//     public static void main(String args[]){
      
         
//     }
// }

// // ...............................................   find the first bad version
// import  java.util.*;

// public class programe{
//       public  static boolean valid(int n){
//            int start =1;
//            int end = n;
//             while(start<end){
//                    int mid = start+(end-start)/2;
//                     if(valid(mid)){
//                          end = mid;   
//                     }else{
//                             start = mid+1;
//                     }
//             }
//                  System.out.print(left);
//                  return false;
//       }
//     public static void main(String args[]){
//         valid(5);
         
//     }
// }

// ...............................................  find the minimum in sorted rotated array
// import java.util.*;
// public class programe{
//     public static void  main(String args[]){
//             int nums[] = {3,4,5,1,2};
//             int n = nums.length;
//             int start=0;
//             int end = n-1;
//             while(start<end){
//                     int mid = start+(end-start)/2;
//                      if(nums[mid]>nums[end]){
//                            start = mid+1;
//                      }else{
//                           end = mid;
//                      }

//             }
//             System.out.print(nums[start]);
//     }
// }



// // ................................................................  find the minimum in sorted rotated array
// import  java.util.*;
// public class programe{
//     public static int findMin(int nums[],int start,int end){
//             Arrays.sort(nums);
//           int min = nums[0];
//             return min;
//     }
//     public static int partition(int nums[],int start,int end){
//         if(start<=end){
//                return  0;
//         }
//         int mid = start+(end-start)/2;
//         int leftMin = findMin(nums,start,mid);
//         int rightMin= findMin(nums,mid+1,end);
//         return Math.min(leftMin,rightMin);
          
//     }
//     public static void main(String[] args) {
//          int nums[] = {-2,5,6,7,-1,1,2,3};
//        int ans =   partition(nums,0,nums.length-1);
//         System.out.print(ans);
//     }
// }


// // .........................................   find the rotation in array
// import  java.util.*;
// public class programe{
//    public static void main(String[] args) {
//            int  nums[] = {4,5,6,7,0,1,2,3};
//            int n = nums.length-1;
//            int pivot = -1;
//            for(int i=n-1;i>=0;i--){
//                 if(nums[i]>nums[i+1]){
//                        pivot = i;
//                        break;
//                 }
//            }
//             System.out.print((pivot!=-1)?pivot+1:-1 );

//     }
// }

// import  java.util.*;
// public class programe{
//     public static void main(String[] args) {
//          int nums[] = {5,6,7,1,2,3,4};
//          int n = nums.length;
//         //       find the target in sorted rotated array
//        int target = 7;
//         int start=0;
//         int end = n-1;
//         while(start<=end){
//             int mid = start+(end-start)/2;
//                if(nums[mid]==target){
//                    System.out.print(mid);
//                    break;
//                }
//                if(nums[start]<=nums[mid]){
//                         if(nums[start]<=target  && target<nums[end]){
//                              end = mid-1;
//                         }else{
//                               start =mid+1;
//                         }
                 
//                }else{
//                      if(nums[mid]<target  && target<=nums[end]){
//                              start = mid+1;
//                      }else{
//                           end = mid-1;
//                      }
//                }
//         }
//     }
// }
// .............................................................. 


// // ......................................................................isomophich string
// import  java.util.*;
// public class programe{
//     public static boolean helper(String s,String t){
//           int n = s.length();
//           char ch1[] = s.toCharArray();
//           char ch2[] = t.toCharArray();
//           HashMap<Character,Character> map1 = new HashMap<>();
//           HashMap<Character,Character> map2 = new HashMap<>();
//           for(int i=0;i<n;i++){
//                 if(map1.containsKey(ch1[i])){
//                         if(map1.get(ch1[i])!=ch2[i]){
//                                 return  false;
//                         }
//                 }
//                 map1.put(ch1[i],ch2[i]);
//                 if(map2.containsKey(ch2[i])){
//                       if(map2.get(ch2[i])!=ch1[i]){
//                            return false;
//                       }
//                 }
//                 map2.put(ch2[i],ch1[i]);

//           }

//           return true;
//     }
//     public static void main(String args[]){
//          String s = "egg";
//          String t = "ado";
//          System.out.print(helper(s,t));
//     }
// }


// // ..................................................  Ranson Note
// import  java.util.*;
// public class programe{
//     public static boolean helper(){
//          String ransomNote = "a";
//            String magazine = "b";
//            int n = ransomNote.length();
//            int m = magazine.length();
//            HashMap<Character,Integer> map = new HashMap<>();
//            for(char ch :  magazine.toCharArray() ){
//                  map.put(ch,map.getOrDefault(ch, 0)+1);
//            }
//            for(char ch: ransomNote.toCharArray()){
//                         if(!map.containsKey(ch)){
//                               return false;
//                      }
//                      map.put(ch,map.get(ch)-1);
//                      if(map.get(ch)==0){
//                          map.remove(ch);
//                      }
//            }
//            return true;


//     }
//     public static void main(String[] args) {
          
//         System.out.print(helper());
           
//     }
// }

// .....................................................................................

// import  java.util.*;
// public class programe{
//      public static void helper(String s,int n){
//         HashMap<Character,Integer> map = new HashMap<>();
//            char c ='\0';
//            for(char ch :s.toCharArray()){
//                map.put(ch,map.getOrDefault(ch, 0)+1);
//            }
//            for(int i=0;i<n;i++){
//                 if(map.get(s.charAt(i))==1){
//                      c = s.charAt(i);
//                      break;
                        
//                 }
//            }
//            System.out.print(c +"  ");
           
//      }
//     public static  void main(String args[]){
//           String s = "loveleetcode";
//           int n = s.length();
//           helper(s,n);

//     }
// }
 
// ............................................................
// import java.util.*;
// public  class programe{
//     public static void main(String[] args) {
//           int nums1[] = {1,2,2,3,4};
//           int nums2[] = {2,2,3};
//           int n = nums1.length;
//           int m = nums2.length;
//           HashSet<Integer> set = new HashSet<>();
//           HashSet<Integer> result  = new HashSet<>();
//             for(int num : nums1){
//                    set.add(num);
//             }
//             for(int num : nums2){
//                    if(set.contains(num)){
//                       result.add(num);
//                    }
//                    set.add(num);
                   
//             }
//             for(int num: result){
//                   System.out.print(num);
//             }

//     }
// }
// ........................................  intersection 

// // ....................................................... top k frequent elemrnt in heap
// import  java.util.*;
// public  class programe{
//      public static int[] helper(int nums[],int k){
//             HashMap<Integer,Integer> map  = new HashMap<>();
//             for(int num: nums){
//                  map.put(num,map.getOrDefault(num,0)+1);
//             }
//             PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
//             for(int num : map.keySet()){
//                   pq.add(num);
//                   if(pq.size()>0){
//                        pq.poll();
//                   }
//             }
//             int result[] = new int[k];
//             int i=0;
//             while(!pq.isEmpty()){
//                   result[i++] = pq.poll();
//             }
//                return result;

//      }
//      public static void main(String args[]){
//            int nums[] = {1,1,1,2,2,3};
//            int n = nums.length;
//            int k=3;
//            int res[] = helper(nums,k);
//             System.out.print(Arrays.toString(res));
//      }
// }


// import java.util.*;

// public class programe{
//      public static int partition(int nums[],int low,int high){
//           int pivot = nums[high];
//           int i = low-1;
//           for(int j=low;j<high;j++){
//                    if(nums[j]<pivot){
//                       i++;
//                      int temp = nums[i];
//                      nums[i] = nums[j];
//                      nums[j] = temp;
//                    }
//           }
//           //  put the pivot at the correct postion
//           int temp = nums[i+1];
//           nums[i+1] = nums[high];
//           nums[high] = temp;
//           return i+1;

//      }
//      public static void QuickSort(int nums[],int low,int high){
//             if(low<high){
//                    int pi = partition(nums,low,high);
//                     QuickSort(nums,low,pi-1);
//                     QuickSort(nums,pi+1,high);

//             }
//      }
//      public static void main(String args[]){
//             int nums[] = {8, 3, 1, 7, 0, 10, 2};
//             int n = nums.length;
//             QuickSort(nums,0,n-1);
//             for(int num:nums){
//                  System.out.print(num +"  ");
//             }
//      }
// }
// .......................................................... quick sort




// import  java.util.*;

// public  class programe{
//     public  static class ListNode{
//         int val;
//         ListNode next;
//         ListNode random;
        
//         public ListNode(int val){
//               this.val = val;
//               this.next = null;
//               this.random = null;
//         }
//         public static void printList(ListNode head){
//            while(head!=null){
//                 System.out.print(head.val);
//                 head =head.next;
//            }
//     }
//     public static void insertRandomMap(HashMap<ListNode,ListNode> map ,ListNode head){
//               map.put(head, head.random);
//               ListNode temp = head.next;
//               while(temp!=null){
//                       map.put(temp,temp.random);
//                        temp = temp.next;
//               }
//     }
//      public static ListNode helper(ListNode head){
//              if(head==null){
//                   return null;
//              }
//              HashMap<ListNode,ListNode> map = new HashMap<>();
//              ListNode newHead = new ListNode(head.val);
//              ListNode oldTemp = head.next;
//              ListNode newTemp = newHead;
//              map.put(head,newHead);
//              while(oldTemp!=null){
//                     ListNode copy = new ListNode(oldTemp.val);
//                     map.put(oldTemp,copy);
//                     newTemp.next = copy;
//                     oldTemp = oldTemp.next;
//                     newTemp = newTemp.next;
//              }
//              newTemp = newHead;
//              oldTemp = head;
//              while(oldTemp!=null){
//                     newTemp.random = map.get(oldTemp.random);
//                     newTemp = newTemp.next;
//                     oldTemp = oldTemp.next;
//              }


//      }
   

//     }
    
//     public static void main(String[] args) {
//         ListNode head = new ListNode(1);
//         head.random = null;
//         head.next = new ListNode(2);
//         head.next.random = head;

//         head.next.next = new ListNode(3);
//         head.next.next.random = head.next.random;
        
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.random = head.next.next;
//         head.next.next.next.next = new ListNode(5);
//         // ListNode.printList(head);
//         ListNode.copyListWithRandomPointer(head);
//          ListNode.printList(head);
          
//     }
// }


// ........................................................................


// import  java.util.*;
// public class  programe{
//     public  static void main(String args[]){
//         int a[] = {1,3,4};
//         int b[] = {3,4,5};
//         int n1 = a.length;
//         int n2 = b.length;
//          ArrayList<Integer> list= new ArrayList<>();
//          int i=0;
//          int j=0;
       
//          while(i<n1  && j<n2){
//                 if(a[i]<=b[j]){
//                       list.add(a[i++]);
//                 }else{
//                       list.add(b[j++]);
//                 }
//          }
//          while(i<n1){
//                 list.add(a[i++]);
//          }
//          while(j<n2){
//               list.add(b[j++]);
//          }
//           for(int val : list){
//               System.out.print(val);
//           }
//     }
// }
// ................................................................. merge 2 sorted array


// import  java.util.*;
// public class programe{
//     public static class ListNode{
//         int val;
//         ListNode next;
//         public ListNode(int val){
//               this.val  = val;
//               this.next = null;
//         }
//         public static ListNode mergeList(ListNode lists[]){
//                 if(lists.length==0  || lists==null){
//                        return null;
//                 }
//                 PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
                 
//                  for(ListNode node : lists){
//                        if(node!=null){
//                             pq.add(node);
//                        }
//                  }
//                  ListNode dummy = new ListNode(0);
//                  ListNode tail =  dummy;
//                  while(!pq.isEmpty()){
//                         ListNode smallest =  pq.poll();
//                             tail.next =  smallest;
//                             tail = tail.next;
//                             if(smallest.next!=null){
//                                 pq.add(smallest.next);
                                  
//                             }
//                  }

//                   return   dummy.next;

//         }
//     }
//      public static void  createList(){
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(1);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
        
        
//      }
//     public static void main(String[] args) {
        
           
//     }
// }
// .............................................................  merge k sorted list


// ................................................................................


// import java.util.*;
// public class  programe{
//     public static void merge(int nums[],int start,int mid,int end){
//           int n1 = mid-start+1;
//           int n2 = end-mid;
//           int left[] = new int[n1];
//           int right[] = new int[n2];
//           for(int i=0;i<n1;i++){
//               left[i] = nums[start+i];
//           }
//           for(int j=0;j<n2;j++){
//                right[j] = nums[mid+1+j];
//           }
//           int i=0;
//           int j=0;
//           int k=start;
//           while(i<n1   && j<n2){
//                   if(left[i]<=right[j]){
//                        nums[k++]= left[i++];
//                   }else{
//                      nums[k++] = right[j++];
//                   }
//           }
//            while(i<n1){
//                 nums[k++] = left[i++];
//            }
//            while(j<n2){
//               nums[k++] = right[j++];
//            }
          

//     }
//     public static void mergeSort(int nums[],int start,int end){
//         if(start>=end){
//              return;
//         }
//         int mid = start+(end-start)/2;
//         mergeSort(nums,start,mid);
//         mergeSort(nums,mid+1,end);
//         merge(nums,start,mid,end);


        
//     }
//     public static void main(String args[]){
//           int nums[] = {38, 27, 43, 3, 9, 82, 10};
//           int n = nums.length;
//           mergeSort(nums,0,n-1);
//           System.out.print(Arrays.toString(nums));
//     }
// }



// import  java.util.*;
// public class programe{
//     public static void helper(int nums[],int i,int n,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list){
//            if(i==n){
//                 ans.add(new ArrayList<>(list));
//                 return;
//            }
//         //     take
//         list.add(nums[i]);
//         helper(nums,i+1,n,ans,list);
//         list.remove(list.size()-1);
//         helper(nums,i+1,n,ans,list);
//     }
//     public static void main(String args[]){
//         int nums[] = {1,2,3};
//         int n = nums.length;
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//         ArrayList<Integer> set = new ArrayList<>();
//         helper(nums,0,n,ans,set);
//         for(ArrayList<Integer> val: ans){
//                for(int v : val){
//                   System.out.print(v +" ");
//                }
//                System.out.println();
//         }
//     }
// }

// ..............................................................................   sub set problem

// public class programe{
//     public static void main(String args[]){
//          int nums[] = {3,4,5,6,7,0,1,2};
//          int n  = nums.length;
//           int start = 0;
//           int end = n-1;
//           int target=0;
//           int found = 0;
//           while(start<=end){
//              int mid  =  start+(end-start)/2;
//                 if(nums[mid]==target){
//                       found  = mid;
//                        break;
//                 }
//                 if(nums[start]<=nums[mid]){
//                         if(nums[start]<=target && target<=nums[end]){
//                                  end = mid-1;
//                         }
//                 }else{
//                            if(nums[mid]<=target  && target<=nums[end]){
//                                 start = mid+1;
//                            }
//                 }
//           }
//            System.out.print(found);
        
           
//     }
// }


// // ............................................................................   convert the linked list into the zigzag fashion

// import java.util.*;

// public class programe {

//     public static class ListNode {

//         int val;
//         ListNode next = null;

//         public ListNode(int val) {
//             this.val = val;
//             ListNode next = null;
//         }

//         public static void printList(ListNode head) {
//             while (head != null) {
//                 System.out.print(head.val);
//                 head = head.next;
//             }
//         }

//         public static void zigZagLinkedList(ListNode head) {
//             //   find the middle of the linked list
//             ListNode slow = head;
//             ListNode fast = head;
//             while (fast != null && fast.next != null) {
//                 slow = slow.next;
//                 fast = fast.next.next;
//             }
//             ListNode secondHalf = slow.next;
//             ListNode rightHead = reverseSecond(secondHalf);
//             ListNode leftHead = head;
//             ListNode newHead = leftHead;
//             ListNode nextLeft = null;
//             ListNode nextRight = null;
//             while (leftHead != null && rightHead != null) {
//                 nextLeft = leftHead.next;
//                 leftHead.next = rightHead;
//                 nextRight = rightHead.next;
//                 rightHead.next = leftHead;

//             }
//             printList(leftHead);

//         }

//         public static ListNode reverseSecond(ListNode head) {
//             ListNode prev = null;
//             ListNode curr = head;
//             while (curr != null && curr.next != null) {
//                 ListNode next = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = next;
//             }
//             return prev;
//         }
//     }

//     public static void main(String args[]) {
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.next = new ListNode(5);
//         ListNode.zigZagLinkedList(head);

//     }
// }

// // ............................................................  0 1 knapsack using the memoisation
// import java.util.*;
// public  class programe{
//       public static int helper(int val[],int wt[],int capacity,int n,int dp[][]){
//                 if(capacity==0  ||   n==0){
//                       return 0;
//                 }
//                 if(dp[n][capacity]!=-1){
//                      return   dp[n][capacity];
//                 }
//                 if(capacity>=wt[n-1]){
//                      int include = val[n-1]+helper(val,wt,capacity-wt[n-1],n-1,dp);
//                      int exclude = helper(val,wt,capacity,n-1,dp);
//                       dp[n][capacity]  = Math.max(include,exclude);
//                 }
//                 dp[n][capacity] = helper(val,wt,capacity,n-1,dp);
//                 return dp[n][capacity];
//       }
//       public  static void main(String args[]){
//             int val[] = {15,14,10,45,30};
//             int wt[] = {2,5,1,1,4};
//             int n = val.length;
//             int capacity = 7;
//             int dp[][] = new int[n+1][capacity+1];
//             for(int i=0;i<n;i++){
//                    for(int j=0;j<=dp[0].length;j++){
//                           dp[i][j] = -1;
//                    }
//             }
//             int ans = helper(val,wt,capacity,n,dp);
//             System.out.print(ans);
//       }
// }
// // .......................................................   0 1 Knapsack
// import  java.util.*;
// public class programe{
//       public static int knapsack(int val[],int wt[],int n,int capacity){
//                         if(capacity==0  || n==0){
//                                  return  0;
//                         }
//                         if(capacity>=wt[n-1]){
//                                 int include = val[n-1]+knapsack(val, wt, n-1, capacity-wt[n-1]);
//                                 int exclude = knapsack(val, wt, n-1, capacity);
//                                 return Math.max(include,exclude);
//                         }
//                         return knapsack(val, wt, n-1, capacity-wt[n-1]);
//       }
//       public static void main(String args[]){
//             int val[] = {15,14,10,45,30};
//             int wt[] = {2,5,1,3,4};
//             int n = val.length;
//             int capacity = 7;
//             int ans =   knapsack(val,wt,n,capacity);
//               System.out.print(ans);
//       }
// }
// // ............................................................   house robber
// public class programe{
//       public static int HouseRobber(int nums[]){
//             int  n = nums.length;
//               if(n==0){
//                     return  0;
//               }
//               if(n==1){
//                     return nums[0];
//               }
//               int dp[] = new int[n];
//               dp[0] = nums[0];
//               dp[1] = Math.max(nums[0],nums[1]);
//               for(int i=2;i<n;i++){
//                      dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
//               }
//               return dp[n-1];
//       }
//       public static void main(String[] args) {
//            int nums[] = {2, 7, 9, 3, 1};
//           int ans =  HouseRobber(nums);
//              System.out.print(ans);
//       }
// }
// // .............................................................................  DP questions 
// public  class  programe{
//       public static void main(String args[]){
//             int n = 10;
//               int dp[] = new int[n];
//               dp[0] = 0;
//               dp[1] = 1;
//               for(int i=2;i<n;i++){
//                     dp[i] = dp[i-1]+dp[i-2];
//               }
//               for(int num: dp){
//                     System.out.print(num +" ");
//               }
//       }
// }
// import  java.util.*;
// public  class programe{
//     public static class Edge{
//         int src;
//         int des;
//         int wt;
//         public Edge(int src,int des,int wt){
//              this.src = src;
//              this.des = des;
//              this.wt = wt;
//         }
//     }
//     public static void createGraph( ArrayList<Edge> list[]){
//           list = new ArrayList[10];
//          for(int i=0;i<10;i++){
//                list[i] = new ArrayList<>();
//          }
//          list[0].add(new Edge(0,1,2));
//          list[0].add(new Edge(0,2,1));
//          list[1].add(new Edge(1,3,9));
//          list[2].add(new Edge(2,4,5));
//          list[3].add(new Edge(3,4,1));
//          list[4].add(new Edge(4,5,8));
//          list[5].add(new Edge(5,6,2));       
//     }
//     public static void bfsTravelsal(){
//         ArrayList<Edge> list[] = new ArrayList[10];
//             createGraph(list);
//             boolean  vis[] = new boolean[10];
//               Queue<Integer> q = new LinkedList<>();
//                 while(!q.isEmpty()){
//                        int curr = q.poll();
//                         if(vis[curr]!=true){
//                                vis[curr] = true;
//                                  System.out.print(curr +"  ");
//                               for(int i=0;i<list[curr].size();i++){
//                                        Edge e = list[curr].get(i);
//                                        q.add(e.des);
//                               }
//                         }
//                 }       
//     }
//       public static void dfs(boolean vis[],int curr,ArrayList<Edge> graph[]){
//             System.out.print(curr);
//             vis[curr] = true;
//             for(int i=0;i<graph[curr].size();i++){
//                         Edge e =  graph[curr].get(i);
//                         if(vis[e.des]!=true){
//                                dfs(vis,e.des,graph);
//                         }
//             }
//       }
//       public static void bfs(ArrayList<Edge> list[],boolean vis[]){
//                     for(int i=0;i<list.length;i++){
//                                 if(vis[i]!=true){
//                                       bfsUtil(vis,list);
//                                 }  
//                    }
//       }
//     //   detect the cycle in undirected graph
//       public static void detectCycle(ArrayList<Edge>graph[]){
//              boolean vis[] = new boolean[graph.length];
//              for(int i=0;i<graph.length;i++){
//                    if(!vis[i]){
//                       dfsUtil(graph,vis,i,-1);
//                    }
//              }
//       }
//       public static boolean  dfsUtil(ArrayList<Edge>graph[],boolean  vis[],int curr,int parent){
//         vis[curr] = true;
//           for(int i=0;i<graph[curr].size();i++){
//                      Edge e =  graph[curr].get(i);
//                      if(!vis[e.des]  && dfsUtil(graph, vis, e.des, curr)){
//                              return true;
//                      }else if(vis[e.des]  && e.des!=parent){
//                             return true;
//                      }
//                      return false;
//           }
//       }
//     public static void main(String[] args) {
//         //   bfsTravelsal();
//         ArrayList<Edge> list[] = new ArrayList[10];
//         createGraph(list);
//         boolean vis[] = new boolean[10];
//         dfs(vis, 0, list);
//     }
// }
// // ..................................................... level order travesal
// import  java.util.*;
// public  class programe{
//     public static class TreeNode{
//         int val;
//         TreeNode left;
//         TreeNode right;
//          public TreeNode(int val){
//              this.val = val;
//              this.left = null;
//              this.right = null;
//          }
//     }
//      public static void levelOrder(TreeNode root){
//           if(root==null){
//               return ;
//           }
//            Queue<TreeNode> q = new LinkedList<>();
//            q.add(root);
//            while(!q.isEmpty()){
//                TreeNode curr = q.poll();
//                 System.out.print(curr.val +"  ");
//                 if(curr.left!=null){
//                          q.add(curr.left);
//                 }
//                 if(curr.right!=null){
//                         q.add(curr.right);
//                 }
//            }
//      }
//     public static void main(String[] args) {
//          TreeNode root = new TreeNode(1);
//          root.left = new TreeNode(2);
//          root.right = new TreeNode(3);
//          root.left.left = new TreeNode(4);
//          root.right.right = new TreeNode(5);
//          root.left.left.right = new TreeNode(6);
//          root.right.right.right = new TreeNode(7);
//          levelOrder(root);
//     }
// }
// import java.util.*;
// // .................................................................   create a graph
// public  class programe{
//     public static  class Edge{
//         int src;
//         int des;
//         int wt;
//         public Edge(int src,int des,int wt){
//               this.src = src;
//               this.des = des;
//               this.wt = wt;
//         }
//     }
//     public static void main(String args[]){
//           ArrayList<Edge>list[] = new ArrayList[10];
//           for(int i=0;i<10;i++){
//                list[i]  =  new ArrayList<>();
//           }
//           list[0].add(new Edge(0,2,3));
//           list[1].add(new Edge(2,3,9));
//           list[2].add(new Edge(3,1,0));
//           list[3].add(new Edge(3,1,5));
//     }
// }
// // ...................................................  Job sequencing problem
// import  java.util.*;
// public  class programe{
//     public static class Job{
//          int id;
//          int deadline;
//          int profit;
//        public  Job(int id,int deadline,int profit){
//               this.id = id;
//               this.deadline = deadline;
//               this.profit = profit;
//          }
//     }
//     public static void main(String args[]){
//           int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
//           int n = jobInfo.length;
//           ArrayList<Job> list = new ArrayList<>();
//           for(int i=0;i<n;i++){
//               list.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
//           }
//           Collections.sort(list,(a,b)->b.profit-a.profit);
//            int time=0;
//            ArrayList<Integer> ans = new ArrayList<>();
//            for(int i=0;i<n;i++){
//                  Job current = list.get(i);
//                  int currentTime = current.deadline;
//                  if(time<currentTime){
//                          ans.add(current.id);
//                          time++;
//                  }
//            }
//            for(int i=0;i<ans.size();i++){
//                System.out.print(ans.get(i) + "   ");
//            }
//         }
// } 
//............................................ change the lower case into the uppercase
// public  class  programe{`
//     public static void main(String[] args) {
//             String str = "anjali";
//             int pos =3;
//             char ch = 'A';
//             StringBuilder sb = new StringBuilder();
//                 int n =  str.length();
//                 for(int i=0;i<n;i++){
//                       if(i==pos){
//                             sb.append(ch);
//                       }else{
//                              sb.append(str.charAt(i));
//                       }
//                 }
//                  System.out.print(sb.toString());
//     }
// }
// .............................................. chnage  the first character  of the string into  the uppercase
// import  java.util.*;
// public  class  programe{
//     public static void main(String[] args) {
//             Integer coins[] = {2000,500,100,50,20,10,2,1};
//             int n = coins.length;
//             int change = 120;
//             ArrayList<Integer> list = new ArrayList<>();
//             int note=0;
//               for(int num : coins){
//                        while(change>=num){
//                           change -= num;
//                           note++;
//                           list.add(num);
//                        }
//               }
//               for(int num : list){
//                   System.out.print(num +"  ");
//               }
//     }
// }
// ...................................................................    indian coins
// // ....................................................................   max length chain pair
// import  java.util.*;
// public  class  programe{
//     public static void main(String[] args) {
//            int nums[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
//            int n = nums.length;
//            int m = nums[0].length;
//            int max = 1;
//             Arrays.sort(nums,Comparator.comparingDouble(o->o[1]));
//           int intial = nums[0][1];
//            for(int i=1;i<n;i++){
//                 int finalValue  = nums[i][0];
//                 if(intial<=finalValue){
//                        max++;
//                        intial = nums[i][1];
//                 }
//            }
//             System.out.print(max);
//     }
// }
// import  java.util.*;
// // .........................................................    min absolute difference
// public  class programe{
//     public static   void main(String args[]){
//         int a[] = {1,2,3};
//         int b[] = {1,2,3};
//          Arrays.sort(a);
//          Arrays.sort(b);
//          int min = Integer.MAX_VALUE;
//          int n = a.length;
//          for(int i=0;i<n;i++){
//                int diff = Math.abs(a[i]-b[i]);
//                min = Math.min(min,diff);
//          }
//           System.out.print(min);
//     }
// }
// import  java.util.*;
// // ....................................................  fractional knapsack
// public  class programe{
//     public static void main(String[] args) {
//           int val[] = {60,100,120};
//           int wt[] = {10,20,30};
//           int w = 50;
//           int n = val.length;
//           double ratio[][] = new double[val.length][2];
//           for(int i=0;i<n;i++){
//                   ratio[i][0] = i;
//                   ratio[i][1] =val[i]/(double)wt[i];
//           }
//              Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
//           int finalVal = 0;
//           int capacity  = w;
//           for(int i=n-1;i>=0;i--){
//                int index = (int)ratio[i][0];
//                if(capacity>=wt[index]){
//                       finalVal +=val[index];
//                       capacity -= wt[index];
//                }else{
//                         finalVal += (ratio[i][1]* capacity);
//                         capacity = 0;
//                }
//           }
//           System.out.print(finalVal);
//     }
// }
// public  class programe{
//     public static void main(String args[]){
//          int nums[]  = {1,2,3,4,5,6};
//          int  n = nums.length;
//          int k=3;
//          while(k!=0){
//              int temp = nums[n-1];
//              for(int i=n-2;i>=0;i--){
//                    nums[i+1] = nums[i] ;
//                    if(i==0){
//                        nums[0] = temp;
//                    }
//              }
//              k--;
//          }
//          for(int num: nums){
//               System.out.print(num);
//          }
//     }
// }
// ......................................................  rotate the array by k
// .........................................................  single element 
// import  java.util.*;
// public  class  programe{
//     public static void main(String[] args) {
//           int nums[] = {5,8};
//           int n = nums.length;
//           int ans = 0;
//           for(int i=0;i<n;i++){
//              ans  ^= nums[i];
//           }
//           System.out.print(ans);
//     }
// }
// import  java.util.*;
// public  class programe{
//     public  static void main(String args[]){
//         int nums[] = {2,1,5,6,2,3};
//         int n = nums.length;
//         Stack<Integer> st = new Stack<>();
//         int right[] = new int[n];
//         for(int i=n-1;i>=0;i--){
//               while(!st.isEmpty()  &&  nums[st.peek()]>nums[i]){
//                    st.pop();
//               }
//               right[i] = st.size()==0?-1 : st.peek();
//               st.add(i);
//         }
//           for(int i=0;i<n;i++){
//               System.out.print(right[i] +"  ");
//           }
//     }
// }
// // .......................................................  find the missing and the repeated element
// public  class programe{
//     public   static  void main(String args[]){
//            int nums[][] = {{1,2,3},{4,0,6},{7,8,9}};
//            int n = nums.length;
//            int m = nums[0].length;
//            int  total = n*m;
//            int actual = total*(total+1)/2;
//            int sum = 0;
//            for(int i=0;i<n;i++){
//              for(int j=0;j<m;j++){
//                    sum += nums[i][j];
//              }
//            }
//            int ans = actual-sum;
//             System.out.print(ans);
//     }
// }
// // ..............................................................  majority element
// public  class  programe{
//     public static void main(String args[]){
//         int nums[] = {1,1,1,2,2,2,3,3,3,3,3,3};
//         int count=1;
//         int n = nums.length;
//         int major = nums[0];
//         for(int i=1;i<n;i++){
//                     int curr = nums[i];
//                     if(curr==major){
//                           count++;
//                     }else{
//                          count--;
//                     }
//                     if(count<=0  &&  i<n  &&  curr!=major){
//                            major = curr;
//                     }
//         }
//          System.out.print(major);
//     }
// }
// ...................................................................   buy and sell stock prp
// // ................................................................. next right smaller element
// import  java.util.*;
// public  class programe{
//      public static  void main(String args[]){
//         int nums[] = {2,1,5,6,2,3};
//         int n = nums.length;
//         int rightSmaller[] = new int[n];
//         Stack<Integer> st = new Stack<>();
//         for(int i=n-1;i>0;i--){
//               while( (st.size()>0) && nums[st.peek()]>nums[i]  ){
//                      st.pop();
//               }
//                rightSmaller[i] = (st.isEmpty()? -1 : st.peek());
//               st.add(i);
//         }
//           for(int num : rightSmaller){
//                System.out.print(num +" ");
//           }
//         //   .................................................. next left smaller value
//         st.clear();
//         int leftSmaller[] = new int[n];
//          for(int i=0;i<n;i++){
//                   while(st.size()>0   &&  st.peek()>nums[i]){
//                          st.pop();
//                   }
//                   leftSmaller[i] = (st.isEmpty()? -1 : st.peek());
//                   st.add(nums[i]);
//          }
//      }
// }
// ......................................................  largest rectangle in histograme
// // ............................................................. best buy sell and stock problem
// import  java.util.*;
// public  class  programe{
//     public static void main(String[] args) {
//          int nums[] = {7,1,5,3,6,4};
//          int n = nums.length;
//          int bestBuy = nums[0];
//          int maxProfit  =0;
//          for(int i=1;i<n;i++){
//               if(bestBuy<nums[i]){
//                  maxProfit = Math.max(maxProfit,nums[i]-bestBuy);
//               }
//               bestBuy = Math.min(nums[i],bestBuy);
//          }
//           System.out.print(bestBuy);
//     }
// }
// ................................................................................. buy sell stock problem
// import  java.util.*;
// public  class  programe{
//     public static void main(String[] args) {
//           int nums[] = {7,1,5,3,6,4};
//           int n = nums.length;
//           int maxProfit = 0;
//           for(int i=0;i<n;i++){
//               int buy = nums[i];
//               for(int j=i+1;j<n;j++){
//                  int sell = nums[j];
//                    if(buy<sell){
//                       maxProfit = Math.max(maxProfit,sell-buy);
//                    }
//               }
//           }
//           System.out.print(maxProfit);
//     }
// }
// // .........................................................................  calculate the binary form 
// import  java.util.*;
// public  class programe{
//     public static void myPow(double x,int n){
//             double binary = n;
//              double ans =1;
//          if(n<0){
//                x = 1/x;
//                binary = -binary;
//          }
//          while(binary!=0){
//                 if(binary%2==1){
//                       ans *= x;
//                 }
//                 x *= x;
//                 binary /=2;
//          }
//           System.out.print(ans);
//     }
//     public static void main(String[] args) {
//         myPow(3,5);
//     }
// }
// import java.util.*;
// public  class  programe{
//     public static void main(String[] args) {
//           int nums = 153;
//           int original = nums;
//           int ans =0;
//           while(nums>0){
//             int digit = nums%10;
//             ans += Math.pow(digit, 3);
//             nums/=10;
//           }
//          if(original==ans){
//               System.out.print("Number is armstrong");
//          }else{
//               System.out.print("Number is not armstrong");
//          }
//     }
// }
// // .....................................................................  trapping rain water
// public  class programe{
//     public static void main(String args[]){
//         int nums[] =  {1,8,6,2,5,4,8,3,7};
//         int n = nums.length;
//         int left[] = new int[n];
//         int right[] = new int[n];
//         left[0] = nums[0];
//         for(int i=1;i<n;i++){
//                left[i] = Math.max(nums[i],left[i-1]);
//         }
//         right[n-1] = nums[n-1];
//         for(int j=n-2;j>0;j--){
//                right[j] = Math.max(right[j+1],nums[j]);
//         }
//         int ans = 0;
//         for(int i=0;i<n;i++){
//               ans+= Math.min(left[i], right[i])-nums[i]; 
//         }
//              System.out.print(ans);
//     }
// }
// ................................................................  Max Water
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//            int nums[] = {1,8,6,2,5,4,8,3,7};
//            int n
//     }
// }
// // ...........................................................  quick sort
// import  java.util.*;
// public class programe{
//     public static int partitions(int nums[],int st,int end){
//           int i=st-1;
//           int pivot = nums[end];
//           for(int j=0;j<end;j++){
//                if(nums[j]<=pivot){
//                      i++;
//                      int temp = nums[j];
//                      nums[j] = nums[i];
//                      nums[i] = temp;
//                }
//           }
//         //     put the pivot at the right place
//         i++;
//          int temp = pivot;
//            nums[end] = nums[i];
//                 nums[i] = temp;
//           return  i;
//     }
//     public static void QuickSort(int nums[],int st,int end){
//         if(st>=end){
//                return;
//         }
//           int pivot =   partitions(nums,st,end);
//           QuickSort(nums, st, pivot);
//           QuickSort(nums, pivot+1, end);
//     }
//     public static void main(String[] args) {
//         int nums[] = {6,3,9,8,2,5};
//         int n = nums.length;
//          QuickSort(nums,0,n-1);
//     }
// }
//  .................................................  generate the all binary strinhg without consecutive ones
// public  class  programe{
//     public static void  printBinaryString(int n,String str,int lastPlace){
//               if(n==0){  
//                     System.out.println(str);
//                     return;
//               }
//               if(lastPlace==0){
//                     printBinaryString(n-1, str+"0", 0);
//                     printBinaryString(n-1, str+"1", 1);
//               }else{
//                   printBinaryString(n-1, str+"0", 0);
//               }
//     }
//     public static void main(String args[]){
//         int n = 5;
//             printBinaryString(n,"",0);
//     }
// }
// ...................................................................... connecting cities  minimum cost me src se des tak reach karna tha 
// ............................................................  max sum subarray
// public  class  programe{
//     public static void main(String[] args) {
//            int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
//            int n = nums.length;
//             int maxSum = Integer.MIN_VALUE;
//             int currentSum = 0;
//             for(int i=0;i<n;i++){
//                      currentSum += nums[i];
//                      if(currentSum>maxSum){
//                             maxSum = currentSum;
//                      }
//                       if(currentSum<0){
//                           currentSum = 0;
//                       }
//             }
//              System.out.print(maxSum);
//     }
// }
// ............................................................
// import  java.util.*;
// public  class programe{
//      public static void main(String args[]){
//          String s1 = "geeks";
//            String s2 = "lseeg";
//            int n1 = s1.length();
//            int n2 = s2.length();
//                char ch1[] = s1.toCharArray();
//                char ch2[] = s1.toCharArray();
//                 Arrays.sort(ch1);
//                 Arrays.sort(ch2);
//                  if(Arrays.equals(ch1, ch2)){
//                        System.out.print(true);
//                  }else{
//                        System.out.print(false);
//                  }
//      }
// }
//  .......................................................... subarray sum  equals k
// import  java.util.*;
// public  class  programe{
//      public   static void main(String args[]){
//           int nums[] = {1,2,3,4};
//           int target =7;
//           HashMap<Integer,Integer> map = new HashMap<>();
//            int n = nums.length;
//            int count=0;
//            for(int i=0;i<n;i++){
//                  if(nums[i]>target){
//                      i++;
//                  }
//                  int halfTarget = target-nums[i];
//                  if(!map.containsKey(halfTarget)){
//                        map.put(halfTarget,map.getOrDefault(halfTarget, 0)+1);
//                  }else{
//                          count += map.get(halfTarget);
//                  }
//            }
//              System.out.print(count);
//      }
// }
// // ...................................................................    find the next permutaiont
// import  java.util.*;
// public  class  programe{
//          public static void swap(int i,int j,int nums[]){
//            int temp = nums[i];
//            nums[i]=  nums[j];
//            nums[j] = temp;
//          }
//      public static void main(String[] args) {
//               int nums[] = {1,2,3};
//               int n =  nums.length;
//           //       find the pivot 
//                int pivot = -1;
//                for(int i=n-2;i>=0;i--){
//                        if(nums[i]<nums[i+1]){
//                             pivot = i;
//                        }
//                }
//                int nextRight = -1;
//                  for(int i=n-1;i>=0;i--){
//                       if(pivot!=-1 &&  nums[i]>nums[pivot]){
//                               nextRight = i;
//                               break;
//                       } 
//                  }
//                    swap( pivot,nextRight,nums);
//                //   now reverse the  elemeent which comes just after the  pivot;
//                int  i = pivot+1;
//                int j = nextRight-1;
//                  while(i<j){
//                       swap(i,j,nums);
//                       i++;
//                       j--;
//                  }
//                  for(int num:nums){
//                       System.out.print(num +" ");
//                  }
//      }
// }
// ...................................................................... longest happy prefix
// import  java.util.*;
// public  class  programe{
//      public static void main(String[] args) {
//            String str = "ababab";
//            int n  =  str.length();
//            int longest = 0;
//            for(int i=0;i<n;i++){
//                    String prefix = str.substring(0,i);
//                    String suffix = str.substring(n-i,n);
//                     if(prefix.startsWith(suffix) && suffix.endsWith(prefix)){
//                            longest  = Math.max(longest,prefix.length());
//                     }
//            }
//             System.out.print(longest);
//      }
// }
// // ....................................................................  combination sum
//  import  java.util.*;
//  public  class  programe{
//      public  static void helper(int nums[],int target,ArrayList<Integer> list , ArrayList<ArrayList<Integer>> ans,int i){
//            if(target==0){
//                  ans.add(new ArrayList<>(list));
//                  return;
//            }
//            if(target<0){
//                  return;
//            }
//            if(i==nums.length){
//                  return;
//            }
//             list.add(nums[i]);
//            helper(nums,target-nums[i],list,ans,i+1);
//            helper(nums, target-nums[i], list, ans, i);
//      }
//      public static void main(String args[]){
//             int nums[] = {1,2,3,4};
//             int n = nums.length;
//             int target = 5;
//             ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//             ArrayList<Integer> list = new ArrayList<>();
//             helper(nums,target,list,ans,0);
//             for(int i=0;i<ans.size();i++){
//                  for(int j =0;j<ans.get(i).size();j++){
//                       System.out.print(ans.get(j));
//                  }
//             }
//      }
//  }
// ........................................................... remove the duplicate from the string
// import  java.util.*;
// public  class  programe{
//       public static void main(String[] args) {
//             String str = "annjali";
//             boolean vis[] = new boolean[26];
//              StringBuilder sb = new StringBuilder();
//              for(int i=0;i<str.length();i++){
//                   int index = str.charAt(i)-'a';
//                     if(vis[index]){
//                             continue;
//                     }else{
//                            vis[index] = true;
//                            sb.append(str.charAt(i));
//                     }
//              }
//               System.out.print(sb.toString());
//       }
// }
//  selection sort .......................................................
// public  class  programe{
//      public static void swap(int i,int j,int nums[]){
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//      }
//      public static void main(String[] args) {
//             int nums[] = {1,4,2,0,5};
//             int n = nums.length;
//             for(int i=0;i<n;i++){
//                int minVal = nums[i];
//                int index = i;
//                for(int j=i;j<n;j++){
//                     if(minVal>nums[j]){
//                            index = j;
//                            minVal = nums[j];
//                     }
//                }
//                swap(index,i,nums);
//             }
//             for(int num : nums){
//                 System.out.print(num +" ");
//             }
//      }
// }
// import java.util.ArrayList;
// //............................................................... generate all the binary string
// public  class  programe{
//      public static void helper(ArrayList<String> list ,String str, int n,int i){
//               if(str.length()==n){
//                  list.add(new String(str));
//                  return;
//               }
//               helper(list,str+"0",n,i+1);
//               helper(list,str+"1",n,i+1);
//      }
//      public static void main(String[] args) {
//             int n = 2;
//             ArrayList<String> list= new ArrayList<>();
//             helper(list,"",n,0);
//             for(String str : list){
//                  System.out.print(str +" ");
//             }
//      }
// }
// import java.util.ArrayList;
// public class  programe{
//      public static void helper(ArrayList<String> list,String str , int i,int n){
//              if(i==n){
//                   list.add(str);
//                    return;
//              }
//           //      zero
//           helper(list,str+"1",i+1,n);
//           helper(list,str+"0",i+1,n);
//      }
//      public static void main(String args[]){
//               int i=0;
//               int n = 3;
//               ArrayList<String> list = new ArrayList<>();
//               helper(list,"",i,n);
//               for(String str : list){
//                     System.out.print(str +" ");
//               }
//      }
// }
// ..
// ..............................................................   friend  pairing problem
// ....................................................................  generate all the binary string
// import  java.util.*;
// public  class  programe{
//       public static void main(String[] args) {
//               String s = "11001";
//               int count=0;
//               int n = s.length();
//                for(int i=0;i<n;i++){
//                     for(int j=0;j<i;j++){
//                            if(s.charAt(i)=='1'  &&  s.charAt(j)=='1'){
//                                 count++;
//                            }
//                     }
//                }
//                  System.out.print(count);
//       }
// }
// // ........................................................  remove the duplicate from the string
// import  java.util.*;
// public  class programe{
//       public static void helper(String str ,int i,int n,StringBuilder sb,boolean vis[]){
//               if(i==n){
//                      System.out.print(sb.toString());
//                      return ;
//               }
//               int index = str.charAt(i)-'a';
//               if(!vis[index]){
//                      vis[index] = true;
//                      sb.append(str.charAt(i));
//                      helper(str,i+1,n,sb,vis);
//               }else{
//                     helper(str,i+1,n,sb,vis);
//               }
//       }
//       public static void main(String args[]){
//               String str = "appnnacollege";
//               int n = str.length();
//               boolean vis[] = new boolean[26];
//               helper(str,0,n,new StringBuilder(),vis);
//       }
// }
// ......................................   selctions sort ..............................................
// public class  programe{
//       public static void swap(int minIndex,int i,int nums[]){
//               int temp = nums[minIndex];
//               nums[minIndex] = nums[i];
//               nums[i] = temp;
//       }
//       public static void main(String[] args) {
//             int nums[] = {1,4,2,5,6};
//             int n = nums.length;
//             for(int i=0;i<n;i++){
//                    int min = nums[i];
//                    int minIndex = i;
//                    for(int j=i;j<n;j++){
//                          if(min>nums[j]){
//                                  minIndex = j;
//                                  min = nums[j] ;
//                          }
//                    }
//                    swap(minIndex,i,nums);
//             }
//             for(int num : nums){
//                     System.out.print(num +" ");
//             }
//       }
// }
// .................................................................  Combination sum
// import  java.util.*;
// public class  programe{
//     public static void helper(int index,int nums[],int target,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans){
//          if(target==0){ 
//                ans.add(new ArrayList<>(list));
//                return;
//          }
//          if(target<0){
//               return ;
//          }
//          if(index==nums.length){
//                return;
//          }
//          list.add(nums[index]);
//          helper(index,nums,target-nums[index],list,ans);
//          list.remove(list.size()-1);
//          helper(index+1,nums,target-nums[index],list,ans);
//     }
//     public static   void main(String args[]){
//           int num[] = {1,2,3};
//           int target = 5;
//           ArrayList<Integer> list = new ArrayList<>();
//           ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
//           helper(0,num,target,list,ans);
//             System.out.print(ans);
//     }
// }
// ...............................................................  longest happy preifx
// public  class programe{
//      public static void main(String[] args) {
//              String s =  "ababab";
//              int n = s.length();
//              String ans = "";
//              for(int i=0;i<n;i++){
//                   String prefix = s.substring(0,i);
//                   String suffix =  s.substring(n-i);
//                   if(prefix.equals(suffix)){
//                              ans  = prefix;
//                   }
//              }
//               System.out.print(ans);
//      }
// }
// import java.util.*;
// import java.util.HashSet;
// public class programe{
//     public static void main(String args[]){
//        String str = "ababab";
//        int n = str.length();
//         HashSet<String> prefix = new HashSet<>();
//           for(int i=0;i<n-1;i++){
//               StringBuilder sb = new  StringBuilder();
//                for(int j=0;j<=i;j++){
//                    sb.append(str.charAt(j));
//                }
//                prefix.add(sb.toString());
//           }
//         //     calculate the suffix
//         HashSet<String>  suffix  = new HashSet<>();
//         for(int i=n-1;i>0;i--){
//                 StringBuilder sb = new StringBuilder();
//                 for(int j=i;j<n;j++){
//                         sb.append(str.charAt(j));  
//                 }
//                 suffix.add(sb.toString());
//         }
//         HashMap<String,String> map = new HashMap<>();
//         StringBuilder ans = new StringBuilder();
//           ArrayList<String> prefix1 = new  ArrayList<>(prefix);
//           ArrayList<String> suffix1 = new ArrayList<>(suffix);
//           Collections.sort(prefix1);
//           Collections.sort(suffix1);
//           int max = 0;
//           for(String p : prefix1){
//                 if(suffix1.contains(p)){
//                         max = Math.max(max,p.length());
//                 }
//           }
//            System.out.print(max);
//     }
// }
// import java.util.*;
// public class programe{
//      public static void main(String args[]){
//            String num = "143321";
//            int n  = num.length();
//            int k = 3;
//            Stack<Character> st = new Stack<>();
//            for(int i=0;i<n;i++){
//                 while(!st.isEmpty()  && k>=0 && num.charAt(i)>st.peek()){
//                       st.pop();
//                       k--;
//                 }
//                 st.add(num.charAt(i));
//            }
//            while(!st.isEmpty()){
//                System.out.print(st.pop() +" ");
//            }
//      }
// }
// ...................................................................   merge the 2 sorted array without using the extra array 
// .............................................................................. words search problems on the matrix
// ...........................................................................  find the next permutation
// public  class  programe{
//     public static void swap(int i,int j,int num[]){
//           int temp = num[i];
//           num[i] = num[j];
//           num[j] = temp;
//     }
//     public static void main(String[] args) {
//             int num[] = {1,3,2};
//             int n =  num.length;
//             int pivot = -1;
//             for(int i=n-2;i>=0;i--){
//                   if(num[i+1]<num[i]){
//                       pivot = i;
//                       break;
//                   }
//             }
//             int nextRight = -1;
//             for(int i=n-1;i>pivot;i--){
//                    if(num[i]<num[pivot]){
//                         nextRight  = i;
//                         break;
//                    }
//             }
//              swap(nextRight,pivot,num);
//              int i = pivot ;
//              int j = n-1;
//              while(i<j){
//                    swap(i,j,num);
//                    i++;
//                    j--;
//              }
//               for(int nums : num){
//                   System.out.print(nums +"  ");
//               }
//     }
// }
// ...............................................................................
// public class programe {
//     public static class Node {
//         Node children[] = new Node[26];
//         boolean isTrue = false;
//         public Node() {
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//         }
//     }
//     public static Node root = new Node();
//     public static void insert(String word) {
//         Node curr = root;
//         for(int i=0;i<word.length();i++){
//                int index = word.charAt(i)-'a';
//                if(curr.children[index]==null){
//                       curr.children[index] = new Node();
//                }
//                  curr =  curr.children[index] ;
//         }
//         curr.isTrue = true;
//     }
//     public static boolean  search(String word){
//               Node curr = root;
//               for(int i=0;i<word.length();i++){
//                       int index = word.charAt(i)-'a';
//                       if(curr.children[index]==null){
//                            return  false;
//                       }
//                      curr =   curr.children[index] ;
//               }
//               return  curr.isTrue;
//     }
//     public static void main(String[] args) {
//         String words[] = {"w", "wo", "wor", "worl", "world"};
//         for (String word : words) {
//             insert(word);
//         }
//        boolean ans =   search("anjlai");
//           System.out.print(ans);
//     }
// }
// ........................................... sub  Array sum equals k
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//           int nums[] = new int[]{1,1,2};
//           int k = 5;
//           int count=1;
//           int prefix[] = new int[nums.length];
//           int n = nums.length;
//           prefix[0] = 0;
//           for(int i=1;i<n;i++){
//                     prefix[i] = prefix[i-1]+nums[i];
//           }
//           Map<Integer,Integer> map = new HashMap<>();
//           for(int i=0;i<n;i++){
//                int leftSum = nums[i]-k;
//                if(map.containsKey(leftSum)){
//                        count += map.get(leftSum);
//                }
//                else{
//                     map.put(leftSum,map.getOrDefault(leftSum,0)+1);
//                }
//           }
//              System.out.print(count);
//     }
// }
// public  class programe{
//     public static class Edge implements  Comparable<Edge>{
//         int src;
//         int des;
//         int cost;
//         public Edge(int src,int des,int cost) {
//              this.src = src;
//              this.des = des;
//              this.cost = cost;
//         }
//         @Override
//          public  int compareTo(Edge e2){
//              return this.cost - e2.cost;
//          }
//     }
//     public static int   connectingCities(int cities[][]){
//           PriorityQueue<Edge> pq = new PriorityQueue();
//           boolean vis[]  = new boolean[cities.length];
//           pq.add(new Edge(0,0,0));
//           int finalCost  =0;
//           while(!pq.isEmpty()){
//               Edge  e = pq.poll();
//                 if(!vis[e.des]){
//                        finalCost += e.cost;
//                        vis[e.des] = true;
//                        for(int i=0;i<cities[e.des].length;i++){
//                               pq.add(new Edge(i,cities[i][e.des],e.cost));
//                        }
//                 }
//           }
//            return  finalCost;
//     }
//     public static void main(String[] args) {
//           int city[][] = {{1,2,5},{1,3,6},{2,3,1}};
//              System.out.print( connectingCities(city));
//     }
// }
// ............................................................  connecting cities
// import java.util.*;
// public class programe{
//     public static class Edge implements  Comparable<Edge>{
//         int src;
//         int des;
//         int cost;
//         Edge(int src,int des,int cost){
//              this.src = src;
//              this.des = des;
//              this.cost = cost;
//         }
//         @Override
//         public int compareTo(Edge e2){
//               return this.cost-e2.cost;
//         }
//     }
//     public static int connectingCity(int city[][]){
//            PriorityQueue<Edge> pq = new PriorityQueue<>();
//            boolean vis[] = new boolean[city.length];
//            int finalCost =0;
//            pq.add(new Edge(0,0,0));
//            while(!pq.isEmpty()){
//                 Edge e = pq.poll();
//                  if(!vis[e.des]){
//                          vis[e.des] = true;
//                          finalCost += e.cost;
//                          for(int i=0;i<city[e.des].length;i++){
//                                  pq.add(new Edge(i,city[i][e.des],e.cost));
//                          }
//                  }
//            }
//            return finalCost;
//     }
//     public static void main(String args[]){
//          int city[][] = {{1,2,5},{1,3,6},{2,3,1}};
//          int n = city.length;
//        int ans =   connectingCity(city);
//          System.out.print(ans);
//     }
// }
// .................................................................. check the how many prime number exist in  the range
// import  java.util.*;
// public  class programe{
//     public static void main(String[] args) {
//           int n = 50;
//           int count=0;
//           boolean primes[] = new boolean[n];
//             Arrays.fill(primes,true);
//             for(int i=2;i<n;i++){
//                    if(primes[i]){
//                        count++;
//                        for(int j=i*2;j<n;j=i+j){
//                             primes[j] =  false;
//                        }
//                    }
//             }
//             System.out.print(count);
//     }
// }
// .......................................................... 0 1 knapsack  problem
// import  java.util.*;
// public  class  programe{
//     public  static int helper(int val[],int wt[],int allowed,int n,int m,int dp[][],int i){
//               if(i==0  || allowed==0){
//                      return 0;
//               }
//                if(dp[i][allowed]!=-1){
//                   return dp[i][allowed];
//                }
//                 if(wt[i]<=allowed){
//                         int take = val[i]+ helper(val,wt,allowed-wt[i],n,m,dp,i-1);
//                         int notTake = helper(val,wt,allowed,n,m,dp,i-1);
//                         dp[i][allowed] = Math.max(take,notTake);
//                 }else{
//                         dp[i][allowed] =  helper(val, wt, allowed, n, m, dp, i-1);
//                 }
//                 return dp[n][m];
//     }
//     public static void main(String[] args) {
//            int val[] = {1, 2, 3};
//            int wt[] = {4, 5, 1};
//            int allowed = 4;
//            int n =  val.length;
//            int m = wt.length;
//            int dp[][] = new int[n+1][allowed+1];
//            for(int col[] : dp){
//               Arrays.fill(col,-1);
//            }
//         int ans =    helper(val,wt,allowed,n,m,dp , n-1);
//             System.out.print(ans);
//     }
// }
// .......................................................................  remove  the kth digit
// import   java.util.*;
// public  class programe{
//     public static void main(String[] args) {
//          String num = "1432219"; 
//         //    remove  the kth  digit to make  the minimum number
//          int k = 3;
//          int n = num.length();
//          Stack<Character> st = new Stack<>();
//          st.add(num.charAt(0));
//          for(int  i=1;i<n;i++){
//                while(!st.isEmpty()  &&  k>0  &&  st.peek()>num.charAt(i)){
//                       st.pop();
//                       k--;
//                }
//                st.add(num.charAt(i));
//          }
//          while(!st.isEmpty()){
//                System.out.print(st.pop());
//          }
//     }
// }
// import  java.util.*;
// // .....................................................................  Next permutaion
// public  class  programe{
//     public static int  findNextSmaller(int nums[]){
//              Stack<Integer> st = new Stack<>();
//              int n = nums.length-1;
//               st.push(nums[n]);
//              for(int i =n-2;i>=0;i--){
//                   if(st.peek()>nums[i]){
//                       return nums[i];
//                   }else{
//                       st.add(nums[i]);
//                   }
//              }
//              return -1;
//     }
//     public static void main(String[] args) {
//           int nums[] = {1,2,3,6,5,4};
//           int n = nums.length;
//             int pivot = findNextSmaller(nums);
//     }
// }
// // ............................................................    merge 2 sorted array
// public  class programe{
//     public static void main(String[] args) {
//              int nums1[] = {7,8,9,0,0,0};
//              int nums2[] = {1,2,3};
//              int n = 3;
//              int m = 3;
//              int i=n-1;
//              int j=m-1;
//              int k = nums1.length-1;
//              while(i>=0  && j>=0){
//                      if(nums1[i]<=nums2[j]){
//                             nums1[k--] =  nums2[j];
//                             j--;    
//                      }else{
//                             nums1[k--] = nums1[i];
//                             i--;
//                      } 
//              }
//              while(j>=0){
//                    nums1[k--] = nums2[j--];
//              }
//              for(int num : nums1){
//                     System.out.print(num);
//              }
//     }}
// ..........................................................  merge 2 sorted array
// public class programe{
//     public static void main(String args[]){
//            int nums1[] = {1,2,3,0,0,0};
//            int nums2[]= {2,5,6};
//            int n = 3;
//            int m =3;
//              int i=n-1;
//              int j = m-1;
//              int k =  nums1.length-1;
//              while(i>=0  && j>=0){
//                       if(nums1[i]<nums2[j]){
//                              nums1[k--] = nums2[j--];
//                       } 
//                       i--;
//              }
//              for(int num :  nums1){
//                   System.out.print(num +"  ");
//              }
//     }
// }
// ...............................................................  temove the kth digit
// import  java.util.*;
// public class  programe{
//     public static void main(String args[]){
//              String str ="1432219";
//              int n = str.length();
//              int k=3;
//              Stack<Character> st = new Stack<>();
//              st.add(str.charAt(0));
//              for(int i=1;i<n;i++){
//                     while(!st.isEmpty() &&  k>0   &&  st.peek()>str.charAt(i)){
//                                 st.pop();
//                                 k--;
//                     }
//                     st.add(str.charAt(i));
//              }
//              while(!st.isEmpty()){
//                   System.out.print(st.pop() +"  ");
//              }
//     }
// }
// // ............................................................  remove the largest number from the starting position
// import java.util.*;
// public class  programe{
//     public static void main(String[] args) {
//              String s = "1432219";
//              int n = s.length();
//              Stack<Character> st = new Stack<>();
//              int k=3;
//              st.add(s.charAt(1));
//              for(int i=1;i<n;i++){
//                     if(!st.isEmpty()){
//                           if(st.peek()<s.charAt(i)){
//                                st.add(s.charAt(i));
//                      }else{
//                            if(k!=0  && st.peek()>s.charAt(i)){
//                                  st.removeLast();
//                                  k--;
//                            }
//                      }
//                     }
//              }
//              while(!st.isEmpty()){
//                    System.out.print(st.pop());
//              }
//     }
// }
// import java.util.ArrayList;
// import java.util.List;
// // ....................................................................    remove kth digit and return the minimum number
// public  class programe{
//     public static void main(String[] args) {
//            String num = "1432219";
//            char nums[] = num.toCharArray();
//             int n = nums.length;
//            int k = 3;
//            List<String> list = new ArrayList<>();
//            for(int i=0;i<n-k;i++){
//                  int skiped = i+k;
//                  StringBuilder sb = new StringBuilder();
//                  for(int j=skiped+1;j<n;j++){
//                       sb.append(nums[j]);
//                  } 
//                   list.add(sb.toString());
//            }
//            for(String ans : list){
//               System.out.println(ans);
//            }
//     }
// }
// ...........................................................  regular expression mathing
// .................................................................. wild card matching
// public  class  programe{
//      public  static boolean helper(String s,String p,int i,int j,int n,int m){
//             if(i>=n  &&  j>=m ){ 
//                   return true;
//             }
//             if(i>=n  ||  j>=m){
//                    return false;
//             }
//             if(s.charAt(i)==p.charAt(j) ||  p.charAt(j)=='?'){
//                  return    helper(s,p,i+1,j+1,n,m);
//             }
//             if(p.charAt(j)=='*'){
//                  return    helper(s,p,i+1,j,n,m);
//             }
//             return helper(s,p,i,j+1,n,m);
//      }
//      public static void main(String[] args) {
//             String s = "aab";
//             String p = "aah";
//             int n = s.length();
//             int m = p.length();
//             int i=0;
//             int j=0;
//               boolean ans = helper(s,p,i,j,n,m);
//               System.out.print(ans);
//      }
// }
// import  java.util.*;
// // ...............................................................  0 1 knapsack
// public  class  programe{
//     public static int helper(int val[],int wt[],int n,int allowed,int i,int dp[][]){
//           if(i==0 || allowed==0){
//                  return 0;
//           }
//            if(dp[n-1][allowed]!=-1){
//                 return  dp[n-1][allowed];
//            }
//           if(wt[i-1]<=allowed){
//                 int take = val[i-1]+helper(val,wt,n,allowed-wt[i-1],i-1,dp);
//                 int notTake = helper(val,wt,n,allowed,i-1,dp);
//                   return  Math.max(take,notTake);
//           }
//           return helper(val,wt,n,allowed,i-1,dp);
//     }
//     public static void main(String[] args) {
//           int val[] = {15,14,10,45,30};
//           int wt[] = {2,5,1,3,4};
//           int n = val.length;
//           int m = wt.length;
//             int allowed = 7;
//           int dp[][] = new int[n+1][allowed+1];
//            for(int col[]: dp){
//                  Arrays.fill(col, -1);
//            }
//         int ans =   helper(val,wt,n-1,allowed,n-1,dp);
//           System.out.print(ans);
//     }
// }
// import java.util.*;
// // ............................................................   check the prime number
// public class programe{
//     public static boolean   isPrime(int n){
//            n = 20;
//           for(int i=2;i*i<=n;i++){
//               if(i%2==0){
//                      return false;
//               }
//           }
//           return  true;
//     }
//     public static int checkPrime(int n){
//         boolean primes[] = new boolean[n];
//         int count=0;
//         Arrays.fill(primes, true);
//            for(int i=2;i<n;i++){
//                if(primes[i]){
//                 count++;
//                   for(int j=i*2;j<n;j=j+i){
//                         primes[j]  = false;
//                   }
//                }
//            }
//             return count;
//     }
//      public static void DigitNumber(){
//              int num = 213;
//               int sum=0;
//              while(num!=0){
//                   int digit  = num%10;
//                    sum+=digit;
//                   num = num/10;
//              }
//              System.out.print(sum);
//      }
//      public static void findCube(int n){
//               int count=0;
//               int cube =1;
//               while(count<3){
//                       cube*=n;
//                       count++;
//               }
//               System.out.print(cube);
//      }
//     public static void main(String[] args) {
//         //  System.out.println(isPrime());
//         //  System.out.println(checkPrime(50));
//         //  DigitNumber();
//         int count=0;
//         int n = 5;
//         int cube =1;
//               while(count<3){
//                       cube*=n;
//                       count++;
//               }
//               System.out.print(cube);
//     }
// }
// ..........................................................     0 1 knapsack
// public  class  programe{
//     public static int helper(int val[],int wt[],int i,int allowed,int n){
//                    if(i==0  || allowed==0){
//                        return 0;
//                    }
//                    if(wt[n-1]<=allowed){
//                           int take = val[i-1]+helper(val, wt, i-1, allowed-wt[i], n-1);
//                           int notTake  = helper(val, wt, i-1, allowed, n-1);
//                           return  Math.max(take,notTake);
//                    }
//                    return helper(val, wt, i-1, allowed, n-1);
//     }
//     public static void main(String[] args) {
//            int val[] = {15,14,10,45,30};
//            int wt[] = {2,5,1,3,4};
//            int n = val.length;
//            int allowed = 7;
//              System.out.print(helper(val, wt, n-1,allowed,n));
//     }
// }
// ..................................................   Climbing stairs
// public  class  programe{
//     public static void main(String args[]){
//          int n = 5;
//          int dp[] = new int[n+1];
//          dp[0] = 1;
//          dp[1] = 1;
//          for(int i=2;i<=n;i++){
//               dp[i] = dp[i-1]+dp[i-2];
//          }
//          System.out.print(dp[n]);
//     }
// }
// // .................................................................   find and union .......................................
// import  java.util.*;
// public  class  programe{
//     public static void union(int a,int b,int rank[],int parent[]){
//           int x = find(a,rank,parent);
//           int y = find(b,rank, parent);
//              if(rank[x]==rank[y]){
//                       parent[y] = x;
//                        rank[x]++;
//              }else if(rank[x]<rank[y]){
//                     parent[x] = y;
//                     rank[y]++;
//              }else{
//                     parent[y] = x;
//                     rank[x]++;
//              }
//     }
//     public static int find(int x,int rank[],int parent[]){
//         if(x==parent[x]){
//                return x;
//         }
//         return  find(parent[x],rank,parent);
//     }
//     public static void  main(String args[]){
//          int rank[] = new int[10];
//          int parent[] = new int[10];
//          Arrays.fill(rank, 0);
//          for(int i=0;i<10;i++){
//                parent[i] = i;
//          }
//           union(1,3,rank,parent);
//           System.out.println(find(3,rank,parent));
//           union(2,4,rank,parent);
//           union(3,6,rank,parent);
//           union(1,6,rank,parent);
//           System.out.println(find(5,rank,parent));
//           union(1,5,rank,parent);
//     }
// }
// ...................................................................................
// import java.util.Comparator;
// import java.util.PriorityQueue;
// // ....................................................................... connexting cities
// public  class  programe{
//      public  static  class  Edge implements  Comparable<Edge>{
//         int des;
//         int cost;
//         public Edge(int des,int cost) {
//              this.des = des;
//              this.cost = cost;
//         }
//         @Override 
//          public int compareTo(Edge e2){
//               return  this.cost-e2.cost;
//          }
//      }
//      public static int connectingCities(int cities[][]){
//            PriorityQueue<Edge> pq = new PriorityQueue<>();
//            boolean vis[] = new boolean[cities.length];
//            int finalCost =0;
//            pq.add(new Edge(0,0));
//            while(!pq.isEmpty()){
//                Edge e = pq.remove();
//                if(!vis[e.des]){
//                      finalCost += e.cost;
//                      vis[e.des] = true;
//                      for(int i=0;i<cities[e.des].length;i++){
//                                 if(cities[e.des][i]!=0){
//                                        pq.add(new Edge(i,cities[e.des][i]));
//                                 }
//                      }
//                }
//            }
//            return finalCost;
//      }
//     public static void main(String[] args) {
//     int [][] city = {
//     {1, 2, 1}, {1, 3, 1}, {1, 4, 100},
//     {2, 3, 1}, {4, 5, 2}, {4, 6, 2}, {5, 6, 2}
// };
//           System.out.print(connectingCities(city));;
//     }
// }
// // ..................................................... place the cows in max of min distance
// public  class programe{
//     public static boolean isPossible(int mid,int arr[],int C){
//         int cows =1;
//         int lastStall = arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]-lastStall>=mid){
//                    cows++;
//                    lastStall = arr[i];
//             }
//             if(cows==C){
//                    return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//            int N = 5;
//            int C= 3;
//            int arr[] = {1,2,4,8,9};
//            int n = arr.length;
//            int low = 1;
//            int high = arr[n-1]-arr[0];
//            int ans =0;
//            int max = 0;
//            while(low<=high){
//                int mid = low+(high-low)/2;
//                if(isPossible(mid,arr,C)){
//                   low = mid+1;
//                    ans = mid;
//                }else{
//                   high  = mid-1;
//                }
//            }
//            max = Math.max(max,ans);
//            System.out.print(max);
//     }
// }
// ............................................................
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// // .................................................................    cheapest flights within k  stops
// public class  programe{
//     public static class Edge{
//           int src;
//           int des;
//           int wt;
//         public Edge(int src,int des, int wt) {
//               this.src = src;
//               this.des = des;
//               this.wt = wt;
//         }
//     }
//     public  static class Info{
//          int v;
//          int cost;
//          int stops;
//         public Info(int v,int cost,int stops) {
//             this.v = v;
//             this.cost = cost;
//             this.stops = stops;
//         }
//     }
//     public  static void createGraph(int flights[][],ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//                graph[i] = new ArrayList<>();
//         } 
//         for(int i=0;i<flights.length;i++){
//                int s = flights[i][0];
//                int d =  flights[i][1];
//                int wt = flights[i][2];
//                 graph[i].add(new Edge(s, d, wt));
//         }
//     }
//     public  static int cheapestFlight(int flights[][],int source,int destination,int k){
//         ArrayList<Edge> graph[] = new ArrayList[flights.length];
//             createGraph(flights,graph);
//             Queue<Info> q = new LinkedList<>();
//             q.add(new Info(0,0,0));
//             int dis[]  = new int[graph.length];
//             for(int i=0;i<graph.length;i++){
//                   if(i!=source){
//                       dis[i] = Integer.MAX_VALUE;
//                   }
//             }
//              while(!q.isEmpty()){
//                    Info curr = q.remove();
//                    if(curr.stops>k){
//                           break;
//                    }
//                    for(int i=0;i<graph[curr.v].size();i++){
//                           Edge e = graph[curr.v].get(i);
//                           int u = e.src;
//                           int v = e.des;
//                           int wt = e.wt;
//                           if(dis[u]+wt<dis[v]  && dis[u]!=Integer.MAX_VALUE   && curr.stops<=k){
//                                  dis[v] =    dis[u]+wt;
//                                  q.add(new Info(v, dis[v], curr.stops+1));
//                           }
//                    }
//              }
//              if(dis[des]!=Integer.MAX_VALUE){
//                     return dis[des];
//              }
//     }
//     public static void main(String[] args) {
//              int n = 4;
//              int src =0;
//              int des =3;
//              int k=1;
//              int flights[][] = {{0,1,200},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
//                 cheapestFlight(flights,src,des,k);
//     }
// }
// ....................................................................
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// public  class  programe{
//     public static class Edge implements Comparable<Edge>{
//            int src;
//            int des;
//            int wt;
//         public Edge(int s,int d,int wt) {
//              this.src = s;
//              this.des = d;
//              this.wt = wt;
//         }
//         @Override
//         public int compareTo(Edge e2){
//                return  this.wt- e2.wt;
//         }
//     }
//     public static void createGraph(int flights[][],ArrayList<Edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//                graph[i] = new ArrayList<>();
//         }
//         for(int i=0;i<flights.length;i++){
//                int s = flights[i][0];
//                int d = flights[i][1];
//                int w = flights[i][2];
//                graph[s].add(new Edge(s,d,w));
//         }
//     }
//     public static class info{
//          int v;
//          int price;
//          int stops;
//         public info(int v,int price,int stops) {
//             this.v = v;
//             this.price = price;
//             this.stops = stops;
//         }
//     }
//     public static int cheapestFlights(int src,int des,int k,int flights[][],int n ){
//            ArrayList<Edge> graph[] = new ArrayList[n];
//               createGraph(flights,graph);
//               Queue<info> q = new LinkedList<>();
//               int dis[] =  new int[n];
//               int ans=0;
//              for(int i=0;i<graph.length;i++){
//                 //     intialize the all index of the array  with max value except src
//                 if(i!=src){
//                        dis[i] = Integer.MAX_VALUE;
//                }
//              }
//               q.add(new info(0,0,0));
//               while(!q.isEmpty()){
//               }
//     }
//     public static void main(String args[]){
//             int n = 4;
//             int flights[][] = {{0,1,200},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
//             int src =0;
//             int des = 3;
//             int k = 1;
//              cheapestFlights(src, des, k, graph, flights, n)
//     }
// }
// .........................................................................
// import java.util.Arrays;
// // ...........................................................  Assign the cookies
// public  class  programe{
//        public static void main(String args[]){
//            int  greed[] = {1, 10, 3};
//            int cookie[] = {1, 2,3};
//            int count=0;
//            Arrays.sort(greed);
//            Arrays.sort(cookie);
//               int n1 = greed.length;
//            int n2 = cookie.length;
//            int i=0;
//            int j=0;
//              while(i<n1  && j<n2){
//                 if(greed[i]<=cookie[j]){
//                        i++;
//                        j++;
//                        count++;
//                 }
//                     j++;
//              }
//              System.out.print(count);
//        }
// }
// import java.util.PriorityQueue;
// // ....................................................................  min cost to connect n  ropes
// public  class  programe{
//     public static void main(String args[]){
//           int nums[] = {4, 3, 2, 6};
//           int n = nums.length;
//           PriorityQueue<Integer> pq = new PriorityQueue<>();
//           for(int num : nums){
//                      pq.add(num);
//           }
//           int res=0;
//           while(pq.size()>1){
//               int first = pq.poll();
//               int second = pq.poll();
//                res  += first+second;
//                pq.add(first+second);
//           }
//             System.out.print(res);
//     }
// }
// // ........................................ Trie data structure
// public  class  programe{
//     public static class Node{
//           Node children[] = new Node[26];
//           boolean isComplete  = false;
//           Node(){
//               for(int i=0;i<26;i++){
//                    children[i] = null;
//               }
//           }
//     }
//     public static Node root = new Node();
//     public static void insert(String word){
//           Node curr = root;
//            for(int i=0;i<word.length();i++){
//               int index = word.charAt(i)-'a';
//                if(curr.children[index]==null){
//                     curr.children[index] = new Node();
//                }
//                curr = curr.children[index];
//            }
//            curr.isComplete  = true;
//     }
//     public static boolean wordBreak(String key){
//         if(key.length()==0){
//                  return   true;
//         }
//          for(int i=1;i<key.length();i++){
//                 if(search(key.substring(0,i)) &&  wordBreak(key.substring(i))){
//                             return  true;
//               }
//          }
//           return    false;
//     }
//     public static boolean search(String word){
//                Node curr = root;
//                for(int i=0;i<word.length();i++){
//                     int index = word.charAt(i)-'a';
//                     if(curr.children[index]==null){
//                             return  false;
//                     }
//                     curr = curr.children[index];
//                }
//                return curr.isComplete==true;
//     }
//     public static void main(String[] args) {
//              String words[] = {"i","like","samsang","mobile"};
//              for(String word:words){
//                   insert(word);
//              }
//     }
// }
// // .................................................
// public class  programe{
//     public static void main(String[] args) {
//         String s = "-1337c0d3";
//         int n = s.length();
//          StringBuilder sb = new StringBuilder();
//            int i=0;
//            if(s.charAt(i)=='-'){
//                  sb.append('-');
//                  i+=1;
//            }
//            for(;i<n;i++){
//                 char ch = s.charAt(i);
//                if(Character.isDigit(ch)){
//                    sb.append(ch);
//                }
//            }
//            int j=0;
//            boolean isTrue = false;
//             if(sb.charAt(0)=='-'){
//                     isTrue = true;
//                     j =1;
//             }
//            int ans = 0;
//            while(j<sb.length()){
//             char ch = sb.charAt(j);
//                 int num = ch-'0';
//                  ans  = ans*10+num;
//                  j++;
//            }
//            if(isTrue){
//                ans = -ans;
//            }else{
//                 ans = ans;
//            }
//            System.out.print(ans);
//     }
// }
// ....................................................... atois
// // .......................................................  N queens 
// public  class programe{
//     public static void printBoard(char board[][]){
//            for(int i=0;i<board.length;i++){
//               for(int j=0;j<board[0].length;j++){
//                        System.out.print(board[i][j] +"  ");
//               }
//               System.out.println();
//            }
//     }
//     public static boolean isSafe(int col,int row,char board[][]){
//              for(int i=row-1;i>=0;i--){
//                    if(board[i][col]=='Q'){
//                              return false; 
//                    }
//              } 
//             //  vertical left
//             for(int i=row,j=col-1;i>=0 && j>=0;i--,j--){
//                      if(board[i][j]=='Q'){
//                            return  false;
//                      } 
//             }
//             for(int i=row,j=col; i>=0 && j<board[0].length;i--,j++){
//                   if(board[i][j]=='Q'){
//                          return false;
//                   }
//             }
//               return  true;
//     }
//      public static void helper(char board[][],int row){
//                if(row==board.length){
//                       printBoard(board);
//                       return;
//                }
//                 for(int i=0;i<3;i++){
//                       if(isSafe(i,row,board)){
//                              board[row][i] ='Q';
//                              helper(board,row+1);
//                              board[row][i] = '#';
//                       }
//                 }
//      }
//      public static void main(String[] args) {
//         char board[][] = new char[3][3];
//         for(int i=0;i<3;i++){
//               for(int j=0;j<3;j++){
//                     board[i][j] = '.';
//               }
//         }
//         helper(board,0);
//      }
// }
// public  class  programe{
//     public static void helper(String str,String ans){
//            if(str.length()==0){
//                 System.out.println(ans);
//                 return;
//            }
//            for(int i=0;i<str.length();i++){
//                   char ch = str.charAt(i);
//                   String sub = str.substring(0,i)+str.substring(i+1);
//                   helper(sub, ans+ch);
//            }
//     }
//     public static void main(String[] args) {
//            String str ="abc";
//            int n = str.length();
//              String ans = "";
//             helper(str,ans);
//     }
// }
// public  class  programe{
//     public static void  helper(String str, int i,String sb){
//               if(i==str.length()){
//                     System.out.println(sb);
//                     return;
//               }
//               helper(str,i+1,sb+str.charAt(i));
//               helper(str,i+1,sb);
//             //   sb.deleteCharAt(sb.length()-1);
//     }
//     public static void main(String args[]){
//            String str ="abc";
//            int n = str.length();
//             helper(str,0,"");
//     }
// }
//      find the substring  of  the string
// public class programe{
//     public static void main(String args[]){
//            String str = "202";
//            int n = str.length();
//            for(int i=0;i<n;i++){
//             int len =0;
//               for(int j=i+1;j<=n;j++){
//                        String  s = 
//               }
//            }
//     }
// }
// import java.util.*;
// public class programe{
//     public static void main(String args[]){
//            int nums[][] = {{9,1,7},{8,9,2},{3,4,6}};
//            int n = nums.length;
//            int m = nums[0].length;
//            int a = 0;
//            int ans[] = new int[2];
//            Set<Integer> set = new HashSet<>();
//            for(int i=0;i<n;i++){
//               for(int j=0;j<m;j++){
//                    if(set.contains(nums[i][j])){
//                           a = nums[i][j];
//                          break;
//                    }else{
//                          set.add(nums[i][j]);
//                    }
//               }
//            }
//            int expected =  (n*n)*((n*n)+1)/2;
//            int actual = 0;
//            for(int i=0;i<n;i++){
//                for(int j=0;j<m;j++){
//                     actual  +=  nums[i][j];
//                }
//            }
//             int b =  expected+a-actual;
//                ans[0]  = a;
//                ans[1] = b;
//                 System.out.print(ans[0] +"  "+ ans[1]);
//     }
// }
// public class programe{
//       public   static void main(String args[]){
//            String str = "ThisIsAnAutomationEra";
//            int n = str.length();
//             StringBuilder sb = new StringBuilder();
//              for(int i=0;i<n;i++){
//                     char ch = str.charAt(i);
//                     int ascii = (int)ch;
//                     if(ascii>=65  && ascii<=90){
//                             sb.append(" ");
//                             sb.append((char)(ascii+32));
//                     }else{
//                            sb.append(ch);
//                     }
//              }
//              System.out.print(sb.toString());
//       }
// }
// ........................................................................
// import java.util.*;
// // ...........................................................   max  subarray sum equals to get 
// public class programe{
//     public static void main(String args[]){
//           int nums[] =  {1,0,0,1,0,1,1};
//            int n = nums.length;
//            Map<Integer,Integer> map  = new HashMap<>();
//            int sum=0;
//            int max = 0;
//            map.put(0,-1);
//            for(int i=0;i<n;i++){
//                if(nums[i]==1){
//                    sum += 1;
//                }else{
//                   sum -=1;
//                }
//                if(sum==0){
//                     max = i+1;
//                }
//                if(map.containsKey(sum)){
//                      int len = i-map.get(sum);
//                      max = Math.max(max,len);
//                }else{
//                   map.put(sum,i);
//                }
//            }
//            System.out.print(max);
//     }
// }
// // ............................................................................// 
// public  class  programe{
//     public static boolean found = false;
//     public static boolean helper(int i,int j,int n,int m,int l,char board[][],String s){
//          if(i<0  || j<0 || i>=n || j>=m || board[i][j]!=s.charAt(l)){
//                return false;
//          }
//          if(l==k){
//                return true;
//          }
//          if(s.charAt(l)==board[i][j]){
//            found =    helper(i-1,j,k,n,m,l+1,board,s)||
//             helper(i+1,j,k,n,m,l+1,board,s)||
//            helper(i,j-1,k,n,m,l+1,board,s)||
//          helper(i,j+1,k,n,m,l+1,board,s);
//          }
//          return found;
//     }
//      public static void main(String args[]){
//           char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','F'}};
//           int n = board.length;
//           int m = board[0].length;
//           String str= "ABCCED";
//           int k = str.length();
//           boolean ans = false;
//           for(int i=0;i<n;i++){
//               for(int j=0;j<m;j++){
//                  if(helper(i, j, n, m, 0, board, str)){
//                         ans = true;
//                         break;
//                  }
//               }
//           }
//           System.out.print(ans);
//      }
// }
// import java.util.HashMap;
// // .................................................................................    subarray  sum   equals k
// public  class programe{
//     public  static boolean searchArray(int val,int nums[]){
//           int n = nums.length;
//           for(int i=0;i<n;i++){
//                     if(nums[i]==val){
//                            return  true;
//                     }
//           }
//           return  false;
//     } 
//     public static void main(String[] args) {
//           int nums[] = {9,4,20,3,10,5};
//           int n = nums.length;
//           int prefix[] = new int[n+1];
//           prefix[0] = 0;
//           int count=0;
//           for(int i=1;i<prefix.length;i++){
//                  prefix[i] = prefix[i-1]+nums[i];    
//           }
//           HashMap<Integer,Integer> map = new HashMap<>();
//           int target = 33;
//           for(int i=0;i<n;i++){
//                if(prefix[i]==target){
//                       count++;
//                }
//                int val = prefix[i]-target;
//                 if(map.containsKey(val)){
//                        int fre = map.get(val);
//                        count+=fre;
//                 }else{
//                       map.put(val,map.getOrDefault(val, 0)+1);
//                 }
//           }
//           System.out.print(count);
//     } 
// }
// // ...............................................................................   4 Sum 
// public  class  programe{
//      public   static  boolean  searchRow(int mat[][],int i,int target,int m){
//            boolean  found = false;
//             if(mat[i][0]==target){
//                    found = true;
//                          return found;
//             }
//             else if(mat[i][m-1]==target){
//                  found = true;
//                  return  found;
//             }
//               int low = 0;
//               int high = m-1;
//               while(low<high){
//                   int mid = low+(high-low)/2;
//                   if(mat[i][mid]>target){
//                         high = mid-1;
//                   }else if(mat[i][mid]<target){
//                        low = mid+1;
//                   }else if(mat[i][mid]==target){
//                           found = true;
//                             return  true;
//                   }
//               }
//               return  false;
//      }
//       public static void main(String args[]){
//           //    search in  2D matrix
//           int mat[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//            int n = mat.length;
//            int m = mat[0].length;
//            int target = 34;
//            boolean found = false;
//            for(int i=0;i<n;i++){
//                   for(int j=0;j<m;j++){
//                        int  low = mat[i][0];
//                        int high = mat[i][m-1];
//                         if(target>=low  && target<=high){
//                                found = searchRow(mat,i,target,m);
//                                if(found==true){
//                                       System.out.print(found);
//                                       break;
//                                }else{
//                                       System.out.print(found);
//                                        break;
//                                }
//                         }
//                   }
//            }
//       }
// }
// .................................................................................
// import java.util.*;
// // .................................................................  
// public  class  programe{
//      public static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                  this.data = data;
//                  this.left = null;
//                  this.right = null;
//           }
//      }
//      public static class pair{
//      }
//      public static int index=-1;
//      public static Node buildTree(int nodes[]){
//               index++;
//               if(nodes[index]==-1){
//                     return null;
//               }
//               Node root = new Node(nodes[index]);
//               root.left = buildTree(nodes);
//               root.right = buildTree(nodes);
//               return root;
//      }
//      public static  void preOrder(Node root){
//              if(root==null){
//                   return;
//              }
//              System.out.print(root.data +"  ");
//              preOrder(root.left);
//              preOrder(root.right);
//      }
//      public static void levelOrderTravesal(Node root){
//               if(root==null){
//                  return ;
//               }
//               Queue<Node> q = new LinkedList<>();
//                q.add(root);
//                while(!q.isEmpty()){
//                        Node curr = q.poll();
//                                   System.out.print(curr.data +"  ");
//                        if(curr.left!=null){
//                            q.add(curr.left);
//                        }
//                        if(curr.right!=null){
//                             q.add(curr.left);
//                        }
//                }
//      }
//      public static void postOrder(Node root ,Stack<Integer> st){
//                       if(root==null){
//                             return ;
//                       }    
//                       st.add(root.data);
//                       postOrder(root.right, st);
//                       postOrder(root.left, st);
//      }
//      public static int sum =0;
//      public static int sumNodes(Node root){
//                if(root==null){
//                          return 0;
//                }
//                sum += root.data;
//                sumNodes(root.left);
//                sumNodes(root.right);
//                return sum;
//      }
//      public static  void levelOrder(Node root){
//            if(root==null){
//                  return;
//            }
//            Queue<Node> q = new LinkedList<>();
//            q.add(root);
//            q.add(null);
//            while(!q.isEmpty()){
//                    Node curr  = q.poll();
//                    if(curr==null){
//                          if(q.isEmpty()){
//                                   break;
//                          }else{
//                                 System.out.println();
//                          }
//                    }else{
//                          System.out.print(curr.data);
//                          if(curr.left!=null){
//                                 q.add(curr.left);
//                          }else{
//                                 q.add(curr.right);
//                          }
//                    }
//            }
//      }
//      public  static void topView(Node root){
//      }
//      public static void main(String[] args) {
//               int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//               Stack<Integer> st = new Stack<>();
//               int n = nodes.length;
//             Node root =    buildTree(nodes);
//             levelOrder(root);
//           //   levelOrderTravesal(root);
//           //   int ans =   sumNodes(root);
//           //   System.out.print(ans);
//           //     preOrder(root );
//           //     postOrder(root,st);
//           //     while(!st.isEmpty()){
//           //           System.out.print(st.pop());
//           //     }
//      }
// }
// // .....................................................    Reverse a string
// import  java.util.*;
// public  class  programe{
//     public static void helper(){
//          String str = "take12% *&u ^$#forward";
//               int n =  str.length();
//                  StringBuilder sb  = new StringBuilder();
//                 for(int i=0;i<n;i++){
//                        int ascii = (int)str.charAt(i);
//                        if(ascii>=97  &&  ascii<=122){
//                                 char ch =  str.charAt(i);
//                                    sb.append(ch);
//                        }  
//                 }
//                  System.out.print(sb.toString());
//     }
//     public static void helper1(){
//          int n = 4, d=2,a=2;
//         int arr[] = new int[n];
//         arr[0] = d;
//         int i=1;
//         while(i<n){
//                arr[i] = arr[i-1]+d;
//                i++;
//         }
//           for(int num: arr){  
//                System.out.print(num);
//           }
//     }
//       public static int lcs(int nums1[],int nums2[]){
//               int n = nums1.length;
//               int m = nums2.length;
//               int dp[][] = new int[n+1][m+1];
//               for(int i=0;i<n+1;i++){
//                   dp[i][0] = 1;
//               }
//               for(int j=0;j<m+1;j++){
//                   dp[0][j] = 1;
//               }
//               for(int i=1;i<n+1;i++){
//                    for(int j=1;j<m+1;j++){
//                         if(dp[i-1]==dp[j-1]){
//                                  dp[i][j] = dp[i-1][j-1]+1;
//                         }else{
//                              int ans = dp[i-1][j];
//                              int ans2 = dp[i][j-1];
//                              dp[i][j] = Math.max(ans,ans2);
//                         }
//                    }
//               }
//                 return dp[n][m];
//       }
//     public static void longestIncreaseing(int nums[]){
//                 int n = nums.length;
//              HashSet<Integer> set = new HashSet<>();
//              for(int num:  nums){
//                   set.add(num);
//              }
//              int m = set.size();
//              int nums2[] = new int[m];
//              int i=0;
//              for(int val : set){
//                       nums2[i++] = val;
//              }
//              Arrays.sort(nums2);
//             int ans =    lcs(nums,nums2);
//               System.out.print(ans);
//     }
//     public static void main(String[] args) {
//           int nums[] = {21,12,13,-2,-12};
//           int n = nums.length;
//           int  sum=0;
//               Arrays.sort(nums);
//               int min = nums[0];
//               int max = nums[n-1];
//               for(int i=0;i<n;i++){
//                    if(nums[i]<0){
//                          min= Math.max(nums[i], min);
//                    }
//               }
//                      System.out.print(min+max);
//     }
// }
// // .............................................................................  insert the character at  teh given postion
// import java.util.*;
// public class programe{
//      public static void findFreq(){
//           String str = "google";        
//           int n = str.ength();
//         //   str = str.split(" ");
//           int freq[] = new int[26];
//           for(int i=0;i<n;i++){
//                 freq[str.charAt(i)-'a']++;
//           }
//           ArrayList<Character> ans = new ArrayList<>();
//           for(int i=0;i<n;i++){
//               if(freq[str.charAt(i)-'a']==1   && freq[str.charAt(i)-'a']!=0 ){
//                        ans.add(str.charAt(i));
//               }
//           }
//           for(char ch: ans){
//                 System.out.print(ch +" " );
//           }
//      }
//      public  static void printDuplicate(){
//               String str = "sinstriiintng";
//               int n = str.length();
//               Map<Character,Integer> map = new HashMap<>();
//               for(int i=0;i<n;i++){
//                   char ch = str.charAt(i);
//                   map.put(ch,map.getOrDefault(ch,0)+1);
//               }
//                for(Map.Entry<Character,Integer> e: map.entrySet()){
//                        if(e.getValue()>1){
//                               System.out.print(e.getKey() +"  -> " + e.getValue());
//                        }
//                }
//      }
//      public static void changeCase(){
//               String str = "javA";
//               StringBuilder sb = new StringBuilder();
//               int n = str.length();
//               for(int i=0;i<str.length();i++){
//                    int ascii =  (int)str.charAt(i);
//                    if(ascii>=60  &&  ascii<=90){
//                        sb.append((char)(ascii+32));  //  converted into the uppercase
//                    }else if(ascii>=97  && ascii<=122){ 
//                          sb.append((char)(ascii-32));
//                    }else if(str.charAt(i)==' '){
//                         sb.append(" ");
//                    }
//               }
//                System.out.print(sb.toString());
//      }
//       public static int countFreq(String words){
//            Map<Character,Integer> map = new HashMap<>();
//             for(char ch: words){
//                   map.put(ch,map.getOrDefault(ch,0)+1);
//             }
//             int  count=0;
//               if(Map.Entry<Character,Integer>  e: map.entryset()){
//                     if(e.getValue()>1){
//                           count++;
//                     }
//               }
//               return count;
//       }
//      public static void highestRepeatedCharacter(){
//                String str = "abcdefghij google microsoft" ;
//                String  word[] = str.split(" ");
//               Map<String,Integer> map = new HashMap<>();   
//                  for(String words : word){
//                          int    count = countFreq(words);
//                            map.put(words,count);
//                  }
//                  int max = 0;
//                  String ans = "";
//                  for(Map.Entry<String,Integer> e : map.entryset()){
//                              int count = e.getValue();
//                              if(max<count){
//                                   max = count;
//                                   ans += e.getKey();
//                              }
//                  }
//                  System.out.print(ans);
//      }
//     public static void main(String args[]){
//         //   findFreq();
//         //   printDuplicate();
//         // changeCase();
//         highestRepeatedCharacter();
//     }
// }
// ...........................................................................
// import java.util.HashMap;
// // .............................................................  tcs coding questions
// public  class  programe{
//      public static void DecimalToBinary(){
//             int num  = 45;
//          int pow = 1;
//          int ans = 0;
//          while(num>0){
//                  int rem = num%2;
//                  num  /= 2;
//                  ans   += (rem*pow);
//                  pow *= 10;
//          }
//          System.out.print(ans);
//      }
//      public static void BinaryToDecimal(){
//           int  num = 10001;
//           int ans = 0;
//           int start = 1;
//           while(num>0){
//                  int rem = num%10;
//                   ans += (rem*start);
//                   num  /= 10;
//                   ans *= 2;
//           }
//            System.out.print(ans);
//      }
//      public  static void sortByFre(int arr[]){
//           int n = arr.length;
//           HashMap<Integer,Integer> map  = new HashMap<>();
//           for(int i: arr){
//               map.put(i,map.getOrDefault(i, 0)+1);
//           }
//           int max =0;
//             for(HashMap.Entry<Integer,Integer> e : map.entrySet()){
//             }
//      }
//     public static void main(String[] args) {
//     }
// }
// ......................................................................
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// ...................................................... BFS
// public  class programe{
//     public class  Edge{
//          int src ;
//          int des;
//          int wt;
//     }
//     public  static void BFS(ArrayList<Edge> graph[]){
//             Queue<Integer> q = new LinkedList<>();
//             boolean visited[] =  new boolean[6];
//             q.add(0);
//             while(!q.isEmpty()){
//                  int curr = q.poll();
//                  if(!visited[curr]){
//                        System.out.print(curr+" ");
//                        visited[curr] = true;
//                        for(int i=0;i<graph[curr].size();i++){
//                                  Edge e = graph[curr].get(i);
//                                  q.add(e.des);
//                        }
//                  }
//             }
//     }
//     public static void DFS(ArrayList<Edge> graph[],int src,int des){
//             boolean vis[] = new boolean[6];
//             for(int i=0;i<6;i++){
//                  for(int j=0;j<graph[i].size();j++){
//                       if(!vis[j]){
//                             vis[j] = true;
//                                DFS(graph, graph[i].get(src), );
//                       }
//                  }
//             }
//     }
//     public static void main(String[] args) {
//     }
// }
// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// // ............................................................    create  the graph
// public class  programe{
//     public  static class  Edge{
//           int src;
//           int des;
//           int wt;
//           public Edge(int src,int des,int wt){
//                   this.src = src;
//                   this.des = des;
//                   this.wt = wt;
//         }
//     }
//      public static void bfs(ArrayList<Edge> graph[] ,int v){
//            Queue<Edge> q = new LinkedList<>();
//             q.add(new Edge(0,0,0));
//             while(!q.isEmpty()){
//                   Edge e = q.poll();
//                    int src = e.src;
//                    int des = e.des;
//                    int wt = e.wt;
//                    System.out.print(des +" ");
//                    for(Edge e : graph[src].get(des)){
//                    }
//             }
//      }
//     public static void main(String[] args) {
//            ArrayList<Edge>graph[] = new ArrayList[6];
//            for(int i=0;i<6;i++){
//                 graph[i] = new ArrayList<>();
//            }
//             graph[0].add(new Edge(0,1,5));
//             graph[1].add(new Edge(1,0,5));
//             graph[1].add(new Edge(1,2,3));
//             graph[2].add(new Edge(2,1,4));
//             graph[2].add(new Edge(2,3,5));
//             graph[3].add(new Edge(3,2,4));
//             graph[3].add(new Edge(3,1,2));
//             graph[4].add(new Edge(4,2,4));
//             for(int i=0;i<6;i++){
//                    for(int j=0;j<graph[i].size();j++){
//                           int src = graph[i].get(j).src;
//                           int des = graph[i].get(j).des;
//                           int wt  = graph[i].get(j).wt;
//                           System.out.print(i + "-> "+ src + "  "+ des +" " + wt);
//                    }
//                    System.out.println();
//             }
//     }
// }
// .....................................................................
// import java.util.ArrayList;
// // .................................................. find the all subset of the  string
// public  class programe{
//     public static void helper(String s,int n,int i, ArrayList<String> ans,StringBuilder sb){
//             if(i>=s.length()){
//                   ans.add(sb.toString());
//                   return;
//             }
//                sb.add(s.substring(0, i).toString());
//                 for(int j=0;j<i;j++){
//                          helper(s,n,i+1,ans,sb);
//                 }
//     }
//     public static void main(String[] args) {
//              String s = "abcd";
//              int n = s.length();
//              int i=0;
//              StringBuilder sb = new StringBuilder();
//              ArrayList<String> ans = new ArrayList<>();
//               helper(s,n,i,ans,sb);
//               for(String str: ans){
//                   System.out.print(str);
//               }
//     }
// }
// ....................................................................
// public  class  programe{
//     public static void changeArray(int arr[],int i,int val){
//             if(i>=arr.length){
//                     return;
//             }
//              arr[i] = val;
//              changeArray(arr, i+1, val+1);
//              arr[i] -= 2;
//     }
//     public static void printArray(int arr[]){
//            for(int i: arr){
//                 System.out.print(i +" ");
//            }
//     }
//      public static void main(String[] args) {
//             int arr[] = new int[5];
//                changeArray(arr,0,1);
//                printArray(arr);
//      }
// }
// import java.util.*;
// public class programe{
//       public static void main(String args[]){
//               String s = "abc\\p\"";
//               String str[] = s.split("\\s+");
//               int n = s.length();
//               if(str==null){
//                     return ;
//               }
//               System.out.print(str.length);
//       }
// }
// ...........................................................
// public class programe{
//       public static void main(String args[]){
//               String s  = "geeksforgeeks";
//               char ch[] = s.toCharArray();
//               Arrays.sort(ch);
//               String newStr= new String(ch);
//                System.out.print(newStr);
//       }
// }
// import java.util.*;
// public class programe{
//       public static void main(String args[]){
//                String str = "geeksforgeeks";
//              int n = str.length();
//              Map<Character,Integer> map = new HashMap<>();
//              for(int i=0;i<n;i++){
//                     char ch = str.charAt(i);
//                     map.put(ch,map.getOrDefault(ch,0)+1);
//              }
//              int max =0;
//              int ans=0;
//              for(int i=0;i<n;i++){
//                     char ch = str.charAt(i);
//                     max = map.get(ch);
//                     ans = Math.max(ans,max);
//              }
//              System.out.print(ans);
//       }
// }
// import java.util.*;
// import  java.util.Arrays;
// // ........................................  sort the character in string
// public  class  programe{
//     public static void helper(){
//           String s = "zxcbg";
//            int n = s.length();
//            char arr[] = s.toCharArray();
//            Arrays.sort(arr);
//                 StringBuilder sb = new StringBuilder();
//                 for(char ch : arr){ 
//                       sb.append(ch);
//                   }
//                   System.out.print(sb.toString());
//     }
//     public static void countVowels(){
//           String s = "Take u forward is Awesome";
//             int n = s.length();
//                      int vowel = 0;
//                      int conso =0;
//                      int space = 0;
//                       String str_upper = s.toLowerCase();
//                       char ch[] = str_upper.toCharArray();
//                       for(int i=0;i<n;i++){
//                            char c = s.charAt(i);
//                            if(c==' '){
//                                  space++;
//                            }
//                       }
//                       for(char c : ch){
//                              if(c=='a' ||  c=='e' || c=='i' || c=='o' || c=='u'){
//                                       vowel ++;
//                              }else{
//                                   conso++;
//                              }
//                       }
//                          System.out.print(vowel +"   " + (conso-space)  +"  " + space);
//     }
//     public static void deleteVowels(){
//           String s = "take u forward";
//                     StringBuilder sb = new StringBuilder(s);
//                        for(int i=0;i<sb.length();i++){
//                          char ch = s.charAt(i);
//                             if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'  || ch=='u'){
//                                      sb.deleteCharAt(i);
//                                      i--;
//                             }
//                        }
//                        System.out.print(sb.toString());
//     }
//     public static void helper1(){
//            String s = "a+((b-c)+d)";
//                    int n = s.length();
//                    char arr[] = s.toCharArray();
//                    StringBuilder sb = new StringBuilder();
//                     for(char ch : arr){
//                           if(ch=='(' || ch==')'){
//                                continue;
//                           }else{
//                                sb.append(ch);
//                           }
//                     } 
//                      System.out.print(sb.toString());
//     }
//     public static void capitalizeFirstAndLast(){
//           String s = "take u forward is awesome";
//                 StringBuilder sb = new StringBuilder();
//                   String arr[] = s.split(" ");
//                   for(int i=0;i<arr.length;i++){
//                          String word = arr[i];
//                          StringBuilder ans = new StringBuilder();
//                         //  StringBuilder wordString = new StringBuilder();
//                            if(word.length()==1){
//                                  String newAns = word.toUpperCase();
//                                   ans.append(newAns);
//                            }
//                            for(int j=0;j<word.length();j++){
//                                    if(i==0  || i==word.length()-1){
//                                           char ch =  word.charAt(i);
//                                           char upper = Character.toUpperCase(ch);
//                                            ans.append(upper);
//                                    }
//                                    ans.append(word.charAt(j));
//                            }
//                            sb.append(ans);
//                   }
//                   System.out.print(sb.toString());
//     }
//       public static  void findMostFrequentNumber(){
//       }
//      public static void main(String[] args) {
//    String s = "takeuforward";
//    char arr[] = s.toCharArray();
//    Arrays.sort(arr);
//     StringBuilder sb = new StringBuilder();
//     for(int i=0;i<arr.length-1;i++){
//             char current = arr[i];
//             int count=0;
//             char unique = current;
//             while(current==arr[i]){
//                    count++;
//             }
//             sb.append(unique);
//              sb.append(String.valueOf(count));
//     }
//      System.out.print(sb.toString());
//      }
// }
// import java.sql.ResultSet;
// public  class  programe{
//     public static void main(String[] args) {
//            int arr[] = {5,3,7,14,18,1,4,3,8};
//            int n = arr.length;
//            int st = 0;
//            int  end = 0;
//            int  k = 15;
//             int result_st = Integer.MIN_VALUE;
//             int result_end = Integer.MIN_VALUE;
//               while(end<n){
//                     int sum = 0;
//                     sum += arr[end];
//                      while(sum>k){
//                            sum -= arr[st];
//                            st++;
//                      }
//                      if(sum==k){
//                            if(end-st>0  && result_st!=Integer.MIN_VALUE   &&  result_end!=Integer.MIN_VALUE){
//                                  result_st =  st;
//                                  result_end = end;
//                            }
//                      }
//                       end++;
//               }
//                 if(result_end!=Integer.MIN_VALUE  && result_st!=Integer.MIN_VALUE){
//                             System.out.print(result_st  +"  " +  result_end);
//                 }else{
//                         System.out.print("No solution exist");
//                 }
//     }
// }
// ..................................................................
// import java.util.Arrays;
// // ............................  minimum jump to reach the destination
// public  class programe{
//     public static int helper(int arr[]){
//         int n = arr.length;
//         int dp[] = new int[n];
//          Arrays.fill(dp, -1);
//             dp[n-1] = 0;
//             for(int i=n-2;i>=0;i--){
//                  int steps = arr[i];
//                  int ans = Integer.MAX_VALUE;
//                  for(int j=i+1;j<=steps+i && j<n;j++){
//                         if(dp[j]!=-1){
//                             ans = Math.min(ans,dp[j]+1);
//                         }
//                  }
//                  if(ans!=Integer.MAX_VALUE){
//                        dp[i] = ans;
//                  }
//             }
//            return  dp[0];
//     }
//     public static void main(String[] args) {
//           int arr[] = {1,4,2,5,6,2};
//           int n =arr.length;
//          int ans = helper(arr);
//          System.out.print(ans);
//     }
// }
// // ...................................................   Minimum partioning in  the array
// public  class programe{
//     public static int helper(int arr[]){
//         int n = arr.length;
//          int sum=0;
//           for(int i=0;i<n;i++){
//                   sum += arr[i];
//           }
//           int half = sum/2;
//           int dp[][] = new int[n+1][half+1];
//           for(int i=1;i<n+1;i++){
//               for(int j=1;j<half+1;j++){
//                    if(arr[i-1]<=j){
//                         dp[i][j]   = Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
//                    }else{
//                         dp[i][j] = dp[i-1][j];
//                    }
//               }
//           }
//             int sum1 = dp[n][half];
//             int sum2 = sum-sum1;
//             return  Math.abs(sum1-sum2);
//     }
//     public static void main(String[] args) {
//            int arr[] = {1,6,11,5};
//            int n = arr.length;
//          int ans=  helper(arr);
//          System.out.print(ans);
//     }
// }
// // ...............................................................find the string is palinddrome or not
// import java.util.Arrays;
// public class programe{
//     public static int isPalindrome(int i,int j,String str,int dp[][]){
//               if(i==j){
//                   return 1;
//               }
//              if(dp[i][j]!=-1){
//                      return dp[i][j];
//              }
//               if(str.charAt(i)==str.charAt(j)){
//                       dp[i][j] = 1+isPalindrome(i+1, j-1, str, dp);
//               }else{
//                   dp[i][j] = 0;
//               }
//                return dp[i][j];
//     }
//     public static void main(String[] args) {
//           String str = "aaba";
//           int  n = str.length();
//           int dp[][] = new int[n][n];
//           for(int row[]: dp){
//                 Arrays.fill(row,-1);
//           }
//           int res = 0;
//           for(int i=0;i<n;i++){
//               for(int j=i+1;j<n;j++){
//                 if(isPalindrome(i,j,str,dp)==1){
//                       res++;
//                 }
//               }
//           }
//     }
// }
// ........................................................  find the shortest path in the graph using the  bellman ford algorithm
// public class programe{
//     public static void main(String args[]){
//             String s = "01212";
//             int res = Integer.MAX_VALUE;
//             boolean zero = false;
//             boolean one = false;
//             boolean two = false;
//             int oneIndex =0;
//             int zeroIndex =0;
//             int twoIndex =0;
//             int n = s.length();
//             for(int i=0;i<n;i++){
//                     if(s.charAt(i)=='0'){
//                            zero = true;
//                            zeroIndex = i;
//                     }else if(s.charAt(i)=='1'){
//                            one =  true;
//                            oneIndex = i;
//                     }else if(s.charAt(i)=='2'){
//                            two = true;
//                            twoIndex = i;
//                     }
//                     if(one && zero && two){
//                           res = Math.max(oneIndex,Math.max(zeroIndex,twoIndex))-Math.min(oneIndex,Math.min(zeroIndex,twoIndex));
//                     }
//             }
//             if(res!=-1){
//                   res = res+1;
//             }
//             System.out.print(res);
//     }
// }
// // ..........................................................   detect cycle in  undirected  graph
// public class  programe{
//        public static boolean dfs(boolean visited[],int u,int parent,ArrayList<ArrayList<Integer>>adj){
//              if(!visited[u]){
//                     visited[u]  = true;
//              }
//               for(int i :  adj.get(u)){
//                    if(!visited[i]){
//                        if(dfs(visited,i,parent,u)){
//                             return  true;
//                        }
//                    }else if(i != parent){
//                             return
//                    }
//               }
//               return false;
//        }
//     public static boolean helper(){
//                  int v = 5;
//              boolean visited[]  = new boolean[v];
//              ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//              for(int i=0;i<v;i++){
//                    if(!visited[i]){
//                        if(dfs(visited,i,-1,adj)){
//                           return  true;
//                        }
//                    }
//              }
//              return false;
//     }
//      public static void main(String[] args) {
//      }
// }
// // ............................................  catlans' number  using the tabulation
// public  class  programe{
//     public static void main(String[] args) {
//            int n = 5;
//            int dp[] = new int[n+1];
//             dp[0] = 1;
//             dp[1] = 1;
//             for(int i=2;i<=n;i++){
//                   for(int j=0;j<i;j++){
//                        dp[i]  += dp[j]*dp[i-j-1];
//                   }
//             }
//             System.out.print(dp[n]);
//     }
// }
// .........................................  mountain ranges
// public  class  programe{
//     public static void main(String[] args) {
//            int n=4;
//            int dp[] = new int[n+1];
//            dp[0] = 1;
//            dp[1]= 1;
//            for(int i=2;i<=n;i++){
//              for(int j=0;j<i;j++){
//                    dp[i] += dp[j]*dp[i-j-1];
//              }
//            }
//     }
// }
// // ............................................................    catlan's number using the recursionm
// public class programe{
//     public static int catlans(int n,int dp[]){
//           if(n==0){
//               return 1;
//           }
//           if(n==1){
//               return 1;
//           }
//           int ans =0;
//            for(int i=0;i<=n;i++){
//               ans += catlans(i,dp)*catlans(n-i-1,dp);
//            }
//            dp[n] = ans;
//            return ans;
//     }
//     public static void main(String args[]){
//         int n = 5;
//          int dp[] = new int[n+1];
//           for(int i=0;i<=n;i++){
//               dp[i] = -1;
//           }
//           System.out.print(catlans(n,dp));  
//     }
// }
// // ....................................................  longest common subsequence
// public class programe{
//     public static  int helper(int dp[][],String s1,String s2,int n,int m){
//             if(n==0 || m==0){
//                   return 0;
//             }
//             if(dp[n][m]!=-1){
//                   return dp[n][m];
//             }
//             if(s1.charAt(n-1)==s2.charAt(m-1)){
//                     dp[n][m] = 1+helper(dp, s1, s2, n-1, m-1);
//                     return dp[n][m];
//             }else{
//                     dp[n][m]  = Math.max(helper(dp,s1,s2,n-1,m),helper(dp,s1,s2,n,m-1));
//                     return dp[n][m];
//             }
//     }
//     public static void main(String[] args) {
//            String s1 = "abcde";
//            String s2 = "ace";
//            int n = s1.length();
//            int m = s2.length();
//            int dp[][] = new int[n+1][m+1];
//            for(int i=0;i<n+1;i++){
//               for(int j=0;j<m+1;j++){
//                     dp[i][j] = -1;
//               }
//            }
//           int ans =   helper(dp,s1,s2,n,m);
//           System.out.print(ans);
//     }
// }
// // ...................................................  0 1 knapsack using the memoization
// public class  programe{
//     public static int helper(int values[],int wights[],int n,int W,int dp[][]){
//           if(n==0  || W==0){
//                 return 0;
//           }
//           if(dp[n][W]!=0){
//               return dp[n][W];
//           }
//           if(wights[n-1]<=W){
//                int take = values[n-1]+helper(values, wights, n-1, W-wights[n-1], dp);
//                int notTake = helper(values,wights,n-1,W,dp);
//                return dp[n][W] = Math.max(take,notTake);
//           }
//           else{
//                   return dp[n][W] = helper(values,wights,n-1,W,dp);
//           }
//     }
//     public static void main(String args[]){
//           int values[] = {60,100,120};
//            int wights[] = {10,20,30};
//             int W  = 50;
//              int n = values.length;
//              int dp[][] = new int[n+1][W+1];
//             int ans =  helper(values,wights,n,W,dp);
//             System.out.print(ans);
//     }
// }
// // ......................................................  0 1 knapsac problem
// public class  programe{
//     public static int helper(int n,int W,int values[],int wights[]){
//             if(n==0  || W==0){
//                    return 0;
//             }
//             if(wights[n-1]<=W){
//                   int take  = values[n-1]+helper(n-1,W-wights[n-1],values,wights);
//                   int notTake = helper(n-1,W,values,wights);
//                    return Math.max(take,notTake);
//             }
//               return helper(n-1,W,values,wights);
//     }
//     public static void main(String[] args) {
//           int values[] = {60,100,120};
//           int wights[] = {10,20,30};
//           int n = values.length;
//           int W  = 50;
//         int ans =    helper(n,W,values,wights);
//           System.out.print(ans);
//     }
// }
// // ..............................................................count the uppercase and the lower case if the upper case >lowercase then convert whole string into the uppercase
// public class programe{
//     public static void main(String args[]){
//            String s = "AbCdEfG";
//            int n = s.length();
//            int upperCase =0;
//            int lowerCase=0;
//            for(char ch : s.toCharArray()){
//               if(Character.isUpperCase(ch)){
//                    upperCase++;
//               }else{
//                   lowerCase++;
//               }
//            }
//            if(upperCase>lowerCase){
//                 System.out.print(s.toUpperCase());
//            }else{
//               System.out.print(s.toLowerCase());
//            }
//     }
// }
// ...................................................................................
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Comparator;
// // ................................................................. coin  change problem
// public  class programe{
//       public static void main(String[] args) {
//              int amount = 121;
//              Integer coins[] = {1,2,5,10,20,50,100,200,500,1000,2000};
//              int n = coins.length;
//              int ans=0;
//              ArrayList<Integer> list = new ArrayList<>();
//               Arrays.sort(coins,Comparator.reverseOrder());
//               for(int i=0;i<n;i++){
//                    if(amount>=coins[i]){
//                        while(amount>=coins[i]){
//                              list.add(coins[i]);
//                              amount -= coins[i];
//                              ans++;
//                        }
//                    }
//               }
//                 System.out.print(list);
//       }
// }
// import java.util.Arrays;
// import java.util.Comparator;
// // ................................................................  maximum chain length  from given pair
// public  class programe{
//      public static void main(String[] args) {
//            Integer  pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
//            int n = pairs.length;
//            int ans =0;
//              Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
//              int lastEnd = pairs[0][1];
//              for(int i=1;i<n;i++){
//                     if(pairs[i][0]>lastEnd){
//                            ans++;
//                            lastEnd = pairs[i][1];
//                     }
//              }
//              System.out.print(ans);
//      }
// }
// import java.util.Arrays;
// // ................................................... minimum absolute difference in arr
// public class programe{
//      public static void main(String[] args) {
//             int a[] = {1,2,3};
//             int b[] = {2,3,1};
//             Arrays.sort(a);
//             Arrays.sort(b);
//             int n = a.length;
//             int m = b.length;
//             int diff =0;
//             for(int i=0;i<n;i++){
//                  diff += Math.abs(a[i]-b[i]);
//             }
//             System.out.print(diff);
//      }
// }
// // .................................  build a tree 
// public class programe{
//      public static  class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data) {
//              this.data = data;
//              this.left = null;
//              this.right = null;
//         }
//      }
//      public static Node insert(int val,Node root){
//          if(root==null){
//              root= new Node(val);
//              return  root;
//          }
//          if(root.data>val){
//               root.left = insert(val, root.left);
//          }
//          if(root.data<val){
//               root.right = insert(val,root.right);
//          }
//          return root;
//      }
//      public static boolean search(Node root,int key){
//              if(root==null){
//                    return false;
//              }
//              if(root.data==key){
//                      return true;
//              }
//              if(root.data>key){
//                   return search(root.left,key);
//              }
//             else{
//                      return search(root.right,key);
//             }
//      }
//      public static Node findIS(Node root){
//           while(root.left!=null){
//               root = root.left;
//           }
//             return root;
//      }
//      public static Node delete(Node root,int key){
//           if(key<root.data){
//                root.left = delete(root.left,key);
//           }else if(key>root.data){
//                 root.right = delete(root.right, key);
//           }else{
//               if(root.left==null && root.right==null){
//                      return null;
//               }else if(root.left==null){
//                       return root.right;
//               }
//                 Node IS  = findIS(root.right);
//                 root.data = IS.data;
//               root.right=   delete(root.right,IS.data);
//               return root;
//           }
//           return root;
//      }
//      public static void printRange(Node root,int k1,int k2){
//               if(root==null){
//                     return;
//               }
//               if(k1<root.data  && k2>root.data){
//                     printRange(root.left, k1, k2);
//                     System.out.print(root.data);
//                     printRange(root.right, k1, k2);
//               }else if(k1<root.data  &&  k2<root.data){
//                    printRange(root.left, k1, k2);
//                      System.out.print(root.data);
//               }
//               else{
//                  printRange(root.right, k1, k2);
//                    System.out.print(root.data);
//               }
//      }
//     public static void main(String[] args) {
//         int values[] = {5,1,3,4,2,7};
//         int n = values.length;
//         Node root = null;
//          for(int i=0;i<n;i++){
//                insert(values[i], root);
//          }
//            int key =3;
//            boolean found = search(root,key);
//            if(found){
//                 System.out.print("Found"); 
//            }else{
//                 System.out.print("Not Found");
//            }
//     }
// }
// import java.util.Queue;
// import java.util.LinkedList;
// // ...............................................................  reverse the element by k
// public class programe{
//     public static  void reverse(Queue<Integer> q,int k){
//            if(q.isEmpty()){
//                return;
//            }
//            if(k==0){
//                return;
//            }
//            int data = q.poll();
//               reverse(q,k-1);
//               q.add(data);
//     }
//     public static void main(String[] args) {
//           Queue<Integer> q =  new LinkedList<>();
//           q.add(1);
//           q.add(2);
//           q.add(3);
//           q.add(4);
//           int k   = 3;
//            reverse(q,k);
//            while(!q.isEmpty()){
//                 System.out.print(q.poll());
//            }
//     }
// }
// ................................................................
// import java.util.LinkedList;
// import java.util.Queue;
// // ......................................................  
// public class programe{
//     public static void  printQueue(Queue<Integer> q){
//              while(!q.isEmpty()){
//                     System.out.print(q.poll());
//              }
//     }
//     public static void reverseQ(Queue<Integer> q){
//           if(q.isEmpty()){
//                 return ;
//           }
//           int data = q.poll();
//           reverseQ(q);
//           q.add(data);
//     }
//     public static void main(String[] args) {
//           Queue<Integer> q = new LinkedList<>();
//           q.add(1);
//           q.add(2);
//           q.add(3);
//           q.add(4);
//           reverseQ(q);
//           printQueue(q);
//     }
// }
// ..............................................
// import javax.crypto.NullCipher;
// import javax.swing.RootPaneContainer;
// // ...............................................................  create the trie Node 
// public class programe{
//        public static class TrieNode{
//           TrieNode children[] ;
//           boolean leaf;
//         public TrieNode() {
//               children = new TrieNode[26];
//               leaf = false;
//         }
//        }
//       public static TrieNode root  = new TrieNode();
//          public static void insert(String key){
//                 TrieNode curr = root;
//                   for(char ch : key.toCharArray()){
//                         int index =  ch-'a';
//                          if(curr.children[index]==null){
//                                   curr.children[index] = new TrieNode();
//                          }
//                          curr = curr.children[index];
//                   }
//                   curr.leaf  = true;
//          }
//          public static boolean search(String key){
//                       TrieNode curr = root;
//                     for(char ch : key.toCharArray()){
//                             int index = ch-'a';
//                                if(curr.children[index]==null){
//                                      return false;
//                                }
//                              curr = curr.children[index];
//                     }
//                     return true;
//          }
//          public static boolean isPrefixes(String key){
//                 TrieNode curr = root;
//                 for(char ch : key.toCharArray()){
//                           int index = ch-'a';
//                          if(curr.children[index]==null){
//                                   return false;
//                          }
//                          curr =  curr.children[index];
//                 }
//                 return  true;
//          }
//     public static void main(String args[]){
//     }
// }
// import java.util.Arrays;
// // ................................................................  word break
// public class programe{
//     public static boolean helper(int i,String s , String dictionary[]){
//            if(i==s.length()){
//                 return true;
//            }
//              String prefix = "";
//              for(int j=i;j<s.length();j++){
//                    prefix += s.charAt(j);
//                    if(Arrays.asList(dictionary).contains(prefix) && helper(j+1,s,dictionary)){
//                                 return true;
//                    }
//              }
//              return false;
//     }
//     public static void main(String args[]){
//                String s = "ilike";
//         String[] dictionary = { "i", "like", "gfg" };
//         System.out.print(helper(0,s,dictionary));
//     }
// }
// ............................................................   Edit Distance
// public class programe{
//     public static int helper(String s1,String s2,int n,int m){
//            if(m==0){
//                return  0;
//            }
//            if(n==0){
//              return 0;
//            }
//            if(s1.charAt(m-1)==s2.charAt(n-1)){
//                   return helper(s1,s2,n-1,m-1);
//            }
//            return Math.min(helper(s1,s2,n-1,m-1),Math.min(helper(s1,s2,n-1,m),helper(s1,s2,n,m-1)))+1;
//     }
//     public static void main(String args[]){
//           String s1 = "abcd";
//           String s2 = "bcfe";
//           int n = s1.length();
//           int m = s2.length();
//          int ans =  helper(s1,s2,n,m);
//          System.out.print(ans);
//     }
// }
// .................................................................longest increasing subsequece
// public class programe{
//     public static int helper(int arr[],int i){
//            if(i==0){
//              return  1;
//            }
//              int max = 1;
//              for(int index=0;index<i;index++){
//                    max = Math.max(max,helper(arr,index)+1);
//              }
//              return max;
//     }
//     public static void main(String[] args) {
//         int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60};
//         int n = arr.length;
//        int ans =1;
//         for(int i=0;i<n;i++){
//             ans =    helper(arr,i);
//         }
//             int max=1;
//             max = Math.max(max,ans);
//               System.out.print(max);
//     }
// }
// .....................................................
// import java.util.*;
// // ......................................................... count the distinct element in k  window
// public class programe{
//     public static void main(String args[]){
//          int arr[] = {1, 2, 1, 3, 4, 2, 3};
//          int n = arr.length;
//          int k = 4;
//          ArrayList<Integer> list = new ArrayList<>();
//          for(int i=0;i<=n-k;i++){
//               HashSet<Integer> set = new HashSet<>();
//                for(int j=i+1;j<i+k;j++){
//                    set.add(arr[j]);
//                }
//                list.add(set.size());
//          }
//            System.out.print(list);
//     }
// }
// ............................................................  calculate the maximum length  
// ......................................................................
// import java.util.HashMap;
// // ...............................................     return the kth non repeating character from the string
// public class programe{
//     public static void main(String[] args) {
//           String s = "geekforgeeks";
//           int n = s.length();
//           HashMap<Character,Integer> map = new HashMap<>();
//           for(int i=0;i<n;i++){
//                 map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
//           }
//            int k =3;
//            int count=0;
//              StringBuilder sb = new StringBuilder();
//               char ch1  = '\0';
//           for(char ch: s.toCharArray()){
//                     if(map.get(ch)>1){
//                           continue;
//                     }
//                     count++;
//                    if(count==k){
//                          sb.append(ch);
//                          ch1 = ch;
//                    }
//           }
//           System.out.print(sb.toString() +"  " + ch1);
//     }
// } 
// .................................................................
// import java.util.*;
// import java.util.ArrayList;
// // ................................................................genetrate  all the binary string withous consecutivre 1's
// public  class programe{
//     public static void helper(int i, StringBuilder sb, ArrayList<String> ans){
//              if(i>=sb.length()){
//                    ans.add(sb.toString());
//                    return ;
//              }
//              helper(i+1,sb,ans);
//              sb.charAt(i,'1');
//              helper(i+2,sb,ans);
//              sb.charAt(i,'0');
//     }
//     public static void main(String[] args) {
//           int n = 4;
//           StringBuilder sb = new StringBuilder();
//           for(int i=0;i<n;i++){
//                sb.append("0");
//           }
//           ArrayList<String> ans = new ArrayList<>();
//              helper(0,sb,ans);
//     }
// }
// // ...........................................................   zig zag linked list traversal
// public  class programe{
//     public static class Node{
//             int data;
//             Node next;
//             Node(int data){
//                   this.data = data;
//                   this.next = null;
//             }
//     }
//     public static Node getMid(Node head){
//              Node slow =head;
//              Node fast = head.next;
//              while(fast!=null  || fast.next!=null){
//                    fast = fast.next.next;
//                    slow = slow.next;
//              }
//              return slow;
//     }
//     public static Node reversNode(Node right){
//             Node curr = right;
//             Node prev = null;
//             Node next ;
//             while(curr!=null  || curr.next!=null){
//                      next = curr.next;
//                      curr.next = prev;
//                      prev  = curr;
//                      curr = next;
//             }
//             return prev;
//     }
//     public static Node zigzag(Node head){
//               if(head==null  || head.next==null){
//                   return null;
//               }
//                 Node main   = head;
//             Node mid  = getMid(head);
//             Node right = mid.next;
//             mid.next = null;
//             Node rightHead = reversNode(right);
//             Node leftHead = head;
//             Node nextLeft,nextRight;
//             while(leftHead!=null  && rightHead!=null){
//                     nextLeft = leftHead.next;
//                     leftHead.next = rightHead;
//                     nextRight = rightHead.next;
//                     rightHead.next = nextLeft;
//                     leftHead = nextLeft;
//                     rightHead = nextRight;
//             }
//             return main;
//     }
//     public static void main(String[] args) {
//          Node head  = new Node(1);
//          head.next = new Node(2);
//          head.next.next = new Node(3);
//          head.next.next.next = new Node(4);
//          head.next.next.next.next = new Node(5);
//          head =   zigzag(head);
//          while(head!=null){
//               System.out.print(head.data);
//               head  = head.next;
//          }
//     }
// }
// .........................................................
// import java.util.LinkedList;
// public  class programe{
//      public static class Node{
//            int data;
//            Node next;
//            Node(int data){
//                 this.data = data;
//                   this.next = null;
//            }
//      }
//      public static Node getMid(Node head){
//           Node slow = head;
//           Node fast = head.next;
//           while(fast!=null  || fast.next!=null){
//                 slow = slow.next;
//                 fast = fast.next.next;
//           }
//            return slow;
//      }
//        public static Node merge(Node head1,Node head2){
//                             Node dummy = new Node(-1);
//                             Node temp  = dummy;
//                           while(head1!=null   &&head2!=null){
//                                 if(head1.data<=head2.data){
//                                        temp.next = head1.next;
//                                        head1 = head1.next;
//                                          temp  = temp.next;
//                                 }else{
//                                         temp.next = head2.next;
//                                          head2 = head2.next;
//                                          temp = temp.next;
//                                 }
//                           }
//                           while(head1!=null){
//                                 temp.next = head1.next;
//                                 temp = temp.next;
//                                 head1 = head1.next;
//                           }
//                           while(head2!=null){
//                                   temp.next = head2.next;
//                                   temp = temp.next;
//                                   head2 = head2.next;
//                           }
//                         return   temp.next;
//        }
//      public static Node mergeSort( Node head){
//                 Node mid = getMid(head);
//                 Node rightHead = mid.next;
//                   mid.next  = null;
//              Node head1 =     mergeSort(head);
//                 Node head2 =   mergeSort(rightHead);
//                 return merge(head1,head2);
//      }
//     public static void main(String[] args) {
//         Node head = new Node(3);
//           head.next = new Node(1);
//             head.next.next = new Node(4);
//             head.next.next = new Node(0);
//             // while(head!=null || head.next!=null){
//             //       System.out.print(head.data);
//             //       head = head.next;
//             // }
//             mergeSort(head);
//             //   while(head!=null || head.next!=null){
//             //       System.out.print(head.data);
//             //       head = head.next;
//             // }
//     }
// }
// ...........................................
// public class programe{
//     public static class Node{
//          int data;
//          Node left,right;
//          Node(int data){
//                this.data = data;
//                this.left = null;
//                this.right = null;
//          }
//     }
//    public static void printLeaft(Node root){
//         if(root==null){
//               return ;
//         }
//         if(root.left==null  && root.right==null){
//                  System.out.println(root.data +" ");
//                  return ;
//         }
//         if(root.left!=null){
//               printLeaft(root.left);
//         }
//         if(root.right!=null){
//               printLeaft(root.right);
//         }
//    }
//    public static Node printLeaft1(Node root,int key){
//        Node temp = new Node(key);
//         if(root==null){
//                return temp;
//         }
//         Node curr = root;
//         while(curr!=null){
//             if(curr.data<key && curr.right!=null){
//                   curr =  curr.right;
//             }
//             if(curr.data>key  && curr.left!=null){
//                   curr = curr.left;
//             }else{
//                    break;
//             }
//         }
//           if(curr.data<key){
//                    curr.right = temp;
//              }
//              if(curr.data>key){
//                     curr.left = temp;
//              }
//              return root;
//    }
//    public static void printNodes(Node root){
//           Node curr = root;
//           while(curr!=null){
//                   System.out.print(curr.data +" ");
//                   if(curr.left!=null){
//                         curr = curr.left;
//                   }else if(curr.right!=null){
//                       curr = curr.right;
//                   }else{
//                       break;
//                   }
//           }
//    }
//       public static  int heightBinaryTree(Node root){
//           if(root==null){
//                 return 0;
//           }
//           int left=0;
//           int right=0;
//           if(root.left!=null){
//                 left = 1+heightBinaryTree(root.left);
//           }
//           if(root.right!=null){
//               right  = 1+heightBinaryTree(root.right);
//           }
//           return Math.max(left,right)+1;
//       }
//     //   public static boolean isIdentical(Node root,Node root2){
//     //                 if(root==null  && root2==null){
//     //                        return true;
//     //                 }
//     //                  if(root==null  || root2==null){
//     //                       return false;
//     //                  }
//     //                  if(root.data==root2.data){
//     //                         return true;
//     //                  }
//     //                    return (root.data==r2.data) && isIdentical(root.left, root2.left)&& isIdentical(root.right, root2.right)
//     //   }
//       public static int height(Node root){
//             if(root==null){
//                   return 0;
//             }
//             int leftHeight = height(root.left);
//             int rightHeight = height(root.right);
//             return Math.max(leftHeight,rightHeight)+1;
//       }
//        public static int diameter(Node root){
//         if(root==null){
//               return 0;
//         }
//         int leftHeight  = height(root.left);
//         int rightHeight = height(root.right);
//         int leftDiameter = diameter(root.left);
//         int rightDiameter = diameter(root.right);
//         return Math.max(leftHeight+rightHeight,Math.max(leftDiameter,rightDiameter));
//        }
//         public static boolean isIdentical(Node root1,Node root2){
//                   if(root1==null  &&  root2==null){
//                          return true;
//                   }
//                   if(root1==null  || root2==null){
//                         return false;
//                   }
//                 if(root1.data==root2.data){
//                        return true;
//                 }
//                 boolean left = isIdentical(root1.left,root2.left);
//                 boolean right = isIdentical(root1.right,root2.right);
//                 return left&&right;
//         }
//         public static boolean isSubTree(Node root1,Node root2){
//                  if(root2==null){
//                        return true;
//                  }
//                  if(root1==null){
//                      return false;
//                  }
//                  if(isSubTree(root1,root2)){
//                         return true;
//                  }
//                  return isSubTree(root1.left,root2)|| isSubTree(root1.right,root2);
//         }
//         public static boolean isBST(Node root,int min ,int max){
//               if(root==null){
//                    return true;
//               }
//             if(root.data<min  ||  root.data>max){
//                    return  false;
//             }
//             return isBST(root.left,min,root.data-1)&&isBST(root.right,root.data+1,max);
//         }
//     public static void main(String args[]){
//         Node root = new Node(1);
//          root.left = new Node(1);
//          root.right = new Node(3);
//          root.left.left = new Node(4);
//          root.right.left = new Node(5);
//         Node root2 = new Node(1);
//          root2.left = new Node(2);
//          root2.right = new Node(3);
//          root2.left.left = new Node(4);
//          root2.right.left = new Node(5);
//           System.out.print( diameter(root));
//              System.out.print(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
//         //  System.out.print(isIdentical(root, root2));
//         //  printLeaft1(root,6);
//         //  printNodes(root);
//         // int h =   heightBinaryTree(root);
//     }
// }
// .....................................................................
// import com.sun.jdi.connect.Connector;
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// // .........................................................  toposort using the kahn's algorithm
// public class programe{
//     public static void main(String[] args) {
//          ArrayList<Integer> result = new ArrayList<>();
//          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//          Queue<Integer> q =  new LinkedList<>();
//          int n = result.size();
//         int indegree[] = new int[n];
//            for(int i=0;i<n;i++){
//              for(int j : adj.get(i)){
//                   indegree[j]++;
//              }
//            }
//            for(int i=0;i<n;i++){
//               if(indegree[i]==0){
//                    q.add(i);
//               }
//            }
//            while(!q.isEmpty()){
//                int top = q.poll();
//                result.add(top);
//                for(int j: adj.get(top)){
//                     if(indegree[j]==0){
//                           q.add(j);
//                     }
//                     indegree[j]--;
//                }
//            }
//            return result;
//     }
// }
// ..................................................................................
// import java.util.ArrayList;
// import java.util.Stack;
// // ..................................................................   toposort using the dfs
// public class programe{
//      protected  static void topo(int node,boolean vis[],Stack<Integer> st, ArrayList<ArrayList<Integer>> adj ){
//                          vis[node] = true;
//                          st.add(node);
//                          for(int v: adj.get(node)){
//                              if(!vis[v]){
//                                    topo(v, vis, st, adj);
//                              }
//                          }
//    }
//      public static void main(String[] args) {
//            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//            int n  = adj.size();
//            Stack<Integer> st = new Stack<>();
//            boolean vis[]  = new boolean[n];
//            for(int i=0;i<n;i++){
//               if(!vis[i]){
//                      topo(i,vis,st,adj);
//               }
//            }
//            while(!st.isEmpty()){
//                System.out.print(st.pop());
//            }
//      }
// }
// ..............................................................
// import java.util.HashMap;
// public class programe{
//     public static void commonRemoval(int arr[],int arr2[]){
//           HashMap<Integer,Integer> countA = new HashMap<>();
//           HashMap<Integer,Integer> countB = new HashMap<>();
//           for(int e1 :arr){
//               countA.put(e1,countA.getOrDefault(e1, 0)+1);
//           }
//           for(int e2 : arr2){
//               countB.put(e2,countB.getOrDefault(e2, 0)+1);
//           }
//           int res=0;
//           for(int key : countA.keySet()){
//              if(countB.containsKey(key)){
//                     res +=  Math.min(countA.get(key),countB.get(key));
//              }
//           }
//           System.out.print(res);
//     }
//     public static void main(String args[]){
//            int[] arr1 = {1, 2, 3, 4};
//         int[] arr2 = {2, 3, 4, 5, 8};
//            commonRemoval(arr1,arr2);
//    print the reverse  start
//   .............................................
//      int n=5;
//      for(int i=0;i<n;i++){
//           for(int j=0;j<i;j++){
//                 System.out.print(" ");
//           }
//                 System.out.print("*");
//           System.out.println();
//      }
// }
// }
// ...............................................
// import java.util.ArrayList;
// import java.util.HashSet;
// // ............................................................
// public class programe{
//     public static void main(String[] args) {
//           String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
//           int n = s.length();
//           HashSet<String> seen = new HashSet<>();
//           HashSet<String> repeated = new HashSet<>();
//           for(int i=0;i+9<n;i++){
//                String part = s.substring(i,i+10);
//                if(seen.contains(part)){
//                    repeated.add(part);
//                }else{
//                       seen.add(part);
//                }
//           }
//     }
// }
// ......................................................................
// import  java.util.*;
// public  class programe{
//     public static class Node{
//           Node children[] = new Node[26];
//           boolean isEnd = false;
//           Node(){
//               for(int i=0;i<26;i++){
//                    children[i] = null;
//               }
//           }
//     }
//      Node root = new Node();
//      public static void insert(String key,Node root){
//           Node curr = root;
//           int index=0;
//           for(int i=0;i<key.length();i++){
//                     index = key.charAt(i)-'a';
//                     if(curr.children[index]==null){
//                           curr.children[index] = new Node();
//                     }
//                     curr = curr.children[index];
//           }
//           curr.isEnd = false;
//      }
//      public static String ans = "";
//      public static void helper(StringBuilder sb , Node root){
//            if(sb.length()>ans.length()){
//                    ans = sb.toString();
//            }
//            for(int i=0;i<26;i++){
//             char ch = (char)(i+'a');
//                  if(root.children[i]!=null  && root.isEnd==true){
//                          sb.append(ch);
//                          helper(sb,root.children[i]);
//                           sb.charAt(sb.length()-1);
//                  }
//            }
//      }
//     public static void main(String[] args) {
//     }
// }
// import java.util.ArrayList;
// import java.util.Arrays;
// import  java.util.List;
// // ...................................................... print the shortest distance
// public  class  programe{
//        public static void printShortestDistance(List<List<Integer>> graph,int s,int d,int v){
//        }
//     public static void main(String[] args) { 
//         //  create the graph
//        List<List<Integer>> edges = Arrays.asList(
//             Arrays.asList(0,1),Arrays.asList(0,1),
//             Arrays.asList(2,3),Arrays.asList(1,3),
//             Arrays.asList(2,4),Arrays.asList(4,5),
//             Arrays.asList(5,1),Arrays.asList(2,5)  );
//             int s=2;
//             int d=6;
//             int v=6;
//             List<List<Integer>>graph = new ArrayList<>(v);
//             for(int i=0;i<v;i++){
//                    graph.add(new ArrayList<>());
//             }
//             for(List<Integer> edge: edges ){
//                    graph.get(edge.get(0)).add(edge.get(1));
//                    graph.get(edge.get(1)).add(edge.get(0));
//             }
//              printShortestDistance(graph,s,d,v);
//     }
// }
// ................................................................
// public class programe{
//     public static void main(String[] args) {
//         //   remove the duplicate from the sorted array
//             //   top k frequent element
//                 int[] arr = {2, 3, 4, 7, 11};
//                 int n=arr.length;
//                 int max = Integer.MIN_VALUE;
//                 for(int i=0;i<n;i++){
//                       max = Math.max(max,arr[i]);
//                 }
//                 int k=4;
//                 int count=0;
//                 for(int i=1;i<=max;i++){
//                       for(int j=0;j<n;i++){
//                         if(i==arr[j]){
//                                continue;
//                         }else{
//                                if(count==k){
//                                    break;
//                                }
//                                 count++;
//                         }
//                       }
//                 }
//                 System.out.print(count);
//     }
// }
// ................................................................
// import java.util.StringTokenizer;
// //  ...................................... check the    valid ip addresss or not
// public  class programe{
//     public static boolean isValid(String s){
//         int n= s.length();
//             if(n<7){
//                   return false;
//             }
//             if(s.charAt(0)<0 || s.charAt(0)>255  || s.charAt(n-1)>1){
//                    return false;
//             }
//     }
//     public static void main(String[] args) {
//              String s = "128.0.0.1";
//              int n = s.length();
//                 StringTokenizer st = new StringTokenizer(s,".");
//                 int dots =0;
//                  while(st.hasMoreTokens()){
//                       String part = st.nextToken();
//                       if(isValid(part)){
//                            if(st.hasMoreTokens()){
//                             dots++;
//                            }else{
//                                return ;
//                            }
//                       }
//                  }
//                  boolean found = false;
//                  if(dots!=3){
//                      found = false;
//                        return;
//                  }else{
//                       found= true;
//                        return;
//                  }
//     }
// }
// import java.util.Stack;
// public  class programe{
//     public static void main(String[] args) {
//         //  longest  peranthisis  substring
//         String s = "(()())";
//         int n = s.length();
//         Stack<Integer> st = new Stack<>();
//          st.push(-1);
//         int maxLen = 0;
//         for(int i=0;i<s.length();i++){
//                 while(!st.isEmpty()){
//                         if(s.charAt(i)=='('){
//                               st.push(i);
//                         }else{
//                                  st.pop();
//                                  if(st.isEmpty()){
//                                       st.push(i);
//                                  }else{
//                                       maxLen = Math.max(maxLen,i-st.peek());
//                                  }
//                         }
//                 }
//         }
//           System.out.print(maxLen);
//     }
// }
// ...................................................................................
// import java.util.ArrayList;
// import java.util.Stack;
// // ......................................................
// public class programe{
//     public static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//               this.data = data;
//               Node left = null;
//               Node right = null;
//         }
//     }
//     public static void main(String args[]){
//             Stack<Node> st = new Stack<>();
//             ArrayList<Integer> ans = new ArrayList<>();
//             Node curr = root;
//             while(curr!=null  ||  !st.isEmpty()){
//                     while(curr!=null){
//                            st.push(curr);
//                            curr = curr.left;
//                     }
//                     Node temp = st.pop();
//                      ans.add(temp.data);
//                      curr = curr.right;
//             }
//     }
// }
//........................................................................
// import java.util.HashSet;
// // ..................................................................  check if the one array subset of another
// public  class  programe{
//     public static boolean isSubset(int a[],int b[]){
//         //  int n = a.length;
//         //  int m = b.length;
//         //  for(int i=0;i<m;i++){
//         //     boolean  found = false;
//         //     for(int j=0;j<n;j++){
//         //            if(b[i]==a[j]){
//         //                  a[j] = -1;
//         //                  found = true;
//         //                  break;
//         //            }
//         //     }
//         //     if(!found){
//         //           return false;
//         //     }
//         //  }
//         //  return true;
//         int n = a.length;
//         int m = b.length;
//         HashSet<Integer> set = new HashSet<>();
//         for(int num: a){
//                set.add(num);
//         }
//         for(int num: b){
//             if(!set.contains(num)){
//                     return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//           int[] a = {11, 1, 13, 21, 3, 7};
//            int[] b = {11, 3, 7, 1};
//            if(isSubset(a,b)){
//                 System.out.print("true");
//            }else{
//                 System.out.print("false");
//            }
//     }
// }
// ...................................................................................... number of island
// public class programe{
//     public  static boolean  isSafe(char grid[][],int r,int c,boolean vis[][]){
//             int n = grid.length;
//             int m = grid[0].length;
//             return  (r>=0  && c>=0 && r<n && c<m && !vis[r][c]  && grid[r][c]=='L');
//     }
//     public   static void dfs(char grid[][],int r,int c,boolean  vis[][]){
//             int dr[]= {-1,-1,-1,0,0,1,1,1};
//             int dc[] = {-1,0,1,-1,1,-1,0,1};
//               vis[r][c] = true;
//             for(int i=0;i<8;i++){
//                   int nr = dr[i]+r;
//                   int nc = dc[i]+c;
//                    if(isSafe(grid,nr,nc,vis)){
//                         dfs(grid,nr,nc,vis);
//                    }
//             }
//     }
//     public static void main(String[] args) {
//            char grid[][] = {{'W', 'L', 'L', 'L', 'W', 'W', 'W'},
//                             {'W', 'W', 'L', 'L', 'W', 'L', 'W'}};   
//                         int n = grid.length;
//                         int m = grid[0].length;
//                          boolean visited[][] = new boolean[n][m];
//                          int island =0;
//                         for(int i=0;i<n;i++){
//                               for(int j=0;j<m;j++){ 
//                                    if((grid[i][j]=='L'  && !visited[i][j])){
//                                        dfs(grid,i,j,visited);
//                                         island++;
//                                    }
//                               }
//                         }   
//                         System.out.print(island);    
//     }
// }
//...................................................................
// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.PriorityQueue;
// // .................................................
// public class programe{
//     public static int miniPlatform(int arr[],int dep[]){
//           int n = arr.length;
//           int v[][] = new int[n][2];
//           for(int i=0;i<arr.length;i++){
//                   v[i][0] = arr[i];
//                   v[i][1] = dep[i];
//           }
//                       int ans = 0;
//                   Arrays.sort(v,Comparator.comparingInt(a->a[0]));
//                   PriorityQueue<Integer> pq = new PriorityQueue<>();
//                   for(int i=0;i<n;i++){
//                         while(!pq.isEmpty() && pq.peek()<v[i][0]){
//                               pq.poll();
//                         }
//                         pq.add(v[i][1]);
//                         ans = Math.max(ans,pq.size());
//                   }
//                   return ans;
//     }
//     public static void main(String[] args) {
//            int[] arr = {900, 940, 950, 1100, 1500, 1800};
//             int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
//            int ans=  miniPlatform(arr, dep);
//              System.out.print(ans);
//     }
// }
// import java.util.Arrays;
// // .......................................  min cost to buy the candy
// public  class programe{
//     public static void main(String[] args) {
//             int arr[]   = {3, 2, 1, 4};
//             int k=2;
//             int n = arr.length;
//             int minCost = 0;
//             Arrays.sort(arr);
//             for(int i=0;i<n;i++){
//                    minCost += arr[n-i-1];
//                    n -= k;
//             }
//             System.out.print(minCost);
//     }
// }
// ..................................................     delete the character of a so and make the c (does not) including  the character of 
// public class  programe{
//    public static void main(String[] args) {
//       int n = 4;
//       int m = 20;
//       int sum1 = 0;
//       int sum2=0;
//       for(int i=1;i<=m;i++){
//         if(i%n==0){
//                 sum1 += i;
//         }else{
//                 sum2 += i;
//         }
//       }
//         System.out.print(Math.abs(sum1-sum2));
//    }
// }
// public class programe{
//       public static void main(String[] args) {
//              String a = "tiger";
//              String b = "ti";
//              StringBuilder sb = new StringBuilder();
//              for(char ch: a.toCharArray()){
//                     char c = ch;
//                     if(b.indexOf(c)==-1){
//                          sb.append(c);
//                     }
//              }
//                 System.out.print(sb.toString());
//       }
// }
// ..................................................... count  the price of   the product;
// public class  programe{
//       public static void main(String[] args) {
//            int price = 1234;
//             int ans = 1;
//             while(price>0){
//                     int rem  =  price%10;
//                     price = price/10;
//                      ans *= rem;
//             }
//             System.out.print(ans);
//       }
// }
// .......................................................
// public   class programe{
//       public static int helper(int arr[],int n){
//               int max = Integer.MIN_VALUE;
//                int count=0;
//                for(int i=0;i<n;i++){
//                     if(max<arr[i]){
//                             max = arr[i];
//                             count++;
//                     }
//                }
//                return count;
//       }
//       public static void main(String[] args) {
//             int arr[] = {7,4,8,2,9};
//             int n = arr.length;
//             int ans= helper(arr,n);
//                System.out.print(ans);
//       }
// }
// // ..........................................     sort the array 
// public  class programe{
//       public static  void sort(int arr[],int n){
//             int one=0;
//             int two=0;
//             int zero=0;
//              for(int i=0;i<n;i++){
//                    if(arr[i]==1){
//                           one++;
//                    }else if(arr[i]==2){
//                           two++;
//                    }else{
//                           zero++;  
//                    }  
//              }
//                int index=0;
//             if(zero>0){
//                     while(zero>=0){
//                            arr[index++] = 0;
//                            zero--;
//                     }
//             }
//             if(one>0){
//                     while(one>=0){
//                            arr[index++] = 1;
//                            one--;
//                     }
//             }
//             if(two>0){
//                      while(two>=0){
//                           arr[index++] = 2;
//                           two--;
//                      }
//             }
//             for(int i: arr){
//                     System.out.print(i +"  ");
//             }
//       }
//       public static void main(String[] args) {
//               int arr[] = {0,1,2,2,1,0,1,2};
//               int n = arr.length-1;
//               sort(arr,n);
//       }
// }
// ..........................................  moves  the all zeroes to the ens
// public class programe{
//       public static void main(String[] args) {
//           int arr[] = {4,5,0,1,9,0,5,0};
//           int n = arr.length;
//            for(int i=0;i<n-1;i++){
//              for(int j=0;j<n-1;j++){
//                      if(arr[j]==0){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1]=  temp;
//                  }
//              }
//            }
//            for(int val : arr){
//                System.out.print(val +"  ");
//            }
//       }
// }
// // ...............................................  Trie data structure
// public class programe{
//      public  static class TrieNode{
//         TrieNode children[] ;
//         boolean isEnd ;
//         public TrieNode() {
//             children=  new TrieNode[26];
//             isEnd = false;
//          }
//      }
//      public static  void insert(TrieNode root,String key){
//           TrieNode curr = root;
//           for(char ch : key.toCharArray()){
//                 if(curr.children[ch-'a']==null){
//                       TrieNode newNode = new TrieNode();
//                       curr.children[ch-'a'] = newNode;
//                 }
//                 curr = curr.children[ch-'a'];
//           }
//           curr.isEnd = true;
//      }
//      public static boolean search(TrieNode root,String key){
//            TrieNode curr = root;
//            for(char ch : key.toCharArray()){
//                   if(curr.children[ch-'a']==null){
//                           return false;
//                   }
//                   curr = curr.children[ch-'a'];
//            }
//            return curr.isEnd;
//      }
//      public static boolean isPrefix(TrieNode root, String key){
//         TrieNode    curr = root;
//         for(char ch: key.toCharArray()){
//                int index = ch-'a';
//                if(curr.children[index]==null){
//                          return false;
//                }
//                 curr = curr.children[index];
//         }
//         return true;
//      }
//     public static void main(String args[]){
//     }
//     public static boolean isPrefix(String s,TrieNode root){
//     }
// }
// ....................................... minimum   subset partitioning
// public  class programe{
//         public  static int helper(int arr[]){
//                   int n = arr.length;
//                   int sum = 0;
//                   for(int i=0;i<n;i++){
//                            sum+= arr[i];
//                   }
//                   int w = sum/2;
//                   int dp[][] = new int[n+1][w+1];
//                   for(int i=0;i<n+1;i++){
//                           dp[i][0]   =0;
//                   }
//                   for(int j=0;j<w+1;j++){
//                           dp[0][j] = 0;
//                   }
//                   for(int i=1;i<n+1;i++){
//                           for(int j=1;j<w+1;j++){
//                                   if(arr[i-1]<=j){
//                                            dp[i][j]  = Math.max(arr[i-1]+dp[i-1][j-arr[i-1]],dp[i-1][j]);
//                                   }else{
//                                           dp[i][j] = dp[i-1][j];
//                                   }
//                           }
//                   }
//                   int sum1 = dp[n][w]-sum;
//                   return Math.abs(sum1-sum);
//         }
//         public static void main(String args[]){
//                  int arr[]  = {2,1,3,4,2,0};
//               int ans=   helper(arr);
//               System.out.print(ans);
//         }
// }
// // ....................................  matrix chain multiplications
// public  class  programe{
//           public static int mcm(int arr[],int i,int j){
//                 int n = arr.length;
//                   int dp[][]   = new int[n][n];
//                   for(int k=0;k<n;k++){
//                           for(int l=0;l<n;l++){
//                                    dp[i][j] = -1;
//                           }
//                   }
//                   if(dp[i][j]!=-1){
//                           return dp[i][j];
//                   }
//                   if(i==j){
//                           return 0;
//                   }
//                   int ans=Integer.MAX_VALUE;
//                   for(int k=i;k<=j-1;k++){
//                           int cost1 = mcm(arr,i,k);
//                            int cost2 = mcm(arr,k+1,j);
//                            int cost3  = arr[i-1]*arr[k]*arr[j];
//                            int total = cost1+cost2+cost3;
//                             ans = Math.min(ans,total);
//                             dp[i][j] = ans;
//                   }
//                   return dp[i][j];
//           }
//         public static void main(String[] args) {
//             int arr[] = {1,2,3,4,5};
//             int n = arr.length;
//             int j = n-1;
//             int i=1;
//           int ans=   mcm(arr,i,j);
//             System.out.println(ans +"  ");
//         }
// }
// ..............................................
// import java.util.HashMap;
// import java.util.Map;
// // .................................................................. String copression
// public class programe{
//         public static String helper(String s){
//                 HashMap<Character,Integer> map = new HashMap<>();
//                  for(int i=0;i<s.length();i++){
//                           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//                  }
//                   for(Map.Entry<Character,Integer> e: map.entrySet()){
//                           char key =  e.getKey();
//                           int val = e.getValue();
//                   }
//         }
//     public static void main(String[] args) {
//             String  str  = "aabbcc";
//              String s = helper(str);
//                System.out.print(s);
//     }
// }
// ........................................................  Quick sorting  
// public  class  programe{
//     public static void swap( int arr[],int temp1,int temp2){
//           int temp = arr[temp1];
//              arr[temp1] =   arr[temp2];
//                arr[temp2] = temp;
//     }
//     public static int partition(int arr[],int st,int end){
//                     int index=st-1;
//                     int pivot = arr[end];
//                     for(int j=st;j<end;j++){
//                          if(arr[j]<=pivot){
//                               index++;
//                                swap(arr,index,j);
//                          }
//                     }
//                     index++;
//                       swap(arr,index,pivot);
//                       return  index;
//     }
//     public static void quickSort(int arr[],int st,int end){
//            if(st<end){
//               int index = partition(arr,st,end);
//                 quickSort(arr, st, index);
//                 quickSort(arr, index+1, end);
//            }
//     }
//         public static void main(String[] args) {
//               int arr[] = {12,53,21,4,7,3,0};
//               int st = 0;
//               int end = arr.length-1;
//                quickSort(arr,st,end);
//                    for(int i=0;i<arr.length;i++){
//                       System.out.print(arr[i]  +"  ");
//                    }
//         }
// }
// ..........................................  inversion count
// public  class  programe{
//        public static int merge(int arr[],int st,int mid,int end){
//                     int temp[] = new int[st+end];
//                     int i=0;
//                     int j=mid+1;
//                     int  count=0;
//                     while(i<mid  && j<end){
//                               if(arr[i]<=arr[j]){
//                                      temp[i] = arr[i];
//                                      i++;
//                               }
//                               else{
//                                         count += mid-i-1;
//                                         temp[j] = arr[j];
//                                         j++;
//                               }
//                     }
//                       while(i<mid){
//                               temp[i] = arr[i];
//                               i++;
//                       }
//                       while(j<end){
//                             temp[j] = arr[j];
//                             j++;
//                       }
//                     //   for(int index=0;index<arr.length;index++){
//                     //               arr[st+end] =  temp[index]; 
//                     //   }
//                         return count;
//        }
//       public  static int mergeSort(int arr[],int st,int en){
//         if(st<=en){
//               int mid = st+(en-st)/2;
//               int left = mergeSort(arr, st, mid);
//               int right = mergeSort(arr, mid+1, en);
//               int  total = merge(arr,st,mid,en);
//               return left+right+total;
//         }
//         return -1;
//       }
//     public static void main(String[] args) {
//             int arr[] = {1,4,3,1,5,4};
//              int st = 0;
//              int en = arr.length-1;
//             int ans = mergeSort(arr,st,en);
//             System.out.print(ans);
//     }
// }
// ...............................................
// public class programe{
//     public static void main(String[] args) {
//          int n=5;
//          for(int i=5;i<=5;i++){
//               if(i==3){
//                  for(int j=0;j<=5;j++){
//                            System.out.println("*");
//                  }
//                 }
//                  for(int k=0;k<=5;k++){
//                         if(k==3){
//                               for(int l=0;l<5;l++){
//                                   System.out.print("*");
//                               }
//                         }
//                  }
//                  System.out.println();
//          }
//     }
// }
// ..............................................
// public class programe{
//     public static void main(String[] args) {
//               int n=5;
//               for(int i=0;i<=n;i++){
//                       for(int j=n-i;j>=0;j--){
//                           System.out.print("*");
//                       }
//                       System.out.println();
//               }
//     }
// }
// ...........................  Edit the distance
// public  class programe{
//      public static void main(String[] args) {
//              for(int i=0;i<5;i++){
//                   for(int s=5-i;s>=0;s--){
//                        System.out.print(" ");
//                   }
//                   for(int j=0;j<=i;j++){
//                        System.out.print("*");
//                   }
//                   System.out.println();
//              }
//      }
// }
// // ..........................................................   Longest common substring
// public class  programe{
//      public static int helper(String s1,String s2){
//              int n = s1.length();
//              int m  = s2.length();
//              int dp[][] = new int[n+1][m+1];
//              for(int i=0;i<n+1;i++){
//                  dp[i][0] = 0;
//              }
//              for(int i=0;i<m+1;i++){
//                 dp[0][i] = 0;
//              }
//              int ans=0;
//              for(int i=1;i<n+1;i++){
//                  for(int j=1;j<m+1;j++){
//                        if(s1.charAt(i-1)==s2.charAt(j-1)){
//                               dp[i][j]  = dp[i-1][j-1]+1;
//                               ans  = Math.max(dp[i][j],ans);
//                        }else{
//                              dp[i][j] = 0;
//                        }
//                  }
//              }
//                return ans;
//      }
//      public static void  main(String args[]){
//               String s1 = "ABCD";
//               String s2= "ABEF";
//                System.out.print(helper(s1,s2));
//      }
// }
// ..........................................
// import java.util.ArrayList;
// // .......................................................... palindrome partionning
// public  class  programe{
//      public static boolean isPalindrome(String s){
//             int i=0;
//             int j=s.length()-1;
//             while(i<=j){
//                    if(s.charAt(i)!=s.charAt(j)){
//                          return false;
//                    }
//                    i++;
//                    j--;
//             }
//             return true;
//      }
//       public static  void helper(String s,ArrayList<ArrayList<String>> ans, ArrayList<String> list ){
//              if(s.length()==0){
//                    ans.add(list);
//                      return;
//              }
//              for(int i=0;i<s.length();i++){
//                       String part = s.substring(0,i+1);
//                       if(isPalindrome(part)){
//                               list.add(part);
//                               helper(s.substring(i+1),ans,list);
//                               list.remove(list.size()-1);
//                       }
//              }
//       }
//      public static void main(String[] args) {
//            String s = "aab";
//             ArrayList<ArrayList<String>> ans = new ArrayList<>();
//             ArrayList<String> list = new ArrayList<>();
//             helper(s,ans,list);
//             for(int i=0;i<ans.size();i++){
//                     System.out.print(ans.get(i) +"  " );
//             }
//      }
// }
// .....................................................
// import  java.util.*;
// public class programe{
//      public static void  helper(){
//           int nums[] = {-2,-1,-1,1,1,2,2};
//           int n = nums.length;
//             int target = 0;
//             ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//             // ArrayList<Integer> list = new  ArrayList<>();
//              for(int i=0;i<n-3;i++){
//                   if(i>0  && nums[i]==nums[i-1]) continue;;
//                   for(int j=i+1;j<n-2;j++){
//                        int k = j+1;
//                        int m = n-1;
//                        int sum=0;
//                          if(j>i+1  && nums[j]==nums[j-1]) continue;
//                        while(k<m){
//                            sum = nums[i]+nums[j]+nums[k]+nums[m];
//                             if(sum==target){
//                                  ans.add(Arrays.asArrayList<>(nums[i],nums[j],nums[k],nums[m]));
//                                     k++;
//                                 m--;
//                                 while(k<m   && nums[k]==nums[k-1]){
//                                           k++;
//                                     }
//                                        while(k<m  && nums[m]==nums[m+1]){
//                                          m--;
//                                    }
//                             }else if(sum<target){
//                                     k++;
//                             }else{
//                                     m--;
//                             }
//                        }
//                   }
//              }
//      }
//     public static void main(String[] args) {
//           helper();
//     }
// }
// ...................................................   container with most waterpub
// public class programe{
//      public static void main(String[] args) {
//         int arr[] =  {0,3,8,9,5,2};
//         int left=0;
//         int right = arr.length-1;
//         int h = 1;
//         int w=1;
//         int curr=0;
//         int maxWater = 0;
//          while(left<right){
//                 w = right-left;
//                 h =   Math.min(arr[left],arr[right]);
//                 curr = w*h;
//                 maxWater = Math.max(curr,maxWater);
//                 arr[left]<arr[right]? left++: right--;
//          }
//      }
// }
// .......................................................    find the  single element in the array
// .................................................................  find the peak element in the arry
// public  class programe{
//     public static int helper(){
//          int arr[] =  {0,3,8,9,5,2};
//           int n   = arr.length;
//           int st = 1;
//           int end  = n-2;
//           while(st<=end){
//                 int mid = st+(end-st)/2;
//                 if(arr[mid-1]<arr[mid] &&  arr[mid]>arr[mid+1]){
//                        return arr[mid];
//                 }else if(arr[mid-1]<arr[mid]){
//                        st = mid+1;
//                 }else{
//                        end = mid-1;
//                 }
//           } 
//           return -1;
//     }
//     public static void main(String[] args) {
//        System.out.print( helper());;
//     }
// }
// ............................  find the peak element in the mountain array
// public class  programe{
//     public static void helper(int nums[],int n){
//            int peak = 0;
//            for(int i=1;i<n-2;i++){
//              if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
//                    peak = nums[i];
//              }
//            }
//            System.out.print(peak);
//     }
//     public static void main(String args[]){
//          int nums[] = {0,3,8,9,5,2};
//          int n = nums.length;
//          helper(nums,n);
//     }
// }
// ................................................................................
// import java.util.ArrayDeque;
// import java.util.ArrayList;
// // ............................................   Maximum sliding window with size k
// public class programe{
//     public static void helper(int nums[],int n,ArrayDeque<Integer> dq ){
//              int i=0;
//              int k=3;
//              while(i<k){
//                    while(dq.size()>0  && nums[dq.getLast()]<=nums[i]){
//                           dq.poll();
//                    }
//              }
//              ArrayList<Integer> list   = new ArrayList<>();
//              for(;i<n;i++){
//                 //     remove that elemenet which is not part of the current window
//                 list.add(nums[dq.getFirst()]);
//                   while(dq.size()>0  &&  dq.getLast()<=i-k){
//                            dq.removeLast();
//                   } 
//                   while(dq.size()>0  &&  nums[dq.getLast()]<=nums[i]){
//                            dq.removeLast();
//                   }
//                       dq.add(i);
//              }
//                list.add(nums[dq.getFirst()]);
//                for(int j:list){
//                    System.out.print(j +"  ");
//                }
//     }
//     public static void main(String[] args) {
//           int nums[] = {1,3,4,0,-1,3,-3};
//           int n = nums.length;
//                 ArrayDeque<Integer> dq = new ArrayDeque<>();
//                helper(nums,n,dq);
//     }
// }
// import java.util.HashMap;
// ..............................................
// public class programe{
//      public static void main(String args[]){
//              String s  = "abbccccc";
//              int n = s.length();
//              HashMap<Character,Integer> map = new HashMap<>();
//              for(int i=0;i<s.length();i++){
//                     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//              }
//               StringBuilder sb = new StringBuilder();
//              for(HashMap.Entry<Character,Integer> e: map.entrySet()){
//              }
//      }
// }
// ..............................................
// public class  programe{
//       public static void main(String[] args) {
//                     String s = "Move#Hash#to#Front";
//                     //    count the  how many hashes available in the string
//                     int count=0;
//                     for(int i=0;i<s.length();i++){
//                           if(s.charAt(i)=='#'){
//                                 count++;
//                           }
//                     }
//                      StringBuilder sb = new StringBuilder();
//                     while(count>=0){
//                            sb.append('#');
//                              count--;     
//                     }
//                       String str[] = s.split("#");
//                       for(String ch: str){
//                              sb.append(ch);
//                       }
//                       System.out.print(sb.toString());
//       }
// }
// ...........................  longest common substring using the tabulation method
// public class programe{
//      public static int helper(String s1,int n1,String s2,int n2){
//           int dp[][] = new int[n1+1][n2+1];
//           for(int i=0;i<n1+1;i++){
//                dp[i][0] = 0;
//           }
//           for(int i=0;i<n2+1;i++){
//                 dp[0][i] = 0;
//           }
//           int ans=0;
//           for(int i=1;i<n1+1;i++){
//               for(int j=1;j<n2+1;j++){
//                    if(s1.charAt(i-1)==s2.charAt(j-1)){
//                         dp[i][j] = 1+dp[i-1][j-1];
//                          ans = Math.max(dp[i][j],ans);
//                    }else{
//                        dp[i][j] = 0;
//                    }
//               }
//           }
//           return ans;
//      }
//     public static void main(String[] args) {
//           String s1 = "ABCDE";
//           String s2 = "ABGCE";
//           int n1 = s1.length();
//           int n2 = s2.length();
// int ans = helper(s1,n1,s2,n2);
//   System.out.print(ans +" ");
//     }
// }
// ................................................. longest common subsequence using the dp
// public class programe{
//      public static int helper(String s1,int n1,String s2,int n2){
//          int dp[][] = new int[n1+1][n2+1];
//            for(int i=0;i<n1+1;i++){
//               for(int j=0;j<n2+1;j++){
//                    if(i==0  || j==0){
//                         dp[i][j] = 0;
//                    }
//               }
//            }
//            for(int i=1;i<n1+1;i++){
//              for(int j=1;j<n2+1;j++){
//                  if(s1.charAt(i-1)==s2.charAt(j-1)){
//                        dp[i][j] = 1+dp[i-1][j-1];
//                  }else{
//                       int a = dp[i-1][j];
//                       int b = dp[i][j-1];
//                        dp[i][j] = Math.max(a,b);
//                  }
//              }
//            }
//            return  dp[n1][n2];
//      }
//     public static void main(String[] args) {
//          String s1 = "abcde";
//          int n1 = s1.length();
//          String s2 = "ace";
//          int n2 = s2.length();
//       int ans=   helper(s1,n1,s2,n2);
//       System.out.print(ans);
//     }
// }
// .......................................................   lengest common subsequence
// public class programe{
//     public static int helper(int n1,int n2,String s1,String s2){
//            if(n1==0 || n2==0){
//                  return 0;
//            }
//            if(s1.charAt(n1-1)==s2.charAt(n2-1)){
//                 return 1+helper(n1-1,n2-1,s1,s2);
//            }else{
//                int ans1 = helper(n1-1,n2,s1,s2);
//                int ans2 = helper(n1, n2-1, s1, s2);
//                return Math.max(ans1,ans2);
//            }
//     }
//       public  static void main(String args[]){
//             String s1 = "abcde";
//             String s2 = "ace";
//              int ans = helper(s1.length(),s2.length(),s1,s2);
//              System.out.println(ans+"   ");
//       }
// }
// ..........................................  Rod  cutting
// public class programe{
//     public static int helper(int length[],int prices[],int len){
//            int dp[][] = new int[prices.length+1][len+1];
//            for(int i=0;i<=prices.length;i++){
//                 dp[i][0] = 0;
//            }
//            for(int i=0;i<=len;i++){
//                dp[0][i] = 0;
//            }
//            for(int i=1;i<=prices.length;i++){
//                 for(int j=1;j<=len;j++){
//                       int capacity = length[i-1];
//                       if(j>=capacity){
//                           dp[i][j] = Math.max(prices[i-1]+dp[i][j-capacity],dp[i-1][j]);
//                       }else{
//                            dp[i][j] = dp[i-1][j];
//                       }
//                 }
//            }
//            return dp[prices.length][len];
//     }
//     public static void main(String[] args) {
//          int length[] = {1,2,3,4,5,6,7,8};
//          int prices[] = {1,5,8,10,17,17,20};
//          int len = 8;
//       int ans=   helper(length,prices,len);
//          System.out.print(ans);
//     }
// }
// ...............................................   coin chnage the variation of the unbounded knapsack
// public  class  programe{
//     public static int helper(int coins[],int sum){
//           int dp[][] = new int[coins.length+1][sum+1];
//           for(int i=0;i<coins.length+1;i++){
//                   dp[i][0] = 1;
//           }
//           for(int i=1;i<sum+1;i++){
//                 dp[0][i]  = 0;
//           }
//           for(int i=1;i<=coins.length;i++){
//               for(int j=1;j<=sum;j++){
//                       int coin =  coins[i-1];
//                       if(j>=coin){
//                            dp[i][j] = dp[i-1][j-coin]+dp[i-1][j];
//                       }else{
//                           dp[i][j] =   dp[i-1][j];
//                       }
//               }
//           }
//           return  dp[coins.length][sum];
//     }
//     public static void main(String[] args) {
//          int coins[] = {1,2,3};
//          int sum = 4;
//        int ans=   helper(coins,sum);
//         System.out.print(ans);
//     }
// }
// // ........................................     0 1 knapsack using the   tabulation
// public class programe{
//     public static int helper(int val[],int w[],int wt,int n){
//                 int dp[][] = new int[n+1][wt+1];
//                   for(int i=0;i<=n;i++){
//                        dp[i][0] = 0;
//                   }
//                   for(int i=0;i<=dp[0].length;i++){
//                       dp[0][i] = 0;
//                   }
//                   for(int i=1;i<=n;i++){
//                       for(int j=1;j<=wt;j++){
//                           int v =  val[i-1];
//                           int weights = w[i-1];
//                            if(weights<=j){
//                                int include = v+dp[i-1][j-weights];
//                                int exclude =  dp[i-1][j];
//                                dp[i][j] = Math.max(include,exclude);
//                            }
//                       }
//                   }
//                   return dp[n][wt];
//     }
//       public static void main(String[] args) {
//          int val[] =  {15,14,10,45,30};
//          int w[] = {2,5,1,3,4};
//            int wt = 7;
//            int n =  val.length;
//           int ans  = helper(val,w,wt,n);
//           System.out.print(ans);
//       }
// }
// ...............................    unbounded knapsack 
// public class programe{
//     public static int helper(int val[],int w[],int wt,int n){
//         if(n==0  || wt==0){
//               return 0;
//         }
//         if(w[n-1]<=wt){
//             //   include
//             int include =  val[n-1]+helper(val,w,wt-w[n-1],n);
//             //  more that one
//             int exclude = helper(val,w,wt,n-1);
//               return Math.max(include,exclude);
//         }
//         return helper(val,w,wt,n-1);
//     }
//     public static void main(String[] args) {
//           int val[] =  {15,14,10,45,30};
//            int w[] = {2,5,1,3,4};
//            int wt = 7;
//           System.out.print( helper(val,w,wt,val.length));
//     }
// }
// // .......................................  target sum subset
// public class programe{
//     public static boolean helper(int nums[],int n,int target){
//                   boolean dp[][] = new boolean[n+1][target+1];
//                   for(int i=0;i<n+1;i++){
//                         dp[i][0] =  true;
//                   }
//                   for(int i=1;i<=n;i++){
//                       for(int j=1;j<=target;j++){
//                           int val =  arr[i-1];
//                            if(val<=target  &&  dp[i-1][j-target]){
//                                 dp[i][j] = true;
//                            }else if(dp[i-1][j]){
//                               dp[i][j] = true;
//                            }
//                       }
//                   }
//                   return dp[n][target];
//     }
//       public static void main(String args[]){
//             int nums[] = {1,5,4,2};
//             int n = nums.length;
//             int target=12;
//                boolean ans = helper(nums,n,target);
//                 System.out.print(ans);
//               }
// }
// // ................................  target sum subset
// public class programe{
//    public static boolean helper(int nums[],int target,int n){
//         boolean dp[][] = new boolean[n+1][target+1];
//         //  intialization
//          for(int i=0;i<n+1;i++){
//                 dp[i][0] = true;
//          }
//          for(int i=1;i<=n;i++){
//               for(int j=1;j<=target;j++){
//                  int val = nums[i-1];
//                  if(val<=j  && dp[i-1][j-val]==true){
//                          dp[i][j] = true;
//                  }else if(dp[i-1][j]==true){
//                        dp[i][j]  =  true;
//                  }
//               }
//          }
//           return dp[n][target];
//    }
//     public static void main(String[] args) {
//             int nums[] = {3,7,1,4,5};
//             int n = nums.length;
//             int target =40;
//           boolean ans=  helper(nums,target,n);
//           System.out.print(ans +" ");
//     }
// }
// //  .............................................................  0 1 knapsack using the tabulations code
// public  class  programe{
//       public static int helper(int val[],int w[],int wt,int dp[][],int n){
//                 for(int i=0;i<dp.length;i++){
//                      dp[i][0] = 0;
//                 }
//                 for(int i=0;i<dp[0].length;i++){
//                      dp[0][i] = 0;
//                 }
//                 for(int i=1;i<=dp.length;i++){
//                     for(int j=1;j<=dp[0].length;j++){
//                             int items = val[i-1];
//                             int weights =   w[j-1];
//                             if(weights<=j){
//                               int include = items+dp[i-1][j-wt];
//                               int exclude = dp[i-1][j];
//                                dp[i][j] = Math.max(include,exclude);
//                             }else{
//                                    dp[i][j] =    dp[i-1][j];
//                             }
//                     }
//                 }
//                   return  dp[n][wt];
//       }
//        public static void main(String[] args) {
//              int val[] =  {15,14,10,45,30};
//               int w[] = {2,5,1,3,4};
//               int n  = val.length;
//               int wt = 7;
//               int dp[][] = new int[n+1][wt+1];
//               for(int i=0;i<=dp.length;i++){
//                     for(int j=0;j<=dp[0].length;j++){
//                            dp[i][j] = -1;
//                     }
//               }
//               helper(val,w,wt,dp,n);
//        }
// }
// // ....................................................      memoisation 
// public class programe{
//       public static int helper(int  val[],int wt[],int dp[][],int allowed,int n){
//                               if(allowed==0  || n==0){
//                                       return 0;
//                               }
//                               if(dp[n-1][allowed]!=-1){
//                                        return  dp[n-1][allowed];
//                               }
//                               if(wt[n-1]<=allowed){
//                                        int include  = val[n-1]+helper(val, wt, dp, allowed-wt[n-1], n-1);
//                                        int  exclude =  helper(val,wt,dp,allowed,n-1);
//                                        dp[n-1][allowed]  =  Math.max(include,exclude);
//                                        return dp[n-1][allowed];
//                               }
//                                dp[n-1][allowed] = helper(val,wt,dp,allowed,n-1);
//                                return dp[n-1][allowed];
//       }
//       public static void main(String[] args) {
//             int val[] =  {15,14,10,45,30};
//             int wt[] = {2,5,1,3,4};
//             int  n = val.length;
//             int allowed = 7;
//              int dp[][] =  new int[n+1][allowed+1];
//                               int m =  dp[0].length;
//              for(int i=0;i<=n;i++){
//                     for(int j=0;j<=m;j++){
//                             dp[i][j]  = -1;
//                      }
//              }                
//                   int ans = helper(val,wt,dp,allowed,n);
//                    System.out.print(ans);
//       }
// }
// // .................................................   0 1 knapsack with memoisation
// ..............................................  tablutaions  0 1 knapsack  using the tabulation method
// public class programe{
//       public static int helper(int val[],int wt[],int totalWt,int dp[],int n){
//                   if(n==0  ||  totalWt==0){
//                           return 0;
//                   }
//                   if(dp[n-1]!=0){
//                             return dp[n-1];
//                   }
//                   if(wt[n-1]<=totalWt){
//                         int include =  val[n-1]+helper(val,wt,totalWt-wt[n-1],dp,n-1);
//                         int exclude =  helper(val,wt,totalWt,dp,n-1);
//                             dp[n-1] =  Math.max(include,exclude);
//                               return  dp[n-1];
//                   }
//                    dp[n-1] = helper(val,wt,totalWt,dp,n-1);
//                       return dp[n-1];
//       }
//       public static void main(String[] args) {
//           int val[] =  {15,14,10,45,30};
//              int wt[] = {2,5,1,3,4};
//              int n = val.length;
//               int totalWt = 7;
//               int dp[]  = new int[n+1];
//           int ans =     helper(val,wt,totalWt,dp,n);
//               System.out.print(ans +"  ");
//       }
// }
// // ....................................................................    0 1  knapsack 
// public class  programe{
//       public static int helper(int val[],int wt[],int n,int allowed){
//               if(n==0   || allowed==0){
//                     return  0;
//               }
//               if(wt[n-1]<=allowed){
//                   int include =   val[n-1]+helper(val,wt,n-1,allowed-wt[n-1]);
//                   int exclude =     helper(val,wt,n-1,allowed);
//                   return Math.max(include,exclude);
//               }
//               return  helper(val,wt,n-1,allowed);
//       }
//        public static void main(String[] args) {
//               int val[] =  {15,14,10,45,30};
//               int wt[] =  {2,5,1,3,4};
//               int n = val.length;
//                int allowed = 7;
//            int ans = helper(val,wt,n,allowed);
//            System.out.print(ans);
//        }
// }
// // ...........................................................   o 1 knapsack 
// public class  programe{
//       public static int helper(int val[],int wt[],int totalWt,int n,int i,int ans){
//                 if(i==n  || totalWt==0){
//                       return ans;
//                 }
//                 if(wt[i]>totalWt){
//                     return helper(val,wt,totalWt,n,i+1,ans);
//                 }
//                 int include = val[i]+helper(val,wt,totalWt-wt[i],n,i+1,ans+val[i]);
//                 int exclude = helper(val,wt,totalWt,n,i+1,ans);
//                 ans = Math.max(include,exclude);
//                 return ans;
//       }
//       public static void main(String[] args) {
//             int val[] = {15,14,10,45,30};
//             int wt[] = {2,5,1,3,4};
//             int totalWt = 7;
//             int n = val.length;
//             int i=0;
//              int ans= helper(val,wt,totalWt,n,i,0);
//              System.out.print(ans);
//       }
// }
// // ...............................................  fibonacci series using the tabulations 
// public  class programe{
//       public static void recursion(int n,int dp[]){
//               dp[0] = 0;
//               dp[1] = 1;
//                 for(int i=2;i<=n;i++){
//                      dp[i] = dp[i-2]+dp[i-1];
//                 }
//       }
//        public static void main(String[] args) {
//               int n =10;
//               int dp[] = new int[n+1];
//             recursion(n,dp);
//              for(int i=0;i<n;i++){
//                      System.out.print(dp[i] +"  ");
//              }
//        }
// }
// .................................................   sum of the  nth number
// public class programe{
//       public static int rec(int n,int dp[]){
//               if(n==0 || n==1){
//                    return n;
//               }
//               if(dp[n]!=0){
//                     return  dp[n];
//               }
//              dp[n]= rec(n-1,dp)+n;
//              return dp[n];
//       }
//       public static void main(String[] args) {
//              int  n = 5;
//              int dp[] = new int[n+1];
//            int ans=  rec(n,dp);
//             for(int i : dp){
//                     System.out.print(i +"  ");
//             }
//       }
// }
// // ........................................................  heap Sort
// public class programe{
//       public static int rec(int n,int dp[]){
//           if(n==0 ||  n==1){
//                return n;
//           }
//           if(dp[n]!=0){
//                return dp[n];
//           }
//           dp[n] = rec(n-1,dp)+rec(n-2,dp);
//             return dp[n];
//       }
//     public static void main(String[] args) {
//           int n = 5;
//           int dp[]  = new int[n+1];
//         int ans =   rec(n,dp);
//           for(int i : dp){
//                 System.out.print(i +"   ");
//           }
//     }
// }
// .........................................................................
// import java.util.ArrayList;
// // .....................................................  Heap ds
// public class programe{
//   static  ArrayList<Integer> list  = new ArrayList<>();
//     public static void add(int data){
//              list.add(data);
//              int n  = list.size()-1;  //  child index
//              int parent = (n-1)/2;
//              while(list.get(n)<list.get(parent)){
//                      int temp = list.get(n);
//                      list.set(n, list.get(parent));
//                  list.set(parent,temp);
//          }
// }
// public static int peek(){
//       return list.get(0);
// }
//    public static int heapify(int k){
//     //     fix the heap 
//         int i = k;
//        int left  = (2*i)+1;
//        int right = (2*i)+2;
//         //   swap that element which is smalle i -> left ,right
//          if(left<list.size()  && list.get(left)<list.get(i)){
//               left = i;
//          }
//          if(right<list.size()  &&  list.get(right)<list.get(i)){
//                  right = i;
//          }
//         //   checkc  the index value changed or not
//         if(i!=k){
//               int temp = list.get(i);
//               list.set(k, list.get(i));
//               list.set(i, temp);
//               heapify(i);
//         }
//    }
//    public static int removePeak(){
//         int data = list.get(0);
//         //   swap the first index value with the last index value
//          list.set(0,list.size()-1);
//          list.set(list.size()-1, data);
//            list.remove(data);
//             heapify(0);
//    }
//   public static void main(String[] args) {
//   }
// }
// ........................................... How to compare the object using the comparator interface
// import java.util.PriorityQueue;
// public  class programe{
//     public static class Info implements  Comparable<Info>{
//          String name;
//          int marks;
//          public Info(String name,int marks){
//               this.name = name;
//               this.marks = marks;
//          }
//          @Override
//          public int compareTo(Info i2){
//               return  this.marks-i2.marks;
//          }
//     }
//     public static void main(String[] args) {
//         PriorityQueue <Info>  pq = new PriorityQueue<>();
//         pq.add(new Info("anjali",123));
//         pq.add(new Info("Sumit",142));
//         pq.add(new Info("Aditya",411));
//         while(!pq.isEmpty()){
//               String name = pq.peek().name;
//               int marks = pq.peek().marks;
//               System.out.println(name +"   "+marks);
//               pq.poll();
//         }
//     }
// }
// .............................................................................
// public  class programe{
//     public static void main(String[] args) {
//         School s1 = new School();
//         s1.schoolName = "Anjali's Scool";
//           System.out.print(s1.schoolName);  //  static values if get changes  then it will be same for all object 
//         School s2 = new School();
//          System.out.print( s2.schoolName);
//     }
// }
// class School{
//       String name;
//       int roll;
//       static  String schoolName ;
//     //   setter
//       public void setName(String name){
//           this.name = name;
//       }
//       public String getName(){
//            return  this.name;
//       }
//     //    getter
// }
// ............  interface  -> it is provide the structure of the class, provides the 100% abstraction , can be define using the final ,static and public keyword
// ...........................................................................................
// public  class programe{
//     public static void main(String[] args) {
//          Horse h1 = new Horse();
//           h1.eat();
//     }
// }
// interface Dog{
//       public void eat();
// }
// interface  Cow{
//       public void walk();
// }
// class Cat implements  Dog,Cow{
//       public void walk(){
//           System.out.print("Cat can  walk");
//       }
//       public void eat(){
//             System.out.print("Cat can drink a milk");
//       }
// }
// class buffalo implements Dog,Cow{
//     public void walk(){
//           System.out.print("buffalo can  walk");
//       }
//       public void eat(){
//           System.out.print("Buffalo can also drink a milk");
//       }
// }
// class Horse implements  Dog,Cow{
//     public void walk(){
//           System.out.print("Horse can  walk");
//       }
//      public  void eat(){
//           System.out.print("Horse can drink a water");
//      }
// }
// ................................................. implemetaion of the abstract  class
// . we can't create the object of the abtstract c
// . but we can create the constructor of the  abstract class
// abstract class Animal{
//       String food;
//       public Animal(){
//           System.out.println("Animal Constructor will call");
//       }
//     //   public Animal(){
//     //         this.food = "Chicken";
//     //   }
//       public  void eat(){
//             System.out.println("Animal eat a food");
//       }
//       abstract void dance();
// }
// class Horse extends  Animal{
//       public Horse(){
//            System.out.println("Horse Constructor will call");
//       }
//         public void dance(){
//                System.out.println("Horse  can dance");
//         }
//         public String changeFood(){
//                 //  this.food =  "grass";
//                  return this.food;
//         }
// }
// class Dog extends  Horse{
//     public Dog(){
//           System.out.println("Dog constructor will call");
//     }
// }
// public  class programe{
//      public static void main(String[] args) {
//           Dog d1 = new Dog();
//         //   Horse h1 = new Horse();
//         //   h1.dance();
//         //    h1.eat();
//         //          System.out.print( h1.changeFood());
//      }
// }
// import java.util.Scanner;
// public class programe{
//     public static void main(String args[]){
//           Scanner sc = new Scanner(System.in);
//            int a   = sc.nextInt();
//             System.out.print("Entererd the value of a" + a);
//     }
// }
// .............................................. Disjoint set 
// import java.util.*;
// // ........................................   minimum cost to connect cities using the prims algorithm
// public class programe{
//      public static class Edge implements Comparable<Edge>{
//          int des;
//          int cost;
//         public Edge(int des,int cost){
//               this.des = des;
//               this.cost = cost;
//         }
//         @override
//          public static int compareTo(Edge e2){
//                  return this.cost-e2.cost;
//          }
//      }
//      public static int connectingCities(int cities[][],int n){
//                  PriorityQueue<Edge> pq = new PriorityQueue<>();
//                  boolean vis[] = new boolean[n];
//                  pq.add(new Edge(0,0));
//                  int finalCost = 0;
//                   while(!pq.isEmpty()){
//                        Edge e =  pq.poll();
//                           if(!vis[e.des]){
//                                finalCost += e.cost; 
//                                 vis[e.des] = true;
//                                 for(int i=0;i<cities[e.des].length;i++){
//                                       if(cities[e.des][i]!=0){
//                                            pq.add(new Edge(i,cities[e.des][i]));
//                                       }
//                                 }
//                           }
//                   }
//                    System.out.print(finalCost);
//      }
//     public static void main(String[] args) {
//          int cities[][] =  {{1,2,5},{1,3,6},{2,3,1}};
//          int n  = 3;
//           connectingCities(cities,n);
//     }
// }
// .......................................................  course shedule -1 
// public  class programe{
//        public static boolean isCycle(int src,boolean vis[],boolean rec[],int n, int edges[][]){
//           vis[src]  = true;
//           rec[src] = true;
//           for(int i=0;i<n;i++){
//               int u = edges[i][1];
//               int v = edges[i][0];
//               if(!vis[u]){
//                       if(isCycle(V, vis, rec, n, edges))
//               }
//           }
//        }
//     public static void main(String[] args) {
//     }
// }
// // ........................................................................ Number of islnad
// public  class  programe{
//       public static void dfs(int i,int j,int n,int m,int grid[][],boolean  vis[][]){
//                  if(i>=0  || j>=0 || i<n  || j<m ||  vis[i][j]==true  || grid[i][j]==0){
//                     return ;  
//                  }
//                  dfs(i-1,j,n,m,grid,vis);
//                  dfs(i+1,j,n,m,grid,vis);
//                  dfs(i,j+1,n,m,grid,vis);
//                  dfs(i,j-1,n,m,grid,vis);
//       }
//       public static void main(String[] args) {
//             int grid[][] = new int[5][5];
//             int n = grid.length;
//             int ans=0;
//             int m   = grid[0].length;
//             boolean vis[][] = new boolean[n][m];
//             for(int i=0;i<n;i++){
//                     for(int j=0;j<m;j++){
//                            if(vis[i][j]!=true  &&  grid[i][j]==1){
//                                  dfs(i,j,n,m,grid,vis);
//                                  ans++;
//                            }
//                     }
//             }
//       }
// }
// ....................................................................
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.Queue;
// // ............................................. rotten oranges
// public  class  programe{
//       public static class Pair{
//             int i;
//             int j;
//             int time;
//             public Pair(int i,int j,int time){
//                     this.i = i;
//                     this.j = j;
//                     this.time = time;
//             }
//       }
//       public static int  rottenOranges(int grid[][]){
//             int n = grid.length;
//             int m  = grid[0].length;
//             boolean vis[][] = new boolean[n][m];
//             Queue<Pair> q = new LinkedList<>();
//             for(int i=0;i<n;i++){
//                   Arrays.fill(vis[i], false);
//             }
//             //   add all the elements which are having the i,j ==2
//             for(int i=0;i<n;i++){
//                    for(int j=0;j<m;j++){
//                           if(grid[i][j]==2){
//                                 q.add(new Pair(i,j,0));
//                           }
//                    }
//             }
//             int ans=0;
//             while(!q.isEmpty()){
//                     Pair pair = q.poll();
//                      int i  = pair.i;
//                      int j = pair.j;
//                      int time = pair.time;
//                      ans = Math.max(ans,time);
//                      if(i-1>=0  && vis[i-1][j]!=true && grid[i-1][j]==1){
//                             q.add(new Pair(i-1,j,time+1));
//                      }
//                      if(j-1>=0  && vis[i][j-1]!=true && grid[i][j-1]==1){
//                            q.add(new Pair(i, j-1, time+1));
//                      }
//                      if(i+1<n  && vis[i+1][j]!=true  && grid[i+1][j]==1){
//                            q.add(new Pair(i+1, j, time+1));
//                      }
//                      if(j+1<m  && vis[i][j+1]!=true  && grid[i][j+1]==1){
//                            q.add(new Pair(i,j+1,time+1));
//                      }
//             }
//             return ans;
//       }
//       public static void main(String[] args) {
//       }
// }
// .........................................................  mst using the prims algoirthm
// ................................................................  
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// // .........................................................    dijkstra algorithm  using cheapest  flights within k stops
// public  class  programe{
//         public static  class Edge{
//             int src;
//             int des;
//             int wt;
//             public Edge(int src,int des,int wt){
//                     this.src = src;
//                     this.des =  des;
//                     this.wt = wt;
//             }
//         }
//         public static class Pair{
//                 int v;
//                 int cost;
//                 int stops;
//                 public Pair(int v,int cost,int stops){
//                     this.v = v;
//                     this.cost = cost;
//                     this.stops = stops;
//                 }
//         }
//          public static  void cheapestFlights(int flights[][],ArrayList<Edge>graph[],int s,int d,int k,int n){
//              for(int i=0;i<graph.length;i++){
//                           graph[i] = new ArrayList<>();
//                  }
//                  for(int i=0;i<graph.length;i++){
//                      int src = flights[i][0];
//                      int des = flights[i][1];
//                      int wt = flights[i][2];
//                       graph[i].add(new Edge(src, des, wt));
//                  }
//                   Queue<Pair> q = new LinkedList<>();
//                   int dis[] = new int[graph.length];
//                   for(int i=0;i<n;i++){
//                           if(dis[i]!=s){
//                                  dis[i] = Integer.MAX_VALUE;
//                           }
//                   }
//                     q.add(new Pair(s,0,0));
//                      while(!q.isEmpty()){
//                            Pair pair =  q.poll();
//                            for(int i=0;i<graph[pair.v].size();i++){
//                                 Edge e = graph[pair.v].get(i);
//                                 int u = e.src;
//                                 int v = e.des;
//                                 int wt = e.wt;
//                                      if(dis[i]!=Integer.MAX_VALUE  && (dis[u]+pair.cost)<dis[v]){
//                                           //       relaxtion 
//                                             dis[v] = dis[u]+wt;
//                                             q.add(new Pair(v,dis[v],pair.stops+1));
//                                      }
//                            }
//                      }
//          }
//       public static void main(String[] args) {
//             ArrayList<Edge>graph[] = new ArrayList[5];
//               int flights[][]=  {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
//                  cheapestFlights(flights, graph,2,5,6,5);
//       }
// }
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// // ........................................................
// // ........................................................  dijkstra algorithm using   cheapest flights within  k stops
// public  class programe{
//       public static class Edge{
//             int src;
//             int des;
//             int wt;
//             public Edge(int src,int des,int wt){
//                    this.src = src;
//                    this.des = des;
//                    this.wt = wt;
//             }
//       }
//       public static class Pair{
//               int v;
//               int cost;
//               int stop;
//               public Pair(int v,int cost,int stop){
//                     this.v = v;
//                     this.cost = cost;
//                     this.stop  = stop;
//               }
//       }
//       public static int  createGraph(ArrayList<Edge> graph[] , int flights[][]){
//              for(int i=0;i<graph.length;i++){
//                     graph[i] = new ArrayList<>();
//              }
//                for(int i=0;i<flights.length;i++){
//                    int src = flights[i][0];
//                    int des = flights[i][1];
//                    int wt = flights[i][2];
//                    Edge  e = new Edge(src,des,wt);
//                      graph[src].add(e);
//                }
//       }
//       public static int cheapestFlights(ArrayList<Edge> graph[],int src,int des,int k,int n, int flights[][] ){
//         int dis[] = new int[n];
//           Queue<Pair> q  = new LinkedList<>();
//               for(int i=0;i<n;i++){
//                     if(i!=src){
//                           dis[i] = Integer.MAX_VALUE;
//                     }
//                     else{
//                            dis[i] = 0;
//                     }
//               }
//                q.add(new Pair(src,0,0));
//                while(!q.isEmpty()){
//                       Pair pair = q.poll();
//                       int stop = pair.stop;
//                       if(stop>k){
//                           break;
//                       }
//                       for(int i=0;i<graph[pair.v].size();i++){
//                               Edge e = graph[pair.v].get(i);
//                               int u = e.src;
//                                int v = e.des;
//                                int wt = e.wt;
//                                 if(dis[u]!=Integer.MAX_VALUE   && dis[u]+wt<dis[v]&& pair.stop<=k){
//                                          dis[v] =  dis[u]+wt;
//                                          q.add(new Pair(v,dis[v],pair.stop+1));
//                                 }
//                       }
//                }
//                if(dis[des]==Integer.MAX_VALUE){
//                        return -1;
//                }else{
//                        return dis[des];
//                }
//       }
//        public static void main(String[] args) {
//              int n=4;
//               ArrayList<Edge> graph[] = new ArrayList[n];
//               int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
//                 createGraph(graph,flights);
//                 int src = 0;
//                 int des = 3;
//                 int k = 2;
//                  int ans = cheapestFlights(graph, src, des, k, n,flights);
//                    System.out.print(ans);
//        }
// }
// import java.util.ArrayList;
// import java.util.PriorityQueue;
// // ........................................................................  mst  using the prim's algorithm
// public  class programe{
//        public static class Edge{
//               int src;
//               int des;
//               int wt;
//         public Edge(int src,int des,int wt) {
//             this.src = src;
//             this.des =  des;
//             this.wt = wt;
//         }         
//        }
//        public static  class Pair implements  Comparable<Pair>{
//                   int v;
//                   int cost;
//                   public Pair(int v,int cost){
//                           this.v = v;
//                           this.cost = cost;
//                   }
//                   @Override
//                   public int compareTo(Pair p2){
//                            return this.cost - p2.cost;
//                   }
//        }
//         public static void createGraph(ArrayList<Edge>graph[]){
//                  graph[0].add(new Edge(0,1,10));
//                  graph[0].add(new Edge(0,2,15));
//                  graph[0].add(new Edge(0,3,30));
//                  graph[1].add(new Edge(1,0,10));
//                  graph[1].add(new Edge(1,3,40));
//                  graph[2].add(new Edge(2,0,15));
//                  graph[2].add(new Edge(2,3,50));
//                  graph[3].add(new Edge(3,1,40)); 
//                  graph[3].add(new Edge(3,2,50)); 
//         }
//         public static void primsAlgo(ArrayList<Edge>graph[]){
//                  boolean vis[] =  new boolean[graph.length];
//                  PriorityQueue<Pair> pq = new PriorityQueue<>();
//                  pq.add(new Pair(0,0));
//                  int finalCost =0;
//                  while(!pq.isEmpty()){
//                      Pair curr = pq.remove();
//                       if(!vis[curr.v]){
//                            vis[curr.v] = true;
//                            finalCost +=  curr.cost;
//                            for(int i=0;i<graph[curr.v].size();i++){
//                                    Edge e  = graph[curr.v].get(i);
//                                    pq.add(new Pair(e.des,e.wt));
//                            }
//                       }
//                  }
//                  System.out.print(finalCost);
//         }
//       public static void main(String[] args) {
//             int v = 4;
//             ArrayList<Edge>graph[] = new ArrayList[v];
//             createGraph(graph);
//             primsAlgo(graph);
//       }
// }
// .........................................................................
// import java.util.ArrayList;
// import java.util.Collections;
// public  class programe{
//         public static class Job{
//             int id;
//             int deadline;
//             int profit;
//             public Job(int id,int deadline,int profit){
//                     this.id = id;
//                     this.deadline = deadline;
//                     this.profit = profit;
//             }
//         }
//       public static void main(String[] args) {
//              int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
//              int n = jobInfo.length;
//              ArrayList<Job> job = new ArrayList<>();
//              for(int i=0;i<n;i++){
//                     job.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
//              }
//              Collections.sort(job,(a,b)->(b.profit-a.profit));
//              ArrayList<Integer> result = new ArrayList<>();
//              int  time=0;
//              for(int i=0;i<n;i++){
//                     Job curr = job.get(i);
//                     if(curr.deadline>time){
//                            time++;
//                            result.add(curr.id);
//                     }
//              }
//              for(int i : result){
//                     System.out.print(i);
//              }
//       }
// }
// ..........................................................................
// import java.util.ArrayList;
// import java.util.Collections;
// public class programe{
//        public  static  class Job{
//             int deadline;
//             int profit;
//             int id;
//               public  Job(int id,int deadline,int profit){
//                      this.id = id;
//                      this.deadline = deadline;
//                      this.profit = profit;
//               }
//        }
//       public static void main(String[] args) {
//             //............................ job sequencing
//             int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
//               ArrayList<Job> list = new ArrayList<>(jobInfo.length);
//              for(int i=0;i<jobInfo.length;i++){
//                   list.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
//              }
//              Collections.sort(list,(a,b)->b.profit-a.profit);
//              ArrayList<Integer> result = new ArrayList<>();
//              int time=0;
//              for(int i=0;i<jobInfo.length;i++){
//                     Job curr  = list.get(i);
//                     if(curr.deadline>time){
//                                time++;
//                                 result.add(curr.id);
//                     }
//              }
//              for(int i : result){
//                    System.out.print(i +"  ");   
//              }
//       }
// }
//.................................................
// public class programe{
//     public static void main(String[] args) {
//           int notes[] = new int[]{2000,1000,500,200,100,50,10,5,1};
//           int notesCounter[] = new int[9];
//           int amount=450;
//           for(int i=0;i<9;i++){
//                 if(amount>=notes[i]){
//                       notesCounter[i] = amount/notes[i];
//                       amount = amount%notes[i];
//                 }
//           }
//     }
// }
//...............................................................
// public  class  programe{
//     public static void main(String[] args) {
//             int[] greed = {1, 10, 3};
//             int[] cookie = {1, 2,3};
//             int n = greed.length;
//             int m = cookie.length;
//             int i=0;
//             int  count=1;
//             int j=0;
//             Arrays.sort(greed);
//             Arrays.sort(cookie);
//             while(i<n  && j<m){
//                    if(cookie[j]>=greed[i]){
//                        count++;
//                        i++;
//                        j++;
//                    }
//                    j++;
//             }
//             System.out.print(count);
//     }
// }
//             if(m==1 ||  n==1){
//                  list.get(m).set(n,1);
//                       return 1;
//             }
//                     if(list.get(m).get(n)==0){
//                             int paths = countPath(m-1, n, list)+countPath(m, n-1, list);
//                             list.get(m).set(n,paths);
//                     }
//             return  list.get(m).get(n);
//     }
//     public   static void main(String args[]){
//         int  m = 3;
//         int n = 3;
//         ArrayList<ArrayList<Integer>>list = new ArrayList<>();
//         for(int i=0;i<=n;i++){
//               ArrayList<Integer>ans = new ArrayList<>();
//               for(int j=0;j<=m;j++){
//                     ans.add(0);
//               }
//               list.add(ans);
//         }
//         int ans1 = countPath(m,n,list);
//           System.out.print(ans1);
//     }
// }
// ............................................... clone a g  graph using bfs  
// public   class programe{
//      int val;
//         ArrayList<Node> list ;
//        public  Node(){
//              list = new ArrayList<>();  
//        }
//        Node(int val){
//           this.val   = val;
//        }
//       Map<Node,Node> map  = new HashMap<>();
//        public static  void cloneGraph(Node node){
//            if(node==null){
//                return null;
//            }
//            Queue<Node> q = new LinkedList<>();
//                  map.put(node,new Node(node.val));
//                  q.add(node);
//                  while(!q.isEmpty()){
//                         Node curr = q.poll();
//                          for(Node neighbour :  curr.neighbour){
//                                 if(!map.contains(neighbour)){
//                                           Node clone = new Node(node.val);
//                                           map.put(neighbour,clone);
//                                           q.offer(neighbour);
//                                 }
//                          }
//                  }
//        }
//     public static void main(String[] args) {
//     }
// }
// ...................................  reverse an array in k group
// public  class programe{
//      public static void main(String args[]){
//             int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//             int k=3;
//             int n = arr.length;
//              for(int i=0;i<n;i+=k){
//                   int left=i;
//                   int  right = Math.min(i+k-1,n-1);
//                   while(left<right){
//                      int temp = arr[left];
//                      arr[left] = arr[right];
//                      arr[right]  =  temp;
//                      left++;
//                      right--;
//                   }
//              }
//              for(int num: arr){
//                    System.out.print(num +"  ");
//              }
//      }
// }
// ..............................................  sum of all subArrays   
// public  class programe{
//       public static void main(String[] args) {
//              int[] arr = {1,2,3,4};
//              int n =  arr.length;
//              int  result = 0;
//              int sum=0;
//              for(int i=0;i<n;i++){
//                      sum = 0;
//                      for(int j=i;j<n;j++){
//                             sum += arr[j];
//                             result += sum;
//                      }
//              }
//                  System.out.print(result);
//       }
// }
// ...................................  roatete an array by k distance
// public  class programe{
//     public static void main(String[] args) {
//           int arr[] = {1, 2, 3, 4, 5, 6};
//           int n = arr.length;
//              int d =2;
//              for(int i=0;i<d;i++){
//                     int first = arr[0];
//                     for(int j=0;j<n-1;j++){
//                              arr[j] = arr[j+1];
//                     }
//                     arr[n-1] = first;
//              }
//              for(int num : arr){
//                   System.out.print(num +"  ");
//              }
//     }
// }
// ............................................................. find toposorting in the graph
// public  class  programe{
//     public static void findTopo(int src,boolean vis[],ArrayList<ArrayList<Integer>> adj,Stack<Integer> st){
//                  vis[src] = true;
//                  for(int it:adj.get(src)){
//                       if(!vis[it]){
//                            findTopo(it, vis, adj, st);
//                       }
//                  }
//                    st.add(src);
//     }
//            public static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj){
//                   Stack<Integer> st = new Stack<>();
//                   int n = adj.size();
//                   boolean vis[] = new boolean[n];
//                   for(int i=0;i<n;i++){
//                             if(vis[i]==false){
//                                 findTopo(i,vis,adj,st);
//                             } 
//                   }
//            }
//       public static void main(String[] args) {
//       }
// }
// ...............................................................
// public class programe {
//     public static class Graph {
//         List<Integer> adj[];
//         int v;
//         public Graph(int v) {
//             this.v = v;
//             @SuppressWarnings
//             List<Integer> adj[] = new ArrayList<>(v);
//             for (int i = 0; i < adj.size(); i++) {
//                 adj[i] = new ArrayList<>();
//             }
//         }
//         public  void addEdge(int src,int des){
//                       this.adj[src].add(des);
//         }
//         public static void findIndegree(boolean vis[],int indegree[],Stack<Integer>st){
//                                 boolean flag = false;
//                             for(int i=0;i<this.v;i++){
//                                   if(!vis[i] &&  indegree[i]==0){
//                                          vis[i] = true;
//                                          st.add(i);
//                                          for(int it:this.adj[i]){
//                                                indegree[it]--;
//                                          }
//                                   }
//                                    topoUtil(vis,indegree,st);
//                                    vis[i] = false;
//                                    st.remove(st.size()-1);
//                                    for(int it:adj[i]){
//                                        indegree[it]++;
//                                    }
//                             }
//                             flag = true;
//                     while(!flag){
//                           st.forEach(i->System.out.print(i +"  "));
//                           System.out.println();
//                     }
//         }
//     }
//     public static void main(String[] args) {
//     }
// }
// .............................................  Toplogical sorting using BFS
// public class  programe{
//   public static class Graph{
//      int v;
//        ArrayList<ArrayList<Integer>> adj;
//        public  Graph(int v){
//              this.v = v;
//              this.adj = new ArrayList<>();
//        }
//        public static void topo(Stack<Integer> st,boolean vis[],int indegree[]){
//         Queue<Integer> q = new LinkedList<>();
//         ArraysList<Integer> result = new ArrayList<>();
//            for(int i=0;i<this.v;i++){
//              for(int j : this.adj.get(i)){
//                    indegree[j]++;
//              }
//            }
//            for(int i=0;i<indegree.length;i++){
//                    if(indegree[i]==0){
//                        q.add(i);
//                    }
//            }
//            while(!q.isEmpty()){
//                int top = q.poll();
//                result.add(top);
//                for(int i: adj.get(top)){
//                   if(indegree[i]==0){
//                         q.add(i);
//                   }else{
//                       indegree[i]--;
//                   }
//                }
//            }
//        }
//   }
//     public static void main(String[] args) {
//             int v = 6;
//             ArrayList<Integer> result = new ArrayList<>();
//             int indeg[] = new int[v];
//     }
// }
// .........................................................  Assign the cook
