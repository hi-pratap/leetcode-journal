package strings;

public class PlaindromeSubString {
    static void main() {
        String s="aaa";
        palindroneSubString(s);
        palindroneSubStringOP(s);
    }

    private static void palindroneSubStringOP(String s) {
        //abc
        //abcd
        int count=0;
        for (int i = 0; i < s.length(); i++) {
           count= expandMe(s,i,i,count);
            count=expandMe(s,i,i+1,count);

        }
        System.out.println(count);
    }

    private static int expandMe(String s, int i, int i1, int count) {

        while(i>=0 && i1<s.length()
                && s.charAt(i)==s.charAt(i1)){
            count++;
            i--;
            i1++;
        }
        return count;
    }

    private static int palindroneSubString(String s) {
        //findSubStrings
        //CheckIfIts Palindrome
        int count=0;
        for (int i = 0; i <= s.length()-1; i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                System.out.println(substring);
                if (checkPalindrome(substring)){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean checkPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if (s.charAt(start)!=(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
