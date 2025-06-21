package com.felipe.stack;

public class Stack {

    private Item lastItem;

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.add(new Item("A"));
        stack.add(new Item("B"));
        stack.add(new Item("C"));

        stack.print();

        stack.remove();
        stack.remove();
        stack.print();
    }

    private void remove() {
        this.lastItem = this.lastItem.getPrevious();
    }

    public void add(Item item) {
        item.setPrevious(this.lastItem);
        this.lastItem = item;
    }

    public void print(){
        Item topStack = this.lastItem;

        while(topStack != null){
            System.out.println(topStack.getName());
            topStack = topStack.getPrevious();
        }
        System.out.println("-----------------------------");
    }




}
