/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.IQueue;
import edu.neu.info6205.Interface.Node;
import java.util.NoSuchElementException;

/**
 *
 * @author Muddassar
 */
public class Queue implements IQueue {

    private Node first;

    @Override
    public void enqueue(int value) {
        //TODO: implement logic
        Node new_node = new Node();
        new_node.value = value;
        new_node.next = first;
        first = new_node;
    }

    @Override
    public int dequeue() {
        //TODO: implement logic        
        if (first == null) {
            throw new NoSuchElementException("Queue doesn't contain any Nodes.");
        }

        if (first.next == null) {
            Node temp = first;
            first = first.next;
            return temp.value;
        }

        Node previous = null;
        Node current = first;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current.value;
    }

    @Override
    public int peek() {
        //TODO: implement logic
        try {
            return first.value;
        } catch (Exception e) {
            throw new NoSuchElementException("Queue doesn't contain any Nodes.");
        }
    }

    @Override
    public boolean isEmpty() {
        //TODO: implement logic
        return (first == null);
    }

    @Override
    public int size() {
        //TODO: implement logic
        int s = 0;

        try {
            if (first != null) {
                Node n = first;

                while (n.next != null) {
                    s++;
                    n = n.next;
                }
                return s;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }

    }
}
