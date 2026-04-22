package arrays;

import java.util.Arrays;

public class SortedArrays {
    static void main() {
        int[] ints = squareAndSort(new int[]{-4, -1, 0, 3, 10});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] squareAndSort(int[] arr){
        int n=arr.length-1;
        int start=0; int end=n;
        int [] ans=new int[n+1];
        while(start<=end){
          if(Math.abs(arr[start])>Math.abs(arr[end])){
              ans[n--]=arr[start]*arr[start];
              start++;
          }else{
              ans[n--]=arr[end]*arr[end];
              end--;
          }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
