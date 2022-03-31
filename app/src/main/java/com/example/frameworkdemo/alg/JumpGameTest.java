package com.example.frameworkdemo.alg;


/**
 * 跳跃游戏
 * 数组中的每个元素代表能跳的最大长度
 * 输出能否到达最后一个下标
 */
public class JumpGameTest {
    public static int[] input = {3, 1, 1, 0, 5, 4};

    public static void main(String[] args) {
        System.out.print(jump(input));
    }

    public static boolean jump(int[] input) {
        int k = 0;
        for (int i = 0; i < input.length; i++) {
            //当前距离比最远还大
            if (i > k) {
                return false;
            }
            //目前最多能跳多远
            k = Math.max(k, i + input[i]);
        }
        return true;
    }


}
