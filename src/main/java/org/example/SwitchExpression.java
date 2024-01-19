package org.example;

public class SwitchExpression {

    public static void main(String[] args) {

        String day = "sun";

        String time = "";

        time = switch (day) {
            case "sat", "sun" -> "8am";
            case "fri" -> "6am";
            default -> "6:30am";
        };
        System.out.println(time);
    }
}
