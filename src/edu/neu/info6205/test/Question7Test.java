/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Question7;

/**
 *
 * @author user
 */
public class Question7Test {
    public static void main(String args[]){
        Question7 queue = new Question7();
        
        int result;
        
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        
        result = queue.dequeue();
        
        System.out.println("Dequeued value is:" +result);        
        
        queue.enqueue(11);
        
        result = queue.dequeue();
        System.out.println("Dequeued value is:" +result);
        result = queue.dequeue();
        System.out.println("Dequeued value is:" +result);
        result = queue.dequeue();
        System.out.println("Dequeued value is:" +result);
        result = queue.dequeue();
        System.out.println("Dequeued value is:" +result);
        
    }
    
    
}
