package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1929 {
    public static int[] isPrime(int N) {
        int[] arr = new int[N + 1];

        // 배열에 숫자 채우기
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= N; i++) {
            // 배수를 증가시키는데, 이미 0으로 지워졌다면 건너 뛰기
            if (arr[i] == 0) {
                continue;
            }
            // 자기 자신을 제외한 나머지 배수의 값을 전부 0으로 만들기
            // j는 i만큼 계속 증가
            for (int j = i + i; j <= N; j += i) {
                arr[j] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 가져와서 공백으로 토큰화하기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] prime = isPrime(N);
        for (int i = M; i <= N; i++) {
            // 소수가 아닌 애들은 isPrime에서 0으로 지워졌으니까 0이 아닌 애들만 출력하기
            if (prime[i] != 0) {
                System.out.println(prime[i]);
            }
        }
    }
}

