/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author virgi
 */
public class Stock {
    private int id;
    private int codigo;
    private String marca;
    private String producto;
    private int precio;
    private int stockL;
    private int vendidos;

    public Stock() {
    }

    public Stock(String id,String codigo, String marca, String producto, String precio, String stockL, String vendidos) {
        this.id = Integer.parseInt(id);
        this.codigo = Integer.parseInt(codigo);
        this.marca = marca;
        this.producto = producto;
        this.precio = Integer.parseInt(precio);
        this.stockL = Integer.parseInt(stockL);
        this.vendidos = Integer.parseInt(vendidos);
    }

    public Stock(String codigo, String marca, String producto, String precio, String stockL, String vendidos) {
       
        this.codigo = Integer.parseInt(codigo);
        this.marca = marca;
        this.producto = producto;
        this.precio = Integer.parseInt(precio);
        this.stockL = Integer.parseInt(stockL);
        this.vendidos = Integer.parseInt(vendidos);
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStockL() {
        return stockL;
    }

    public void setStockL(int stockL) {
        this.stockL = stockL;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", codigo=" + codigo + ", marca=" + marca + ", producto=" + producto + ", precio=" + precio + ", stockL=" + stockL + ", vendidos=" + vendidos + '}';
    }

    
    
    
    
}
