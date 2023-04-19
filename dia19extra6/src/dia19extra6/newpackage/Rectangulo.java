package dia19extra6.newpackage;

public class Rectangulo {
    
    public int lado1;
    public int lado2;
    public int area;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area(){
     
        area = lado1 * lado2;
        
        System.out.println("su area es: "+area);
    }
    
}
