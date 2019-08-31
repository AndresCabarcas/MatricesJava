
package matrices;


public class DeclararMatriz {
    private int matrizNumeros [][];
    private int filas;
    private int columnas;
    
    public DeclararMatriz() {
        matrizNumeros = null;
        filas = 0;
        columnas = 0;
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
    public void setMatriz(int f, int c, int dato){
        matrizNumeros[f][c] = dato;
    }
    public int getMatriz(int f, int c){
        return matrizNumeros[f][c];
    }
    
    public int sumarMatriz(){
        int suma = 0;
        for(int i=0; i<=getFilas()-1; i++){
            for(int j=0; j<=getColumnas()-1; j++){
                suma = suma + getMatriz(i,j);
            }
        }
        return suma;
    }
    
    public double promedioMatriz(){
        double suma = 0;
        for(int i=0; i<=getFilas()-1; i++){
            for(int j=0; j<=getColumnas()-1; j++){
                suma = suma + getMatriz(i,j);
            }
        }
        return suma/(getColumnas()*getFilas());
    }
    
    public int sumaDiagonalPrincipal(){
        int suma = 0;
        for(int i=0; i<=getFilas()-1; i++){
            for(int j=0; j<=getColumnas()-1; j++){
                if(i==j){
                    suma = suma + getMatriz(i,j);
                }
            }
        }
        return suma;
    }
    
    public int sumaDiagonalSecundaria(){
        int suma = 0;
        for(int i=0; i<=getFilas()-1; i++){
            for(int j=0; j<=getColumnas()-1; j++){
                if(i+j==getFilas()-1){
                    suma = suma + getMatriz(i,j);
                }
            }
        }
        return suma;
    }

}
