package dia14act4;

public class Rectangulo {
   
    private int base;
    private int altura;
    private int perimetro;
    private int superficie;
    private int draw;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int perimetro(){
        perimetro = ((base+altura)*2);
        
        return perimetro;
    }
    
    public int superficie(){
        superficie = (base * altura);
        
        return superficie;
    }
    
    public int draw(){
        
        for (int num1 = 0; num1 < altura; num1++){ 
        for (int num2 = 0; num2 < base; num2++){ 
        if((num1 > 1) && (num1 < altura) && (num2 > 1) && (num2 < base)){
            System.out.print(" ");
        }else{
            System.out.print("* ");
        }
        
    }
      System.out.println(" ");
    }
      return draw;
    }
    
}
