package twoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        /*
        5
        1 3 9 5 2
        5
        3 2 5 7 8
        */
        // 235

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = input.nextInt();
        }
        Arrays.sort(arr1);

        int num2 = input.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = input.nextInt();
        }
        Arrays.sort(arr2);

        StringBuilder sb = new StringBuilder();
        int p1 = 0, p2 = 0;

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
                sb.append(arr1[p1]);
                sb.append(" ");
                p1++; p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else if (arr1[p1] > arr2[p2]) {
                p2++;
            }
        }
        System.out.println(sb);
    }
}