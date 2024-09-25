package DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution3 {
    static int N, M, answer = 0;
    static List<List<Integer>> graph;
    static boolean[] check;

    private static void DFS(int V) {
        if (V == N) {
            answer++;
        } else {
            for (int i : graph.get(V)) {
                if (!check[i]) {
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

        check = new boolean[N + 1];

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            graph.get(a).add(b);
        }

        check[1] = true;
        DFS(1);
        System.out.println(answer);
    }
}