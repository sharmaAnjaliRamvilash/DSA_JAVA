
import java.util.ArrayList;
import java.util.HashSet;

public  class IntersectionArrays{
    public static void intersection(int nums1[],int nums2[]){
               HashSet<Integer> set1 = new HashSet<>();
               HashSet<Integer> set2 = new HashSet<>();
               for(int num: nums1){
                   set1.add(num);
               }
               for(int num: nums2){
                   set2.add(num);
               }
               ArrayList<Integer> list = new ArrayList<>();
               for(int num: set1){
                   if(set2.contains(num)){
                        list.add(num);
                   }
               }
               for(int nums: list){
                   System.out.print(nums +"  ");
               }
               
    }
    public static  void main(String args[]){
        int nums[] = {1,2,2,1};
        int nums2[] = {2,2};
        intersection(nums2, nums2);
        
    }
}