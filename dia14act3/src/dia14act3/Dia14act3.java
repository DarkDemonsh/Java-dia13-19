package dia14act3;

import dia14act3.Calculo.Operacion;
import java.util.Scanner;

public class Dia14act3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Definir numeros");
        Operacion o1 = new Operacion(0,0);
        
        o1.setNum(leer.nextInt());
        o1.setNum1(leer.nextInt());
        
        System.out.println("La suma de los numeros es: "+o1.sumar());
        System.out.println("La resta de los numeros es: "+o1.resta());
        System.out.println("La multiplicacion de los numeros es: "+o1.multiplicacion());
        System.out.println("La division de los numeros es: "+o1.divicion());
    }
    
}