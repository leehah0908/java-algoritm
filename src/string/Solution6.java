package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        // teachermode e
        // 10121012210

        /*Scanner input = new Scanner(System.in);
        String str = input.next();
        char c = input.next().charAt(0);*/

        // BufferedReader를 사용해서 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String s = st.nextToken();
        char c = st.nextToken().charAt(0);

        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int target = 0; target < arr.length; target++) {
            int min = arr.length;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == c) {
                    int temp = Math.abs(target - j);
                    min = Math.min(min, temp);
                }
            }
            sb.append(min);
            sb.append(' ');
        }
        System.out.print(sb);
    }
}
