package com.sriram;

import java.util.Random;

/**
 * Created by sriram on 10/25/21.
 */
class Greetings {

    private String[] list = {"Hello", "Welcome", "Hola", "Namaste"};

    private Random r = new Random();

    String generateGreeting() {
        return list[r.nextInt(4)];
    }

}
