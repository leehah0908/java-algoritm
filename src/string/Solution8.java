package string;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        // 4 #****###**#####**#####**##**
        // COOL

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = input.next();

        for (int i = 0; i < num; i++) {
            int idx = 7 * i;
            String newStr = str.substring(idx, idx + 7).replace("#", "1").replace("*", "0");
            int decimalNumber = Integer.parseInt(newStr,2);

            System.out.print((char) decimalNumber);
        }
    }
}