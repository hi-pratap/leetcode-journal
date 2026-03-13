package math;

public class SquareRootOfN {
    static void main() {

      int n=  findSquareRoot(8);
    }

    private static int findSquareRoot(int n) {

        int mid=n/2;
        if(mid*mid==n) return mid;
        int leftMid= mid / 2;
        if(leftMid*leftMid==n) return leftMid;

        return leftMid;
    }
}
