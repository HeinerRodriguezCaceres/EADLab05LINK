package Ejercicio3;

public class Main {
	public static void main(String[] args) {
		
		ListaEnlazadaUtil.Node<Integer> head = null;
		
		head = ListaEnlazadaUtil.insertarAlFinal(head, 10);
		head = ListaEnlazadaUtil.insertarAlFinal(head, 20);
		head = ListaEnlazadaUtil.insertarAlFinal(head, 30);
		
		ListaEnlazadaUtil.Node<Integer> actual = head;
		while (actual != null) {
			System.out.print(actual.data + " ");
			actual = actual.next;
		}
	}

}
