
package ejercicio11video16;

import java.util.*;

public class pedir {
    
    public void realizar1(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("INTRODUCE TU EDAD, POR FAVOR: ");
        
        int edad = entrada.nextInt();
        
        System.out.println();
        
        if(edad >=18){
            
            System.out.println("ERES MAYOR DE EDAD");
            
        }else{
            
            System.out.println("ERES MENOR DE EDAD");
            
        }
    }
    
}
