package math;

public class ArmStrongNumber {
    static void main() {
        //153=1^3+5^3+3^3=153

        int number=153;
        int orignal=number;
        int c=String.valueOf(number).length();
        int sum=0;
        while(number>0){
            int lastDigit=number%10;
        sum=sum+ calculatePower(lastDigit, c);
            number/=10;
        }
        if(orignal==sum) System.out.println("Armstrong");
        else System.out.println("NOOOOOOArmstrong");
    }

    private static int calculatePower(int n,int c) {//3,3
       int power=1;
        while(c>0){//3
            power*=n;//
            c--;
        }
        return power;
    }
}
