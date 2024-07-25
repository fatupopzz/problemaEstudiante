public class Semestre {
	private Asignatura[] asignaturas = new Asignatura[5];
	// organiza las asiganturas en un array
	public void setAsignatura(int index, Asignatura asignatura) {
		if (index >= 0 && index < 5) {
			asignaturas[index] = asignatura;
		}
	}
	//calcula el promedio general asignando una suma
	public double calcularPromedioGeneral() {
		double suma = 0;
		for (Asignatura asignatura : asignaturas) {
			suma += asignatura.getPromedio();
		}
		return suma / asignaturas.length;
	}
	//da el mejor promedio del usuario
	public Asignatura obtenerMejorClase() {
		Asignatura mejor = asignaturas[0];
		for (Asignatura asignatura : asignaturas) {
			if (asignatura.getPromedio() > mejor.getPromedio()) {
				mejor = asignatura;
			}
		}
		return mejor;
	}
	//muestra cuando el promedio es menor a 10
	public void mostrarAlertas() {
		for (Asignatura asignatura : asignaturas) {
			if (asignatura.getPromedio() < 10) {
				System.out.println("Alerta: El promedio de " + asignatura.getNombre() + " es menor que 10.");
			}
		}
	}
	//muestra todas las asignaturas
	public void mostrarAsignaturas() {
		for (Asignatura asignatura : asignaturas) {
			System.out.println(asignatura.getNombre() + ": " + asignatura.getPromedio());
		}
	}
}