package Ejercicio4;

public class HerramientasListaEnlazada {
    public static class Node<T> {
        T dato;
        Node<T> siguiente;

        public Node(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    public static <T> int contarNodos(Node<T> cabeza) {
        int total = 0;
        Node<T> actual = cabeza;

        while (actual != null) {
            total++;
            actual = actual.siguiente;
        }

        return total;
    }
}

