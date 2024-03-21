/*
* 8. Ingresar 10 números por teclado, informar su suma y promedio.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int lengthArray = 10;
        Scanner input = new Scanner(System.in);

        Double[] numbers = new Double[lengthArray];

        // Carga del array.
        for (int i=0; i<numbers.length; i++) {
            Double numero = input.nextDouble();
            numbers[i] = numero;
        }

        Double suma = 0.0;

        // Suma de los números de cada posición en un ACUMULADOR.
        for (int i=0; i<numbers.length; i++) {
            suma = suma + numbers[i];
        }

        // Calculo de promedio.
        Double promedio = (suma/ numbers.length);

        System.out.println("La suma de los números es: "+suma);
        System.out.println("El promedio es: "+promedio);
    }
}