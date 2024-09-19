package string;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        // a#b!GE*T@S
        // S#T!EG*b@a

        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] charArr = str.toCharArray();
        int left = 0;
        int right = charArr.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(charArr[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArr[right])) {
                right--;
            } else {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(String.valueOf(charArr));
    }
}
