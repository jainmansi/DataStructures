/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Question9;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Question9Test {

    public static void main(String args[]) {

        ArrayList<String> testCases = new ArrayList<>();
        testCases.add("abc");
        testCases.add("aaab");
        testCases.add("acdc");
        testCases.add("a b c");
        testCases.add("000");
        testCases.add("1023");
        testCases.add("abc123");
        testCases.add("");
        testCases.add("  ");

        Question9 q = new Question9();
        Boolean result;

        for (String s : testCases) {

            System.out.println("Entered string is:" + s);
            result = q.solve(s);

            if (result) {
                System.out.println("Only unique characters present");
            } else {
                System.out.println("Duplicate characters present");
            }
            System.out.println("\n");
        }
    }
}
