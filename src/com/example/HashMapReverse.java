package com.example;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class HashMapReverse {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("ADC", "物理英雄");
        hashMap.put("APC", "魔法英雄");
        hashMap.put("TANK", "坦克英雄");
        System.out.println(hashMap);

        HashMap<String, String> hashMap1 = new HashMap<>();
        Set<String> set = hashMap.keySet();
        for (String str : set) {
            hashMap1.put(hashMap.get(str), str);
        }
        System.out.println(hashMap1);
    }
}
