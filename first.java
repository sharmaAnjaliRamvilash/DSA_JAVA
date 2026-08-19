// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static class Node{
         Node children[] = new Node[26];
         boolean end ;
         Node(){
               for(int i=0;i<26;i++){
                      children[i] = null;
               }
         }
    }
    public static Node root = new Node();
    
       public static void insert(String word){
             int level = 0;
             int len = word.length();
             Node curr = root;
             
             for(;level<len;level++){
                    index = curr.children[index]-'a';
                   if(curr.children[index]==null){
                           curr.childre[index] = new Node();
                   }
                     curr = curr.childre[index];
             }
              eow = true;
       }
       public static boolean search(String key){
           int level =0;
           int index=0;
           int len = key.length();
           Node curr = root;
           for(; level<len;level++){
                index = curr.children[index]-'a';
               if(curr.children[index]==null){
                      //return false;
               }
               curr = curr.children[index];
           }
             return  curr.eow==true;
           
       }
     public static void insertTrie(String word){
             
     }
    public static int countNodes(Node root){
          if(root==null){
                return 0;
          }
          int count=0;
          for(int i=0;i<26;i++){
                 count += countNodes(curr.children[i]);
          }
          return count+1;
    }
    public static void main(String[] args) {
           String str = "ababc";
           int n = str.length();
           //   calcultate the suffix
           for(int i=0;i<n;i++){
                String suffix  = str.substring(i);
                  insertTrie(suffix);
           }
    }
}