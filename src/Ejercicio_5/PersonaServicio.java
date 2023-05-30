package Ejercicio_5;

import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public PersonaEntidad crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        
        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        return new PersonaEntidad(nombre, fechaNacimiento);
    }
    
    public int calcularEdad(PersonaEntidad p1) {
        Date fechaActual = new Date();
        int anios = fechaActual.getYear() - p1.getFechaNacimiento().getYear();
        if (p1.getFechaNacimiento().getMonth() > fechaActual.getMonth()
                || (p1.getFechaNacimiento().getMonth() == fechaActual.getMonth() && p1.getFechaNacimiento().getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }
    
     public boolean menorQue(PersonaEntidad p1, int edad) {
        return calcularEdad(p1) < edad;
    }

    public void mostrarPersona(PersonaEntidad p1) {
        System.out.println("Nombre: " + p1.getNombre());
        //System.out.println("Fecha de nacimiento: " + (persona.getFechaNacimiento().getDay()+12) + "/" + (persona.getFechaNacimiento().getMonth()+1) + "/" + (persona.getFechaNacimiento().getYear()+1900));
        System.out.println("Fecha de nacimiento: " + p1.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(p1) + " años");
        System.out.println("A que edad es menor?");
        int menor = leer.nextInt();
        System.out.println("Es menor de " + menor + ": " + menorQue(p1, menor));
    }
    
}
