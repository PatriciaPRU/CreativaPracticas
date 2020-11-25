/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.Calculadora;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class Calcular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalculadoraDigital calc=new CalculadoraDigital();
        System.out.print("Ingrese un numero: ");
        String numero1=in.nextLine();
        System.out.print("Ingrese otro numero: ");
        String numero2=in.nextLine();
        if(calc.esNumero(numero1) && calc.esNumero(numero2)){
            int num1=Integer.parseInt(numero1);
            int num2=Integer.parseInt(numero2);
            CalculadoraDigital calcu=new CalculadoraDigital(num1,num2);
            System.out.println("La suma de los numeros es: " + calcu.suma()
                    + "\nLa resta de los numeros es: " + calcu.resta()
                    + "\nLa multiplicacion de los numeros es: " + calcu.multiplicacion()
                    + "\nLa division de los numeros es: " + calcu.division());
        }else{
            System.out.println("Los datos ingresados no son numeros");
        }
    }
}
