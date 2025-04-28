package Ejercicio1;

import java.util.List;

public class UtilidadesLista {
	public static <T> boolean buscarElemento(List<T> lista, T valor) {
        for (T elemento : lista) {
            if (elemento.equals(valor)) {
                return true;
            }
        }
        return false;
    }
}
