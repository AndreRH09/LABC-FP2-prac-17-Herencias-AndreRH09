/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio17;

import java.util.*;

public class Ejercicio1 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<Publicacion> p1= new ArrayList<Publicacion>();
        String conf ="y";
        
        while (conf.equals("y")){
            datos(p1);
            
            System.out.print("\nAgregar otra publicacion (y/n): ");
            conf = sc.nextLine();
        }
        imprimir(p1);
    }
    
    public static void datos(ArrayList<Publicacion> p1) {
        
        String titulo;
        double precio;
        
        System.out.print("Ingrese el titulo: ");
        titulo=sc.nextLine();
        System.out.print("Ingrese el precio: ");
        precio=sc.nextDouble();
        sc.nextLine();
        
        Publicacion publi;
        System.out.print("Ingrese el tipo (CD/Libro): ");
        if(sc.next().equalsIgnoreCase("CD")){
            System.out.print("Ingrese los minutos: ");
            publi = new CD(titulo, precio, sc.nextDouble());
            sc.nextLine();
        }
        else{
            System.out.print("Ingrese las paginas: ");
            publi = new Libro(titulo, precio, sc.nextInt());
            sc.nextLine();
        }
        
        p1.add(publi);
    }
    public static void imprimir(ArrayList<Publicacion> p1) {
        System.out.println("\nPublicacion");
        for (Publicacion publicacion : p1) {
            System.out.println(p1.toString());
        }
    }
}
