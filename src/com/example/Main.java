package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting program");
        int result = compute(5);
        System.out.println("compute(5) = " + result);

        for (int i = 0; i < 10; i++) {
            System.out.println("loop i=" + i);
            if (i == 7) {
                System.out.println("Reached 7 — good place for a conditional breakpoint");
            }
        }

        System.out.println("Done");
    }

    static int compute(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
