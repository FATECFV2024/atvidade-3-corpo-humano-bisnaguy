package main.java;
import java.util.Locale;
import java.util.Scanner;

public class App {
        
    public static void main(String[] args) throws Exception {
        Scanner escrita = new Scanner(System.in);
        escrita.useLocale(Locale.US);

        CorpoHumano c1 = new CorpoHumano(80,60,50,1.65);

        System.out.println("O corpo tem o volume de "+c1.getVolume()+", tem a massa de "+c1.getMassa()+", tem a densidade de "+c1.getDensidade()+" e por fim tem a altura de "+c1.getAltura());

        System.out.println("Quanto você pesa? ");
        double peso = escrita.nextDouble();
        c1.setMassa(peso);
        
        System.out.println("Qual é a sua altura: ");
        double altura = escrita.nextDouble();
        c1.setAltura(altura);

        System.out.println("Seu IMC é "+c1.calcularIMC());

        escrita.close();

    }
}
