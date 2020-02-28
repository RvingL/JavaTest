package com.example;

import character.Hero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionCircle {
    public static void main(String[] args) {
        circle1();
        //circle2();
    }

    //for循环遍历集合
    public static void circle1() {
        List<Hero> heroList=new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            heroList.add(new Hero("hero"+i));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(heroList.get(i));
        }

        for(Hero h:heroList){
            System.out.println(h);
        }
    }

    //迭代器Iterator遍历
    public static void circle2(){
        List<Hero> heroList=new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            heroList.add(new Hero("hero"+i));
        }
        //while循环
        Iterator<Hero> it=heroList.iterator();
        while(it.hasNext()){
            Hero h=it.next();
            System.out.println(h);
        }
        //for循环
        for(Iterator<Hero> iterator=heroList.iterator();iterator.hasNext();){
            Hero hero=iterator.next();
            System.out.println(hero);
        }
    }




}
