package Aula2410;

public class TamanhoEIdade {
    public static void main(String[] args) {
        int alturaChico = 150;
        int alturaZe = 110;
        int cresChico = 2;
        int cresZe = 3;
        int tempo = 0;
        System.out.println("Altura Chico: " + alturaChico  + " ---- " + "Altura Zé: " + alturaZe);

        while (alturaZe<=alturaChico) {
            tempo++;
            alturaZe = alturaZe + cresZe;
            alturaChico = alturaChico + cresChico;
            System.out.println(alturaChico + " ---- " + alturaZe + " ---- Anos passados: " + tempo + " anos" );


        }

    }
}
