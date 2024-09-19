package string;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        // Computercooler c
        // 2

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        char c = input.next().charAt(0);

        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        int cnt = 0;
        for (char x : str.toCharArray()) {
            if (x == c) cnt++;
        }
        System.out.println(cnt);

    }
}
