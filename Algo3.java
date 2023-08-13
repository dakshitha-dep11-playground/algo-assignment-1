import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int[] reverseNums = new int[nums.length];

        for(int i = 0; i<nums.length ; i++){
            reverseNums[i] = nums[nums.length - 1 -i];
        }

        nums = reverseNums;

        System.out.println(Arrays.toString(nums));
    }
}
