package com.company;

public class MyLinkedList<T> {

    private Node first;
    private Node last;

    private int size;

    public boolean isEmpty() {
        return first == null ? true : false;
    }

    public void add(T value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            Node tmp = last;
            last = node;
            last.previous = tmp;
        }
        size++;
    }
    public void reverse(){
        Node curLast = last.previous;
        Node curFirst = first.next;
        changePlaces(first,last);
        for(int i =0;i < (size/2);i++){
            changePlaces(curFirst,curLast);
            curLast = curLast.previous;
            curFirst = curFirst.next;
        }
    }

    private void changePlaces(Node node1, Node node2){
        T tmp = node1.value;
        node1.value = node2.value;
        node2.value = tmp;
    }

    @Override
    public String toString() {
        Node cur = first;
        String result = "[";
        while (cur != null) {
            result += cur.value.toString() + ", ";
            cur = cur.next;
        }
        result= result.substring(0,result.length()-2);
        return result + "]";
    }

    public int size() {
        return size;
    }

    class Node {
        Node next;
        Node previous;
        T value;
        Node(T value) {
            this.value = value;
        }

    }
}
