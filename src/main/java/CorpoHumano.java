package main.java;

public class CorpoHumano {
    private double massa;
    private double volume;
    private double densidade;
    private double altura;

    public CorpoHumano(double massa, double volume, double densidade, double altura){
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    public void setMassa(double entMassa){
        massa = entMassa;
    }

    public double getMassa(){
        return massa;
    }

    public void setVolume(double entVolume){
        volume = entVolume;
    }
    public double getVolume(){
        return volume;
    }

    public void setDensidade(double entDensidade){
        densidade = entDensidade;
    }
    public double getDensidade(){
        return densidade;
    }

    public void setAltura(double entAltura){
        altura = entAltura;
    }
    public double getAltura(){
        return altura; 
    }
    public double calcularIMC(){
        return massa/ (altura*altura);
    }
}
