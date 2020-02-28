package com.example;

import character.Hero;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Hero> hero=new LinkedList<>();

        hero.addFirst(new Hero("hero1"));
        hero.addLast(new Hero("hero2"));
        hero.addLast(new Hero("hero3"));
        System.out.println(hero);
        System.out.println(hero.getFirst());
        System.out.println(hero.getLast());
        System.out.println(hero.removeFirst());
        hero.removeLast();
        System.out.println(hero);

    }
}
