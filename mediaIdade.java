package Aula2410;
import javax.crypto.spec.PSource;
import java.util.Random;

public class mediaIdade {
    public static void main(String[] args) {
        Random random = new Random();

        int idade;
        int indice = 0;
        int somaIdades = 0;

        do {
            idade = random.nextInt(101);
            indice++;
            System.out.println("idade: " + idade);
            somaIdades += idade;
        } while (indice <= 150);
        System.out.println("A média de idade é de : " + somaIdades/indice);

    }
}
