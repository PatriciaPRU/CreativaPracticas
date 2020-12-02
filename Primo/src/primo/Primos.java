/*
 * Segun la informacion la teoria del numero 73 cumple con lo siguiente
 * El numero 73 es el 21er numero primo, la reversa de 73 es 37 el cual tambien es primo
 * 37 es el 12o numero primo y es la reversa de la posicion de 73 quien al multiplicarse sus cifras
 * devuelve el valor de su posicion
 */
package primo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Perla
 */
public class Primos {
    private int numPrimo;
    private int posicion;
    
    public Primos(){
        
    }
    public Primos(int num, int posi){
        numPrimo=num;
        posicion=posi;
    }
    
    //Metodo para listar los numeros primos de 1 a 1000000
    public List<Primos> listarPrimos(){
        //div=divisibles I=iteracion con=contador posi=posicion
        int div=0, I, con, posi=0;
        List<Primos> listaPrimos=new ArrayList<Primos>();
        for (con = 2; con <= 100000; con++) {
            for (I = 1; I <= con; I++) {
                if ((con % I) == 0) {
                    div++;
                }
            }
            if (div <= 2) {
                posi++;
                Primos primo=new Primos(con,posi);
                listaPrimos.add(primo);
            }
            div = 0;
        }
        return listaPrimos;
    }
    //Metodo que devuelve reversa del numero
    public int reversa(int num){
        int reversa = 0;

        while(num != 0) {
            int digito = num % 10;
            reversa = reversa * 10 + digito;
            num /= 10;
        }
        return reversa;
    }
    
    //Verifica si la reversa existe en la secuencia de numeros primos
    public boolean existe(Collection<Primos> c, int num, int pos) {
        for (Primos p : c) {
            if (p != null && p.getNumPrimo() == num && p.getPosicion() == pos) {
                return true;
            }
        }
        return false;
    }
    
    // Metodo que multiplica los digitos del numero
    public int multiplicarDigitos(int num){
        String mulNum=String.valueOf(num);
        String[] splitNum=mulNum.split("(?<=.)");
        int multi=1;
        for(int i = 0; i < splitNum.length; i++) {
            int digito=Integer.parseInt(splitNum[i]);
            multi=multi*digito;
        }
        return multi;
    }
    
    //Metodo para determinar los numeros que son Primos de Sheldon en la secuencia
    public void primoSheldon(){
        List<Primos> listaPrimos=listarPrimos();
        Primos primo;
        Iterator iter = listaPrimos.iterator();
        
        while (iter.hasNext()) {
            primo = (Primos) iter.next();
            if(primo.numPrimo >= 10) {
                int reverNum = reversa(primo.numPrimo);
                int reverPosi = reversa(primo.posicion);
                if (existe(listaPrimos, reverNum, reverPosi)) {
                    int multi=multiplicarDigitos(primo.numPrimo);
                    if(multi==primo.posicion){
                        System.out.println("Los primos de Sheldon son:");
                        System.out.println(primo.numPrimo);
                    }
                }
            }
        }
    }
    public int getNumPrimo() {
        return numPrimo;
    }

    public void setNumPrimo(int numPrimo) {
        this.numPrimo = numPrimo;
    }
    
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
