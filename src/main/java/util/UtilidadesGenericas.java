package util;
import java.util.List;

public class UtilidadesGenericas {

    // 1. Método genérico para imprimir cualquier colección
    public static <T> void imprimirColeccion(List<T> lista) {
        for (T elemento : lista) {
            System.out.println("-> " + elemento);
        }
    }

    // 2. Método genérico para intercambiar dos elementos en un arreglo
    public static <T> void intercambiar(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 3. Método genérico para buscar un elemento
    public static <T> boolean buscarElemento(T[] array, T buscado) {
        for (T elemento : array) {
            if (elemento.equals(buscado)) {
                return true;
            }
        }
        return false;
    }
}