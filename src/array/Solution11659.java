package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution11659 {
    public static void main(String[] args) throws IOException {
        /*
        5 3 -> 숫자 갯수, 몇개 구할거?
        5 4 3 2 1 -> 배열
        1 3
        2 4
        5 5
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        int[] S = new int[N + 1];

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < N + 1; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            sb.append((S[y] - S[x - 1]) + "\n");
        }
        System.out.println(sb);
    }
}
