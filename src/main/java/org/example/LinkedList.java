package org.example;

public class LinkedList {
    Node head = null;
    Node current  = null;

    public void add (int a){
        Node newNode = new Node(a);
        if (head == null){
            head = newNode;
        }else{
            current = head;
            while (current.next != null) {
                current = current.next;
            }current.next = newNode;
        }
    }

    public void print(){
        current = head;
        while(current!= null){
            System.out.println(current);
            current = current.next;
        }
    }
}
