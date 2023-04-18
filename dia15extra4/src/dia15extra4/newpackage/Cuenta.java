package dia15extra4.newpackage;

public class Cuenta {
   
    private double saldo = 1000;
    private String titular;
    private double ret;

    public Cuenta() {
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double getRet() {
        return ret;
    }

    public void setRet(double ret) {
        this.ret = ret;
    }
    
    public void retirar_dinero(){
        
        if(ret > saldo){
            System.out.println("Insuficientes fondos");
        }else{
            System.out.println("...Retirando dinero...");
            
            saldo = saldo - ret;
            
            System.out.println("");
            System.out.println("Saldo restante $"+saldo);
        }
        
    }
    
    
}
