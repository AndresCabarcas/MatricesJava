package matrices;

import javax.swing.JOptionPane;

public class Main {

    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== IMPLEMENTACIÓN DE MATRICES - OPCIONES DEL MENÚ ===== \n\n"
                    + "1. Guardar datos en la Matriz si es  nxn \n"
                    + "2. Mostrar elementos de la Matriz \n"
                    + "3. Mostrar diagonal principal \n"
                    + "4. Promedio y suma de los elementos de la Matriz\n"
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

    public static void mostrarMatriz(DeclararMatriz obj) {
        String datosMatriz = "";
        for (int i = 0; i <= obj.getFilas() - 1; i++) {
            for (int j = 0; j <= obj.getColumnas() - 1; j++) {
                datosMatriz = datosMatriz + String.valueOf(obj.getMatriz(i, j) + " ");
            }
            datosMatriz = datosMatriz + "\n" + "\n";
        }
        JOptionPane.showMessageDialog(null, "=============== DATOS DE LA MATRIZ ===============" + "\n" + datosMatriz);
    }

    public static void mostrarDiagonalPrincipal(DeclararMatriz obj) {
        String datosMatriz = "";
        for (int i = 0; i <= obj.getFilas() - 1; i++) {
            for (int j = 0; j <= obj.getColumnas() - 1; j++) {
                if (i == j) {
                    datosMatriz = datosMatriz + String.valueOf(obj.getMatriz(i, j) + " ");
                } else {
                    datosMatriz = datosMatriz + String.valueOf(" 0 ");
                }
            }
            datosMatriz = datosMatriz + "\n" + "\n";
        }
        JOptionPane.showMessageDialog(null, "=============== DATOS DE LA MATRIZ ===============" + "\n" + datosMatriz);
    }

    public static void mostrarDiagonalInferior(DeclararMatriz obj) {

        String datosMatriz = "";
        for (int i = 0; i < obj.getFilas(); i++) {
            for (int j = 0; j < obj.getColumnas(); j++) {
                if (i >= j) {
                    datosMatriz = datosMatriz + String.valueOf(obj.getMatriz(i, j) + " ");
                } else {
                    datosMatriz = datosMatriz + String.valueOf(" 0 ");
                }
            }
            datosMatriz = datosMatriz + "\n" + "\n";
        }
        JOptionPane.showMessageDialog(null, "=============== DATOS DE LA MATRIZ ===============" + "\n" + datosMatriz);

    }

    public static void mostrarDiagonalSuperior(DeclararMatriz obj) {

        String datosMatriz = "";
        for (int i = 0; i < obj.getFilas(); i++) {
            for (int j = 0; j < obj.getColumnas(); j++) {
                if (i <= j) {
                    datosMatriz = datosMatriz + String.valueOf(obj.getMatriz(i, j) + " ");
                } else {
                    datosMatriz = datosMatriz + String.valueOf(" 0 ");
                }
            }
            datosMatriz = datosMatriz + "\n" + "\n";
        }
        JOptionPane.showMessageDialog(null, "=============== DATOS DE LA MATRIZ ===============" + "\n" + datosMatriz);

    }

    public static void diagonalSecundaria(DeclararMatriz obj) {

        String datosMatriz = "";

        for (int i = 0; i <= obj.getFilas() - 1; i++) {
            for (int j = 0; j <= obj.getColumnas() - 1; j++) {
                if (i + j == obj.getFilas() - 1) {
                    datosMatriz = datosMatriz + String.valueOf(obj.getMatriz(i, j) + " ");
                } else {
                    datosMatriz = datosMatriz + String.valueOf(" 0 ");
                }
            }
            datosMatriz = datosMatriz + "\n" + "\n";
        }
        JOptionPane.showMessageDialog(null, "=============== DATOS DE LA MATRIZ ===============" + "\n" + datosMatriz);

    }

    public static void contardiagonal(DeclararMatriz obj) {

        String datosMatriz = "";

        for (int i = 0; i <= obj.getFilas() - 1; i++) {
            for (int j = 0; j <= obj.getColumnas() - 1; j++) {

            }

        }

    }

    public static void main(String[] args) {
        DeclararMatriz obj = new DeclararMatriz();
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
                    break;
                case 2:
                    mostrarMatriz(obj);
                    break;
                case 3:
                    if (obj.getFilas() == obj.getColumnas()) {
                        mostrarDiagonalPrincipal(obj);
                    } else {
                        JOptionPane.showMessageDialog(null, "\n\n=======================================================" + "\n\n"
                                + "LA MATRIZ NO ES CUADRADA, NO SE PUEDE MOSTRAR LA DIAGONAL" + "\n\n=======================================================\n\n");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "========== INFORME ELEMENTOS DE LA MATRIZ ==========" + "\n\n"
                            + "SUMA: " + obj.sumarMatriz() + "\n\n" + "PROMEDIO: " + obj.promedioMatriz() + "\n\n"
                            + "SUMA DIAGONAL PRINCIPAL: " + obj.sumaDiagonalPrincipal());
                    break;
                case 5:
                    if (obj.getFilas() == obj.getColumnas()) {
                        mostrarDiagonalInferior(obj);
                    } else {
                        JOptionPane.showMessageDialog(null, "\n\n=======================================================" + "\n\n"
                                + "LA MATRIZ NO ES CUADRADA, NO SE PUEDE MOSTRAR LA DIAGONAL" + "\n\n=======================================================\n\n");
                    }
                    break;
                case 6:
                    if (obj.getFilas() == obj.getColumnas()) {
                        mostrarDiagonalSuperior(obj);
                    } else {
                        JOptionPane.showMessageDialog(null, "\n\n=======================================================" + "\n\n"
                                + "LA MATRIZ NO ES CUADRADA, NO SE PUEDE MOSTRAR LA DIAGONAL" + "\n\n=======================================================\n\n");
                    }
                    break;
                case 7:
                    if (obj.getFilas() == obj.getColumnas()) {
                        diagonalSecundaria(obj);
                    } else {
                        JOptionPane.showMessageDialog(null, "\n\n=======================================================" + "\n\n"
                                + "LA MATRIZ NO ES CUADRADA, NO SE PUEDE MOSTRAR LA DIAGONAL" + "\n\n=======================================================\n\n");
                    }
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "========== INFORME ELEMENTOS DE LA MATRIZ ==========" + "\n\n"
                            + "SUMA: " + obj.sumarMatriz() + "\n\n" + "SUMA DIAGONAL PRINCIPAL: " + obj.sumaDiagonalSecundaria());
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

                    DeclararMatriz oj = new DeclararMatriz();

                    int numero;
                    int cont = 0;
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero a buscar"));

                    for (int i = 0; i <= obj.getFilas() - 1; i++) {
                        for (int j = 0; j <= obj.getColumnas() - 1; j++) {

                            if (numero == numero) {

                                cont++;
                                                               
                            } else {
                            }
                                         
                        }
                    }
                    
                     JOptionPane.showMessageDialog(null, "La cantidad de veces que se repite es: "+cont+"\n");
                   
                    break;
            }
        } while (opcion != 10);
    }

}
