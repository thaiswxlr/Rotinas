package roteiro2.parte4;

import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] vetorNotas = new int[5];
        
     
        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Informe uma nota:");
            int nota = entrada.nextInt();
            vetorNotas[cont] = nota;
        }

       
        System.out.println("Notas armazenadas no vetor:");
        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Nota " + (cont + 1) + ": " + vetorNotas[cont]);
        }
        
        entrada.close(); 
}

}
