/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Question6;

/**
 *
 * @author user
 */
public class Question6Test {

    public static void main(String args[]) {
        Question6 stack = new Question6();

        int result;

        Boolean checkEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty?" +checkEmpty);
        System.out.println("\n");
        
        stack.push(8);
        stack.push(6);
        stack.push(9);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        
        result = stack.pop();
        System.out.println("Popped value is:" +result);
        System.out.println("\n");
        
        result = stack.pop();
        System.out.println("Popped value is:" +result);
        System.out.println("\n");
        
        result = stack.pop();
        System.out.println("Popped value is:" +result);
        System.out.println("\n");
        
        result = stack.pop();
        System.out.println("Popped value is:" +result);
        System.out.println("\n");
        
        result = stack.pop();
        System.out.println("Popped value is:" +result);
        System.out.println("\n");
        
        checkEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty?" +checkEmpty);
        System.out.println("\n");
        
        
        
    }
}
