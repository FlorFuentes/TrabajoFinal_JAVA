package ControDePrecios;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrito {
    
    private ArrayList<Producto> productos;

    public Carrito() {
       productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }
    
    
    public void mostrarProductos() {
        for (Producto productos : productos) {
            Scanner sc = new Scanner(System.in);
            String producto = sc.nextLine();
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio compra: " + producto.getPrecioCompra());
            System.out.println("Precio venta: " + producto.getPrecioVenta());
            System.out.println();
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecioVenta();
        }
        return total;
    }
}


