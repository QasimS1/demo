package com.generic;

public class MyLinkedList <T> {

        static class Node <T>{

            T data;
            Node<T> next;

            public Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        public Node<T> head = null;
        public Node<T> tail = null;

        //addNode() will add a new node to the list
        public void addNode(T data) {
            //Create a new node
            Node newNode = new Node(data);

            //Checks if the list is empty
            if(head == null) {
                //If list is empty, both head and tail will point to new node
                head = newNode;
                tail = newNode;
            }
            else {
                //newNode will be added after tail such that tail's next will point to newNode
                tail.next = newNode;
                //newNode will become new tail of the list
                tail = newNode;
            }
        }

        //display() will display all the nodes present in the list
        public void display() {
            //Node current will point to head
            Node current = head;

            if(head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of singly linked list: ");
            while(current != null) {
                //Prints each node by incrementing pointer
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        //REMOVE() will add a new node to the list
        public void remove(T value) {
            //Create a new node
            Node prev= null;
            Node current = head;
            Node last= tail;

            //Checks if the list is empty
            if(head == null) {
                System.out.println("List is mt");
            }
            else if(current.data==value) {
                head=current.next;
            }

            else {
                while(current!=null){
                    System.out.println("REMOVE"+ current.data);
                    if(current.data==value){
                        prev.next=current.next;
                        current = current.next;

                    }else {
                        prev= current;
                        current=current.next;
                    }

                }
            }
            System.out.println("REMOVE");
        }

}
