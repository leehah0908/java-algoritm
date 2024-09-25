package DFS;

import java.util.Scanner;

public class Solution2 {
    static int N, M, answer = 0;
    static boolean[][] graph;
    static boolean[] check;

    private static void DFS(int V) {
        if (V == N) {
            answer++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[V][i] && !check[i]) {
                    check[i] = true;
                    DFS(i);
                    check[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();
        graph = new boolean[N + 1][N + 1];
        check = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            graph[a][b] = true;
        }

        check[1] = true;
        DFS(1);
        System.out.println(answer);
    }
}