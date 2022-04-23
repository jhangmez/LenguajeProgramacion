
package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMatematica {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Matematica cn = new Matematica();
        int n,m;
        System.out.println("Ingrese un numero: ");
        n = Integer.parseInt(br.readLine());
        System.out.println("1. Convertir a Octal");
        System.out.println("2. Convertir a Hexadecimal");
        System.out.println("3. Exit");
        do{
                System.out.print("Ingrese opcion: ");
                m = Integer.parseInt(br.readLine());
            }while(m < 1 || m > 4);
            
            switch(m){
                case 1:
                    cn.setNumero(n);
                    System.out.println("El numero entero a Octal es: "+cn.enteroAOctal());
                    break;
                case 2:
                    cn.setNumero(n);
                    System.out.println("El numero entero a Hexadeciaml es: "+cn.enteroAHexa());
                    break;
                case 3:
                    System.out.println("Gracias por su visita");    break;                                     
            }
        
    }
}
