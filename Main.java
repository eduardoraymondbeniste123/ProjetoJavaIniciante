package com.devwebai.dudu;

public class Main {

    public int[] numeros = { 10, 20 };

    public Main() {
        int soma = 0;
        // Corrigido o loop para usar < em vez de <=
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos números é: " + soma);
    }

    public static void main(String[] args) {
        new Main();
    }
}
