package arrays;

import java.util.Arrays;

public class AdditionOfArraysTwoRevise {

    static void main() {
        int[] arr1 = {1, 2, 3, 4, 9};
        int[] arr2 = {3, 4, 9};

        //
        //12698
        //addTwoArrays(arr1, arr2);
        subStructTwoArrays(arr1, arr2);

    }

    private static void subStructTwoArrays(int[] arr1, int[] arr2) {
        int[] ans = new int[Math.max(arr1.length, arr2.length) + 1];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int carry = 0;

        while (k >= 0) {
            int sub = 0;
            if (i >= 0) {
                sub += arr1[i]-carry;
            }
            if (j >= 0) sub += arr1[j]-carry;
            carry=sub/10;

            k--;
            i--;
            j--;
        }
    }

    private static void addTwoArrays(int[] arr1, int[] arr2) {
        int[] ans = new int[Math.max(arr1.length, arr2.length) + 1];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = ans.length - 1;
        int carry = 0;
        while (k > 0) {
            int sum = 0;

            //sum=arr1+arr2+carry
            if (i >= 0) sum = sum + arr1[i];
            if (j >= 0) sum = sum + arr2[j];
            sum += carry;
            carry = sum / 10;
            ans[k] = sum % 10;
            k--;
            i--;
            j--;

        }
        System.out.println(Arrays.toString(ans));
    }
}
