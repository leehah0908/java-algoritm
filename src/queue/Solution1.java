package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        // 8 3
        // 7
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int target = input.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int cnt = 0;
        while (queue.size() > 1) {
            cnt++;
            if (cnt == target) {
                queue.poll();
                cnt = 0;
                continue;
            }
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
