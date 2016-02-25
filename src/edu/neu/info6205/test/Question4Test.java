/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.DoubleLinkedList;

/**
 *
 * @author user
 */
public class Question4Test {

    public static void main(String args[]) {

        DoubleLinkedList dList = new DoubleLinkedList();

        //Test for empty()
        Boolean checkEmpty = dList.isEmpty();
        System.out.println("Is linked list empty?" + checkEmpty);
        System.out.println("\n");

        //Test for size()
        System.out.println("Size of doubly linked list is:" + dList.size());
        System.out.println("\n");

        //Test for addNodeAtHead
        dList.addNodeAtHead(8);
        System.out.println("Doubly Linked List after insertion at head");
        dList.display();
        System.out.println("\n");
        
        //Test for addNodeAtTail
        dList.addNodeAtTail(3);
        System.out.println("Doubly Linked List after insertion at tail");
        dList.display();
        System.out.println("\n");
        
        dList.addNodeAtTail(6);
        System.out.println("Doubly Linked List after insertion at tail");
        dList.display();
        System.out.println("\n");
        
        //Test for addNodeAt(Nth)Position
        dList.addNodeAtPosition(15, 1);
        System.out.println("Doubly Linked List after insertion at a position");
        dList.display();
        System.out.println("\n");
        
        //Test for reverseALinkedList
        dList.reverseALinkList(dList.getHeadNode());
        System.out.println("Doubly Linked List after reversal");
        dList.display();
        System.out.println("\n");
        
        //Test for getHeadNode
        System.out.println("Head node of Doubly Linked List is:" +dList.getHeadNode().value);
        System.out.println("\n");
        
        //Test for getTailNode
        System.out.println("Tail node of Doubly Linked List is:" +dList.getTailNode().value);
        System.out.println("\n");
        
        //Test for deleteNodeAt(Nth)Position
        dList.deleteNodeAtPosition(1);
        System.out.println("Deletion of linked list after deletion at Nth Position:");
        dList.display();

    }

}
