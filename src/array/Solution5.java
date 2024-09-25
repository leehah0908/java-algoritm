package array;

import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        // 5
        // 10 13 10 12 15
        // 12 39 30 23 11
        // 11 25 50 53 15
        // 19 27 29 37 27
        // 19 13 30 13 19

        // 155

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int maxSum = 0;
        int tempSum;

        // 행 합
        for (int i = 0; i < arr.length; i++) {
            tempSum = Arrays.stream(arr[i]).sum();
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }

        // 열 합
        for (int i = 0; i < arr.length; i++) {
            tempSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                tempSum += arr[j][i];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }

        // 대각선 합 1
        tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i][i];
        }
        if (tempSum > maxSum) {
            maxSum = tempSum;
        }

        // 대각선 합 2
        tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i][num - 1 - i];
        }
        if (tempSum > maxSum) {
            maxSum = tempSum;
        }

        System.out.println(maxSum);
    }
}