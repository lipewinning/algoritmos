package com.felipe.list.linkedlist;

public class LinkedList {

    private Node firstNode;
    private Node lastNode;

    public LinkedList(Node first) {
        firstNode = first;
        lastNode = first;
    }

    public static void main(String[] args) {

        Node first = new Node("first");
        LinkedList linkedList = new LinkedList(first);

        Node two = new Node("second");
        linkedList.addNode(two);

        Node three = new Node("third");
        linkedList.addNode(three);

        Node four = new Node("fourth");
        linkedList.addNode(four);

        linkedList.print();
        linkedList.removeNode(2);
        linkedList.print();



    }

    public void addNode(Node node){
        this.lastNode.setNext(node);
        this.lastNode = node;
    }

    public boolean removeNode(int position) {

        if(this.firstNode == null){
            return false;
        }

        Node actualNode = this.firstNode;
        Node previousNode = this.firstNode;

        int counter = 1;
        while(actualNode != null){

            if (counter == position){

                if (position == 1){
                    this.firstNode = this.firstNode.getNext();
                    return true;
                }

                previousNode.setNext(actualNode.getNext());
                return true;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNext();
            counter++;
        }

        return false;
    }


    public void print(){
        Node actualNode = this.firstNode;

        while(actualNode != null){
            System.out.print(" -> " + actualNode.getName());
            actualNode = actualNode.getNext();
        }
        System.out.println();
    }
}
