package math;

public class LCM {
    static void main() {
        int n= lcmBruteForce(2,5);
        int nop= lcmOptimised(12,18);
        System.out.println(nop);
    }

    //idea here is
    //LCM(a,b)=a*b/GCD(a,b)
    private static int lcmOptimised(int a, int b) {

        int product=a*b;
        return product/gcd(a,b);

    }

    private static int gcd(int a, int b) {
        if(Math.min(a,b)==0) return Math.max(a,b);
       if(a>b)return gcd(a%b,b);
       else return gcd(a,b%a);
    }

    private static int lcmBruteForce(int a, int b) {

        int max=Math.max(a,b);
        boolean found=true;
        while(true){
            if(max%a==0 && max%b==0){
                 break;
            }
            max++;
        }
        return max;
    }
}
