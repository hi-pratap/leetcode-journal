package math;

import java.util.Arrays;

public class PlusOneRevision {
    static void main() {
//      System.out.println(Arrays.toString(plusOneRevise(new int[]{4,3,2,1})));
//      System.out.println(Arrays.toString(plusOneRevise(new int[]{4,3,2,9})));
      System.out.println(Arrays.toString(plusOneRevise(new int[]{9})));
    }

    private static int[] plusOneRevise(int[] digits) {
        int n=digits.length-1;
        while(n>=0){
            if (digits[n]+1 != 10) {
                digits[n] = digits[n] + 1;
               return digits;
            }
            digits[n]=0;
            n--;
        }
        int [] ansNew=new int[digits.length+1];
        ansNew[0]=1;
        return ansNew;
    }
}
