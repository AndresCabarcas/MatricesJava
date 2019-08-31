/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosMatriz obj= new MetodosMatriz();
        
                int nF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas para la primera matriz"));
        while (nF < 2) {
            JOptionPane.showMessageDialog(null, "Error, valor debe ser mayor a 1");
            nF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas para la primera matriz"));
        }
        int nC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas para la primera matriz"));
        while (nC < 2) {
            JOptionPane.showMessageDialog(null, "Error, valor debe ser mayor a 1");
            nC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas para la primera matriz"));
        }
        int nF2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas para la segunda matriz"));
        while (nF2 < 2) {
            JOptionPane.showMessageDialog(null, "Error, valor debe ser mayor a 1");
            nF2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas para la segunda matriz"));
        }
        int nC2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas para la segunda matriz"));
        while (nC2 < 2) {
            JOptionPane.showMessageDialog(null, "Error, valor debe ser mayor a 1");
            nC2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas para la segunda matriz"));
        }
        if (nC != nF2) {
            JOptionPane.showMessageDialog(null, "No se pueden multiplicar las matrices");
        } else {
            int m1[][] = new int[nF][nC];
            int m2[][] = new int[nF2][nC2];
            int mr[][] = new int[nF][nC2];
            
            JOptionPane.showMessageDialog(null, "Llena la primera matriz");
            obj.LlenarMatriz(m1, nF, nC);
            JOptionPane.showMessageDialog(null, "Llena la segunda matriz");
            obj.LlenarMatriz(m2, nF2, nC2);
            JOptionPane.showMessageDialog(null, "La primera matriz creada fue...");
            obj.MostrarMatriz(m1, nF, nC);
            JOptionPane.showMessageDialog(null, "La segunda matriz creada fue...");
            obj.MostrarMatriz(m2, nF2, nC2);
            JOptionPane.showMessageDialog(null, "La matriz resultante es...");
            obj.MultiplicarMatriz(m1, m2, mr);
            obj.MostrarMatriz(mr, nF, nC2);
        }
    }
 }
    

