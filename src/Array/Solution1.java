package Array;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        // 6     7 3 9 5 6 12
        // 7 9 6 12

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(" " + arr[i]);
            }
        }
    }
}