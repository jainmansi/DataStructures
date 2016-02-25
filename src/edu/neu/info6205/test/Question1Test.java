/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.Interface.Node;
import edu.neu.info6205.src.LinkedList;

/**
 *
 * @author user
 */
public class Question1Test {

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        
        
        //Test for isEmpty Function
        Boolean emptyStatus;        
        emptyStatus = list.isEmpty();        
        System.out.println("ListEmpty? \t" +emptyStatus);

        //Test for size() function
        System.out.println("Size of linkedlist is: \t" +list.size());
                
        //Test for addNodeAtHead()
        list.addNodeAtHead(5);
        
        System.out.println("Linkedlist after insertion at head: \t" );
        list.displayList();
        System.out.println("\n");
                
        //Test for addNodeAtTail()             
        list.addNodeAtTail(6);
        
        System.out.println("Linkedlist after insertion at tail: \t" );
        list.displayList();
        System.out.println("\n");
        
        //Test for addNodeAt(Nth)Position()  
        list.addNodeAtPosition(9, 1);
        
        System.out.println("Linkedlist after insertion at a position: \t" );
        list.displayList();
        System.out.println("\n");
        
        
        list.addNodeAtHead(8);
        
        System.out.println("Linkedlist after insertion at head: \t" );
        list.displayList();
        System.out.println("\n");
        
        
        //Test for getHeadNode()
        Node n = list.getHeadNode();
        System.out.println("Head of linkedlist is: \t" +n.value);
        
        //Test for getTailNode()
        n = list.getTailNode();
        System.out.println("Tail of linkedlist is: \t" +n.value);
        
        
        //Test for reverseALinkList
        list.reverseALinkList(list.getHeadNode());
        
        System.out.println("Linkedlist after reversal: \t" );
        list.displayList();
        System.out.println("\n");
        
        //Test for deleteNodeAt(Nth)Position
        list.deleteNodeAtPosition(2);
        System.out.println("Linkedlist is: \t" );
        list.displayList();
        System.out.println("\n");
               
        emptyStatus = list.isEmpty();        
        System.out.println("ListEmpty? \t" +emptyStatus);

        //Test for size() function
        System.out.println("Size of linkedlist is: \t" +list.size());
        
    }

}
