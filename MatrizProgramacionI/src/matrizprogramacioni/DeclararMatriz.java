/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizprogramacioni;

/**
 *
 * @author Luna Escudero
 */
public class DeclararMatriz {
    private int matrizNumeros [][];
    private int matrizNumeros2 [][];
    private int matrizResultante [][];
    private int filas;
    private int columnas;
    private int filas2;
    private int columnas2;
    
    public DeclararMatriz() {
        matrizNumeros = null;
        matrizNumeros2 = null;
        filas = 0;
        columnas = 0;
        filas2 = 0;
        columnas2 = 0;
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
    public void crearMatriz(){
        matrizNumeros = new int [filas][columnas];
        
    }
    
    public void crearMatriz2(){
        matrizNumeros2 = new int [filas2][columnas2];
    }
    
    public void crearMatrizMul(){
        matrizResultante = new int [filas][columnas2];
    }
    
    public void crearMatrizResul(){
        matrizResultante = new int [filas][columnas];
    }
    
    public void setMatriz(int f, int c, int dato){
        matrizNumeros[f][c] = dato;
    }
    public int getMatriz(int f, int c){
        return matrizNumeros[f][c];
    }
    
    public void setMatriz2(int f, int c, int dato){
        matrizNumeros2[f][c] = dato;
    }
    public int getMatriz2(int f, int c){
        return matrizNumeros2[f][c];
    }
    
    public void setMatrizResultante(int f, int c, int dato){
        matrizResultante[f][c] = dato;
    }
    public int getMatrizResultante(int f, int c){
        return matrizResultante[f][c];
    }

    public int getFilas2() {
        return filas2;
    }

    public void setFilas2(int filas2) {
        this.filas2 = filas2;
    }

    public int getColumnas2() {
        return columnas2;
    }

    public void setColumnas2(int columnas2) {
        this.columnas2 = columnas2;
    }
    
    
    
    public void sumarMatriz(){
        for(int i=0; i<=getFilas()-1; i++){
            for(int j=0; j<=getColumnas()-1; j++){
                matrizResultante[i][j] = getMatriz(i,j) + getMatriz2(i,j);
            }
        }
    }
    
     public void RestarMatriz(){
        for(int i=0; i<=getFilas()-1; i++){
            for(int j=0; j<=getColumnas()-1; j++){
                matrizResultante[i][j] = getMatriz(i,j) - getMatriz2(i,j);
            }
        }
    }
     
    public void MultiplicarMatriz(){
    for(int i=0; i<=getFilas()-1; i++){
            for(int j=0; j<=getColumnas2()-1; j++){
                for (int k = 0; k <= getColumnas()-1; k++) {
                     matrizResultante[i][j] += getMatriz(i,k) * getMatriz2(k,j);
                }              
            }
        }
    }
    
}
