package strings;

public class CountVowels {
    static void main() {
        int n=countVowels("aeiou");
        System.out.println(n);
    }

    private static int countVowels(String string) {
        char[] charArray = string.toCharArray();
        int count=0;
        for (int i = 0; i <string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
