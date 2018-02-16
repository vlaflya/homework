package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    MyLinkedList<Integer> oke = new MyLinkedList<>();
    oke.add(1);
    oke.add(2);
    oke.add(3);
    oke.add(4);
    oke.add(5);
    System.out.println(oke.toString());
    oke.reverse();
    System.out.println(oke.toString());
}
}
