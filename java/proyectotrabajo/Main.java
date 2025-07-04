package proyectotrabajo;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ProductoElectronico> productos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú TechSolutions ---");
            System.out.println("1. Añadir nuevo producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Aplicar descuento");
            System.out.println("5. Mostrar productos con descuento");
            System.out.println("6. Eliminar por ID");
            System.out.println("7. Actualizar precios");
            System.out.println("8. Calcular inventario total");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> anadirProducto();
                case 2 -> listarProductos();
                case 3 -> buscarPorNombre();
                case 4 -> aplicarDescuento();
                case 5 -> mostrarConDescuento();
                case 6 -> eliminarPorID();
                case 7 -> actualizarPrecios();
                case 8 -> calcularInventario();
            }
        } while (opcion != 0);
    }

    static void anadirProducto() {
        System.out.print("Tipo (1-Smartphone, 2-Laptop, 3-Tablet): ");
        int tipo = sc.nextInt(); sc.nextLine();
        System.out.print("ID: "); String id = sc.nextLine();
        System.out.print("Nombre: "); String nombre = sc.nextLine();
        System.out.print("Marca: "); String marca = sc.nextLine();
        System.out.print("Precio: "); double precio = sc.nextDouble();
        System.out.print("Stock: "); int stock = sc.nextInt(); sc.nextLine();

        switch (tipo) {
            case 1 -> {
                System.out.print("Tamaño pantalla: "); double pantalla = sc.nextDouble();
                System.out.print("Almacenamiento (GB): "); int almacenamiento = sc.nextInt();
                System.out.print("¿Es 5G? (true/false): "); boolean es5G = sc.nextBoolean();
                productos.add(new Smartphone(id, nombre, marca, precio, stock, pantalla, almacenamiento, es5G));
            }
            case 2 -> {
                System.out.print("Procesador: "); String proc = sc.nextLine();
                System.out.print("RAM (GB): "); int ram = sc.nextInt();
                System.out.print("¿Es gamer? (true/false): "); boolean gamer = sc.nextBoolean();
                productos.add(new Laptop(id, nombre, marca, precio, stock, proc, ram, gamer));
            }
            case 3 -> {
                System.out.print("¿Tiene lápiz? (true/false): "); boolean lapiz = sc.nextBoolean(); sc.nextLine();
                System.out.print("Sistema Operativo: "); String so = sc.nextLine();
                productos.add(new Tablet(id, nombre, marca, precio, stock, lapiz, so));
            }
        }
    }

    static void listarProductos() {
        for (ProductoElectronico p : productos)
            p.mostrarInfo();
    }

    static void buscarPorNombre() {
        System.out.print("Nombre a buscar: ");
        String nombre = sc.nextLine().toLowerCase();
        for (ProductoElectronico p : productos)
            if (p.getNombre().toLowerCase().contains(nombre))
                p.mostrarInfo();
    }

    static void aplicarDescuento() {
        System.out.print("ID del producto: ");
        String id = sc.nextLine();
        System.out.print("Porcentaje de descuento: ");
        double porcentaje = sc.nextDouble();

        for (ProductoElectronico p : productos) {
            if (p.getIdProducto().equalsIgnoreCase(id) && p instanceof ConDescuento) {
                ((ConDescuento) p).aplicarDescuento(porcentaje);
                System.out.println("Descuento aplicado.");
                return;
            }
        }
        System.out.println("Producto no encontrado o no elegible.");
    }

    static void mostrarConDescuento() {
        for (ProductoElectronico p : productos) {
            if (p instanceof ConDescuento) {
                p.mostrarInfo();
                ((ConDescuento) p).mostrarPrecioConDescuento();
            }
        }
    }

    static void eliminarPorID() {
        System.out.print("ID del producto a eliminar: ");
        String id = sc.nextLine();
        boolean eliminado = productos.removeIf(p -> p.getIdProducto().equalsIgnoreCase(id));
        if (eliminado) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    static void actualizarPrecios() {
        System.out.print("Porcentaje de aumento de precio: ");
        double porcentaje = sc.nextDouble();
        for (ProductoElectronico p : productos)
            p.actualizarPrecio(porcentaje);
        System.out.println("Precios actualizados.");
    }

    static void calcularInventario() {
        double total = 0;
        for (ProductoElectronico p : productos)
            total += p.getPrecio() * p.getStock();
        System.out.println("Valor total del inventario: $" + total);
    }
}