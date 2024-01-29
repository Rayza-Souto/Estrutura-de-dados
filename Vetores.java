import javax.swing.*;

public class Vetores {

    public static void main(String[] args) {
        // declaração de variáveis e/ou constantes
        int i;
        double[] num = new double[50];
        double media, soma = 0;


        for (i = 0; i < 50; i++) {

            num [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));

            soma += num[i];
        }

        // processamento de dados
        media = soma / 50;

        // saída de resultados
        System.out.println("A média das 50 notas digitadas é: " + media);

        System.exit(1);
    }
}