package org.example;

public class TextBlockExample {

    public static void main(String[] args) {

        // old feature
//        String htmlContent = "<html>\n" +
//                "<body>\n" +
//                "<p>Hi, Welcome</p>\n" +
//                "</body>\n" +
//                "</html>\n";

        //new feature
        String htmlContent = """
                <html>
                <body>
                <p>Hi, Welcome</p>
                </body>
                </html>
                """;
        System.out.println(htmlContent);
    }
}
