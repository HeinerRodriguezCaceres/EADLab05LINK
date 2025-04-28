package Ejercicio4;

public class Main {
	public static void main(String[] args) {
        HerramientasListaEnlazada.Node<Integer> head = new HerramientasListaEnlazada.Node<>(5);
        head.siguiente = new HerramientasListaEnlazada.Node<>(10);
        head.siguiente.siguiente = new HerramientasListaEnlazada.Node<>(15);

        int cantidad = HerramientasListaEnlazada.contarNodos(head);
        System.out.println("Cantidad de nodos: " + cantidad);
    }
}
