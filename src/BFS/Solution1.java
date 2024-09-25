package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1 {
    static int[] dis = {1, -1, 5};
    static boolean[] check;
    static Queue<Integer> queue = new LinkedList<>();

    private static void BFS(int S, int E) {
        check = new boolean[10001];
        check[S] = true;
        queue.add(S);
        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int cur = queue.poll();
                for (int di : dis) {
                    int next = cur + di;
                    if (next == E) {
                        System.out.println(level + 1);
                        return;
                    }

                    if (next >= 1 && next <= 10000 && !check[next]) {
                        check[next] = true;
                        queue.add(next);
                    }
                }
            }
            level++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int S = input.nextInt();
        int E = input.nextInt();

        BFS(S, E);
    }
}
