package arrays;

public class FindNumberWithEvenNumberOFDigits {
    static void main() {
        int[] nums = {12, 345, 2, 6, 7896};
        int numberCount = bruteForce(nums);
        System.out.println(numberCount);
        int optimised = evenDigits(nums);
        System.out.println(optimised);
    }

    private static int bruteForce(int[] nums) {
        // interate through whole numbers
        //count number of digits if its even then increase the count
        int n = nums.length - 1;
        int count = 0;
        int ans = 0;
        while (n >= 0) {
            int digits = nums[n];
            while (digits > 0) {
                count++;
                digits /= 10;
            }
            if (count % 2 == 0) ans++;
            count = 0;
            n--;
        }


        return ans;
    }

    private static int evenDigits(int[] nums) {
        int length = nums.length - 1;
        int count=0;
        while (length>=0){
            int digit=nums[length];
            if((digit>=10 && digit<=99) || (digit>=1000 && digit<=9999)){
                count++;
            }
            length--;
        }
            return count;
    }
}
