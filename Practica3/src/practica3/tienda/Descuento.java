/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.tienda;

/**
 *
 * @author Perla
 */
public abstract class Descuento {
    public static double subtotal;
    
    public static double evaluarDesc(int cant, double precio, String cat){
        subtotal = cant * precio;
        if (cat.contains("frutas")||cat.contains("verduras")||cat.contains("carnes")) {

            if (subtotal >= 20 && subtotal < 50) {
                double desc = Descuento.Descuento5(subtotal);
                double total = subtotal - desc;
                return total;
            }else if (subtotal >= 50) {
                double desc = Descuento.Descuento7(subtotal);
                double total = subtotal - desc;
                return total;
            }else{
                return subtotal;
            }
        }else{
            return subtotal;
        }
    }
    
    public static double Descuento5(double cant){
        double desc=cant*0.05;
        return desc;
    }
    public static double Descuento7(double cant){
        double desc=cant*0.07;
        return desc;
    }
}
