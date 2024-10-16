package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int x = 10;
        System.out.println(F(n));
        System.out.println(fIterative(x));
    }

    public static int F(int n) { // Método recursivo
        // Caso base, se n for 0 ou 1, retorna o próprio valor de n.
        if (n <= 1) {
            return n;
        }
        //Soma o resultado da função F
        return F(n - 1) + F(n - 2);
    }

    public static int fIterative(int x) { // Método iterativo
        if (x <= 1) {
            return x;
        }
        // F1 e F2 representam os dois últimos números da sequência de Fibonacci
        int F1 = 0;
        int F2 = 1;
        int N = 0;

        for (int i = 2; i <= x; i++) {
            N = F1 + F2; // Calcula o próximo número
            F1 = F2;     // Atualiza F1 para o próximo ciclo
            F2 = N;      // Atualiza F2 para o próximo ciclo
        }

        return F2; // Retorna número de Fibonacci
    }
}