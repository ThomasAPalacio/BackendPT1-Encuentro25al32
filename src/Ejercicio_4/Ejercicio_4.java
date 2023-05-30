//Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, 
//que tenga los siguientes métodos:
//Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
//Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
//el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
//El método debe retornar el objeto Date.
//Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
//de años entre una y otra (edad del usuario).
//Si necesiten acá tienen más información en clase Date: Documentacion Oracle
package Ejercicio_4;

import java.util.Date;

public class Ejercicio_4 {

    public static void main(String[] args) {

        FechaServicios servicio = new FechaServicios();

        Date usuario = servicio.fechaNacimiento();
        Date fechaHoy = servicio.fechaActual();
        //Diferencia por año:
        System.out.println("La diferencia es: ");servicio.fechaDiferencia(usuario, fechaHoy);
        //Diferencia por año comparando la diferencia entre meses y dia:
        System.out.println("Su edad es: " + servicio.fechaDiferencia2(usuario, fechaHoy));
        // Diferencia por segundos:
        System.out.println(servicio.fechaDiferencia3(usuario, fechaHoy));
        
        
    }

}
