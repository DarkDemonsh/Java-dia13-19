package dia14act2.Circunferencia;

import java.lang.Math;

public class Circulo {
    
    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCirculo(double radio){
        this.radio = radio;
    }
    
    public double Area(){
        area = Math.pow((radio*(Math.PI)),2);
        return area;
    }
    
    public double perimetro(){
        perimetro = 2*(Math.PI)*radio;
        return perimetro;
    }
    
}
