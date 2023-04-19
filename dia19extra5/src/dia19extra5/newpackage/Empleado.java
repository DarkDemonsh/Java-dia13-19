package dia19extra5.newpackage;

public class Empleado {
    
    public String nombre;
    public int edad;
    public double sal;
    public double aum;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double sal) {
        this.nombre = nombre;
        this.edad = edad;
        this.sal = sal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    
    public void calcular_salario(){
        
        if(edad > 30){
            aum = 10*sal/100;
            sal = sal + aum;
        }else if(edad < 30){
            aum = 5*sal/100;
            sal = sal + aum;
        }
        System.out.println("");
        System.out.println("El salario del empleado mas un "+aum+" de aumento es: "+sal);
        
    }
    
}
