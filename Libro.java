/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio17;

/**
 *
 * @author andre
 */
public class Libro extends Publicacion{
    private int paginas;

    public Libro() {
    }

    public Libro(String titulo, double precio,int paginas) {
        super(titulo, precio);
        this.paginas = paginas;
    }
    
    @Override
    public String toString() {
        return "\n-----Libro----"+
                "\n"+super.toString()+
                "\npaginas: " + paginas;
    }
    
}
