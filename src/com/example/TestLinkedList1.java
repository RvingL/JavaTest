package com.example;

import character.Hero;

import java.util.LinkedList;
import java.util.Queue;

public class TestLinkedList1 {
    public static void main(String[] args) {
        Queue<Hero> queue=new LinkedList<>();
        queue.offer(new Hero("hero1"));
        queue.offer(new Hero("hero2"));
        queue.offer(new Hero("hero3"));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
