/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Perla
 */
public class Fibonacci {
    
    public static long posicion47() {
        List<Long> secuencia = new ArrayList<Long>();
        long actual = 1, anterior = actual, posi47 = 0;

        secuencia.add(actual);
        //La formula original es: Fn= Fn-1+Fn-2 donde n hace referencia a la posicion de la secuencia
        for (int i = 2; i <= 47; i++) {
            long nuevo = actual + anterior;
            anterior = actual;
            actual = nuevo;
            secuencia.add(actual);
            if (i == 47) {
                posi47 = actual;
            }
        }
        return posi47;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La posicion 47 de la secuencia es: "+posicion47());
    }
    
}
