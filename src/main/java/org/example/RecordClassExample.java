package org.example;

public class RecordClassExample {

    public record Person(int id, String name, int age) {

        public static void main(String[] args) {

            Person person = new Person(1, "riya", 24);
            System.out.println(person);
        }
    }


}
