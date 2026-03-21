package arrays;

public class AddTwoArrays {
    static void main() {
        int[] arr1={1,2,3,4,9};
        int[] arr2={3,4,9};
    addTwoArrays(arr1,arr2);
    }
// 1 2 3 4 9
//     3 4 9
// 1 2 6 9 0
    private static void addTwoArrays(int[] arr1, int[] arr2) {
int n=arr1.length;
        int [] ans=new int[arr1.length];
        int i=arr1.length;
        int j=arr2.length;
        int carry=0;
        int sum=0;
        while(i>0||j>0||carry!=0){
            sum=carry;
            sum=arr1[i]+arr2[j];
            carry=sum%10;

            ans[i]

            n--;
        }

    }
}
