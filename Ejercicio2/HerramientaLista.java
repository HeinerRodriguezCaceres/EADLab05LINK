package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class HerramientaLista {
	public static <T> List<T> invertirLista(List<T> listaOriginal) {
        List<T> listaInvertida = new ArrayList<>();
        for (T elemento : listaOriginal) {
            listaInvertida.add(0, elemento);
        }
        return listaInvertida;
    }


}
