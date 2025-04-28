package Ejercicio3;

public class ListaEnlazadaUtil {
	public static class Node<T> {
		T data;
		Node<T> next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	public static <T> Node<T> insertarAlFinal(Node<T> head, T valor){
		Node<T> nuevoNodo = new Node<>(valor);
		if (head == null) {
			return nuevoNodo;
		}
		Node<T> actual = head;
		while (actual.next != null) {
			actual = actual.next;
		}
		actual.next = nuevoNodo;
		return head;
	}
}
