package com.sriram.hello;

/**
 * Created by sriram on 10/25/21.
 */
public class Hello {
    public static void main(String[] args) {
        StringBuilder greetingText = new StringBuilder();
        Greetings greetings = new Greetings();
        greetingText.append(greetings.generateGreeting());
        greetingText.append(" ");
        if (args.length > 0) {
            greetingText.append(args[0]);
        } else {
            greetingText.append("buddy");
        }
        greetingText.append("!");
        System.out.println(greetingText);
    }
}
