/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.DoubleLinkedListNode;
import edu.neu.info6205.Interface.IDoubleLinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Muddassar
 */
public class DoubleLinkedList implements IDoubleLinkedList {

    public DoubleLinkedListNode first = null;
    public DoubleLinkedListNode last = null;
    int n = 0;

    @Override
    public int size() {
        //TODO: implement logic
        int s = 0;

        if (first != null) {
            DoubleLinkedListNode n = first;
            while (n.next != null) {
                s++;
                n = n.next;
            }
        }
        return s;
    }

    @Override
    public boolean isEmpty() {
        //TODO: implement logic
        return (first == null);
    }

    @Override
    public void addNodeAtHead(int value) {
        //TODO: implement logic
        DoubleLinkedListNode new_node = new DoubleLinkedListNode();
        new_node.value = value;

        if (first == null) {
            first = new_node;
            last = first;
        } else {
            first.next = new_node;
            new_node.next = first;
            first = new_node;
        }

        n++;

    }

    @Override
    public void addNodeAtTail(int value) {
        //TODO: implement logic
        DoubleLinkedListNode new_node = new DoubleLinkedListNode();

        new_node.value = value;
        if (isEmpty()) {
            first = new_node;
        } else {
            last.next = new_node;
            new_node.prev = last;
        }

        last = new_node;
        n++;

    }

    @Override
    public void addNodeAtPosition(int value, int position) {
        //TODO: implement logic
        DoubleLinkedListNode dll = new DoubleLinkedListNode();
        dll.value = value;

        if (position > n + 1) {

            System.out.println("The list is of size: " + n + "You may enter any values between 1 to " + (n + 1));
            return;
        }

        if (position <= 0) {
            System.out.println("Please enter position value greater than 0");
            return;

        }

        if (position == 0) {
            first = last = dll;
            return;
        }

        DoubleLinkedListNode ptr = first;
        for (int i = 1; i <= n; i++) {

            if (i == position) {

                DoubleLinkedListNode tempNode = ptr.next;
                ptr.next = dll;
                dll.prev = ptr;

                dll.next = tempNode;
                tempNode.prev = dll;

            }

            ptr = ptr.next;

        }

        n++;
    }

    @Override
    public DoubleLinkedListNode reverseALinkList(DoubleLinkedListNode node) {
        //TODO: implement logic
        DoubleLinkedListNode temp = null;
        DoubleLinkedListNode current = first;

        /* swap next and prev for all nodes of 
         doubly linked list */
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        /* Before changing head, check for the cases like empty 
         list and list with only one node */
        if (temp != null) {
            first = temp.prev;
        }

        return first;
    }

    @Override
    public DoubleLinkedListNode getHeadNode() {
        if (first != null) {
            return first;
        } else {
            throw new NoSuchElementException("No element");
        }
    }

    @Override
    public DoubleLinkedListNode getTailNode() {
        //TODO: implement logic
        if (first != null) {
            return last;
        } else {
            throw new NoSuchElementException("No element");
        }

    }

    @Override
    public boolean deleteNodeAtPosition(int position) {
        //TODO: implement logic

        DoubleLinkedListNode temp = first;

        if (position == 0) {
            first = temp.next;
            return true;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return false;
        }

        DoubleLinkedListNode next = temp.next.next;
        temp.next = next;

        n--;

        return true;
    }

    public void display() {
        if (first == null) {
            System.out.print("empty\n");
            return;
        }
        if (first.next == null) {
            System.out.println(first.value);
            return;
        }
        DoubleLinkedListNode ptr = first;
        System.out.print(first.value + " <-> ");
        ptr = first.next;
        while (ptr.next != null) {
            System.out.print(ptr.value + " <-> ");
            ptr = ptr.next;
        }
        System.out.print(ptr.value + "\n");
    }

}
