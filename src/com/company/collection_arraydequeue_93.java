package com.company;

import java.util.ArrayDeque;

public class collection_arraydequeue_93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(4);
        ad1.add(5);
        ad1.add(8);
        ad1.add(56);
        ad1.addFirst(78);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
