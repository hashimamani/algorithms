/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.linkedList;

/**
 *
 * @author AMANI
 */
public class LinkedList {

    private Node head;

    public void insertAtHead(int data) {

        Node newNode = new Node(data);

        newNode.setNextNode(this.head);

        this.head = newNode;

    }

    public int length() {

        int len = 0;

        Node current = this.head;

        while (current != null) {

            len++;

            current = current.getNextNode();

        }

        return len;

    }

    public void deleteAtHead() {

        Node current = this.head;

        this.head = current.getNextNode();

    }

    public void reverseList() {

        Node current = this.head;

        Node previous = null;

        Node next = null;

        while (current != null) {

            next = current.getNextNode();

            current.setNextNode(previous);

            previous = current;

            current = next;

        }

        this.head = previous;

    }

    public Node search(int value) {

        Node current = this.head;

        while (current != null) {

            if (current.getData() == value) {

                return current;

            }

            current = current.getNextNode();

        }

        return null;

    }

    @Override
    public String toString() {

        String result = "[";

        Node current = this.head;

        while (current != null) {

            result += current.toString() + "->";

            current = current.getNextNode();
        }
        result += "]";

        return "LinkedList: " + result;
    }

}
