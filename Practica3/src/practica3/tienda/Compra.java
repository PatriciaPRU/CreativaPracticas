/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.tienda;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class Compra {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nom=in.nextLine();
        System.out.print("Ingrese nombre del producto: ");
        String pro=in.nextLine();
        System.out.print("Ingrese area del producto: ");
        String are=in.nextLine();
        System.out.print("Ingrese el precio: ");
        double pre=in.nextDouble();
        System.out.print("Cantidad: ");
        int cant=in.nextInt();
        
        
        Tienda tienda=new Tienda(nom,pro,pre,cant,are);
        tienda.Compra();
        double subtotal=Descuento.subtotal;
        System.out.println("\nCliente: " + tienda.getNombreCli()
                + "\nProducto: " + tienda.getProducto()
                + "\nPrecio: " + tienda.getPrecio()
                + "\nCantidad: " + tienda.getCantidad()
                + "\nSubtotal: " + subtotal
                + "\nDescuento: " + Descuento.Descuento5(subtotal)
                + "\nTotal a pagar: " + Tienda.getTotal());
    }
}
