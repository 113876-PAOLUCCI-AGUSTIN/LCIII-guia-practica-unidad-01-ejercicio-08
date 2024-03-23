/*
* 8. Ingresar 10 números por teclado, informar su suma y promedio.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cantidadNumerosAingresar = 10;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i < cantidadNumerosAingresar; i++){
            numbers.add(input.nextInt());
        }

        Double sumaTotal = 0.0;
        for (int i =0; i < numbers.size(); i++) {
            sumaTotal += numbers.get(i);
        }

        Double promedio = sumaTotal / cantidadNumerosAingresar;

        System.out.println("La suma de los números es: "+sumaTotal);
        System.out.println("Y el promedio: "+promedio);
    }
}