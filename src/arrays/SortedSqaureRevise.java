package arrays;

public class SortedSqaureRevise {
    static void main() {
        int [] arr={-4,-1,0,3,10};
        sortAndSqaure(arr);
    }

    private static void sortAndSqaure(int[] arr) {
        int start=0;
        int i = arr.length - 1;
        int end= i;
        while(start<=end){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                arr[i--]=arr[start]*arr[start];
                start++;
            }else{
                arr[i--]=arr[end]*arr[end];

                end--;
            }
        }
    }
}
