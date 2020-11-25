
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.Calculadora;

/**
 *
 * @author Perla
 */
public class CalculadoraDigital extends Calculadora {
    private static int num1;
    private static int num2;
    
    public CalculadoraDigital(){
        
    }
    public CalculadoraDigital(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    //metodo para validar que solo sean numeros
    public boolean esNumero(String num){
        try{
            Integer.parseInt(num);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    //Metodos de la clase abstracta Calculadora
    public static int suma() {
        int result = Calculadora.suma(num1, num2);
        return result;
    }

    public int resta() {
        int result=Calculadora.resta(num1, num2);
        return result;
    }

    public int multiplicacion() {
        int result=Calculadora.multiplicacion(num1, num2);
        return result;
    }
    
    public int division() {
        int result=Calculadora.division(num1, num2);
        return result;
    }

    public static int getNum1() {
        return num1;
    }

    public static void setNum1(int aNum1) {
        num1 = aNum1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int aNum2) {
        num2 = aNum2;
    }

    
}
