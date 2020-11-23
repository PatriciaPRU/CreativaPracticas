/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre=in.nextLine();
        System.out.print("Ingrese su numero de cuenta: ");
        String numC=in.nextLine();
        System.out.print("Ingrese el tipo de interes: ");
        Double interes=in.nextDouble();
        System.out.print("Ingrese saldo: ");
        Double saldo=in.nextDouble();
        CuentaBanco cuenta=new CuentaBanco(nombre,numC,interes,saldo);
        System.out.println("Nombre del Cliente: " + cuenta.getNombreCliente() 
                            + "\nNumero de cuenta: "+ cuenta.getNumCuenta()
                            +"\nTipo de interes: "+ cuenta.getInteres() 
                            + "\nSaldo de la cuenta: "+ cuenta.getSaldo());
                            
    }
    
}
