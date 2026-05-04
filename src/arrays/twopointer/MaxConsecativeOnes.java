package arrays.twopointer;

public class MaxConsecativeOnes {
    static void main() {
        int[] arr={1,1,0,0,1,0,1,1,1,1};
        maxConsecativeOnes(arr);
    }

    private static void maxConsecativeOnes(int[] arr) {

        int i=0;
        int j=0;
        int n = arr.length - 1;
        int max=Integer.MIN_VALUE;
        int count=0;
        while(n>=0){
                if(arr[j]==1){
                    j++;
                }else{
                    count=j-i;
                    if(count>max) max=j-i;
                    j++;
                            i=j;
                }
            if(j-i>max) max=j-i;
            n--;
        }
        System.out.println(max);
    }
}
