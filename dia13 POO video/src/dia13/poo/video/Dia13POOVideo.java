package dia13.poo.video;

import Entidades.Mascota;
import java.util.Scanner;

public class Dia13POOVideo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Duko", leer.next(), "Perro");
                
        m1.setNombre("Rafa");
        
        m1.pasear(100);
        
        System.out.println(m1);
             
    }

}
