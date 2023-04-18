package dia15extra1;

import dia15extra1.newpackage.Cancion;
import java.util.Scanner;

public class Dia15extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cancion c1 = new Cancion("","");
        
        System.out.print("Ingrese el titulo de la cancion: ");
        c1.setTitulo(leer.next());
        System.out.print("Ingrese el autor de la cancion: ");
        c1.setAutor(leer.next());
        
        System.out.println("la cancion: ["+c1.getTitulo()+"] del autor: ["+c1.getAutor()+"] ya esta disponible");
    }
    
}
