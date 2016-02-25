/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author user
 */
public class Question6 {
    Queue q = new Queue();
    Queue tmp = new Queue();
    
    public int pop()
    {
        if (q.isEmpty())
            throw new NoSuchElementException("Underflow Exception");        
        return q.dequeue();
    }
    
    public int peek()
    {
        if (q.isEmpty())
            throw new NoSuchElementException("Underflow Exception");            
        return q.peek();
    }
    
    public boolean isEmpty()
    {
        return q.isEmpty();
    }
    
    public void push(int data)
    {        
        if (q.isEmpty())
            q.enqueue(data);
        else
        {        
            int l = q.size();
            for (int i = 0; i < l; i++)
                tmp.enqueue(q.dequeue());                
            
            q.enqueue(data);        
                        
            for (int i = 0; i < l; i++)
                q.enqueue(tmp.dequeue());
        }
    }
    public int getSize()
    {
        return q.size();
    } 
    
    
}
