package Aula2410;
import javax.swing.*;

public class parSomaNegativoProduto {
    public static void main(String[] args) {
        int numero;
        int soma = 0;
        int produto = 1;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
            if (numero % 2 == 0) {
                soma += numero;
            } else if (numero % 2 > 0){
                produto *= numero;
            } else {
                System.out.println("Número inváido");
            }
        } while (numero != 0 );
        System.out.println("Prutodo dos ímpares: " + produto);
        System.out.println("Soma dos pares : " + soma);
    }
}
