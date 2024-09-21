package Array;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        // 5
        // 2 3 3 1 3
        // 1 1 2 2 3

        // A
        // B
        // A
        // B
        // D
        // 가위:1 바위:2 보:3

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[][] arr = new int[2][num];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int temp;
        for (int j = 0; j < num; j++) {
            temp = arr[0][j] - arr[1][j];
            if (temp == 0) {
                System.out.println("D");
            } else if (temp == 1) {
                System.out.println("A");
            } else if (temp == 2 || temp < 0) {
                System.out.println("B");
            }
        }
    }
}