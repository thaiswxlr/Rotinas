package roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    
        public static void main(String[] args) {
           
           Random random = new Random();
            int numeroSecreto = random.nextInt(100) + 1;
    
            Scanner scanner = new Scanner(System.in);
            int palpite = 0;
    
            while (palpite != numeroSecreto) {
                System.out.print("Adivinhe o número entre 1 e 100: ");
                palpite = scanner.nextInt();
    
                
                if (palpite < numeroSecreto) {
                    System.out.println("Muito baixo! Tente novamente.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("Muito alto! Tente novamente.");
                } else {
                    System.out.println("Parabéns! Você acertou o número!");
                }
            }
            scanner.close();
    }
    



}



