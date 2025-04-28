package Ejercicio5;


public class Main {
	public static void main(String[] args) {
        HerramientaListaEnlazada.Node<Integer> lista1 = new HerramientaListaEnlazada.Node<>(1);
        lista1.siguiente = new HerramientaListaEnlazada.Node<>(2);
        lista1.siguiente.siguiente = new HerramientaListaEnlazada.Node<>(3);

        HerramientaListaEnlazada.Node<Integer> lista2 = new HerramientaListaEnlazada.Node<>(1);
        lista2.siguiente = new HerramientaListaEnlazada.Node<>(2);
        lista2.siguiente.siguiente = new HerramientaListaEnlazada.Node<>(3);

        boolean iguales = HerramientaListaEnlazada.sonIguales(lista1, lista2);
        System.out.println("¿Las listas son iguales? " + iguales);
    }
}
	
