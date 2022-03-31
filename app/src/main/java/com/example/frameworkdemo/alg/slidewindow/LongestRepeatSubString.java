package com.example.frameworkdemo.alg.slidewindow;

import java.util.HashMap;

/**
 * 无重复字符的最长子串
 */
public class LongestRepeatSubString {

    public static void main(String[] args) {

    }

    public static int findMaxLength(String str) {
        int max = 0;
        if (str != null) {
            HashMap<Character, Integer> map = new HashMap<>();
            int left = 0;
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                if (map.containsKey(temp)) {
                    //左下标更新
                    //例如运行到 i=3时，left更新为第一个a的下一个坐标
                    left = Math.max(left, map.get(temp) + 1);
                }
                //每次更新char的位置
                map.put(temp, i);
                max = Math.max(max, i - left + 1);
            }

        }
        return max;
    }

}
