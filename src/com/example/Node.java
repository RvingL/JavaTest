package com.example;

import character.Hero;

import java.util.ArrayList;
import java.util.List;

public class Node<T extends Comparable<T>> {
    public Node<T> leftNode;
    public Node<T> rightNode;
    public T value;

    public void add(T t) {
        if (null == value) {
            value = t;
        } else {
            if ((t.compareTo(value)) <= 0) {
                if (null == leftNode) {
                    leftNode = new Node<>();
                }
                leftNode.add(t);
            } else {
                if (null == rightNode) {
                    rightNode = new Node<>();
                }
                rightNode.add(t);
            }
        }
    }

    public List<T> values() {
        List<T> values = new ArrayList<>();

        if (null != leftNode) {
            values.addAll(leftNode.values());
        }

        values.add(value);

        if (null != rightNode) {
            values.addAll(rightNode.values());
        }
        return values;
    }

    public static void main(String[] args) {
        int[] a = new int[]{67, 2, 9, 47, 19, 42, 231};
        Node<Integer> root = new Node<>();
        for (int i : a) {
            root.add(i);
        }

        System.out.println(root.values());

        Node<String> node = new Node<String>();
        node.add("azc");
        node.add("aef");
        node.add("ghi");

        System.out.println(node.values());
    }
}
