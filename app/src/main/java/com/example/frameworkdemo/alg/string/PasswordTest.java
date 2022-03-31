package com.example.frameworkdemo.alg.string;


import java.util.*;

//密码，大小字母，小写支付，数字，符号，最少3种组合
public class PasswordTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(checkPassword(str));
        }
    }

    public static String checkPassword(String word) {
        if (word == null || word.length() < 9 || word.length() > 100) {
            return "NG";
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < word.length(); i++) {
            char now = word.charAt(i);
            if (Character.isUpperCase(now)) {
                count1 = 1;
            } else if (Character.isLowerCase(now)) {
                count2 = 1;
            } else if (Character.isDigit(now)) {
                count3 = 1;
            } else {
                count4 = 1;
            }
        }
        if ((count1 + count2 + count3 + count4) < 3) {
            return "NG";
        }
        if (checkSub(word)) {
            return "OK";
        } else {
            return "NG";
        }
    }

    /**
     * 3个或以上相同的子字符串，重复
     */
    public static boolean checkSub(String word) {
        for (int i = 0; i < word.length() - 3; i++) {
            if (word.substring(i + 3).contains(word.substring(i, i + 3))) {
                return false;
            }
        }
        return true;
    }
}
