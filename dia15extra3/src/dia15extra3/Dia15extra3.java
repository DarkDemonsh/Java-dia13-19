package dia15extra3;

import dia15extra3.newpackage.Juego;
import java.util.Scanner;

public class Dia15extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Juego j1 = new Juego(0);
        
        System.out.print("Jugador 1 ingresa numero a adivinar: ");
        j1.setNum(leer.nextInt());
        
        System.out.println("");
        System.out.print("PISTA, tu numero esta entre "+j1.getA()+" y "+j1.getB());
        System.out.println("");
        System.out.println("Jugador 2 adivine el numero");
        System.out.println("");
        
        do{
        System.out.println("Intento "+j1.limit+"/3");    
        j1.setP(leer.nextInt());
        if(j1.getNum() == j1.getP()){
        break;
        }
        }while(j1.limit != 4);
        
        System.out.println("");
        j1.iniciarJuego();
        
    } 
    
}
