import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int contador = 0, adivinhar = 0;


        int numero = random.nextInt(100)+ 1;
        while (numero != adivinhar){
            System.out.println("Tente adivinhar o numero de 1-100");
            adivinhar = scanner.nextInt();
            if (adivinhar < numero){
                System.out.println("Numero maior");
                contador++;
            } else if (adivinhar > numero) {
                System.out.println("Numero menor");
                contador++;
            }
            else {
                System.out.println("Numero correto!!\n");
            }
        }
        System.out.println("Tentativas necessarias: "+contador);


    }
}