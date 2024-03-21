/*
* 8. Ingresar 10 números por teclado, informar su suma y promedio.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double sumaTotal = 0.0;
        Integer cantNumerosIngresados = 10;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < cantNumerosIngresados; i++) {
            sumaTotal = sumaTotal + input.nextDouble();
        }
        Double  promedio = sumaTotal / cantNumerosIngresados;
        System.out.println("La suma de los números es: "+sumaTotal);
        System.out.println("Y el promedio: "+promedio);
    }
}