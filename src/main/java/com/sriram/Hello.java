package com.sriram;

/**
 * Created by sriram on 10/25/21.
 */
public class Hello {
    public static void main(String[] args) {
        StringBuilder greetingText = new StringBuilder();
        Greetings greetings = new Greetings();
        greetingText.append(greetings.generateGreeting());
        greetingText.append(" ");
        greetingText.append(args[0]);
        greetingText.append("!");
        System.out.println(greetingText);
    }
}
