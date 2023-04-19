package dia19extra6;

import dia19extra6.newpackage.Rectangulo;
import java.util.Scanner;

public class Dia19extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        Rectangulo rectangulo1 = new Rectangulo();
        
        System.out.println("definir base del rectangulo");
        r1.setLado1(leer.nextInt());
        
        System.out.println("");
        System.out.println("definir altura del rectangulo");
        r1.setLado2(leer.nextInt());
        
        System.out.println("");
        r1.calcular_area();
        
        System.out.println("");
        System.out.println("");
        System.out.println("El area del rectangulo1");
        rectangulo1.setLado1(4);
        rectangulo1.setLado2(6);
        rectangulo1.calcular_area();
    }
    
}
