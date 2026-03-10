package math;

import java.util.Arrays;

public class SwapTwoNumbers {
    static void main() {
      int[] number= swapNumbers(new int[]{1,2,3});
      System.out.println(Arrays.toString(number));
    }

    private static int [] swapNumbers(int[] ints) {

        int length = ints.length-1;
        int i=0;
        int j=i+1;
        while(length>i){
            int temp=ints[i];
            ints[i]=ints[j];
            ints[j]=temp;
            i++;
            j++;
        }
return ints;
    }
}
