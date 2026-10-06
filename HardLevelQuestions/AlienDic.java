
import java.util.*;
public  class AlienDic{
    public static void main(String[] args) {
        String str[] = {"wrt", "wrf", "er", "ett", "rftt"};
        int n  = str.length;
        HashMap<Character,List<Character>> graph = new HashMap<>();
        HashMap<Character,Integer> indegree = new HashMap<>();
            for(String s: str){
                  for(char ch: s.toCharArray()){
                        graph.put(ch, new ArrayList<>());
                        indegree.put(ch, 0);
                  }
            }
            for(int i=0;i<n-1;i++){
                   String w1 = str[i];
                   String w2 = str[i+1];
                   int min = Math.min(w1.length(),w2.length());
                   boolean found = false;
                   for(int j=0;j<min;j++){
                          char c1 = w1.charAt(j);
                          char c2 = w1.charAt(j);
                          if(c1!=c2){
                              graph.get(c1).add(c2);
                              indegree.put(c2, indegree.get(c2)+1);
                              found = true;
                              break;

                          }
                          
                   }
                   Queue<Character> q = new LinkedList<>();
                   for(char ch: indegree.keySet()){
                        if(indegree.get(ch)==0){
                               q.offer(ch);
                        }
                   }
                   StringBuilder sb = new StringBuilder();
                   while(!q.isEmpty()){
                           char curr = q.poll();
                           sb.append(curr);
                           for(char nbr: graph.get(curr)){
                            
                           }
                   }

            }
          
    }
}