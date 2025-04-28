package Ejercicio1;

import java.util.Arrays;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	        List<String> listaNombres = Arrays.asList("Ana", "Pedro", "Laura");

	        boolean encontrado = UtilidadesLista.buscarElemento(listaNombres, "Pedro");
	        System.out.println("¿'Pedro' está en la lista? " + encontrado);

	        boolean noEncontrado = UtilidadesLista.buscarElemento(listaNombres, "Maria");
	        System.out.println("¿'María' está en la lista? " + noEncontrado);
	    }
}
