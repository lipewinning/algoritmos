package com.felipe.list.ordered;

public class Node {

    private String name;
    private Node next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String name) {
        this.name = name;
    }
}
