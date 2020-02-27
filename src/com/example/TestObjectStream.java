package com.example;

import character.Hero;

import java.io.*;

public class TestObjectStream {

    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.hp=100;
        hero.name="Garen";

        File file=new File("d:/LOLFolder/lol4.txt");
        try(
                FileInputStream fileInputStream=new FileInputStream(file);
                ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

                FileOutputStream fileOutputStream=new FileOutputStream(file);
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
                )
        {
            objectOutputStream.writeObject(hero);
            Hero hero1=(Hero)objectInputStream.readObject();
            System.out.println(hero.name);
            System.out.println(hero.hp);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
