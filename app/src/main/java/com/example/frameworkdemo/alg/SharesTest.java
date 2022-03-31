package com.example.frameworkdemo.alg;

/**
 * 股票的最大收益
 */
public class SharesTest {
    public static int[] input = {8, 9, 2, 5, 4, 7, 1};//最大收益是，7-2=5

    public static void main(String[] args) {
        System.out.print(findMaxProfit(input));
        System.out.print("\n");
    }

    public static int findMaxProfit(int[] input) {
        if (input.length <= 0) {
            return 0;
        }
        int max = 0;
        int small = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < small) {
                small = input[i];
            }
            int benefit = input[i] - small;
            if (benefit > max) {
                max = benefit;
            }
        }
        return max > 0 ? max : 0;
    }
}
