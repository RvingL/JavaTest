package com.example;

import character.ADHero;
import character.Hero;
import property.Item;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
        Hero hero = new Hero("garen");
        Item item = new Item("黑切");

        List heros = new ArrayList();
        heros.add(hero);
        heros.add(item);
        System.out.println(heros);
        Hero h1 = (Hero) heros.get(0);
        //容器里放类型太多的对象，容易记不清楚，对象转型时会发生错误。
        //Hero h2=(Hero)heros.get(1);

        //引入泛型
        List<Hero> heroList = new ArrayList<>();
        heroList.add(new Hero("temo"));
        heroList.add(new ADHero("yaso"));
        Hero h2 = heroList.get(0);
    }
}
