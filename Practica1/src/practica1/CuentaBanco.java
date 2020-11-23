/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Perla
 */
public class CuentaBanco {
    private String nombreCliente;
    private String numCuenta;
    private Double interes;
    private Double saldo;
    
    //constructor
    public CuentaBanco(){   
    }
    //constructor con parametros
    public CuentaBanco(String nombreCliente, String numCuenta, Double interes, Double saldo){
        this.nombreCliente=nombreCliente;
        this.numCuenta=numCuenta;
        this.interes=interes;
        this.saldo=saldo;
    }
    //constructor copia
    public CuentaBanco(final CuentaBanco cuentaB){
        this.nombreCliente=cuentaB.nombreCliente;
        this.numCuenta=cuentaB.numCuenta;
        this.interes=cuentaB.interes;
        this.saldo=cuentaB.saldo;
    }
    
    //setters y getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
