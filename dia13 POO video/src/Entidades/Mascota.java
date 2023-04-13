package Entidades;

public class Mascota {
   
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private String raza;
    private int edad;
    private boolean cola;
    private int energia;
    
    public Mascota(){
       this.energia = 1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Carpincho") || tipo.equals("Conejo")){
            this.tipo = tipo;
        }
        
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, String raza, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.cola = cola;
        this.energia = 1000;
    }
    
    public void setNombre(String nombre){
        if(nombre.length()>0){
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }
    
    public int pasear(int energiaRestar){
       energia -= energiaRestar;
       return energia;
    }
    
    public int pasear(int energiaRestar, int vueltas){
        
        for (int i = 0; i < vueltas; i++){   
        energia -= energiaRestar;
    }
        return energia;
        
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", raza=" + raza + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }
    
}