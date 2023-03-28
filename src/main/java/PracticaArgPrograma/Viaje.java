package PracticaArgPrograma;

public class Viaje {

//private Datetime inicio;
    private int cantDias;
    private String origen;
    private String  destino;
    private float precio;

    void setCantidadDias(int cantDias) {
        this.cantDias = cantDias;
    }
    void setOrigen(String origen) {
        this.origen = origen;
    }
    void setDestino(String destino) {
        this.destino = destino;
    }
    void setPrecio(float precio) {
        this.precio = precio;
    }
    
    int getCantidadDias(){
        return this.cantDias;
    }
    String getOrigen(){
        return this.origen;
    }
    String getDestino(){
        return this.destino;
    }
    float getPrecio(){
        return this.precio;
    }
    

    public float precioXDia() {
        return (float) precio * cantDias; //… Completar
    }

    public static void main(String[] args) {
        Viaje v1 = new Viaje();
        
        v1.setCantidadDias(15);
        v1.setPrecio(450);
        
        System.out.println("La estadia completa le saldria: " + v1.precioXDia() );

    }

}
