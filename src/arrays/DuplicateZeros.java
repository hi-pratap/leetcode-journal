package arrays;

import java.util.Arrays;

public class DuplicateZeros {

    static void main() {
        int [] nums={1,0,2,3,0,4,5,0};
        copied(nums);
    }

    private static void DUplicateZerosInArrays(int[] nums) {
        int n=nums.length-1;
        int i=0;
        int j=0;
        int [] ans=new int[nums.length+1];
        while(n>0){
            if(nums[i]==0){
               ans[j++]= nums[i++];
               ans[j++] =0;
            }else{
                ans[j++]= nums[i++];
            }
            n--;

        }
    }
    private static void copied(int[] arr) {
        int n = arr.length;
        int[] ans = Arrays.copyOf(arr, n);
        int j = 0;

        for (int i = 0; i < n && j < n; i++) {
            if (ans[i] == 0 && j < n - 1) {
                arr[j++] = 0;
                arr[j++] = 0;
            } else
                arr[j++] = ans[i];
        }
    }
}
