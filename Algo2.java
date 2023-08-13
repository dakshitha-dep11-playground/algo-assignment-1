public class Algo2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;
        int smallestNumber =nums[0];
        int largestNumber = nums[0];


        for(int i = 0; i < nums.length; i++){
            if(nums[i]<smallestNumber)smallestNumber=nums[i];

            if(nums[i]>largestNumber)largestNumber=nums[i];
        }

        System.out.println("Smallest Number : "+smallestNumber);
        System.out.println("Largest Number : "+largestNumber);
    }
}
