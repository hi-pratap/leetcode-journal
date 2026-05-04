package arrays.twopointer;

import java.util.ArrayList;
import java.util.List;

import static arrays.TwoSum.twoSum;

public class TwoSums {
    static void main() {
        int[] arr={1,1,2,3,4,5,9};
      twoSum(arr,7);
    }

    private static void twoSum(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        List<Integer> list=new ArrayList<>();
        while(start<end){
            if(arr[start]+arr[end]==target){
                list.add(arr[start]);
                list.add(arr[end]);
                start++;
            }else {
                if(arr[start]+arr[end]>target) end--;
                else start++;
            }
        }
        System.out.println(list);

    }
}
