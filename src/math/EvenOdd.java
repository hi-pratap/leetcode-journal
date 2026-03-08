package math;

import java.time.LocalDateTime;

public class EvenOdd {

    static void main() {
        int n=1;

        //1. Even ODD
        evenOdd(n);

        //2. Sum of two Numbers
        int sum = sumOfTwoNumbers(n, 5);
        System.out.println(sum);

        //3. Find Max between two
        int max=findMaxNumber(2,4);
        System.out.println(max);


        //4. Factorial Of Number


        System.out.println("Before normal "+LocalDateTime.now());
        int factorial= factorialOfNumber(12);
        System.out.println(factorial);
        System.out.println("After normal "+LocalDateTime.now());
        System.out.println("Before recursive "+LocalDateTime.now());
        int recursiveFactorial= recursiveFactorialOfNumber(12);
        System.out.println(recursiveFactorial);
        System.out.println("After recursive "+LocalDateTime.now());

        //5. Prime Number Check

        boolean isPrimeCheck=isNumberPrime(2);
        System.out.println(isPrimeCheck);

        boolean isPrimeCheck2=isNumberPrime(37);
        System.out.println(isPrimeCheck2);

        boolean isPrimeCheck3=isNumberPrime(36);
        System.out.println(isPrimeCheck3);

    }

    private static boolean isNumberPrime(int n) {
        for (int i = 2; i*i<n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    private static int recursiveFactorialOfNumber(int n) {
        if(n==0){
            return 1;
        }
        return n* recursiveFactorialOfNumber(n-1);
    }

    private static int factorialOfNumber(int i) {
        //5!=5*4*3*2*1;
        int fact=1;
        for (int j = 1; j <= i; j++) {
            fact= fact*j;

        }
        return fact;

    }

    private static int findMaxNumber(int i, int i1) {
//        Math.max(i,i1);
       return (i>i1) ? i: i1;
    }

    private static int sumOfTwoNumbers(int n, int i) {
        return n+i;
    }

    private static void evenOdd(int n) {
        if(n %2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
