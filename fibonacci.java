import java.util.*;
public  class  fibonacci{
    public static int fibonacci(int n){
          if(n<=0){
                return  1;
          }
          return  n*fibonacci(n-1);
    }
    public static void fiboDp(int n){
          int dp[] = new int[n];
          dp[0] = 1;
          dp[1] = 2;
        
          if(n==1){
                System.out.print("ans" + 1);
                return;
          }
          if(n==2){
                  System.out.print("ans" + 2);
                  return ;
          }
          
        int ans = 1;
        for(int i=1;i<n+1;i++){
               ans *= i;
        }
       System.out.print(ans);

    }
      public static void helper(int n,ArrayList<ArrayList<String>> res,ArrayList<String> list){
               if(n<=0){
                  return;
               }
                  res.add(new ArrayList<>(list));
               for(int i=n-1;i>=0;i--){
                        list.add(String.valueOf(i));
                        helper(i,res,list);
                        list.remove(list.size()-1);

               }
      }
    public static void main(String[] args) {
       ArrayList<ArrayList<String>> res = new ArrayList<>();
       helper(4,res,new ArrayList<>());
       for(ArrayList<String> list: res){
              System.out.print(list +"  ");
       }
       

    }
}