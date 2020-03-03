package com.example;

import character.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortCollection {
    public static void main(String[] args) {
        Random random=new Random();
        List<Hero> list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(new Hero("hero "+ i, random.nextInt(100), random.nextInt(100)));
        }
        Collections.sort(list);
        System.out.println(list);
    }

}
