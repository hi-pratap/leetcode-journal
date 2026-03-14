package arrays;

import java.util.Arrays;

public class ReverseArray {
    static void main() {
        int [] arr={1,2,3,4,5};

      //  System.out.println(Arrays.toString(reverseArrayBruteForce(arr)));
        System.out.println(Arrays.toString(reverseArrayTwoPointers(arr)));
    }

    private static int[] reverseArrayTwoPointers(int[] arr) {

        int start=0;//startOfArray //0,1,2
        int end=arr.length-1; //end 4,3,2
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

        return arr;
    }

    private static int[] reverseArrayBruteForce(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                swap(arr, i, j);
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
