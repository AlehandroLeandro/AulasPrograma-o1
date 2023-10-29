package Aula2410;
import javax.crypto.spec.PSource;
import javax.swing.*;
import java.util.Random;

public class tabuada {
    public static void main(String[] args) {

        int numTabuada = Integer.parseInt(JOptionPane.showInputDialog("Número que deseja saber tabuada"));
        int indice = 0;
        int produto;

        while(indice<=10) {
            produto = indice * numTabuada;
            System.out.println(indice + " X " + numTabuada + " = " + produto);
            indice++;
        }
    }
}
