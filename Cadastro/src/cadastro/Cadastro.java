package cadastro;

import javax.swing.JOptionPane;

public class Cadastro {

    public static void main(String[] args) {
            int n;
            int n2;
            
            JOptionPane.showMessageDialog(null,"Boa noite meu camarada");
            n = Integer.parseInt(JOptionPane.showInputDialog("Entre um número inteiro: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre outro número inteiro: "));
            JOptionPane.showMessageDialog(null,"o 1° número é: "+n+ "\no 2° número é: " + n2 + "" +
            JOptionPane.INFORMATION_MESSAGE);


                   
    }
    
}
