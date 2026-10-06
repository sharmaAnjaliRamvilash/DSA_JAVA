
public class DuplicateMissing{
    public static void main(String[] args) {
        flmlfmf
    }
}







// import java.util.HashSet;
// public  class DuplicateMissing{
//        public static void main(String[] args) {
//                  int nums[][] = {{1,3},{2,2}};
//                  HashSet<Integer> set = new HashSet<>();
//                  int n = nums.length;
//                  int ans[] = new int[2];
//                  int m = nums[0].length;
//                  for(int i=1;i<n;i++){
//                        for(int j=1;j<m;j++){
//                               if(set.contains(nums[i][j])){
//                                          ans[0] = nums[i][j]; 
//                               }else{
//                                        ans[1] = nums[i][j];
//                               }
//                        }
//                  }
//                  System.out.print(ans[0] +"  " +ans[1]);

//        }
// }





// import java.util.PriorityQueue;

// public  class DuplicateMissing{
//        public static void main(String[] args) {
//              int nums[]  = {3,2,1,5,6,4};
//              int n = nums.length;
//              int k=2;
//              PriorityQueue<Integer> pq = new PriorityQueue<>();
//              for(int num: nums){
//                   if(pq.size()>k){
//                         pq.poll();
//                   }
//                   pq.add(num);
//              }
//                System.out.print(pq.peek());
//        }
// }

// import java.util.HashSet;

// public  class DuplicateMissing{
//      public static void main(String[] args) {
//             int nums[][] = {{1,3},{2,2}};
//             int n = nums.length;
//             int m = nums[0].length;
//             int ans[] = new int[2];
//             HashSet<Integer> set = new HashSet<>();
//             for(int i=0;i<n;i++){
//                   for(int j=0;j<m;j++){
//                            if(set.contains(nums[i][j])){
//                                ans[0] = nums[i][j];
//                            }else{
//                                   set.add(nums[i][j]);
//                            }
//                   }
//             }
//      }

// }