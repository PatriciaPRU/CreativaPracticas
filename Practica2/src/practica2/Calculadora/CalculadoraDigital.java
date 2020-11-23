
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.Calculadora;

/**
 *
 * @author Perla
 */
public class CalculadoraDigital extends Calculadora {
    private int num1;
    private int num2;
    
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
    public int suma() {
        int result=num1+num2;
        return result;
    }

    public int resta() {
        int result=num1-num2;
        return result;
    }

    public int multiplicacion() {
        int result=num1*num2;
        return result;
    }
    
    public int division() {
        int result=num1/num2;
        return result;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
}
