package roteiro2.parte3;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        while (cont < 5) {
            System.out.println("Infome uma nota: ");
            int nota = entrada.nextInt();

            if (nota >= 7) {
                System.out.println("Aprovado ");
            }
             else {
                System.out.println("Reprovado: ");
             }

             cont++;

        }
        entrada.close(); 
    }


}
