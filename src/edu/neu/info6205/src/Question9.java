/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import java.util.HashSet;

/**
 *
 * @author Muddassar
 */
public class Question9 {
    
    public boolean solve(String input)
    {
        HashSet hashSet=new HashSet();
        
        for(char c: input.toCharArray())
        {
            
            if(!hashSet.add(Character.toUpperCase(c)))
            return false;
        }
        
        //TODO: implement logic
        return true;
    }
    
    
}
