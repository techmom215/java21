/*
Practice work from Java in 21 days
Day 20 for #100DaysOfCode
Learning about Constructors
*/
package com.java21days;

import java.util.StringTokenizer; 
//A Java class ^^ that divides a string into shorter strings called Tokens.

class TokenTester{ //Program to analyze stock prices & use string tokens

    public static void main(String[] arguments) {
        StringTokenizer st1, st2, st3;
        
        String quote1= "GOOG 805.02 +2.85";
        st1 = new StringTokenizer(quote1); //new object
        
        /* To create a new object,^^^ use the new operator with the name of the 
        class that should be used as a template
        */
            System.out.println("Token 1: " + st1.nextToken());
            System.out.println("Token 2: " + st1.nextToken());
            System.out.println("Token 3: " + st1.nextToken());
            
        String quote2 = "RHT@75.00@0.22";
        st2 = new StringTokenizer(quote2, "@"); //new object
            System.out.println("\nToken 1: " + st2.nextToken());
            System.out.println("Token 2: " + st2.nextToken());
            System.out.println("Token 3: " + st2.nextToken());
            
        String quote3 = "01/21/2017";
        st3 = new StringTokenizer(quote3, "/"); //new object
            System.out.println("\nDay Token 1: " + st3.nextToken());
            System.out.println("Month Token 2: " + st3.nextToken());
            System.out.println("Year Token 3: " + st3.nextToken());
   
    }
}