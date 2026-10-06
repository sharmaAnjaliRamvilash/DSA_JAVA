
import java.util.ArrayList;

public class generatePeranthisis {
    public static void generate(ArrayList<String> ans,int n,int open ,int close,StringBuilder sb,int i){
           if(open==close || i==n){
                 ans.add(sb.toString());
                 return;
           }
           for(;i<n;i++){
                   sb.append('(');
                   generate(ans, n, open++, close, sb, i++);
                   sb.deleteCharAt(sb.length()-1);
                   sb.append(')');
                   generate(ans, n, open, close++, sb, i++);
           }


    }
    public static void helper(int n){

        ArrayList<String> ans = new ArrayList<>();
        int open = 0;
        int close = 0;
        StringBuilder sb = new StringBuilder();
        generate(ans,n,open,close,sb,0);
        for(String list: ans){
                System.out.print(list +"  ");
        }
        
    }
    public static void main(String args[]){
        int n=3;
        helper(n);
          
    }
}