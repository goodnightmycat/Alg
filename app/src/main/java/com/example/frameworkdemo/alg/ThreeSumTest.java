package com.example.frameworkdemo.alg;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

public class ThreeSumTest {
    public static int[] nums = {-10, 0, 1, 2, 4, 6, 8, 9, 9};

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        //排序
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        LinkedHashSet<String> result = find(list);
        if (result.size() == 0) {
            System.out.print("[]");
        } else {
            int position = 0;
            for (String str : result) {
                if (position == 0) {
                    System.out.print("[");
                }
                System.out.print(str);
                if (position == result.size() - 1) {
                    System.out.print("]");
                } else {
                    System.out.print(",");
                }
                position++;
            }
        }

    }

    public static LinkedHashSet<String> find(List<Integer> list) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++) {
            int left = i + 1;
            int right = list.size() - 1;
            int nowTemp = list.get(i);

            if (nowTemp > 0) {
                break;
            }
            while (left < right) {
                int leftTemp = list.get(left);
                int rightTemp = list.get(right);
                int tempSum = nowTemp + leftTemp + rightTemp;
                if (tempSum == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    sb.append(nowTemp);
                    sb.append(",");
                    sb.append(leftTemp);
                    sb.append(",");
                    sb.append(rightTemp);
                    sb.append("]");
                    hashSet.add(sb.toString());
                    if (right - 1 > left && list.get(right - 1) == rightTemp) {
                        right--;
                    } else if (left + 1 < right && list.get(left + 1) == leftTemp) {
                        left++;
                    } else {
                        left++;
                        right--;
                    }
                } else if (tempSum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return hashSet;
    }


}
