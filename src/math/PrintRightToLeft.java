package math;

public class PrintRightToLeft {
    static void main() {

        int n=123;
        int orignal=n;
        int digits=0;
        //Count the Digits here
        while(n>0){
            digits++;
            n/=10;
        }

        //find the divisior hee
        int divisor= (int) Math.pow(10, digits-1);

        while(divisor>0){
            int quotient = orignal / divisor;
            System.out.println(quotient);
            orignal%=divisor;
//            123%100=23
            divisor/=10;
        }

    }
}
