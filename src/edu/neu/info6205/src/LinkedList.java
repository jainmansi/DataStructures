/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.ILinkedList;
import edu.neu.info6205.Interface.Node;

/**
 *
 * @author Muddassar
 */
public class LinkedList implements ILinkedList {

    private Node head;

    @Override
    public int size() {
        int s = 0;

        if (head != null) {
            Node n = head;
            while (n.next != null) {
                s++;
                n = n.next;
            }
        }
        return s;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public boolean isEmpty() {
        if (head != null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void addNodeAtHead(int value) {
        Node n = new Node();

        n.value = value;
        n.next = head;
        head = n;
    }

    @Override
    public void addNodeAtTail(int value) {
        //TODO: implement logic
        Node new_node = new Node();
        new_node.value = value;

        if (head == null) {
            head = new_node;
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
        return;
    }

    @Override
    public void addNodeAtPosition(int value, int position) {
        //TODO: implement logic
        Node new_node = new Node();
        //int counter = 0;
        new_node.value = value;

        if (head == null && position != 0) {
            System.out.println("Inappropriate value of position");
        }

        if (position == 0) {
            new_node.next = head;
            head = new_node;
        }

        Node current = head;
        Node previous = null;

        for (int i = 0; i < position; i++) {
            previous = current;
            current = current.next;

            if (current == null) {
                System.out.println("Inappropriate value of position");
                break;
            }
        }

        new_node.next = current;
        previous.next = new_node;

    }

    @Override
    public Node reverseALinkList(Node node) {
        //TODO: implement logic       

        Node prev = null;
        Node temp = node;
        Node ahead = null;
        while (temp != null) {
            ahead = temp.next;
            temp.next = prev;
            prev = temp;
            temp = ahead;

        }
        head = prev;
        return head;
    }

    @Override
    public Node getHeadNode() {
        //TODO: implement logic
        if (head == null) {
            System.out.println("Empty linked list");
            return null;
        }

        return head;
    }

    @Override
    public Node getTailNode() {
        //TODO: implement logic

        if (head == null) {
            System.out.println("Empty list");
            return null;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    @Override
    public boolean deleteNodeAtPosition(int position) {
        //TODO: implement logic
        if (head == null) {
            return false;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return true;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return false;
        }

        Node next = temp.next.next;
        temp.next = next;

        return true;
    }

    public void displayList() {
        if (head == null) {
            System.out.println("Empty Linked List");
        } else {
            Node last = head;
            System.out.print(head.value + "\t");
            while (last.next != null) {
                last = last.next;
                System.out.print(last.value + "\t");
            }
        }
    }

    public void convertCyclic() {
        if (head == null) {
            System.out.println("Empty Linked List");
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = head;
        }
    }

    public boolean isCyclic() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next; //if fast and slow pointers are meeting then LinkedList is cyclic 
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Node getNode() {
        return head;
    }

    public void displayCircular() {

        Node traverse = head;

        if (head == null) {
            System.out.println("Empty Linked List");

        } else if (head.next == null) {
            System.out.println("Elements of list is:" + head.value);

        } else {
            System.out.println("Elements in the list are:");
            System.out.print(head.value);

            while (traverse.next != head && traverse.next != null) {
                traverse = traverse.next;
                System.out.print("-->");
                System.out.print(traverse.value);
            }

        }

    }

}
