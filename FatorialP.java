import javax.swing.*;

public class FatorialP {
    static void fatP (int n, int x, int f){
        if (x == 0 || x == 1) {
            System.out.println("O fatorial de " + n + " é " + f);
        }
        else {
            fatP(n, x-1, f*x); 
        }
}

public static void main (String args[]){
    
    int num;

    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para saber o fatorial"));

    if (num < 0) {
        System.out.println("O valor é invalido para calculo de fatorial. O valor deve ser maior ou igual a zero");
    }

    else {
        fatP(num, num, 1); // o n e o x recebem o número informado
    }
    System.exit(0);
}

}