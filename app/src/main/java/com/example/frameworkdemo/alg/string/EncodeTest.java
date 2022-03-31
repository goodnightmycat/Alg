package com.example.frameworkdemo.alg.string;

import java.util.*;

//加密解密
public class EncodeTest {
    public static char[] chars = {'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(getCode(str));
        }
    }

    public static String getCode(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if (Character.isUpperCase(temp)) {
                sb.append(getSmallByBig(temp));
            } else if (Character.isLowerCase(temp)) {
                sb.append(getNumberBySmall(temp));
            } else if (Character.isDigit(temp)) {
                sb.append(temp);
            }
        }
        return sb.toString();
    }

    public static int getNumberBySmall(char a) {
        if (a <= 'c') {
            return 2;
        } else if (a <= 'f') {
            return 3;
        } else if (a <= 'i') {
            return 4;
        } else if (a <= 'l') {
            return 5;
        } else if (a <= 'o') {
            return 6;
        } else if (a <= 's') {
            return 7;
        } else if (a <= 'v') {
            return 8;
        } else {
            return 9;
        }
    }

    public static char getSmallByBig(char a) {
        if (a == 'Z') {
            return 'a';
        } else {
            return chars[a - 'A'];
        }
    }
}
