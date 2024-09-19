package string;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        // found7, time: study; Yduts; emit, 7Dnuof
        // YES

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] charArr = str.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        boolean flag = true;

        while (left < right) {
            if (!Character.isAlphabetic(charArr[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArr[right])) {
                right--;
            } else if (Character.toLowerCase(charArr[left]) != Character.toLowerCase(charArr[right])) {
                flag = false;
                break;
            } else {
                left++;
                right--;
            }
        }

        if (flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
