/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.LinkedList;

/**
 *
 * @author user
 */
public class Question8Test {
    public static void main(String args[]){
        
        LinkedList list = new LinkedList();
        
        list.displayCircular();
        System.out.println("\n");
        
        list.addNodeAtHead(5);
        list.addNodeAtTail(6);
        list.addNodeAtTail(7);
        list.addNodeAtTail(8);
        list.addNodeAtTail(9);
        list.addNodeAtTail(10);
        list.addNodeAtTail(11);
        
        //list.displayList();
        list.displayCircular();
        
        if(list.isCyclic()){
            System.out.println("Linked List is cyclic -- 1");
            System.out.println("\n");
        }
        else{
            System.out.println("linked list is not cyclic -- 1"); 
            System.out.println("\n");
        }
        
        list.convertCyclic();
        list.displayCircular();
        
        if(list.isCyclic()){
            System.out.println("Linked List is cyclic -- 2");
            System.out.println("\n");
        }
        else{
            System.out.println("linked list is not cyclic -- 2"); 
            System.out.println("\n");
        }
    }
}
