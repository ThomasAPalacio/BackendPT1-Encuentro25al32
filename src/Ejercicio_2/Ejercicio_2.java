//Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales 
//con los cuales se realizarán diferentes operaciones matemáticas. La clase debe 
//tener un constructor vacío, getters y setters.  En el constructor vacío se usará 
//el Math.random para generar los dos números. Crear una clase ParDeNumerosService, 
//en el paquete Servicios, que deberá además implementar los siguientes métodos:
//
//Método mostrarValores que muestra cuáles son los dos números guardados.
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
//Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
//Previamente se deben redondear ambos valores.
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular 
//la raíz cuadrada se debe obtener el valor absoluto del número.
package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ParDeNumerosServicio servicio = new ParDeNumerosServicio();
        ParDeNumerosEntidad nums = new ParDeNumerosEntidad();

        int menu = -1;
        do {
            System.out.println("");
            System.out.println("1. Mostrar valores");
            System.out.println("2. Devolver mayor");
            System.out.println("3. Calcular potencia");
            System.out.println("4. Calcular raiz");
            System.out.println("0. SALIR");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    servicio.mostrarValores(nums);
                    break;
                case 2:
                    servicio.devolverMayor(nums);
                    break;
                case 3:
                    servicio.calcularPotencia(nums);
                    break;
                case 4:
                    servicio.calculaRaiz(nums);
                    break;
                default:
                    System.out.println("Opcion no valida...");
            }
        } while (menu != 0);

    }

}
