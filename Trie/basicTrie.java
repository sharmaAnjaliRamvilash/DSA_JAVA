public  class basicTrie{
    public static  class  TrieNode{

        int children[];
        boolean isEnd;

        public TrieNode() {
            this.children = new int[26];
            this.isEnd = false;
        }
        TrieNode root = new TrieNode();
        public void insert(String s){
               TrieNode curr =  root;
                for(char ch: s.toCharArray()){
                       int index = ch-'a';
                       if(children[index]==null){
                                   children[index] = new TrieNode();
                                   curr[index]   = cur;      
                       }
                }
        }
        
    }
    
    public static void main(String[] args) {
          
    }
}