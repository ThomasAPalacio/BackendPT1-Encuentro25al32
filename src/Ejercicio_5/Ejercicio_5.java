//Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y 
//una fecha de nacimiento, (Tipo Date), constructor vacío, constructor parametrizado, get y set.  
//Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:

//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
//Retornar el objeto Persona creado.
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento 
//y la fecha actual.
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor 
//que la edad consultada o false en caso contrario.
//Método mostrarPersona que muestra la información de la persona deseada.

package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PersonaServicio servicio = new PersonaServicio();
        PersonaEntidad p1 = servicio.crearPersona();
        
        servicio.mostrarPersona(p1);
        
    }
}
