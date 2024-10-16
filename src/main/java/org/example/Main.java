package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(F(n));
    }

    public static int F(int n) {
        if (n <= 1) {
            return n;
        }
        return F(n - 1) + F(n - 2);
    }
}