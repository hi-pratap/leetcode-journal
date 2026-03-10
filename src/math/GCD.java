package math;

public class GCD {
    static void main() {
        int result=findGCD(36,60);
        System.out.println(result);
        System.out.println(findGCDByEuclideanOptimised(1226,60));
        System.out.println(EuclidGcd(1226,60));
    }

    private static int EuclidGcd(int a, int b) {

        while(a!=0 && b!=0){
            if(a>b) a=a%b;
            else b=b%a;
        }
      return (a != 0) ? a : b;
    }

    private static int findGCD(int n, int m) {
        //step 1: find the  minimum of two
        int min= Math.min(n, m);
        while(min>0){
            if(n%min ==0 && m%min==0) break;

            min--;
        }
        return min;
    }

    /**
     * The idea of this algorithm is, the GCD of two numbers doesn't change if
     * the smaller number is subtracted from the bigger number.
     * This is the Euclidean algorithm by subtraction.
     * It is a process of repeat subtraction,
     * carrying the result forward each time until the result is
     * equal to any one number being subtracted.
     * @param n
     * @param m
     * @return
     */
    private static int findGCDByEuclidean(int n, int m) {
         if(n==m) return n;
        if(n>m) return findGCDByEuclidean(n-m,m);
        else return findGCDByEuclidean(n,m-n);
    }

    private static int findGCDByEuclideanOptimised(int n, int m) {
         if(n==0 || m==0) return Math.max(n,m);
        if(n>m) return findGCDByEuclidean(n%m,m);
        else return findGCDByEuclidean(n,m%n);
    }
}
