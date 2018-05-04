
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.jPanelPrincipal;


public class controladorBotonSegundoAlgortmo implements ActionListener{
    
    private jPanelPrincipal view;
    
    private static final int FILAS = 20;
    private static final int COLUMNAS = 25;
    
    public controladorBotonSegundoAlgortmo (jPanelPrincipal view){
        this.view = view;
        this.view.BT_SegundoAlgoritmo.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        int numeroFilas = FILAS;
        int numeroColumnas = COLUMNAS;
        int numeroRelleno = 2;
        int j;
        int i;
        
        /**
         * For anidado que rellena la matriz con numeros igulaes
        */
        int[][] A = new int [numeroFilas][numeroColumnas];
        
        for ( i = 0 ;i < 20;i++){
            for( j=0;j<25;j++){
                A[i][j] = numeroRelleno;
            }
        }
        /**
         * Mandando a llmamar la funcion recursiva sumando todos los valores de 
         * la matriz
        */
         view.LB_SegundoAlgoritmo.setText(""+sumaMatrisDecrementoDos(A,numeroFilas-1,numeroColumnas-1,COLUMNAS-1));
    }
    /**
            * Resolviendo el siguiente algoritmo resolviendo de forma recursva con
            * decremento en DOS la suma de todos los numeros de la matriz
            * Uno por uno
            * @param A Matris a sumar
            * @param numeroFilas define la cantidad de filas a recorrer
            * @param numeroColumnas define la cantidad de columnas a recorrer
            * @param COLUMNAS variable que define el numero de columnas de cada matriz 
            * esta varible jamas cambia
            * @return regresa en cada llamada recursiva la suma de cada cuadrito de la 
            * funcion
        */
    private int sumaMatrisDecrementoDos(int[][]A, int numeroFilas, int numeroColumnas, int COLUMNAS){
        if((numeroFilas==0 && numeroColumnas==0)||(numeroFilas==0 && numeroColumnas==1)){
            if(numeroFilas==0 && numeroColumnas==1){
                return A[numeroFilas][numeroColumnas]+A[numeroFilas][numeroColumnas-1];
            }
            return A[0][0];
        }else{
            if(numeroColumnas==0){ //impar
                return sumaMatrisDecrementoDos(A,numeroFilas-1,COLUMNAS-1,COLUMNAS)+A[numeroFilas][numeroColumnas]+A[numeroFilas-1][COLUMNAS];
            }else{
                if(numeroColumnas==1){
                    return sumaMatrisDecrementoDos(A,numeroFilas-1,COLUMNAS,COLUMNAS)+A[numeroFilas][COLUMNAS]+A[numeroFilas][COLUMNAS-1];
                }
                return sumaMatrisDecrementoDos(A,numeroFilas,numeroColumnas-2,COLUMNAS)+A[numeroFilas][numeroColumnas-1] +A[numeroFilas][numeroColumnas];
            }
        }
    }
}
