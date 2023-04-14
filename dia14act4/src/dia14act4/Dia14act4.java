package dia14act4;

import java.util.Scanner;
import dia14act4.Rectangulo;

public class Dia14act4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Rectangulo r1 = new Rectangulo(0,0);
        
        System.out.println("Ingrese la base");
        r1.setBase(leer.nextInt());
        
        System.out.println("Ingrese la altura");
        r1.setAltura(leer.nextInt());
        
        System.out.println("La Superficie del rectangulo es: "+r1.superficie());
        System.out.println("El Perimetro del rectangulo es: "+r1.perimetro());
        
        System.out.println("");
        System.out.println(r1.draw());
        System.out.println("");
    }
    
}
