package Ejercicio_extra2;

import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {

        Ahorcado juego1 = new Ahorcado();
        System.out.println("Ingrese la palabra:");
        String cadena = leer.next();
        //Setear longitud del arreglo
        juego1.setLongitud(cadena.length());
        //Pasar el String cadena dentro del arreglo letra por letra
        juego1.setPalabra(cadena.toCharArray());
        System.out.println(juego1.getPalabra());
        System.out.println("Cantidad de jugadas maximas:");
        juego1.setJugadasMax(leer.nextInt());

        return juego1;
    }

    public static void longitud(Ahorcado juego) {

        System.out.println("Longitud de la palabra: " + juego.getLongitud());
    }

    public boolean buscar(Ahorcado juego, String letra) {

        int cont = 0;
        for (int i = 0; i < juego.getLongitud(); i++) {
            //EL VALUEOF CONVIERTE LOS TIPOS DE DATOS A CARACTER (INT, DOUBLE, BOOELAN, ETC)    
            if (letra.equalsIgnoreCase(String.valueOf(juego.getPalabra()[i]))) {
                cont++;
            }
        }
        juego.setLetrasEncontradas(juego.getLetrasEncontradas() + cont);
        if (cont > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void encontradas(Ahorcado juego, String letra) {

        boolean esta = buscar(juego, letra);
        if (esta) {
            System.out.println("Existe la letra en la palabra");
        } else {
            System.out.println("No existe la letra en la palabra");
            juego.setJugadasMax(juego.getJugadasMax() - 1);
        }
    }

    public void intentos(Ahorcado juego) {
        int encontradas = juego.getLetrasEncontradas();
        int restantes = juego.getLongitud() - juego.getLetrasEncontradas();
        System.out.println("Número de letras (encontradas, faltantes): " + encontradas + "," + restantes);
        System.out.println("Intentos restantes: " + juego.getJugadasMax());
    }

    public void juego(Ahorcado juego) {

        System.out.println("Ingrese una letra");
        String letra = String.valueOf(leer.next().charAt(0));
        encontradas(juego, letra);
        intentos(juego);
    }

}
