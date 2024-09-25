package recursive;

import java.util.Arrays;

public class Fibonacci {
    // n값이 100만 되도 int 범위를 벗어남
    static long[] fibo;

    public static long fibonacci(int n) {
        if (fibo[n] > 0) return fibo[n];

        if (n < 3) return fibo[n] = 1;
        else return fibo[n] = fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void conversionToBinary(int n) {
        if (n == 0) return;
        conversionToBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int n = 100;
        fibo = new long[n + 1];

        System.out.println(fibonacci(100));
//        System.out.println(Arrays.toString(fibo));
        System.out.println("===============================");

        conversionToBinary(1000);
    }
}
