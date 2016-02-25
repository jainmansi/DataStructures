/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Question10;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Question10Test {
    
    public static void balancedParenthesis(){
        
        ArrayList<String> cases = new ArrayList<>();
        cases.add("[{(5+3)}]");
        cases.add("[{(5+3}]");
        cases.add("[}})");
        cases.add("[3+9(2)]");
        
        
        Question10 q = new Question10();
        Boolean result;
        
        for(String s : cases){
            System.out.println("Entered string is:" +s);
            result = q.solve(s);
            
            if(result)
                System.out.println("Parenthesis are balanced");
            else
                System.out.println("Parenthesis are not balanced");
        }
    }
    
    public static void main (String args[]){
        balancedParenthesis();
    }
    
}
