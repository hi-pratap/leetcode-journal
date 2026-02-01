package numbers;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegers {
    static void main() {
        int i = romanToInt("MCMXCIV");
        System.out.println(i);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
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

        return sum;
    }
}
