package math;

import java.util.Arrays;

public class FibonachiSequence {
    static void main() {
    System.out.println(Arrays.toString(FibonacciSeq(7)));
    System.out.println(usingRecursion(7));
    }

    private static int usingRecursion(int n) {
        if(n<=1) return n;

       return usingRecursion(n - 1) + usingRecursion(n - 2);
    }

    private static int[] FibonacciSeq(int n) {
        int [] result=new int[n+1]; //length 8
        result[0]=0;
        result[1]=1;
        for (int i = 2; i <= n; i++) {
            result[i]=result[i-1]+result[i-2];
        }
        return result;
    }
}
