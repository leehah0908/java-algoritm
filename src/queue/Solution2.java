package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        // CBA
        // CBDAGE
        Scanner input = new Scanner(System.in);

        String target = input.nextLine();
        String full = input.nextLine();

        Queue<Character> queue = new LinkedList<>();

        for (char c : target.toCharArray()) {
            queue.add(c);
        }

        for (char c : full.toCharArray()) {
            if (queue.contains(c)) {
                char temp = queue.poll();
                if (temp != c) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (!queue.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
