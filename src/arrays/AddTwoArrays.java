package arrays;

public class AddTwoArrays {
    static void main() {
        int[] arr1={1,2,3,4,9};
        int[] arr2={3,4,9};
    addTwoArrays(arr1,arr2);
    }

    private static void addTwoArrays(int[] arr1, int[] arr2) {
        int [] ans=new int[Math.max(arr1.length,arr2.length)+1];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=ans.length-1;
        int carry=0;

        while(k>=0){
            int sum=0;
            if(i>=0) sum+=arr1[i];
            if(j>=0) sum+=arr2[j];

            sum+=carry;
            ans[k]=sum%10;
            carry=sum/10;
            i--;j--;k--;
        }

    }
}
