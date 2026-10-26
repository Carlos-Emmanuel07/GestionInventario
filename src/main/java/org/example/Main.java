package org.example;

import modelo.*;
import util.UtilidadesGenericas;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE INVENTARIO ===");

        // Probando TDA y Arreglos
        Inventario miInventario = new Inventario(5);
        miInventario.agregarProducto(new Producto("P01", "Laptop Lenovo", 12000.0, 4));
        miInventario.agregarProducto(new Producto("P02", "Mouse Gamer", 450.0, 15));

        System.out.println("\n--- Productos Registrados ---");
        miInventario.mostrarProductos();

        System.out.println("Espacios ocupados: " + miInventario.getEspaciosOcupados());
        System.out.println("Espacios disponibles: " + miInventario.getEspaciosDisponibles());

        // Probando Recursividad
        System.out.println("\n--- Pruebas de Recursividad ---");
        double total = miInventario.calcularValorTotalRecursivo(0);
        System.out.println("Valor total del inventario (recursivo): $" + total);

        Producto encontrado = miInventario.buscarRecursivo("P02", 0);
        System.out.println("Búsqueda recursiva de P02: " + (encontrado != null ? encontrado.getNombre() : "No encontrado"));

        // Probando Repositorio Parametrizado
        System.out.println("\n--- Repositorio Parametrizado <T> ---");
        Repositorio<Producto> repoProductos = new Repositorio<>();
        repoProductos.agregar(new Producto("P03", "Teclado Mecánico", 850.0, 10));
        repoProductos.mostrarTodos();

        // Probando Métodos Genéricos
        System.out.println("\n--- Métodos Genéricos ---");
        List<String> nombres = Arrays.asList("Ana", "Carlos", "Beatriz");
        UtilidadesGenericas.imprimirColeccion(nombres);
    }
}