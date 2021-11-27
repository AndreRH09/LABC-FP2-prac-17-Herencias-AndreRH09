/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio17;

public class Publicacion {
    private String titulo;
    private double precio;
    
    private int cantidad=0;

    public Publicacion() {
    }
    public Publicacion(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo 
                + "\nPrecio: " + precio;
    }
    
    
}
