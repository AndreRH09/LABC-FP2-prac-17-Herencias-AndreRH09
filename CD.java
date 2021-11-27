/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio17;

public class CD extends Publicacion{
    private double minutos;

    public CD(String titulo, double precio,double minutos) {
        super(titulo, precio);
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "\n-----CD----" +
                "\n"+super.toString()+
                "\nminutos: " + minutos;
    }
    
}
