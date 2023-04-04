package org.example;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

}
