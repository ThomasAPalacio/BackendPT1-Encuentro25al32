//Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
//Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:

//Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
//Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
//Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
//Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
package Ejercicio_3;

public class Ejercicio_3 {

    public static void main(String[] args) {
        double [] arregloA = new double [50];
        double [] arregloB = new double [20];
        
        ArregloServicios servicio = new ArregloServicios();
        
        servicio.inicializarA(arregloA);
        System.out.println("Muestra arreglo A: ");
        servicio.mostrar(arregloA);
        System.out.println("Ordena el arreglo A de mayor a menor");
        servicio.ordenarA(arregloA);
        servicio.mostrar(arregloA);
        System.out.println("Muestra el arreglo B: ");
        servicio.inicializarB(arregloA, arregloB);
        servicio.mostrar(arregloB);
        
    }
    
}
