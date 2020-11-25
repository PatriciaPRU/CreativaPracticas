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
public class Tienda extends Descuento{
    private String nombreCli;
    private String producto;
    private Double precio;
    private int cantidad;
    private String area;
    private Double descuento;
    private static Double total;
    
    public Tienda(){
        
    }
    public Tienda(String nom, String pro, double prec, int cant, String areas){
        nombreCli=nom;
        producto=pro;
        precio=prec;
        cantidad=cant;
        area=areas;
    }
    
    public void Compra(){
        Tienda.total=Descuento.evaluarDesc(cantidad, precio, area);
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public static Double getTotal() {
        return total;
    }

    public static void setTotal(Double aTotal) {
        total = aTotal;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
