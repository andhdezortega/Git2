
package proyectotrabajo;


public class Laptop extends ProductoElectronico implements ConDescuento {
    private String procesador;
    private int ramGB;
    private boolean esGamer;
    private double precioConDescuento;
    
    public Laptop(String id, String nombre, String marca, double precio, int stock, String procesador, int ramGB, boolean esGamer){
        super(id, nombre, marca, precio, stock);
        this.procesador = procesador;
        this.ramGB = ramGB;
        this.esGamer = esGamer;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Laptop: " + getNombre() + " - " + getMarca() + " - " + getPrecio()+ "€");
    }

    @Override
    public void actualizarPrecio(double porcentaje) {
        setPrecio(getPrecio() * (1 + porcentaje / 100));
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.precioConDescuento = getPrecio() * (1 - porcentaje / 100);
    }

    @Override
    public void mostrarPrecioConDescuento() {
        System.out.println("Precio con descuento: " + precioConDescuento + "€");
    }

    
    
}
