package math;

import java.util.Arrays;

public class BlubSwitcher {
    static void main() {

        int count = blubSwitcher(5);
        System.out.println(count);
        bulbSwitcherOptimised(5);
    }

    private static int bulbSwitcherOptimised(int n) {
        double ans = Math.sqrt(n);
        int count=0;
        for (int i = 1; i*i < n; i++) {
            count++;
        }

        return count;
    }

    private static int blubSwitcher(int n) {
        boolean[] blubs=new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n ; j+=i) {
                blubs[j]=!blubs[j];
            }
        }

        int count=0;
        for (int i = 1; i < blubs.length; i++) {
            if(blubs[i]) count++;
        }
        return count;
    }
}
