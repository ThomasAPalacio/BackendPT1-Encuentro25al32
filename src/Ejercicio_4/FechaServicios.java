package Ejercicio_4;

import java.util.Date;
import java.util.Scanner;

public class FechaServicios {

    public Date fechaNacimiento() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("En que año nacio? ");
        int anio = leer.nextInt();
        System.out.println("¿En que numero de mes nacio? ");
        int mes = leer.nextInt();
        System.out.println("¿En que numero de dia nacio? ");
        int dia = leer.nextInt();

        return new Date(anio - 1900, mes - 1, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public void fechaDiferencia(Date fechaNacimiento, Date fechaActual) {

        int res = Math.abs(fechaActual.getYear() - fechaNacimiento.getYear());
        System.out.println("La diferencia es: " + res);

    }

    public int fechaDiferencia2(Date fechaNacimiento, Date fechaActual) {
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() || (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }

    public int fechaDiferencia3(Date fechaNacimiento, Date fechaActual) {
        long diff = fechaActual.getTime() - fechaNacimiento.getTime();
        long diffYears = diff / (24 * 60 * 60 * 1000) / 365; // calcula la diferencia en años
        return (int) diffYears;
    }
    
}
