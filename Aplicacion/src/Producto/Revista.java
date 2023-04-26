package Producto;

public class Revista  extends Producto{
     private String nombre;
    private int fechaPublicacion;
    private String editor;
    private int codigo;

    public Revista(String nombre, int fechaPublicacion, String editor, int codigo, double precioCompra, boolean copiaFisica) {
        super(codigo, precioCompra, copiaFisica);
        this.editor = editor;
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
   

    public String getNombre() {
        return nombre;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    

    public String getEditor() {
        return editor;
    }

    public double getPrecioVenta() {
        if (isCopiaFisica()) {
            return getPrecioCompra() * 1.22;
        } else {
            return getPrecioCompra() *1.12;
        }
    }
}

