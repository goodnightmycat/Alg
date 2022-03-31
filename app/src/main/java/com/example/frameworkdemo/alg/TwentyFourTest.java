package com.example.frameworkdemo.alg;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.*;

/**
 * 24点
 */
public class TwentyFourTest {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Map<Character, Integer> treeMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (treeMap.containsKey(now)) {
                treeMap.put(now, 1 + treeMap.get(now));
            } else {
                treeMap.put(now, 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            list.add(entry);
        }
        list.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                int i1 = o1.getValue();
                int i2 = o2.getValue();
                if (i1 == i2) {
                    char c1 = o1.getKey();
                    char c2 = o2.getKey();
                    return c1 - c2;
                } else {
                    return i2 - i1;
                }
            }
        });
        for (Map.Entry<Character, Integer> entry : list) {
            System.out.print(entry.getKey());
        }

    }
}
