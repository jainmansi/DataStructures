/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Queue;

/**
 *
 * @author user
 */
public class Question3Test {
    public static void main(String args[]){
        Queue queue = new Queue();
        
        //Test for empty()
         Boolean checkEmpty = queue.isEmpty();
         System.out.println("Is stack empty?" +checkEmpty);
         
         //Test for push()
         queue.enqueue(1);
         System.out.println("Recently added element is:" +queue.peek());
         queue.enqueue(2);
         System.out.println("Recently added element is:" +queue.peek());
         queue.enqueue(3);
         System.out.println("Recently added element is:" +queue.peek());
         queue.enqueue(4);
         System.out.println("Recently added element is:" +queue.peek());
         queue.enqueue(5);
         System.out.println("Recently added element is:" +queue.peek());
         queue.enqueue(6);
         System.out.println("Recently added element is:" +queue.peek());
         
         //Test for pop()
         System.out.println("Dequeued element is:" +queue.dequeue());
         System.out.println("Dequeued element is:" +queue.dequeue());
         
         //Test for size()
         System.out.println("Size of stack is:" +queue.size());
         
         
         //Test for peek()
         System.out.println("Peek of stack is:" +queue.peek());
         
         //Test for empty()
         checkEmpty = queue.isEmpty();
         System.out.println("Is stack empty?" +checkEmpty);
    }
}
