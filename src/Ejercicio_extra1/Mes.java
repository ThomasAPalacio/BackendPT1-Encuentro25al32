package Ejercicio_extra1;

import java.util.Random;
import java.util.Scanner;

public class Mes {

    Random rand = new Random();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = meses[rand.nextInt(12) + 1];

    public Mes() {
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void adivinarMes() {
        String adivine;
        System.out.println("BIENVENIDO");
        System.out.println();
        System.out.println("Adivine el mes secreto... desde enero a diciembre, introduzcalos en minusculas");
        adivine = leer.next();

        do {
            if (adivine == mesSecreto) {
                System.out.println("ACERTASTE!!");
            }

            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mesSecreto = leer.next();

        } while (adivine != mesSecreto);

        System.out.println("ACERTASTE!!");
    }
}
