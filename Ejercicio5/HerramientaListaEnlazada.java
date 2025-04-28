package Ejercicio5;

public class HerramientaListaEnlazada {
	 public static class Node<T> {
	        T dato;
	        Node<T> siguiente;

	        public Node(T dato) {
	            this.dato = dato;
	            this.siguiente = null;
	        }
	    }

	    public static <T> boolean sonIguales(Node<T> cabeza1, Node<T> cabeza2) {
	        System.out.print("Lista 1: ");
	        imprimirLista(cabeza1);

	        System.out.print("Lista 2: ");
	        imprimirLista(cabeza2);

	        Node<T> actual1 = cabeza1;
	        Node<T> actual2 = cabeza2;

	        while (actual1 != null && actual2 != null) {
	            if (!actual1.dato.equals(actual2.dato)) {
	                return false;
	            }
	            actual1 = actual1.siguiente;
	            actual2 = actual2.siguiente;
	        }

	        return actual1 == null && actual2 == null;
	    }

	    public static <T> void imprimirLista(Node<T> cabeza) {
	        Node<T> actual = cabeza;
	        while (actual != null) {
	            System.out.print(actual.dato + " -> ");
	            actual = actual.siguiente;
	        }
	        System.out.println("null");
	    }
}
