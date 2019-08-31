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
public class MetodosMatriz {
    
        //Metodo para llenar matrices
    public void LlenarMatriz(int m[][], int nF, int nC) {

        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < nC; j++) {
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición [" + (i + 1) + "," + (j + 1) + "] de la matriz"));
            }
        }
    }

    //Metodo para mostrar matrices
    public void MostrarMatriz(int m[][], int nF, int nC) {

        String resultado = "";
        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < nC; j++) {
                resultado += m[i][j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    //Metodo para multiplicar matrices
    public void MultiplicarMatriz(int m1[][], int m2[][], int mr[][]) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    // aquí se multiplican las matrices
                    mr[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
    }

    
    
}
