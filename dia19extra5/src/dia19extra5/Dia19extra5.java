package dia19extra5;

import java.util.Scanner;
import dia19extra5.newpackage.Empleado;

public class Dia19extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado e1 = new Empleado();
        
        System.out.println("Definir nombre del empleado");
        e1.setNombre(leer.next());
        
        System.out.println("");
        System.out.println("Definir edad del empleado");
        e1.setEdad(leer.nextInt());
        
        System.out.println("");
        System.out.println("Definir sueldo del empleado");
        e1.setSal(leer.nextDouble());
        
        e1.calcular_salario();
    }
    
}
