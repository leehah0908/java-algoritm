package DFS;

import java.util.Scanner;

public class Solution1 {
    static int N;
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;

    static void DFS(int i) {
        if (i == N + 1) {
            sb.setLength(0);
            for (int j = 0; j <= N; j++) {
                if (check[j]) sb.append(j).append(" ");
            }
            if (!sb.isEmpty()) System.out.println(sb);
        } else {
            check[i] = true;
            DFS(i + 1);
            check[i] = false;
            DFS(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        check = new boolean[N + 1];
        DFS(1);
    }
}
