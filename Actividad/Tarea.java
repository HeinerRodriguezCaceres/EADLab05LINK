package Actividad;

public class Tarea implements Comparable<Tarea> {
	private String nombre;
	private int prioridad;
	
	public Tarea (String nombre, int prioridad) {
		this.nombre = nombre;
		this.prioridad = prioridad;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	@Override
    public int compareTo(Tarea otra) {
        return Integer.compare(otra.prioridad, this.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombre='" + nombre + '\'' + ", prioridad=" + prioridad + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tarea)) return false;
        Tarea otra = (Tarea) o;
        return this.nombre.equals(otra.nombre) && this.prioridad == otra.prioridad;
    }
}
