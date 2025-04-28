package Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<String> palabras = Arrays.asList("uno", "dos", "tres", "cuatro");

        List<String> palabrasInvertidas = HerramientaLista.invertirLista(palabras);

        System.out.println("Original: " + palabras);
        System.out.println("Invertida: " + palabrasInvertidas);
    }

}
