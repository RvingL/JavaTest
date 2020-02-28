package com.example;

import character.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionSearch {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();

        for (int i = 0; i < 3000000; i++) {
            list.add(new Hero("hero-" + Math.random() * 10000));
        }
        hashMapSearch(list);
        arrayListSearch(list);
    }

    public static void arrayListSearch(List<Hero> h1) {
        long start = System.currentTimeMillis();
        for (Hero h : h1) {
            if ("hero-5555".equals(h.name)) {
                System.out.println(h);
            }
        }
        long end = System.currentTimeMillis();
        System.out.print("ArrayList查找耗时");
        System.out.println(end - start);
    }

    public static void hashMapSearch(List<Hero> h2) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < h2.size(); i++) {
            hashMap.put("i", h2.get(i).name);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < h2.size(); i++) {
            if ("hero-5555".equals(hashMap.get("i"))) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.print("HashMap查找耗时");
        System.out.println(end - start);
    }
}
