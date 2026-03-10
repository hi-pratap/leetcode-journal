package math;

public class SumOfNaturalNumber {
    static void main() {
        int n=9;
        int sum=(n*(n-1))/2;
        System.out.println(sum);
        int bruteSum=0;
        for (int i = 0; i < n; i++) {
            bruteSum+=i;
        }
        System.out.println(bruteSum);
    }
}
