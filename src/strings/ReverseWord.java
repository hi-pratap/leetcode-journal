package strings;

import com.sun.tools.javac.Main;

public class ReverseWord {

    static void main() {
        String hello="Hello Pratap Bhaiya";
        StringBuilder stringBuilder = reverseWord(hello);
        System.out.println(stringBuilder);
    }

    private static StringBuilder reverseWord(String hello) {
        // Two Loops Required for sure
        String[] s = hello.split(" "); // size 3
        int length = s.length-1;
        StringBuilder stringBuilder=new StringBuilder();
        while(length>=0){
            stringBuilder.append(s[length] +" ");
            length--;
        }
        return stringBuilder;
    }
}
