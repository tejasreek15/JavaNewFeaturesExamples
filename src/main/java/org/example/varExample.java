package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class varExample {

    public static void main(String[] args) throws IOException {

        var input = new InputStreamReader(System.in);
        var reader = new BufferedReader(input);
        var list = new ArrayList<>();

        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());

        System.out.println(list);

        // int
        var x = 100;

        // double
        var y = 1.90;

        // char
        var z = 'a';

        // string
        var p = "tanu";

        // boolean
        var q = false;
    }
}
