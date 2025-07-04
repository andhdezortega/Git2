
package proyectotrabajo;


public class Smartphone extends ProductoElectronico implements ConDescuento {
    private double tamanoPantalla;
    private int capacidad;
    private boolean es5G;
    private double precioConDescuento;
    
    public Smartphone(String id, String nombre, String marca, double precio, int stock, double tamanoPantalla, int capacidad, boolean es5G){
        super(id, nombre, marca, precio, stock);
        this.tamanoPantalla = tamanoPantalla;
        this.capacidad = capacidad;
        this.es5G = es5G;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Smartphone: " + getNombre() + " - " + getMarca() + " - " + getPrecio() + " €");
    }
    @Override
    public void actualizarPrecio(double porcentaje){
        setPrecio(getPrecio() * (1 + porcentaje / 100));
    }
    @Override
    public void aplicarDescuento(double porcentaje){
        this.precioConDescuento = getPrecio() * (1 - porcentaje / 100);
    @Override
    public void mostrarPrecioConDescuento() {
        System.out.println("Precio con descuento: $" + precioConDescuento);
    }
}
