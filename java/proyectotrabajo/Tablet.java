
package proyectotrabajo;

public class Tablet extends ProductoElectronico {
    private boolean tieneLapiz;
    private String sistemaOperativo;

    public Tablet(String id, String nombre, String marca, double precio, int stock,
                  boolean tieneLapiz, String sistemaOperativo) {
        super(id, nombre, marca, precio, stock);
        this.tieneLapiz = tieneLapiz;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tablet: " + getNombre() + " - " + getMarca() + " - $" + getPrecio());
    }

    @Override
    public void actualizarPrecio(double porcentaje) {
        setPrecio(getPrecio() * (1 + porcentaje / 100));
    }
}
