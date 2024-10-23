package roteiro2.parte4;

import java.util.Scanner;

public class Programa9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] vetorNotas = new int[5];
        int cont = 0;
        
        while (cont < 5) {
            System.out.println("Informe uma nota entre 0 e 10:");
            int nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10) {
                vetorNotas[cont] = nota;  
                cont++;  
            } else {
                System.out.println("Nota inválida! Insira uma nota entre 0 e 10.");
            }
        }

        System.out.println("Notas armazenadas no vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ": " + vetorNotas[i]);
        }
        
        entrada.close(); 
    }
}
