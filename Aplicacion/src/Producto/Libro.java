package Producto;


public  class Libro extends Producto {

    
    private String titulo;
    private String autor;
    private int fechaPublicacion;
    private String editorial;
    private int codigo;

    public Libro(String titulo, String autor, int fechaPublicacion, String editorial, int codigo, double precioCompra, boolean copiaFisica) {
        super(codigo, precioCompra, copiaFisica);
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    
    public String getEditorial() {
        return editorial;
    }

    public double getPrecioVenta() {
        if (isCopiaFisica()) {
            return getPrecioCompra() * 1.18;
        } else {
            return getPrecioCompra() * 1.08;
        }
    }
}

    
 