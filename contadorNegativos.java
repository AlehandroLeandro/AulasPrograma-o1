package Aula2410;

import javax.swing.*;

public class contadorNegativos {
    public static void main(String[] args) {
        int i = 0;
        int contadorNegativos = 0;
        while (i<5) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros para saber se estes são negativos ou positivos"));
            i++;
            System.out.println(numero);
            if (numero<0) {
                contadorNegativos ++;
        }
        }
        System.out.println("Quantidade de números negativos: " + contadorNegativos);

    }

}
