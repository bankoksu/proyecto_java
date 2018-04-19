org.mvpigs.cotxos;

public class Carrera(){
    
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private float distancia = 0.0f;
    private int tiempoEsperado = 0;

    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;       
    }

    public String getTarjetaCredito(){
        return tarjetaCredito;
    }

    public String getOrigen(){
        return origen;
    }

    public String getDestino(){
        return destino;
    }
}