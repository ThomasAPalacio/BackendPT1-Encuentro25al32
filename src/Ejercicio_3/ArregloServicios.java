package Ejercicio_3;

import java.util.Arrays;
import java.util.Random;

public class ArregloServicios {

    Random rand = new Random();

    public void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = rand.nextDouble(10) + 1;
        }
    }

    public void mostrar(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print(" [" + arregloA[i] + "] ");
        }
        System.out.println("");
    }

    //for (int i = 0; i < arregloX.length / 2; i++) {
    //  double temp = arregloX[i];
    //  arregloX[i] = arregloX[arregloX.length - 1 - i];
    //  arregloX[arregloX.length - 1 - i] = temp;
    //}
    public void ordenarA(double[] arregloA) {
        Arrays.sort(arregloA);

        double[] copiaArreglo = arregloA;

        for (int i = 0; i < copiaArreglo.length / 2; i++) { // Va de las puntas al medio para ordenarlos
            double aux = copiaArreglo[i];
            copiaArreglo[i] = copiaArreglo[copiaArreglo.length - 1 - i];
            copiaArreglo[copiaArreglo.length - 1 - i] = aux;
        }
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);
    }

}
