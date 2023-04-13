package dia13act1;

import dia13act1.Libro.EntityLibro;
import java.util.Scanner;

public class Dia13act1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        EntityLibro l1 = new EntityLibro(0,"","",0);

        System.out.println("Ingrese el numero de ISBN");
        l1.setISBN(leer.nextInt());
        
        System.out.println("Ingrese el titulo del libro sin espacios");
        l1.setTitulo(leer.next());
        
        System.out.println("Ingrese el nombre del autor sin espacios");
        l1.setAutor(leer.next());
        
        System.out.println("Ingrese la cantidad de paginas");
        l1.setNpagina(leer.nextInt());
        
        System.out.println("Su numero de ISBN es ["+l1.ISBN+"]");
        System.out.println("El libro |"+l1.titulo+"| del autor |"+l1.autor+"| cuenta con ["+l1.npagina+"] paginas");
        
    }
    
}
