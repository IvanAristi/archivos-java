
package prueba;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Prueba {

   
    public static void main(String[] args) throws FileNotFoundException {
       List<Banco> dependencia = new ArrayList();
    
        
        
        
        Banco mibanco3;
        System.out.println("mi banco 3 sin instancia" );
       
 
         
 
        Sucursal sucursal = new Sucursal ("san javier", "medelllin", "sucursal", 54632178);
        Corresponsal corresponsal1 = new Corresponsal("tiendac13", "2medellin", "corresponsal", 6658547);
        
        dependencia.add(sucursal);
        
        
        Escribirleer cat = new Escribirleer();
        cat.crear();
    }
    
}
