import java.util.Arrays;

public class Algo4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int numberChanger;

        for(int i = 0; i< nums.length/2 ; i++){
        numberChanger = nums[i];
        nums[i] = nums[nums.length-1-i];
        nums[nums.length-1-i] = numberChanger;
        }

        System.out.println(Arrays.toString(nums));
    }
}
