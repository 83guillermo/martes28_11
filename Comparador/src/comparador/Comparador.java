/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author alumno
 */
public class Comparador {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Perro> lista = new ArrayList<>();
        
        lista.add(new Perro("Firulais",5));
        lista.add(new Perro("Toby",9));
        lista.add(new Perro("Anacleto",15));
        
        
        
       Collections.sort(lista);
        
        for (Perro perro : lista) {
            System.out.println(perro.toString());
        }
 
            
        
        
    }
    
}
