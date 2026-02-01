package arrays;

import java.util.Arrays;

public class TwoSum {

    static void main() {
        int [] arr={1,2,3,4,5,6,7,8};
        int target=12;
        int[] ints = bruteForce(arr, target);
        System.out.println(Arrays.toString(ints));

        int [] optimised=optimised(arr,target);
    }

    private static int[] optimised(int[] arr, int target) {

//        Map<>

        return null;
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
