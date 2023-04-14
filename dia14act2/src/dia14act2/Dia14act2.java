package dia14act2;

import dia14act2.Circunferencia.Circulo;
import java.util.Scanner;

public class Dia14act2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo");
        Circulo c1 = new Circulo(leer.nextInt());
        
        System.out.println("Circunferencia: "+c1.getRadio()+"; area: "+c1.Area()+"; perimetro: "+c1.perimetro());
        
    }
    
}
