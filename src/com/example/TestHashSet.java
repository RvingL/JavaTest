package com.example;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("garen");
        System.out.println(set);

        HashSet<Integer> set1=new HashSet<>();
        set1.add(9);
        set1.add(0);
        set1.add(1);
        System.out.println(set1);

        HashSet<Integer> set2=new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set2.add(i);
        }

        for(Iterator<Integer> iterator=set2.iterator();iterator.hasNext();){
            Integer i=iterator.next();
            System.out.println(i);
        }

        for(Integer i:set2) {
            System.out.println(i);
        }
    }
}
