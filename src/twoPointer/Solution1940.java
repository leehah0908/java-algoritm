package twoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1940 {
    public static void main(String[] args) {
        /*
        6
        9
        2 7 4 1 5 3
        */
        // 2
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int target = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        int start = 0, end = num - 1, sum, cnt = 0;

        while (start < end) {
            sum = arr[start] + arr[end];
            if (target > sum) {
                start++;
            } else if (target < sum) {
                end--;
            } else {
                cnt++; start++; end--;
            }
        }
        System.out.println(cnt);
    }
}
