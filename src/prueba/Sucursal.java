
package prueba;

import java.time.LocalDateTime;
import java.time.LocalTime;


public class Sucursal extends Banco {
 private String gerente;
 LocalDateTime fechaReserva;
 LocalTime hora;


    public Sucursal() {
        
    }

    public Sucursal(String nombre, String direccio, String pagina, int telefono) {
        super(nombre, direccio, pagina, telefono);
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    
    

    @Override
    public String toString() {
        return "Sucursal{" + "gerente=" + gerente + '}';
    }

    @Override
    public void recaudar() {
        System.out.println("desde sucursal");
    }
 
 

 
    
    
    
}
