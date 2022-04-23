/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

/**
 *
 * @author Intel
 */
public class Avion {
    private int [][] ventas;
    private int columnas;
    
    Avion(int cantidad){
        ventas = new int [15][cantidad];
        columnas = cantidad;
    }
    
    
    public void simular(){
        for(int i=0;i<15;i++){
            for(int j=0;j<columnas;j++){
               ventas[i][j]= (int) (Math.random()*3);
            }
        }
    }
    public int asientosLibres(){
        int libres = 0,a = 0;
        for(int i=0;i<15;i++){
            for(int j=0;j<columnas;j++){
                  if(libres == ventas[i][j]){
                    a++;
                  }
            }
        }
        return a;
    }
    
    public int asientosReservados(){
        int reservados = 1,b = 0;
        for(int i=0;i<15;i++){
            for(int j=0;j<columnas;j++){
                  if(reservados == ventas[i][j]){
                    b++;
                  }
            }
        }
        return b;
    }
    public int asientosOcupados(){
        int ocupados = 2,c = 0;
        for(int i=0;i<15;i++){
            for(int j=0;j<columnas;j++){
                  if(ocupados == ventas[i][j]){
                    c++;
                  }
            }
        }
        return c;
    }
    public int asientosVendidos(){
        return asientosReservados()+ asientosOcupados();
    }
    
    public int[][] getVentas() {
        return ventas;
    }
}
