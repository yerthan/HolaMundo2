package org.example;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        float nota1 ;
        float nota2;
        float notamedia;

        System.out.println("Dime cual ha sido tu nota del primer control");
        nota1 = sc.nextFloat();

        System.out.println("Dime cual ha sido la segunda nota");
        nota2 = sc.nextFloat();

        notamedia = (nota1+nota2)/2;
        if(notamedia < 10){
            System.out.println("Cual ha sido el resultado de la recuperacion");
            sc.nextLine();
            String resultado = sc.nextLine().toUpperCase();
                if (resultado == "Apto"){
                    System.out.println("Tu nota de Programacion es de 5");
                }
                else {
                    System.out.println("Suspenso");
                }
        }


    }
}