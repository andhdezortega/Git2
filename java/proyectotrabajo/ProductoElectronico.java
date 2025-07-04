package proyectotrabajo;

public abstract class ProductoElectronico {
    private String idProducto;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;
    
    public ProductoElectronico(String idProducto, String nombre, String marca, double precio, int stock){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    //getters y setters

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public abstract void mostrarInfo();
    public abstract void actualizarPrecio(double porcentaje);
    
}