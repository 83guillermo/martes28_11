
package martes_28_11;


public class Local extends Llamada {
    private float  costo;
    private  float CostoLlamada;

 

    
    public float getCostoLlamada() {
        return CostoLlamada;
    }
    public float CalcularCosto(){
        float costo=1;
        return costo; 
    }
    public void local(Llamada unaLlamada, float costo){
       
    }

    
      public Local(String nroOrigen, String nroDestino, float duracion) {
        super(nroOrigen, nroDestino, duracion);
    }


    
    
  
 
    
}
