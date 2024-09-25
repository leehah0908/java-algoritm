package twoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1253 {
    public static void main(String[] args) {
        /*
        10
        1 2 3 4 5 6 7 8 9 10
        */
        // 8
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        int start, end, sum, cnt = 0;

        for (int i = 0; i < num; i++) {
            int target = arr[i];
            start = 0;
            end = num - 1;
            while (start < end) {
                if (start == i) {
                    start++;
                    continue;
                }

                if (end == i) {
                    end--;
                    continue;
                }

                sum = arr[start] + arr[end];
                if (target > sum) {
                    start++;
                } else if (target < sum) {
                    end--;
                } else {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
