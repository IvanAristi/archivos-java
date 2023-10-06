
package prueba;


 import java.io.*;


public class Escribirleer {

    public Escribirleer() {
    }
  
    public void crear() throws FileNotFoundException{
      
        try {
             FileOutputStream archivo = new FileOutputStream("sucursales.dat", true); 
          ObjectOutputStream escribir = new ObjectOutputStream( (archivo));   
        } catch (Exception e) {
            
        }
     
        
    }
    
}
