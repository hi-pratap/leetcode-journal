package numbers;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegers {
    static void main() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int i = romanToInt("MCMXCIV",map);
        usingWhileLoop("MCMXCIV",map);
        System.out.println(i);
    }
    public static int romanToInt(String s, Map<Character, Integer> map) {

        //s=III
        int sum = 0;
        int prevValue = 0;

        // Loop from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = map.get(s.charAt(i));

            // If current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            prevValue = currentValue;
        }
        usingWhileLoop(s, map);

        return sum;
    }

    private static void usingWhileLoop(String s, Map<Character, Integer> map) {
        int length = s.length()-1;
        int i=0;
        int sum=0;
        int prevValue=0;
        //IX=9
        //1>0:sum-0:sum+1=
        while(i<=length){
            int currentValue=map.get(s.charAt(i));
            //if current Value is greater than previous vlaue than substract
           sum= currentValue<prevValue?sum-currentValue:sum+currentValue;
           prevValue=currentValue;
            i++;
        }
    }
}
