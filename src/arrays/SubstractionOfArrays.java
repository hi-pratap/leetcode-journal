package arrays;

import java.util.Arrays;

public class SubstractionOfArrays {
    static void main() {
        int [] arr1={9,9,8,8};
        int [] arr2={8,9,9};
        substractTwoArrays(arr1,arr2);
    }

    private static void substractTwoArrays(int[] arr1, int[] arr2) {
        int [] ans=new int [Math.max(arr1.length,arr2.length)];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=ans.length-1;
        int carry=0;
        //11
        //12
        while(k>=0){
            int toBeSubstracted=0;
            if(j>=0){
                toBeSubstracted=arr2[j];
            }
            if(arr1[i]-carry>=toBeSubstracted){
                ans[k]=arr1[i]-carry-toBeSubstracted;
            }else{
                ans[k]=arr1[i]-carry+10-toBeSubstracted;
                carry=1;
            }
            i--;
            j--;
            k--;
        }
        System.out.println(Arrays.toString(ans));

    }
}
