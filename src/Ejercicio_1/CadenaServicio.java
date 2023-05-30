package Ejercicio_1;

import java.io.IOException;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CadenaEntidad crearFrase() {

        System.out.print("Ingrese una frase: ");
        String frase = leer.next();

        return new CadenaEntidad(frase);

    }

    public void mostrarVocales(CadenaEntidad oracion) {

        int cont = 0;
        String vocales = "AEIOUaeiou";
        for (int i = 0; i < oracion.getLongitud(); i++) {
            String letra = oracion.getFrase().substring(i, i + 1);

            if (vocales.contains(letra)) {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales son: " + cont);
    }

    public void invertirFrase(CadenaEntidad oracion) {

        String invertida = "";

        for (int i = oracion.getLongitud() - 1; i >= 0; i--) {
            invertida += oracion.getFrase().substring(i, i + 1);
        }
        System.out.println("La frase original es: " + oracion.getFrase());
        System.out.println("La frase invertida es: " + invertida);
    }

    public void vecesRepetido(CadenaEntidad oracion, String letraUsuario) {
        int cont = 0;

        letraUsuario = letraUsuario.toUpperCase();
        String frase = oracion.getFrase().toUpperCase();

        for (int i = 0; i < oracion.getLongitud(); i++) {
            if (frase.substring(i, i + 1).contains(letraUsuario)) {
                cont++;
            }
        }

        System.out.println("La letra " + letraUsuario + " se repitio " + cont + " veces");
    }

    public void compararLongitud(CadenaEntidad oracion, String fraseUsuario) {

        if (oracion.getLongitud() == fraseUsuario.length()) {
            System.out.println("Ambas frases tienen la misma cantidad de caracteres");
        } else {
            System.out.println("Ambas frases no tiene la misma cantidad de caracteres");
        }
    }

    public void unirFrases(CadenaEntidad oracion, String fraseUsuario) {
        String frase = oracion.getFrase();

        frase += fraseUsuario;

        System.out.println("La frase unificada: " + frase);
    }

    public void reemplazar(CadenaEntidad oracion, String letraUsuario) {

        String fraseReem = "";
        String vocales = "Aa";
        for (int i = 0; i < oracion.getLongitud(); i++) {
            String letra = oracion.getFrase().substring(i, i + 1);

            if (vocales.contains(letra)) {
                fraseReem += letraUsuario;
            } else {
                fraseReem += letra;
            }
        }
        System.out.println("La frase quedo: " + fraseReem);
    }

    public boolean contiene(CadenaEntidad oracion, String letraUsuario) {

        boolean res = false;
        for (int i = 0; i < oracion.getLongitud(); i++) {
            String letra = oracion.getFrase().substring(i, i + 1);
            if (letraUsuario.contains(letra)) {
                res = true;
                break;
            }
        }
        return res;
    }

    public void mostrarMenu(CadenaEntidad oracion) {

        String fraseUsuario = "";
        String letraUsuario = "";
        String salir = "";
        int opc;

        do {
            System.out.print("\nMENÚ\n"
                    + "1. Mostrar vocales.\n"
                    + "2. Invertir frase.\n"
                    + "3. Veces repetido.\n"
                    + "4. Comparar longitud.\n"
                    + "5. Unir frases.\n"
                    + "6. Reemplazar.\n"
                    + "7. Contiene.\n"
                    + "8. Salir.\n"
                    + "> ");
            opc = leer.nextInt();
            limpiarPantalla();

            switch (opc) {
                case 1:
                    mostrarVocales(oracion);
                    break;
                case 2:
                    invertirFrase(oracion);
                    break;
                case 3:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = leer.next();
                    vecesRepetido(oracion, letraUsuario);
                    break;
                case 4:
                    System.out.print("Ingresar frase.\n> ");
                    fraseUsuario = leer.next();
                    compararLongitud(oracion, fraseUsuario);
                    break;
                case 5:
                    System.out.print("Ingresar frase.\n> ");
                    fraseUsuario = leer.next();
                    unirFrases(oracion, fraseUsuario);
                    break;
                case 6:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = leer.next();
                    reemplazar(oracion, letraUsuario);
                    break;
                case 7:
                    System.out.print("Ingresar letra.\n> ");
                    letraUsuario = leer.next();
                    System.out.println(contiene(oracion, letraUsuario));
                    break;
                case 8:
                    do {
                        System.out.print("¿Esta seguro que desea salir? S/N\n> ");
                        salir = leer.next();
                        if (salir.equalsIgnoreCase("S")) {
                            limpiarPantalla();
                            System.out.println("¡Hasta pronto!");
                            break;
                        } else if (salir.equalsIgnoreCase("N")) {
                            limpiarPantalla();
                            System.out.println("Volver al menú.");
                            esperarTecla();
                            break;
                        } else {
                            System.out.print("Opción no disponible. Intente nuevamente.\n> ");
                        }
                    } while (true);
                    break;
                default:
                    System.out.print("Opción no disponible. Intente nuevamente.\n> ");
                    break;
            }
        } while (!salir.equalsIgnoreCase("S"));
    }

    public void esperarTecla() {

        boolean esperandoEnter = true;

        System.out.print("\nPresione Enter para continuar.\n> ");

        while (esperandoEnter) {
            try {
                // Leer el siguiente byte del flujo de entrada del sistema
                int entrada = System.in.read();
                // Comprobar si el byte leído es igual al código ASCII de Enter
                if (entrada == '\n') {
                    limpiarPantalla();
                    esperandoEnter = false; // Salir del bucle
                }
            } catch (IOException e) {
            }
        }
    }

    public void limpiarPantalla() {

        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

}
