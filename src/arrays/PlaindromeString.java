package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PlaindromeString{
    static void main() {
        Scanner scanner=new Scanner(System.in);

        String s = "A man, a plan, a canal: Panama";
        String cleanS=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // check if start is equal to end or not
        int start=0;
        int end=cleanS.length()-1;
        boolean flag=true;
        while(start<=end){

            if(cleanS.charAt(start)!=cleanS.charAt(end)) flag=false;
            start++;
            end--;
        }
System.out.println(flag);

while(true){

}
    }
}
