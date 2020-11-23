/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.Producto;

import java.util.Scanner;
import practica2.Calculadora.CalculadoraDigital;

/**
 *
 * @author Perla
 */
public class IngresoProducto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese nombre de producto: ");
        String product=in.nextLine();
        System.out.print("Ingrese categoria: ");
        String cate=in.nextLine();
        System.out.print("Ingrese precio del producto: ");
        Double precio=in.nextDouble();
        Producto produ=new Producto(product,cate,precio);
        System.out.println("El precio total con envio es:" +produ.CalcularEnvio());
    }
}
