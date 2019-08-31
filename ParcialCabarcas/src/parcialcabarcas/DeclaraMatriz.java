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
public class DeclaraMatriz {
    
    int NumeroFilas;
    int NumeroColumnas;
    int NumeroFilas2;
    int NumeroColumnas2;
    int matriz1[][];
    int matriz2[][];
    int matrizr[][];
    
    
    public DeclaraMatriz(){
    
    NumeroFilas=0;
    NumeroColumnas=0;
    NumeroFilas2=0;
    NumeroColumnas2=0;
    matriz1=null;
    matriz2=null;
    matrizr=null;
    
    }

    public int getNumeroFilas() {
        return NumeroFilas;
    }

    public void setNumeroFilas(int NumeroFilas) {
        this.NumeroFilas = NumeroFilas;
    }

    public int getNumeroColumnas() {
        return NumeroColumnas;
    }

    public void setNumeroColumnas(int NumeroColumnas) {
        this.NumeroColumnas = NumeroColumnas;
    }

    public int getNumeroFilas2() {
        return NumeroFilas2;
    }

    public void setNumeroFilas2(int NumeroFilas2) {
        this.NumeroFilas2 = NumeroFilas2;
    }

    public int getNumeroColumnas2() {
        return NumeroColumnas2;
    }

    public void setNumeroColumnas2(int NumeroColumnas2) {
        this.NumeroColumnas2 = NumeroColumnas2;
    }
    
    public void CrearMatriz(){
    
    int matriz1[][] = new int[NumeroFilas][NumeroColumnas];
    int matriz2[][] = new int[NumeroFilas2][NumeroColumnas2];
    int matrizr[][] = new int[NumeroFilas][NumeroColumnas2];
    
    }
    
     public void setMatriz(int NumeroFilas, int NumeroColumnas, int dato){
        matriz1[NumeroFilas][NumeroColumnas] = dato;
    }
     
    public int getMatriz(int NumeroFilas, int NumeroColumnas){
        return matriz1[NumeroFilas][NumeroColumnas];
    }
    
    public void setMatriz2(int NumeroFilas2, int NumeroColumnas2, int dato2){
        matriz1[NumeroFilas2][NumeroColumnas2] = dato2;
    }
     
    public int getMatriz2(int NumeroFilas2, int NumeroColumnas2){
        return matriz1[NumeroFilas2][NumeroColumnas2];
    }
    
    public void setMatrizr(int NumeroFilas, int NumeroColumnas2, int dator){
        matriz1[NumeroFilas][NumeroColumnas2] = dator;
    }
     
    public int getMatrizr(int NumeroFilas, int NumeroColumnas2){
        return matriz1[NumeroFilas][NumeroColumnas2];
    }
    
    //Metodo para multiplicar matrices
    public void MultiplicarMatriz() {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    // aquí se multiplican las matrices
                    matrizr[i][j] += matriz1[i][k] * matriz2[k][j];
                    
                    JOptionPane.showMessageDialog(null, "La matriz resultante es..."+"\n"+matrizr[i][j]);
                }
            }
        }
    }
    
    //Metodo para mostrar matrices
    public static void MostrarMatriz(int matriz[][], int NumeroFilas, int NumeroColumnas) {

        String resultado = "";
        for (int i = 0; i < NumeroFilas; i++) {
            for (int j = 0; j < NumeroColumnas; j++) {
                resultado += matriz[i][j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
    

