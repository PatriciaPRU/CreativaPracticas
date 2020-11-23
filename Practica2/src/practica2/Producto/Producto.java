/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.Producto;

/**
 *
 * @author Perla
 */
public class Producto implements Productos{
    private String nombreProducto;
    private String categoria;
    private Double precio;
    
    //constructores
    public Producto(){
    }
    
    public Producto(String nom, String cat, Double precio){
        this.nombreProducto=nom;
        this.categoria=cat;
        this.precio=precio;
    }
    
    //metodo de la interface
    public Double CalcularEnvio() {
      Double envio=precio+5.00;
      return envio;  
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
