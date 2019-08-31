/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialmatricez;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class main {

   
    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== IMPLEMENTACIÓN DE MATRICES - OPCIONES DEL MENÚ ===== \n\n"
                    + "1. Guardar datos en la Matriz 1 si es  nxn \n"
                    + "2. Mostrar elementos de la Matriz \n"
                    + "3. Mostrar matriz 2 \n"
                    + "4. Guardar datos en la Matriz 2 si es  nxn\n"
                    + "5. Diagonal Inferior\n"
                    + "6. Diagonal Superior\n"
                    + "7. Diagonal Secundaria5\n"
                    + "8. Suma Diag, secundaria\n"
                    + "9. Guardar dato en la matriz si es nxm\n"
                    + "10. Contar numero\n"
                    + "\n\n Seleccione una opción del 1 al 9:"));
        } while (opcion <= 0 || opcion > 10);
        return opcion;
    }

    public static void mostrarMatriz(DeclararMatricez obj) {
        String datosMatriz = "";
        for (int i = 0; i <= obj.getFilas() - 1; i++) {
            for (int j = 0; j <= obj.getColumnas() - 1; j++) {
                datosMatriz = datosMatriz + String.valueOf(obj.getMatriz(i, j) + " ");
            }
            datosMatriz = datosMatriz + "\n" + "\n";
        }
        JOptionPane.showMessageDialog(null, "=============== DATOS DE LA MATRIZ ===============" + "\n" + datosMatriz);
    }
public static void mostrarMatriz2(DeclararMatricez obj) {
        String datosMatriz2 = "";
        for (int i = 0; i <= obj.getFilas2() - 1; i++) {
            for (int j = 0; j <= obj.getColumnas2() - 1; j++) {
                datosMatriz2 = datosMatriz2 + String.valueOf(obj.getMatriz2(i, j) + " ");
            }
            datosMatriz2 = datosMatriz2 + "\n" + "\n";
        }
        JOptionPane.showMessageDialog(null, "=============== DATOS DE LA MATRIZ ===============" + "\n" + datosMatriz2);
    }

    public static void main(String[] args) {
        DeclararMatricez obj = new DeclararMatricez();
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    int fila,
                     columna;
                    fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Tamaño de la matriz nxn"));
                    obj.setFilas(fila);
                    obj.setColumnas(fila);
                    obj.crearMatriz();
                    for (int i = 0; i <= obj.getFilas() - 1; i++) {
                        for (int j = 0; j <= obj.getColumnas() - 1; j++) {
                            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento de la matriz en la posicion [" + i + "," + j + "]"));
                            obj.setMatriz(i, j, dato);
                        }
                    }
                    int fila2,columna2;
                    fila2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Tamaño de la matriz2 nxn"));
                    obj.setFilas2(fila2);
                    obj.setColumnas2(fila2);
                    obj.crearMatriz();
                    for (int i = 0; i <= obj.getFilas2() - 1; i++) {
                        for (int j = 0; j <= obj.getColumnas2() - 1; j++) {
                            int dato2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento de la matriz2 en la posicion [" + i + "," + j + "]"));
                            obj.setMatriz2(i, j, dato2);
                        }
                    }
                    break;
                case 2:
                    mostrarMatriz(obj);
                    break;
                case 3:
                    mostrarMatriz2(obj);
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                  
                    break;
                case 9:

                    JOptionPane.showMessageDialog(null, "Digite Tamaño de Matriz nxm\n\n");

                    fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Tamaño de la fila"));
                    obj.setFilas(fila);
                    columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño de la columna"));
                    obj.setColumnas(columna);
                    obj.crearMatriz();
                    for (int i = 0; i <= obj.getFilas() - 1; i++) {
                        for (int j = 0; j <= obj.getColumnas() - 1; j++) {
                            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento de la matriz en la posicion [" + i + "," + j + "]"));
                            obj.setMatriz(i, j, dato);

                        }
                    }
                    break;
                case 10:

                  
                    break;
            }
        } while (opcion != 10);
    }

}
