package roteiro2.parte2;

import javax.swing.JOptionPane;

public class Programa3 {
public static void main(String[] args) {
    
    System.out.println("Informe seu nome:");

    String nome = JOptionPane.showInputDialog("Informe seu nome:");
    JOptionPane.showMessageDialog(null, "Nome informado:" + nome);

    String stridade = JOptionPane.showInputDialog("Informe sua idade:");
    int idade = Integer.parseInt(stridade);
    JOptionPane.showMessageDialog(null, "Idade informada:" + idade);



}

}
