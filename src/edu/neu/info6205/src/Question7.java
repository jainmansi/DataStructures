/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

/**
 *
 * @author user
 */
public class Question7 {
    private Stack s1 = new Stack();
    private Stack s2 = new Stack();
    
    public void enqueue(int value){
        if(!s1.isEmpty())
            {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
                
            }
            s1.push(value);
        }
        
        else {
            s1.push(value);
        }       
        
        while(!s2.isEmpty())
            s1.push(s2.pop());
    }
    
    public int dequeue(){
        return s1.pop();
    }
    
}
