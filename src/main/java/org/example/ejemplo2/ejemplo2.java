package org.example.ejemplo2;

import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base_imponible = 0;
        final float IVA_General = 0.21f;
        final float IVA_reducido = 0.10f;
        final float IVA_superreducido = 0.04f;

        System.out.println("Dime cual es la base imponible");
        base_imponible = sc.nextFloat();

        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido)");


    }
}
