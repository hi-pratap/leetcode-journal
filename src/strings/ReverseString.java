package strings;

import java.util.Arrays;

public class ReverseString {
    static void main() {
        String hello="HelloPratap";
        StringBuilder stringBuilder = reverseString(hello);
        System.out.println(stringBuilder);
        reverseArraysString();
        reverseOnlyLetters("a-bC-dEf-ghIj");
        reverseOnlyLetters("Test1ng-Leet=code-Q!");
        reverseOnlyLetters("7_28]");
    }

    private static String reverseOnlyLetters(String s) {
        char[] charArray = s.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while(start<end){
            while(!Character.isLetterOrDigit(charArray[start])) start++;
            while(!Character.isLetterOrDigit(charArray[end])) end--;

            char temp=charArray[end];
            charArray[end]=charArray[start];
            charArray[start]=temp;

            start++;
            end--;
        }
 return String.valueOf(charArray);

    }

    static void reverseArraysString(){
        char [] s={'h','e','l','l','o'};
        //Take Two pointerss
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[end];
            s[end]=s[start];
            s[start]=temp;
            start++;
            end--;
        }
    }
    private static StringBuilder reverseString(String hello) {
        int i = hello.length() - 1;
        StringBuilder stringBuilder=new StringBuilder();
        while(i >=0){
            char c = hello.charAt(i);
            stringBuilder.append(c);
            i--;
        }
        return stringBuilder;
    }

}