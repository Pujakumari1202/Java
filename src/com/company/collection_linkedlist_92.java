package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class collection_linkedlist_92 {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new  LinkedList<>();
        LinkedList<Integer> l2=new  LinkedList<>();
        l2.add(15);
        l2.add(56);
        l2.add(67);
        l2.add(89);
        l1.add(8);
        l1.add(9);
        l1.add(8);
        l1.addLast(899);
        l1.addFirst(2777);
        //l1.add(0,3);
        //l1.add(0,7);
        l1.addAll(l2);
        System.out.println(l1.contains(99));
        System.out.println(l1.indexOf(89));
        System.out.println(l1.indexOf(99));
        System.out.println(l1.indexOf(8));
        System.out.println(l1.lastIndexOf(8));
        //l1.clear();
        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
