package string;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        // ksekkset
        // kset

        Scanner input = new Scanner(System.in);
        String str = input.next();

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (!answer.contains(String.valueOf(str.charAt(i)))) {
//            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
