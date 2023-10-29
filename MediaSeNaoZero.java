package Aula2410;

import javax.crypto.spec.PSource;
import javax.swing.*;

public class MediaSeNaoZero {
    public static void main(String[] args) {
        System.out.println("Digite números para saber sua média(0 para sair)");
        int contador = 0;
        int num;
        int soma = 0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
            contador++;
            if (num % 2 == 0) {
                soma += num;
                System.out.println("Número par : " + num);
            } else {
               System.out.println("Número ímpar: " + num);
            }
        } while(num !=0);
        System.out.println("Total soma dos números pares " + soma);
        System.out.println("Média : " + soma/contador);
        }


}
