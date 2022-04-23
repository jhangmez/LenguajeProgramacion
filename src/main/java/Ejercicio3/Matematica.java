
package Ejercicio3;
import java.lang.Integer;

public class Matematica {
    private int numero;  

    
    public String enteroAOctal(){
        return Integer.toOctalString(numero);
    }
   
    public String enteroAHexa(){
        return Integer.toHexString(numero);
    }
    
    public double getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
