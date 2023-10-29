package Aula2410;

import javax.swing.*;

public class somaNegativos {
    public static void main(String[] args) {
        int valores = 0;
        int soma = 0;
         do{
            valores = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os valores"));
            if ( valores < 0 ) {
                soma+= valores;
            }

        } while (valores != 0);
        System.out.println("Total soma negativos: " + soma );
    }
}
