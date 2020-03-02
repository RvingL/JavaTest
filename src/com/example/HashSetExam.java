package com.example;

import java.util.HashSet;

public class HashSetExam {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();
        String[] str=new String[100];
        for (int i = 0; i < 100; i++) {
            str[i]=getString(2);
            if (!set.add(str[i])) {
                set1.add(str[i]);
            }
        }
        System.out.println("重复的字符串有" + set1.size() + "种");
        System.out.println("分别是" + set1);
    }

    public static String getString(int length) {
        String str = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = (int) (Math.random() * 62);
            stringBuffer.append(str.charAt(number));
        }
        return stringBuffer.toString();
    }
}
