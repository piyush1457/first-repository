package com.example;

public class App {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Sum of " + a + " and " + b + " is " + sum(a, b));
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
