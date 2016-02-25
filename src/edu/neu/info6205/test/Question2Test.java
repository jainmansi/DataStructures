/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Stack;

/**
 *
 * @author user
 */
public class Question2Test {
    public static void main(String args[]){
         Stack stack = new Stack();
         
         
         //Test for empty()
         Boolean checkEmpty = stack.isEmpty();
         System.out.println("Is stack empty?" +checkEmpty);
         
         //Test for push()
         stack.push(1);
         System.out.println("Recently added element is:" +stack.peek());
         stack.push(2);
         System.out.println("Recently added element is:" +stack.peek());
         stack.push(3);
         System.out.println("Recently added element is:" +stack.peek());
         stack.push(4);
         System.out.println("Recently added element is:" +stack.peek());
         stack.push(5);
         System.out.println("Recently added element is:" +stack.peek());
         stack.push(6);
         System.out.println("Recently added element is:" +stack.peek());
         
         //Test for pop()
         System.out.println("Popped element is:" +stack.pop());
         System.out.println("Popped element is:" +stack.pop());
         
         //Test for size()
         System.out.println("Size of stack is:" +stack.size());
         
         
         //Test for peek()
         System.out.println("Peek of stack is:" +stack.peek());
         
         //Test for empty()
         checkEmpty = stack.isEmpty();
         System.out.println("Is stack empty?" +checkEmpty);        
         
         
         
    }
}
