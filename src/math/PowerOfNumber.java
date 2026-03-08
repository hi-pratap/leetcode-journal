package math;

public class PowerOfNumber {
    static void main() {
        powerOfNumber(21);
        powerOfNumber(10);
        powerOfNumber(2);
        powerOfNumber(3);
    }

    private static void powerOfNumber(int number) {
        int reversed = reverseNumber(number);
        //calculate the power
        //to calculate the power you need to multiply the number that many time
//        int power=1;
//       while(reversed>0){
//           power=power*number;
//           reversed--;
//       }

        int power = power(number, reversed);
        System.out.println(power);

    }

    private static int power(int number, int reversed) {
        if(reversed==0) return 1;
        return number*power(number,reversed-1);
    }

    public static int reverseNumber(int n) {
        int reverse=0;
        while(n>0){
            int lastDigit=n%10; // get the last digit
            reverse=reverse*10+lastDigit; //create reverse number
            n/=10; // remove the last digit
        }
        return reverse;
    }
}
