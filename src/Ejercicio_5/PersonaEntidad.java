package Ejercicio_5;

import java.util.Date;
import java.util.Scanner;

public class PersonaEntidad {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private Date fechaNacimiento;

    public PersonaEntidad() {
    }

    public PersonaEntidad(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

}
