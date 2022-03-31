package com.example.frameworkdemo.alg;

/**
 * 连续子数组的最大和
 * 要求：时间O(n)，空间O(n)
 * 进阶：时间O(n)，空间O(1)
 */
public class ArrayTest {
    public static int[] array2 = {1, 2, 3, -10};
    public static int[] array = {1, -2, 3, 10, -4, 7, 2, -5};//18,{3, 10, -4, 7, 2}

    public static void main(String[] args) {
        System.out.print(3>>1);
    }

    public static int findMaxCount(int[] array) {
        //dp[i]表示以元素array[i]为结尾的连续子数组最大和
        //dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
        int[] dp = new int[array.length];
        int maxValue = array[0];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
            maxValue = Math.max(maxValue, dp[i]);
        }
        return maxValue;
    }


}


