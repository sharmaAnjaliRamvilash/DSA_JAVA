
import java.util.HashSet;

public  class LongestSequance{
        public static void main(String args[]){
              int nums[] = {100,4,200,1,0,2};
              int n = nums.length;
              HashSet<Integer> set = new HashSet<>();
              for(int num: nums){
                     set.add(num);
              }
              int count=0;
              int largest =0;
              for(int num: set){
                    int current = num;
                    count=1;
                    while(set.contains(current+1)){
                            count++;
                            current++;
                    }    
                    largest = Math.max(largest, count);
              }
              System.out.print(largest + "  ");

        }
}