/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

/**
 *
 * @author Muddassar
 */
public class Question10 {
    
    public boolean solve(String input)
    {
        //TODO: implement logic   
        Stack stack = new Stack();
 
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
            case '{':
            case '[':
            case '(':
                stack.push(ch);
                break;
            case '}':
                if (stack.isEmpty() || stack.pop() != '{')
                    return false;
                break;
            case ']':
                if (stack.isEmpty() || stack.pop() != '[')
                    return false;
                break;
            case ')':
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
                break;
            
            }
        }
 
        if(stack.isEmpty())
            return true;
        else 
            return false;
    }   
    
}
