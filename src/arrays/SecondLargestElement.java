package arrays;

public class SecondLargestElement {
    static void main() {
        int [] arr={1,2,3,4,5};
        System.out.println(secondLargestElementInArr(arr));
    }

    private static int secondLargestElementInArr(int[] arr) {
        int max = 0;
        int secondMax = 0;
        int n = arr.length-1; //4
        while (n >= 0) {
            if (arr[n]>max) {//2
                secondMax=max;
                max=arr[n];//2
            }else if(arr[n]>secondMax  && arr[n]<max){//false
                secondMax=max;//0
            }
            n--;
        }
        return secondMax;
    }

}
