package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        /*
        AbaAeCe
        baeeACA
        */
        // YES

        /*
        abaCC
        Caaab
        */
        // NO
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str2 = br.readLine();

        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : str.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        int num1, num2;
        boolean flag = true;
        for (char c : map1.keySet()) {
            if (!map2.containsKey(c)) {
                flag = false;
                break;
            }

            num1 = map1.get(c);
            num2 = map2.get(c);
            if (num1 != num2) {
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}