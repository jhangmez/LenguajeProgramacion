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
public class TestAvion {
    public static void main(String[] args) {
        int cantidad =8;
        String letras = "LRO";
        Avion oboleto = new Avion(cantidad);
        oboleto.simular();  
        System.out.println("                                   Asientos de Avion");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("            |        Lado Izquierdo         |          Lado Derecho      |");
        System.out.println("            --------------------------------------------------------------");
        System.out.println("            |"+"\t"+"1"+"\t"+"2"+"\t"+"3"+"\t"+"4"+"   |"+"\t"+"1"+"\t"+"2"+"\t"+"3"+"\t"+"4"+"|");
        System.out.println("--------------------------------------------------------------------------");
        int boleto [][]= oboleto.getVentas();
        for(int i=0;i<15;i++){
            System.out.print("Fila  "+(i+1)+":"+"\t");
            for(int j=0;j<cantidad;j++){ 
              System.out.print(letras.charAt(boleto[i][j])+"\t");
            }System.out.println("");
        }System.out.println("");
        int alibres = oboleto.asientosLibres();
        System.out.println("La cantidad de asientos libres es: "+alibres);
        int areservados = oboleto.asientosReservados();
        System.out.println("La cantidad de asientos reservados es: "+areservados);
        int aocupados = oboleto.asientosOcupados();
        System.out.println("La cantidad de asientos ocupados es: "+aocupados);
        int avendidos = oboleto.asientosVendidos();
        System.out.println("La cantidad de asientos vendidos es: "+avendidos);
    }
}

