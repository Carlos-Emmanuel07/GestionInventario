package modelo;

public class Inventario {
    private Producto[] productos;
    private int contador;

    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
        contador = 0;
    }

    // Sección 1 y 2: Agregar producto
    public boolean agregarProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
            return true;
        }
        return false; // Arreglo lleno
    }

    // Mostrar productos
    public void mostrarProductos() {
        if (contador == 0) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }

    public int getEspaciosDisponibles() {
        return productos.length - contador;
    }

    public int getEspaciosOcupados() {
        return contador;
    }

    // Sección 3: Métodos Recursivos
    // 1. Calcular valor total del inventario de forma recursiva
    public double calcularValorTotalRecursivo(int index) {
        if (index == contador) {
            return 0;
        }
        double valorActual = productos[index].getPrecio() * productos[index].getCantidad();
        return valorActual + calcularValorTotalRecursivo(index + 1);
    }

    // 2. Búsqueda recursiva de producto por código
    public Producto buscarRecursivo(String codigo, int index) {
        if (index >= contador) {
            return null; // No encontrado
        }
        if (productos[index].getCodigo().equalsIgnoreCase(codigo)) {
            return productos[index];
        }
        return buscarRecursivo(codigo, index + 1);
    }
}

