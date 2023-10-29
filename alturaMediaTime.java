package Aula2410;

import javax.swing.*;

public class alturaMediaTime {
    public static void main(String[] args) {
        int jogadores = 6;
        int i = 0;
        double altura;
        double somaAlt = 0;
        while (i<= jogadores) {
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de cada jogador:  "));
            somaAlt += altura;
            System.out.println("Altura : " + altura);
            i++;
        }
        System.out.println("Total de altura dos jogadores: " + somaAlt);
        System.out.println("Média de altura dos jogadores: " + somaAlt/jogadores);
    }
}
