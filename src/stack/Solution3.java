package stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (char c : str.toCharArray()) {
            if (c == '(') {
                if (stack.isEmpty()) {
                    cnt = 0;
                }
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    for (int i = 0; i < cnt; i++) {
                        stack2.pop();
                    }
                }
            } else {
                cnt++;
                stack2.push(c);
            }
        }
        for (char c : stack2) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
