
public class MajorElement {

    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        int n = nums.length;
        int count = 0;
        int current = 0;
        for (int num : nums) {
            if (count == 0) {
                current = num;
            }
            if (current == num) {
                count++;
            }else{
                  count--;
            }
        }
        System.out.print(current);

    }
}
