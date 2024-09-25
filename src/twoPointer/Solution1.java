package twoPointer;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        /*
        3
        1 3 5
        5
        2 3 6 7 9
        */
        // 1 2 3 3 5 6 7 9

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = input.nextInt();
        }

        int num2 = input.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = input.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        int p1 = 0, p2 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] >= arr2[p2]) {
                sb.append(arr2[p2++]);
                sb.append(" ");
            } else if (arr1[p1] < arr2[p2]) {
                sb.append(arr1[p1++]);
                sb.append(" ");
            }
        }

        while (p1 < arr1.length) {
            sb.append(arr1[p1++]);
            sb.append(" ");
        }
        while (p2 < arr2.length) {
            sb.append(arr2[p2++]);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
