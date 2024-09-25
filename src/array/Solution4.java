package array;

import java.util.Scanner;

public class Solution4 {

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // 9     32 55 62 20 250 370 200 30 100
        // 23 2 73 2 3

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] arr = new int[num];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num; i++) {
            result.setLength(0);
            result.append(input.nextInt());
            result.reverse();
            arr[i] = Integer.parseInt(String.valueOf(result));
        }

        for (int i : arr) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}