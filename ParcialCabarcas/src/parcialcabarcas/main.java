/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialcabarcas;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class main {
    
    //Metodo para multiplicar matrices

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DeclaraMatriz obj=new DeclaraMatriz();
        
        int NumeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas para la primera matriz"));
        obj.setNumeroFilas(NumeroFilas);
        
        int NumeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas para la primera matriz"));
        obj.setNumeroColumnas(NumeroColumnas);
        
        int NumeroFilas2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas para la segunda matriz"));
        obj.setNumeroFilas2(NumeroFilas2);
        
        int NumeroColumnas2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas para la segunda matriz"));
        obj.setNumeroColumnas2(NumeroColumnas2);
        
        JOptionPane.showMessageDialog(null, "Llena la primera matriz");
        for (int i = 0; i <= obj.getNumeroFilas()- 1; i++) {
                        for (int j = 0; j <= obj.getNumeroColumnas()- 1; j++) {
                            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento de la matriz en la posicion [" + i + "," + j + "]"));
                            obj.setMatriz(i, j, dato);
                        }
                    }
        JOptionPane.showMessageDialog(null, "Llena la segunda matriz");
         for (int k = 0; k <= obj.getNumeroFilas2()- 1; k++) {
                        for (int y = 0; y <= obj.getNumeroColumnas2()- 1; y++) {
                            int dato2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento de la matriz en la posicion [" + k + "," + y + "]"));
                            obj.setMatriz(k, y, dato2);
                        }
                    }
         obj.MultiplicarMatriz();
         
    }
    
}
