package BFS;

import java.util.*;

public class Solution3 {
    static int N;
    static int M;
    static int answer = 0;
    static List<List<Integer>> graph;
    static boolean[] check;
    static int[] dis;

    private static void BFS(int V) {
        check[V] = true;
        dis[V] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i : graph.get(cur)) {
                if (!check[i]) {
                    check[i] = true;
                    queue.add(i);
                    dis[i] = dis[cur] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        graph = new ArrayList<>();
        check = new boolean[N + 1];
        dis = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            graph.get(a).add(b);
        }

        BFS(1);
        for (int i = 2; i < dis.length; i++) {
            System.out.println(i + ":" + dis[i]);
        }
    }
}

