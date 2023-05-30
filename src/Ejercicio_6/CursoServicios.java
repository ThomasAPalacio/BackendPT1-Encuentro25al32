package Ejercicio_6;

import java.util.Scanner;

public class CursoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno N°: " + (i + 1));
            System.out.println("Ingrese los nombres de los alumnos:");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public void crearCurso(CursoEntidad c1) {
        System.out.println("Ingrese el nombre del curso:");
        c1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día:");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana:");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno (mañana/tarde):");
        c1.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora");
        c1.setPrecioPorHora(leer.nextInt());
        String[] alumnos = cargarAlumnos();
    }

    public void calcularGananciaSemanal(CursoEntidad c1) {
        int ganancia = (c1.getCantidadDiasPorSemana() * c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * 5);
        
        System.out.println("Su ganancia es: " + ganancia);
    }
}
