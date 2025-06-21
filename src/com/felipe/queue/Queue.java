package com.felipe.queue;

import com.felipe.queue.Item;

public class Queue {

    private Item firstItem;
    private Item lastItem;

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.add(new Item("A"));
        queue.add(new Item("B"));
        queue.add(new Item("C"));
        queue.add(new Item("D"));

        queue.print();

        queue.remove();
        queue.remove();

        queue.print();
    }

    public void add(Item item) {
        if(this.firstItem == null){
            this.firstItem = item;
            this.lastItem = item;
            return;
        }

        this.lastItem.setNext(item);
        this.lastItem = item;
    }

    public boolean remove() {

        this.firstItem = this.firstItem.getNext();
        return false;
    }

    public void print(){
        Item actualItem = this.firstItem;
        while(actualItem != null){
            System.out.print(" >> " + actualItem.getName());
            actualItem = actualItem.getNext();
        }
        System.out.println("");
    }

}
