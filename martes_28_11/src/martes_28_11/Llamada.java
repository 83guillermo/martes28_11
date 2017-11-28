
package martes_28_11;

public abstract class Llamada {
    protected float duracion;
    protected String nroDestino;
    protected String nroOrigen;
//getters de los atributos duracion, destino,origen
    public float getDuracion() {
        return duracion;
    }

    public String getNroDestino() {
        return nroDestino;
    }

    public String getNroOrigen() {
        return nroOrigen;
    }
    //fin de los getters
    //constuctor de la clase
    public Llamada(String Origen,String Destino,float duracion) {
        this.duracion = duracion;
        this.nroDestino = Destino;
        this.nroOrigen = Origen;
    }
   public void mostrar(){
       System.out.println(this.duracion+this.nroDestino+this.nroOrigen);
   }
    
   public int OrdenarPorDuracion(Llamada uno,Llamada dos){
       int numero=0;
       int numero2=0;
       int resultado= numero+numero2;
       return resultado;
   }
}
