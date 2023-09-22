/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.limon.ui;

import java.util.Scanner;

/**
 * El programa lee al derecho y al revés una oración, determina si es palindromo o no.
 * @author Paola Figueroa Higuera
 */
public class Main {

   public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la oración: ");
        String oracion = entrada.nextLine();
      
     String nuevaOracion = oracion.replace(",", "").replace(" ", "").toLowerCase();
     String leer = new StringBuilder(nuevaOracion).reverse().toString();
     
     if (nuevaOracion.equals(leer)) {
            System.out.println("La oración es un palíndromo.");
        } else {
            System.out.println("La oración no es un palíndromo.");
        }
     
}
}