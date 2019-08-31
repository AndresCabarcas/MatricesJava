/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialmatricez;

/**
 *
 * @author ANDACAMES
 */
public class DeclararMatricez {
     private int matrizNumeros [][];
    private int filas;
    private int columnas;
       private int filas2;
    private int columnas2;
    private int matrizNumeros2[][];
    
    public DeclararMatricez() {
        matrizNumeros = null;
        filas = 0;
        columnas = 0;
        filas2 = 0;
        columnas2 = 0;
        matrizNumeros2= null;
    }
    
    public void setFilas(int f){
        filas=f;
    }
    public int getFilas(){
        return filas;
    }
    public void setColumnas(int c){
        columnas=c;
    }
    public int getColumnas(){
        return columnas;
    }
    
    public void setFilas2(int i){
        filas2=i;
    }
    public int getFilas2(){
        return filas2;
    }
    public void setColumnas2(int o){
        columnas2=o;
    }
    public int getColumnas2(){
        return columnas2;
    }
    public void crearMatriz(){
        matrizNumeros = new int [filas][columnas];
        matrizNumeros2 = new int [filas2][columnas2];
    }
    public void setMatriz(int f, int c, int dato){
        matrizNumeros[f][c] = dato;
        
    }
    
    public void setMatriz2(int i, int o, int dato2){
    
    matrizNumeros2[i][o] = dato2;
        
    }
    
    public int getMatriz(int f, int c){
        return matrizNumeros[f][c];
       
    }
    
    public int getMatriz2(int i, int o){
        return matrizNumeros2[i][o];    
    }
}
