

package ejercicio11video16;

import java.util.*;

public class pedir2 {
    
    public void carlos(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("INTRODUCE TU EDAD, POR FAVOR: ");
        
        int edad1 = entrada.nextInt();
        
        System.out.println();
        
        if(edad1 < 18){
            System.out.println("ERES UN ADOLECENTE");
            
        }else if(edad1 < 40){
            
            System.out.println("ERES UN JOVEN");
            
        }else if(edad1 < 65){
               
            System.out.println("ERES MADURO");
            
        }else {
            
            System.out.println("CUIDATE");
        }
            
    }
}
