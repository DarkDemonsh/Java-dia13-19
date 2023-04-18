package dia14act4.newpackage;

public class Rectangulo {
   
    private int base;
    private int altura;
    private int perimetro;
    private int superficie;

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
    
    public String draw(){
      String rec [][] = new String [altura][base];
      
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
            
                rec[i][j] = "";
                
          }
        }
      
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
                
                System.out.print(rec[i][j]+"* ");
                
            }
            System.out.println("");
        }
        return "";
    }
    
}
