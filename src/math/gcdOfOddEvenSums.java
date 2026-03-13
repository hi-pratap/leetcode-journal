package math;

public class gcdOfOddEvenSums {
    static void main() {
        int i = gcdOfOddEvenSums(4);
        System.out.println(i);
    }

    /**
     * One approach is this or second is
     * @param n
     * @return
     */
    public static int gcdOfOddEvenSums(int n) {

        int oddSum=n*n;

        int evenSum=(n*n)+n;

        return GCD(oddSum, evenSum); //gcd(16,20)

    }
  public static int gcdOfOddEvenSumsOptimsied(int n) {
// because the oddSum=n*n;
      //and EvenSum=n*(n+1)
      //and Greatest number  that can divide both is n itself
      return n;

    }

    public static int GCD(int n1, int n2) { //gcd(16,4)

        //GCD -Greatest Common Divsior
        //Step 1. what is base condition
        // if any of two number becomes zero return the non return that is GCD
        if (Math.min(n1, n2) == 0)
            return Math.max(n1, n2); //4

        //Eulids logic is: take reminder of the Large number and replace it with large number and repeat this until u find the ans
        if (n1 > n2)
            return GCD(n1 % n2, n2); // gcd(16%4,4)= 0,4
        else
            return GCD(n1, n2 % n1);// gcd(16,20%16)=
    }
}
