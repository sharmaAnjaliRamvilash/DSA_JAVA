import  java.util.*;
public  class  new{
  public static void main(String args[]){
      
  }
}



// ..........................................................


// import  java.util.*;
// public  class  new{
//     public static int helper(int grid[][],int n,int m,int i,int j ){
//          if(i<=0  ||  j<=0 || i>=n || j>=m){
//                 return 0;

//             }
//          if(i==n-1 ||  j==m-1){
//               return  grid[i][j];
//             }

//             int down = helper(grid,n,m,i+1,j);
//             int right = helper(grid,n,m,i,j+1);

//             return Math.min(down,right);
//     }
     
//     public static void main(String[] args) {
//         int grid[][]  ={{1,2,3},{3,1,4},{6,3,2},{7,4,3},{5,2,1}};
//         int n = grid.length;
//         int m = grid[0].length;
//         int i=0;
//         int j=0;
//         return helper(grid,n,m,i,j);
        
//     }
    
// }



// import java.util.*;
// public class new{
//     public static void main(String[] args) {
//            Node dummy = new Node(0,head);
//             Node slow =dummy;
//             Node fast = dummy;

//             int n = 4;
//             //1->2->3->4->5
//             for(int i=0;i<=n;i++){
//                     fast = fast.next;

//                 }

//                 while(fast!=null){
//                         slow = slow.next;
//                         fast = fast.next;

//                 }
//                 slow = slow.next.next;
//                 return dummy.next;
//     }
// }


// //.............................. reverse  the nodes in k group

// import java.util.*;
// public class new {
//     public static void main(String[] args) {
//           int k = 3;
//           Node head;
//           Node temp = head;
//           for(int i=0;i<=k;i++){
//                   if(temp==null){
//                            return  head;
//                   }

//                 }
                
//                 Node curr = null;
//                 Node prev = null;
//                 int count=0;
//                 while(count<k){
//                       Node next = curr.next;
//                       curr.next = prev;
//                       prev = curr;
//                       curr = next;

//                     }
//                     head.next = reverse(curr,k);
//                     return   prev;
           
//     }
// }




// //......................................



// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

// class Main {
//     public static class Node{
//         Node children[] = new Node[26];
//         boolean eow;
//        public Node(){
//              for(int i=0;i<26;i++){
//                     children[i] = null;
//              }
//         }
//     }
//     public static  Node root = new Node();
//      public static void insert(String word){
//          int level=0;
//          int len = word.length();
//          int idx=0;
//          Node curr = root;
//          for(;level<len;level++){
//              idx = word.charAt(level)-'a';
//              if(curr.children[idx]==null){
//                  curr.children[idx]= new Node();
//              }
//                curr = curr.children[idx] ;
//          }
//          curr.children[idx].eow = true;
            
//      }
//      public static boolean search(String key){
//            int leve=0;
//            int idx=0;
//            int len = key.length();
//            Node curr = root;
//            for(; level<len;level++){
//                 idx = key.charAt(level)-'a';
//                if(curr.children[idx]==null){
//                      return false;
//                }
//                 curr = curr.children[idx] ;
//            }
//            return curr.children[idx].eow ==true;
           
//      }
//      public static ans="";
//      public static void longestWord(Node root,StringBuilder temp){
//          Node curr = root;
//           if(root==null){
//                 return ;
//           }
//           for(int i=0;i<26;i++){
              
//               if(curr.children[i]!=null  && curr.children[i].eow==true  ){
//                    char ch = (char)(i+'a');
//                     temp.append(ch);
//                     if(ans<temp){
//                           ans = temp.toString();
//                     }
//                     longestWord(curr.children[i],temp);
//                      temp.deleteCharAt(temp.legnth()-1);
//               }
              
//           }
         
//      }
//     public static void main(String[] args) {
        
//         for(int i=0;i<words.length();i++){
//                insert(words[i]);
//         }
//         longestWord()
        
//     }
// }   





// //    cycle detection int directed graph

// import java.util.*;
// public class new{
//      public boolean isCycle(int src,boolean vis[],boolean rec[]){
//              vis[src] = true;
//              rec[src] =  true;
//              for(int val : list.get(src)){
//                      if(!vis[val]){
//                           if(isCycle(val,vis,rec)){
//                                 return true;
//                           }else{
//                               if(rec[val]!=true){
//                                         return true;
//                               }
//                           }
//                      }
//              }
//      }
//     public static void main(String[] args) {
            
//     }
// }  

// //   circular queue  ...........................................


// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

// class Main {
//     static class queue{
//        static int front;
//        static  int rear;
//        static  int capacity;
//        static int size;
//        static int currentSize;
//        static int arr[];
//         queue(int size){
//                this.front = -1;
//                this.rear=-1;
//                 this.size = size;
//                 this.arr = new int[size];
//                 this.capacity  = size;
//                 this.currentSize = 0;
                
//         }
//         public static void push(int data){
//             if(isFull()){
//                   System.out.print("Queue is full");
//                   return ;
//             }
//               rear++;
//              rear = (rear+1)%capacity;
//               arr[rear] = data;
//               currentSize++;
            
//         }
//         public  static boolean isFull(){
//              return  currentSize==size;
//         }
//         public static boolean isEmpty(){
//                return currentSize==0;
//         }
//        public static int pop(){
//              if(isEmpty()){
//                      System.out.print("Qeue is Empty");
//                      return -1 ;
//              }
//              front++;
//              front  = (front+1)%capacity;
//              currentSize--;
//              System.out.print(arr[front]);
//              return arr[front];
//        }
      
//     }
//     public static void main(String[] args) {
//           queue q = new queue(5);
//           q.push(1);
//           q.push(2);
//           q.push(3);
//           q.pop();
//           q.push(4);
//           q.push(5);
//           q.push(6);
//           q.push(9);
//           q.pop();
          
        
         
        
//     }
// }



// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online

// class Main {
//     public static class pair implements Comparable<pair> {
//         int vertex;
//         int cost;
        
//         pair(int vertex,int cost){
//               this.vertex   = vertex;
//               this.cost = cost;
//         }
//         @override
//         public int compareTo(pair p2){
//                 return this.cost = p2.cost;
//         }
//         public static void prims(ArraysList<Edge> graph[]){
//              PriorityQueue<pair>pq = new PriorityQueue<>();
//              boolean vis[] = new boolean[graph.length];
//              pq.add(new pair(0,0));
//              int finalCost=0;
//              while(!pq.isEmpty()){
//                   pair p = pq.remove();
//                   int cost = p.cost;
//                   int v = p.vertex;
//                   if(vis[v]!=true){
//                       vis[v] = true;
//                       finalCost += cost;
//                       for(int i=0;i<graph[v].size();i++){
//                            Edge e = graph[v].get(i);
//                            pq.add(new pair(e.des,e,wt));
                           
//                       }
//                   }
//              }
//         }
//           System.out.print(finalCost);
        
        
//     }
//     public static void main(String[] args) {
       
//     }
// }



// import java.util.*;

// public class new{
//     public static void findZero(int mat[][]){
//           for (int idx = 0; idx < arr.length; idx++) {
//               Object elem = arr[idx];
              
//           }}
//     }
//     public static void main(String args[]){

//            findZero(mat);
//     }
// }




//    count the words ans spaces in the string


// create the graph using the adjancey list

import  java.util.*;
public  class new{
  public  static  
}