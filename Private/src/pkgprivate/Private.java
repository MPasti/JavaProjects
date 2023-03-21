
package pkgprivate;
import java.text.DecimalFormat;
import java.util.Scanner;

class Calculo{
    public static double imc(double num1, double num2){
        return num1/(num2 + num2);
    }
}

public class Private {


    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
    
        Pessoa p1 = new Pessoa("Pedro", 21);
        Pessoa p2 = new Pessoa("Renato", 25);
      
      
  //  System.out.println("Entre sua data de nascimento");
  //  p1.data_nasc = ent.next();
  //  System.out.println("Entre o seu peso");
  //  p1.peso = ent.nextDouble();
  //  System.out.println("Entre a sua altura");
  //  p1.altura = ent.nextDouble();
  // System.out.println("IMC = " + formatador.format(Calculo.imc(p1.peso, p1.altura))+ "kg/m2.");   
    p1.status();
    p2.status();
    }
    
}
