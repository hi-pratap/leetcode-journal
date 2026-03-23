package arrays;

import java.util.Arrays;

public class TwoSum {

    static void main() {
        int [] arr={1,2,3,4,5,6,7,8};
        int target=12;
        int[] ints = bruteForce(arr, target);

        int [] optimised=twoSum(arr,target);
        System.out.println(Arrays.toString(optimised));
    }

    public static int[] twoSum(int[] nums, int target) {

        int start=0;
        int adjecent=start+1;
        int n=nums.length-1;
        while(n>start){

            if(nums[start]+nums[adjecent]==target){
                return new int [] {nums[start],nums[adjecent]};
            }else{
                if(adjecent==n){
                    start++;
                    adjecent=start+1;
                }
                adjecent++;
            }

        }
 return new int[]{0,0};
    }

    private static int[] bruteForce(int[] arr, int target) {

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]+arr[j]==target) return new int[]{i,j};
            }
        }
        return new int[0];
    }
}
