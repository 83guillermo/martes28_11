/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparador;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class Perro  implements Comparable{

    
    private String nombre;
    private int edad;
    
    public Perro(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
          
    @Override
    public String toString()
    {
        return this.nombre + this.edad;
    }

  private int compararNombre(Perro p1, Perro p2)
  {
      return p1.nombre.compareTo(p2.nombre);
  }
    
 @Override
    public int compareTo(Object p2) {
      // return  compararNombre(this, (Perro)p2);
      return ((Perro)p2).nombre.compareTo(this.nombre);
    }

   
    
    
}
