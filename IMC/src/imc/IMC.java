package imc;

import java.util.Scanner;

class Calculo{
    public static double imc(double num1, double num2){
        return num1/(num2 + num2);
    }
}

public class IMC {

    public static void main(String[] args) {
    
    
    int peso;
    double altura;
    
    Scanner ent = new Scanner (System.in);
    
    System.out.println("Entre o seu peso");
    peso = ent.nextInt();
    System.out.println("Entre a sua altura");
    altura = ent.nextInt();
    Calculo.imc(peso, altura);
    
    
    }
}
