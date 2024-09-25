package hash;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        /*
        10 3
        13 15 34 23 45 65 33 11 26 42
        */
        // 143
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int th = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        Set<Integer> tSet = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    tSet.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int cnt = 0, result = 0;
        boolean flag = false;
        for (int i : tSet) {
            cnt++;
            if (cnt == th) {
                result = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}