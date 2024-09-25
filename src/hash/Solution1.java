package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        /*
        15
        BACBACCACCBDEDE
        */
        // C
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char result = '\0';
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                result = c;
            }
        }
        System.out.println(result);
    }
}
