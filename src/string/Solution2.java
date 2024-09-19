package string;

import java.util.Scanner;

public class Solution2 {
    public static void solution(String[] strArray) {
        for (String str : strArray) {
            String result = new StringBuilder(str).reverse().toString();
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        // 3 good Time Big
        // doog emiT giB

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String[] strArray = new String[num];
        for (int i = 0; i < num; i++) {
            strArray[i] = input.next();
        }

        solution(strArray);
    }
}
