package ejercicios_tp2;
import java.util.Scanner;

public class Ejercicio_6 {

	private static Scanner input = new Scanner (System.in);

	public static void mejorPromedio() {

		double mejorpromedio = 0;
		String alumnoMejorPromedio= "";
		int contadorAlumno = 0;

		do {

			int promedio;
			String alumno;

			System.out.println("ingrese el nombre completo del alumno");
			alumno = input.nextLine();

			System.out.println("Ingrese el promedio");
			promedio = input.nextInt();
			input.nextLine();

			contadorAlumno++;

			if(promedio > mejorpromedio ) {
				mejorpromedio = promedio;
				alumnoMejorPromedio = alumno;
			}

		} while (contadorAlumno < 10 );

		System.out.println("El mejor promedio le corresponde a " + alumnoMejorPromedio + " " + "y su promedio es de "+ mejorpromedio);

	}

	public static void main(String[] args) {

		mejorPromedio();

	}

}
