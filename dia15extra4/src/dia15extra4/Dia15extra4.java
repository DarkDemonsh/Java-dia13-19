package dia15extra4;

import dia15extra4.newpackage.Cuenta;
import java.util.Scanner;

public class Dia15extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta c1 = new Cuenta("");
        
        System.out.println("Ingrese el nombre de la cuenta");
        c1.setTitular(leer.next());
        
        System.out.println("");
        System.out.println("Su dinero en cuenta es: $"+c1.getSaldo());
        
        System.out.println("");
        System.out.println("¿Cuanto dinero desea retirar?");
        c1.setRet(leer.nextDouble());
        
        System.out.println("");
        c1.retirar_dinero();
        
    }
    
}
