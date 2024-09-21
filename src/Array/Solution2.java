package Array;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        // 8     130 135 148 140 145 150 150 153
        // 5

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}