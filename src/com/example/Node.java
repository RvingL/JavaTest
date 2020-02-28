package com.example;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public Node leftNode;
    public Node rightNode;
    public Object value;

    public void add(Object v) {
        if (null == value) {
            value = v;
        } else {
            if (((Integer) v - (Integer) value) <= 0) {
                if (null == leftNode) {
                    leftNode = new Node();
                }
                leftNode.add(v);
            } else {
                if (null == rightNode) {
                    rightNode = new Node();
                }
                rightNode.add(v);
            }
        }
    }

    public List<Object> values() {
        List<Object> values=new ArrayList<>();

        if(null!=leftNode){
            values.addAll(leftNode.values());
        }
        values.add(value);

        if(null!=rightNode){
            values.addAll(rightNode.values());
        }
        return values;
    }

    public static void main(String[] args) {
        int[] a = new int[]{67, 2, 9, 47, 19, 42, 231};
        Node root = new Node();
        for (int i : a) {
            root.add(i);
        }

        System.out.println(root.values());
    }
}
