package com.example;

import character.Hero;

import java.util.ArrayList;

public class TestCollection {

    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero" + i));
        }
        Hero garen = new Hero("Garen");
        heros.add(garen);
        System.out.println(heros.size());

        heros.add(new Hero("temo"));
        heros.add(7, new Hero("hero7"));
        System.out.println(heros.size());
        System.out.println(heros);
        System.out.println(heros.contains(garen));
        System.out.println(heros.get(3));
        System.out.println(heros.indexOf(garen));
        heros.remove(garen);
        heros.remove(0);
        System.out.println(heros);
        heros.set(0, garen);
        System.out.println(heros);

        Hero[] h = (Hero[]) heros.toArray(new Hero[]{});
        for (Hero h1 : h) {
            System.out.println(h1);
        }

        heros.clear();
        System.out.println(heros);
    }
}
