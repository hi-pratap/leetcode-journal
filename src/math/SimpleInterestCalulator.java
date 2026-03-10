package math;

public class SimpleInterestCalulator {

    static void main() {
        int principalAmount=600;
        int rateOfInterest=11;
        int timeInYear=5;

        int si=(principalAmount*rateOfInterest*timeInYear)*100;
        System.out.println(si);
    }
}
