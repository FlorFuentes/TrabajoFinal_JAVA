package Producto;

 
public abstract class Producto {

    private int codigo;
    private double precioCompra;
    private boolean copiaFisica;

    public Producto(int codigo, double precioCompra, boolean copiaFisica) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.copiaFisica = copiaFisica;
    }

    public int getCodigo() {
        return codigo;
    }

   public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public boolean isCopiaFisica() {
        return copiaFisica;
    }

    public abstract double getPrecioVenta();
}



