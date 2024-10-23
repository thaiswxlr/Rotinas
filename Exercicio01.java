package roteiro1.parte2;

import java.util.Scanner;

public class Exercicio01 { 
    double salarioBase;
    int horasExtras;
    double valorHora;
    double salarioTotal;
    Scanner scanner;


public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Digite o salario base");
        double salarioBase = scanner.nextDouble();

        System.out.println("Digite o numero de horas extras trabalhadas:");
        int horasExtras =scanner.nextInt();

        double valorHora = salarioBase / 160;
        double salarioTotal = salarioBase + (horasExtras * valorHora);

        System.out.printf("O salario total e: R$ %.2f%n", salarioTotal);



    }


  }

}
