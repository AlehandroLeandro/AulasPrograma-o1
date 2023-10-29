package Aula2410;

import javax.swing.*;

public class IntervalosEQuantidades {
    public static void main(String[] args) {
        int valores;
        int cont025 = 0;
        int cont2650 = 0;
        int cont5175 = 0;
        int cont76100 = 0 ;

        do {
            valores = Integer.parseInt(JOptionPane.showInputDialog("Insira os valores para descobrir a que intervalo ele pertence: "));
            if (valores < 0 ) {
                System.out.println("Número negativo identificado, saindo do sistema...");
            }
            else if (valores >= 0 && valores <= 25){
                cont025 ++;
            } else if (valores >=26 && valores <=50) {
                cont2650 ++;
            } else if ( valores >= 51 && valores <=75 ) {
                cont5175 ++;
            } else if ( valores >= 76 && valores <=100 ) {
                cont76100++;
            } else {
                System.out.println("Valor não tem conjunto identificado...");
            }
        } while(valores >= 0);
        System.out.println("COnjunto [0 : 25]: " + cont025);
        System.out.println("COnjunto [26 : 50]: " + cont2650);
        System.out.println("COnjunto [51 : 75]: " + cont5175);
        System.out.println("COnjunto [76 : 100]: " + cont76100);

    }
}
