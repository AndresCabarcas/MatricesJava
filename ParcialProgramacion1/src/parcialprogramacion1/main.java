/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialprogramacion1;

import java.util.Scanner;

/**
 *
 * @author ANDACAMES
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de filas de la primer matriz: ");
        int f1 = sc.nextInt();
        System.out.println("Introduce el numero de columnas de la primer matriz: ");
        int c1 = sc.nextInt();
        System.out.println("Introduce el numero de filas de la segunda matriz: ");
        int f2 = sc.nextInt();
        System.out.println("Introduce el numero de columnas de la segunda matriz: ");
        int c2 = sc.nextInt();
        System.out.println("---Datos ingresados---");
        System.out.println("-- Matriz 1 de: " + f1 + "x" + c1 + " --");
        System.out.println("-- Matriz 2 de: " + f2 + "x" + c2 + " --");
        System.out.println("----------------------");
        if (c1 == f2) {
            int[][] m1 = new int[f1][c1];
            int[][] m2 = new int[f2][c2];
            int[][] mR = new int[f1][c2];
            System.out.println("-> Comineza matriz 1");
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.println("Introduce el valor del elemento " + i + "," + j + ": ");
                    m1[i][j] = sc.nextInt();
                }
            }
            //Matriz 1
            System.out.println("Matriz 1");
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println("");
            }
            //Matriz 2
            System.out.println("-> Comienza matriz 2");
            for (int i = 0; i < f2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.println("Introduce el valor del elemento " + i + "," + j + ": ");
                    m2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matriz 2");
            for (int i = 0; i < f2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println("");
            }
            //Matriz Resultante
            System.out.println("-- Matriz Resultante --");
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int h = 0; h < c1; h++) {
                        mR[i][j] += m1[i][h] * m2[h][j];
                    }
                    System.out.print(mR[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("No se puede realizar la operación");
        }

    }
}