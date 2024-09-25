package twoPointer;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        /*
        10 3
        12 15 11 20 25 10 20 19 13 15
        */
        // 56

        Scanner input = new Scanner(System.in);

        int days = input.nextInt();
        int range = input.nextInt();
        int[] arr = new int[days];
        for (int i = 0; i < days; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < range; i++) {
            sum += arr[i];
        }
        int max = sum;

        for (int i = 0; i < days - range; i++) {
            sum = sum - arr[i] + arr[i + range];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}