/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author dariv
 */
public class Corresponsal extends Banco{
 private String gerente;
    
    
    public Corresponsal() {
    }

    public Corresponsal(String nombre, String direccion, String pagina, int telefono) {
        super(nombre, direccion, pagina, telefono);
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Corresponsal{" + "gerente=" + gerente + '}';
    }

    @Override
    public void recaudar() {
        System.out.println("desde corresponsal");
    }
  
    
    
}
