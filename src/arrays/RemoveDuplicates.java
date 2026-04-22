package arrays;

public class RemoveDuplicates {

    static void main() {
       int [] nums = {0,0,1,1,1,2,2,3,3,4};
       removeDuplicates(nums);
    }

    private static void removeDuplicates(int[] nums) {
        if (nums.length == 0) return;
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

    }

}
