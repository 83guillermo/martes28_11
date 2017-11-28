
package martes_28_11;


public class Centralita {
    private String razonSocial;
    //propiedad de lista de  llamanda
    float GananciaPorLocal;
    float GananciaPorProvincia;
    float GananciaTotal;
    //metodo get de lista por  llamanda

    public float getGananciaPorLocal() {
        return GananciaPorLocal;
    }

    public float getGananciaPorProvincia() {
        return GananciaPorProvincia;
    }

    public float getGananciaTotal() {
        return GananciaTotal;
    }
    public float CalcularGanancia(Llamada tipo){
        float resultadoGanancia=1;
        return resultadoGanancia;
    }

    public Centralita() {
    }
    public Centralita(String nombreEmpresa){
    }
    public void Mostrar(){
        System.out.println("supestamente todo los datos jajaja");
    }
    public void ordenarLlamada(){
    }
}
