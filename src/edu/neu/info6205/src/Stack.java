/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.IStack;
import edu.neu.info6205.Interface.Node;
import java.util.NoSuchElementException;

/**
 *
 * @author Muddassar
 */
public class Stack implements IStack {

    private Node top = null;

    @Override
    public void push(int value) {
        Node n = new Node();
        n.value = value;
        n.next = top;
        top = n;
    }

    @Override
    public int pop() {
        //TODO: implement logic
        Node temp = top;
        if (top != null) {
            top = top.next;
            return temp.value;
        } 
        else {
            throw new NoSuchElementException("Stack Underflow");
        }

    }

    @Override
    public int peek() {
        //TODO: implement logic
        if (top == null) {
            throw new NoSuchElementException("Stack Underflow");
        }
        return top.value;
    }

    @Override
    public int size() {
        //TODO: implement logic
        int size = 0;

        for (Node n = top; n.next != null; n = n.next) {
            size++;
        }

        return size;
    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }

}
