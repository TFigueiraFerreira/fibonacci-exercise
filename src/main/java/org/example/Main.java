package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(F(n));
    }

    public static int F(int n) {
        // Caso base, se n for 0 ou 1, retorna o próprio valor de n.
        if (n <= 1) {
            return n;
        }
        //Soma o resultado da função F
        return F(n - 1) + F(n - 2);
    }
}