package dia14act3.Calculo;

public class Operacion { 
    
    private int num;
    private int num1; 
    public int suma;
    public int resta;
    public int multi;
    public int div;
    public int crearOperacion;

    public Operacion(int num, int num1) {
        this.num = num;
        this.num1 = num1;
    }

    public Operacion() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void crearOperacion(int num,int num1){
        this.num = num;
        this.num1 = num1;
    }

    public int sumar(){
       suma = num + num1;
       return suma;
    }
    
    public int resta(){
        resta = num - num1;
        return resta;
    }
    
    public int multiplicacion(){
        if(num == 0 || num1 == 0){
        System.out.println("La multiplicacion no puede ser por 0");
        multi = 0;
        }else{
        multi = num * num1;    
        }
        return multi;
    }
    
    public int divicion(){
        if(num == 0 || num1 == 0){
        System.out.println("La divicion no puede ser por 0");
        div = 0;
        }else{
        div = num / num1;
        }
        return div;
    }

}
