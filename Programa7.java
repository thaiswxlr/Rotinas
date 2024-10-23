package roteiro2.parte3;

import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int somaNotas = 0;
        int contNotas = 0;
        int[] notas = new int[5]; 


        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe uma nota (ou 0 para encerrar): ");
            int nota = entrada.nextInt();

           
            if (nota == 0) {
                System.out.println("Entrada de notas encerrada.");
                break;
            }

            
            notas[contNotas] = nota; 
            somaNotas += nota;
            contNotas++;

            
            if (nota >= 7) {
                System.out.println("Aprovado.");
            } else {
                System.out.println("Reprovado.");
            }
        }

        
        if (contNotas > 0) {
            double media = (double) somaNotas / contNotas; 
            System.out.println("A média das notas é: " + media);

            
            int notasAcimaMedia = 0;
            for (int i = 0; i < contNotas; i++) {
                if (notas[i] > media) {
                    notasAcimaMedia++;
                }
            }

            
            System.out.println("Quantidade de notas acima da média: " + notasAcimaMedia);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        entrada.close();
    }
}
