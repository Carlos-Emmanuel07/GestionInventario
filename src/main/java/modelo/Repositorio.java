package modelo;
import java.util.ArrayList;

public class Repositorio<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtenerPorPosicion(int index) {
        if (index >= 0 && index < elementos.size()) {
            return elementos.get(index);
        }
        return null;
    }

    public void eliminar(int index) {
        if (index >= 0 && index < elementos.size()) {
            elementos.remove(index);
        }
    }

    public void mostrarTodos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}