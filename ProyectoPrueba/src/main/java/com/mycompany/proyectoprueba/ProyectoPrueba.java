/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoprueba;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class ProyectoPrueba {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int seleccion = 0;
        
        do {
            System.out.println("ESTE ES UN MENU");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.print("INGRESE SU OPCION: ");
            seleccion = entrada.nextInt();
        } while (seleccion != 0);
    }
}
