package com.example;

import character.Hero;

import java.util.LinkedList;

public class MyStack implements Stack {

    private static LinkedList<Hero> linkedList=new LinkedList<>();

    @Override
    public synchronized void push(Hero hero) {
        linkedList.addLast(hero);
    }

    @Override
    public Hero pull() {
        return linkedList.removeLast();
    }

    @Override
    public Hero peek() {
        return linkedList.peekLast();
    }

    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(new Hero("garen"));
        myStack.push(new Hero("temo"));
        myStack.push(new Hero("yaso"));
        System.out.println(myStack.pull());
        System.out.println(myStack.peek());
    }
}
