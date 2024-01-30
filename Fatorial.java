import javax.swing.*;

public class Fatorial {

    static int fat (int n){

        int f;

        if (n == 0){
            return 1;
        }
        else {
            f = n * fat(n-1);
            return f;
        }

    }

    public static void main (String args[]){

        int f, num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber o fatorial"));

        if (num < 0) {
            System.out.println("O valor é invalido para calculo de fatorial. O valor deve ser maior ou igual a zero");
            System.exit(0);
        }

        else {
            f = fat(num);
            System.out.println("O fatorial de " + num + " é " + f);
        }
        System.exit(0);

    }

}