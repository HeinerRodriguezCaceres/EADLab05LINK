package Actividad;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas<T extends Comparable<T>> {
	private Node<T> head;
    private List<T> tareasCompletadas = new ArrayList<>();

    public void agregarTarea(T tarea) {
        Node<T> nuevo = new Node<>(tarea);
        if (head == null) {
            head = nuevo;
        } else {
            Node<T> actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = nuevo;
        }
    }

    public boolean eliminarTarea(T tarea) {
        if (head == null) return false;
        if (head.data.equals(tarea)) {
            head = head.next;
            return true;
        }

        Node<T> actual = head;
        while (actual.next != null && !actual.next.data.equals(tarea)) {
            actual = actual.next;
        }

        if (actual.next == null) return false;

        actual.next = actual.next.next;
        return true;
    }

    public boolean contieneTarea(T tarea) {
        Node<T> actual = head;
        while (actual != null) {
            if (actual.data.equals(tarea)) return true;
            actual = actual.next;
        }
        return false;
    }

    public void imprimirTareas() {
        Node<T> actual = head;
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.next;
        }
    }

    public int contarTareas() {
        int count = 0;
        Node<T> actual = head;
        while (actual != null) {
            count++;
            actual = actual.next;
        }
        return count;
    }

    public T obtenerTareaMasPrioritaria() {
        if (head == null) return null;

        Node<T> actual = head;
        T max = actual.data;

        while (actual != null) {
            if (actual.data.compareTo(max) > 0) {
                max = actual.data;
            }
            actual = actual.next;
        }
        return max;
    }

    public void invertirTareas() {
        Node<T> anterior = null;
        Node<T> actual = head;
        Node<T> siguiente;

        while (actual != null) {
            siguiente = actual.next;
            actual.next = anterior;
            anterior = actual;
            actual = siguiente;
        }
        head = anterior;
    }

    public boolean completarTarea(T tarea) {
        if (eliminarTarea(tarea)) {
            tareasCompletadas.add(tarea);
            return true;
        }
        return false;
    }

    public void imprimirTareasCompletadas() {
        for (T tarea : tareasCompletadas) {
            System.out.println(tarea);
        }
    }

}
