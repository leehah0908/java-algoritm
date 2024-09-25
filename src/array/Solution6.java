package array;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        // AABCDD
        // afzz
        // 09121
        // a8EWg6
        // P5h3kx

        // Aa0aPAf985Bz1EhCz2W3D1gkD6x

        Scanner input = new Scanner(System.in);

        char[][] arr = new char[5][];
        String tempStr;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            tempStr = input.nextLine();
            arr[i] = tempStr.toCharArray();
        }

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sb.append(arr[j][i]);
                } catch (Exception e) {
                }
            }
        }
        System.out.println(sb);
    }
}

