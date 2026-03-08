package arrays;

public class SortedArrays {
    static void main() {
        int[] ints = squareAndSort(new int[]{-4, -1, 0, 3, 10});
        System.out.println(ints);
    }

    public static int[] squareAndSort(int[] arr){
        int n=arr.length;
        int i=0; int j=1;
        while(n>0){
            if(arr[j]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            i++;
            j++;
            n--;
        }
        return arr;
    }
}
