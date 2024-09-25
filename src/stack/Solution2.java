package stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        Stack<Integer> stack = new Stack<>();

        int num1, num2;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                num1 = stack.pop();
                num2 = stack.pop();

                if (c == '+') {
                    stack.push(num2 + num1);
                } else if (c == '-') {
                    stack.push(num2 - num1);
                } else if (c == '*') {
                    stack.push(num2 * num1);
                } else if (c == '/') {
                    stack.push(num2 / num1);
                }
            }
        }
        System.out.println(stack.pop());
    }
}