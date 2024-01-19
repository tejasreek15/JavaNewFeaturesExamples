package org.example;

public class StringTemplateExample {

    public static void main(String[] args) {

        int i = 10;
        int j = 20;

        System.out.println(i + " + " + j + " = " + (i+j));  // old

        //System.out.println(STR."\{i} + \{j} = \{i+j}");   // new  -- support in java 21 version
    }
}
