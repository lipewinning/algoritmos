package com.felipe.list.ordered;

import com.felipe.stack.Item;
import com.felipe.stack.Stack;

public class OrderedList {

    private Node firstNode;

    public static void main(String[] args) {

        OrderedList orderedList = new OrderedList();

        orderedList.add(new Node("F"));

        orderedList.add(new Node("A"));

        orderedList.add(new Node("C"));

        orderedList.add(new Node("B"));



        orderedList.print();


    }

    public boolean add(Node node){

        if (this.firstNode == null){
            this.firstNode = node;
            return true;
        }

        Node previous = this.firstNode;
        Node actualNode = this.firstNode;

        while(actualNode != null){

            if(node.getName().compareTo(actualNode.getName()) == 1){
                node.setNext(actualNode.getNext());
                actualNode.setNext(node);
                return true;
            }

            if (actualNode.getNext() == null){
                actualNode.setNext(node);
                return true;
            }

            actualNode = actualNode.getNext();
        }

        return false;
    }

    private void print(){
        Node actualNode = this.firstNode;

        while (actualNode != null){
            System.out.print(" >> " + actualNode.getName());
            actualNode = actualNode.getNext();
        }
        System.out.println("-----------------------------");
    }



}
