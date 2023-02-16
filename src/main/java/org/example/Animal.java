package org.example;

public class Animal {

    private String nombre;
    private String genero;
    private double peso=1;
    private Animal Pareja;

    Animal pareja; {

    }


    public Animal() {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Animal getPareja() {
        return Pareja;
    }

    public void setPareja(Animal pareja) {
        Pareja = pareja;
    }

    public String getGenero() {
        return null;
    }

    public void emcontrarPareja(Animal animal2) {
    }
}











