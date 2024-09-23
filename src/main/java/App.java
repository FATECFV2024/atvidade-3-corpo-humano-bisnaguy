package main.java;
import java.util.Locale;
import java.util.Scanner;

public class App {
        
    public static void main(String[] args) throws Exception {
        Scanner escrita = new Scanner(System.in);
        escrita.useLocale(Locale.US);

        CorpoHumano corpo = new CorpoHumano(80,60,50,1.65);

        System.out.println("O corpo tem o volume de "+corpo.getVolume()+", tem a massa de "+corpo.getMassa()+", tem a densidade de "+corpo.getDensidade()+" e por fim tem a altura de "+corpo.getAltura());

        System.out.println("Quanto você pesa? ");
        double peso = escrita.nextDouble();
        corpo.setMassa(peso);
        
        System.out.println("Qual é a sua altura: ");
        double altura = escrita.nextDouble();
        corpo.setAltura(altura);

        System.out.println("Seu IMC é "+corpo.calcularIMC());


        escrita.close();

    }
}
