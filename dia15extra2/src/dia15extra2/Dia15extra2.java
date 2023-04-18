package dia15extra2;

import dia15extra2.newpackage.Puntos;
import java.util.Scanner;


public class Dia15extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Puntos p1 = new Puntos(0,0,0,0);
        
        System.out.println("Ingrese las coordenadas X e Y del punto 1");
        p1.setX1(leer.nextInt());
        p1.setY1(leer.nextInt());
        
        System.out.println("Ingrese las coordenadas X e Y del punto 2");
        p1.setX2(leer.nextInt());
        p1.setY2(leer.nextInt());
        
        System.out.println("Los puntos: ("+p1.getX1()+","+p1.getY1()+") y ("+p1.getX2()+","+p1.getY2()+") estan a una distancia de: "+p1.calcularPuntos());
        
    }
    
}
