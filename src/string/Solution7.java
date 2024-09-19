package string;

import java.util.Arrays;
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        // KKHSSSSSSSE
        // K2HS7E

        Scanner input = new Scanner(System.in);
        String str = input.next();
        // str.length() - 1 때문에 추가해줘야 함.
        str = str + " ";

        StringBuilder result = new StringBuilder();
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                result.append(str.charAt(i));
                if (cnt > 1) {
                    result.append(cnt);
                }
                cnt = 1;
            }
        }
        System.out.println(result);
    }
}