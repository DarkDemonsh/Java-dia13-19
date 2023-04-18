package dia15extra3.newpackage;

public class Juego {
    
    public int p;
    public int num;
    public int limit = 1;
    public int a;
    public int b;

    public Juego() {
    }

    public Juego(int p) {
        this.p = p;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        b = num+4;
        a = num-4;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
        limit = limit + 1;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
 
    public void iniciarJuego(){

            if(p == num){
              System.out.println("Correcto el numero es: "+num);
            }else if(limit == 4){
               System.out.println("Perdiste, el numero era: "+num);
            }
    } 
    
}
