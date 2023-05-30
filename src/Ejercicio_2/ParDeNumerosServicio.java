package Ejercicio_2;

public class ParDeNumerosServicio {

    public void mostrarValores(ParDeNumerosEntidad nums) {
        System.out.println("El primer numero random es: ");
        System.out.println(nums.getNum1());

        System.out.println("El segundo numero random es:");
        System.out.println(nums.getNum2());
    }

    public void devolverMayor(ParDeNumerosEntidad nums) {

        if (nums.getNum1() > nums.getNum2()) {
            System.out.println("El numero 1 es mayor que el numero 2");
        } else if (nums.getNum2() > nums.getNum1()) {
            System.out.println("El numero 2 es mayor que el numero 1");
        }
    }

    public void calcularPotencia(ParDeNumerosEntidad nums) {
        double res1, res2;

        res1 = Math.round(nums.getNum1());
        res2 = Math.round(nums.getNum2());

        if (nums.getNum1() > nums.getNum2()) {
            System.out.println(Math.pow(res1, res2));
        } else if (nums.getNum2() > nums.getNum1()) {
            System.out.println(Math.pow(res2, res1));
        }
    }

    public void calculaRaiz(ParDeNumerosEntidad nums) {
        double res1, res2;

        res1 = Math.abs(nums.getNum1());
        res2 = Math.abs(nums.getNum2());

        if (nums.getNum1() < nums.getNum2()) {
            System.out.println(Math.sqrt(res1));
        } else if (nums.getNum2() < nums.getNum1()) {
            System.out.println(Math.sqrt(res2));
        }

    }

}
