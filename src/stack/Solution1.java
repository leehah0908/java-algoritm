package stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
