package Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class CarritoCompra {
    
    private ArrayList<Producto> productos;

    public CarritoCompra() {
       productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }
    
    
    public void mostrarProductos() {
        for (Producto producto : productos) {
            Scanner sc= new Scanner(System.in);
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


