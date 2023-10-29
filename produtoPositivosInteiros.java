package Aula2410;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class produtoPositivosInteiros {
    public static void main(String[] args) {
        int produto = 1;
        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

            if (numero % 2 == 0 && numero != 0) {
                produto = produto * numero;
            }
        } while (numero != 0);
        System.out.println("Total produto: " + produto);
    }


}
