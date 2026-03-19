package arrays;

import java.util.Arrays;

public class SqaureAndSortArray {
    static void main() {
        int[] arr = {-7,-3,2,3,11};
        int[] ints = sortedSquares(arr);
        System.out.println(Arrays.toString(ints)) ;   }

    public static int[] sortedSquares(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int n=arr.length-1;
        int[] ans=new int[arr.length];
        while (start <= end) {
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                ans[n--] = arr[start] * arr[start];
                start++;
            }else{
                ans[n--] = arr[end] * arr[end];
                end--;
            }
        }
      return  ans;
    }
}
