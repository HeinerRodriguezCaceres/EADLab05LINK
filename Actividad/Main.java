package Actividad;

public class Main {
	public static void main(String[] args) {
        GestorTareas<Tarea> gestor = new GestorTareas<>();

        gestor.agregarTarea(new Tarea("Estudiar para examen", 2));
        gestor.agregarTarea(new Tarea("Preparar presentación", 3));
        gestor.agregarTarea(new Tarea("Ir al gimnasio", 1));

        gestor.eliminarTarea(new Tarea("Ir al gimnasio", 1));

        System.out.println("Tareas actuales:");
        gestor.imprimirTareas();

        System.out.println("\n¿Contiene 'Estudiar para examen'? " +
                gestor.contieneTarea(new Tarea("Estudiar para examen", 2)));

        gestor.invertirTareas();
        System.out.println("\nTareas invertidas:");
        gestor.imprimirTareas();

        Tarea masImportante = gestor.obtenerTareaMasPrioritaria();
        System.out.println("\nTarea más prioritaria: " + masImportante);

        gestor.completarTarea(new Tarea("Estudiar para examen", 2));

        System.out.println("\nTareas pendientes:");
        gestor.imprimirTareas();

        System.out.println("\nTareas completadas:");
        gestor.imprimirTareasCompletadas();
    }
}
