package codelitas.eventosgo;

public class Evento {

    //atributos
    private String nombreEvento;
    private String idEvento;
    private String ubicacionEvento;
    private String fecha;
    private String hora;
    private String tipoEvento;
    private int capacidadMaximaEvento;


    //Constructor
    public Evento(String pNombreEvento, String pIdEvento, String pUbicacionEvento, String pfecha,String phora,
            String pTipoEvento, int pCapacidadMaximaEvento) {
        this.nombreEvento = pNombreEvento;
        this.idEvento = pIdEvento;
        this.ubicacionEvento = pUbicacionEvento;
        this.fecha = pfecha;
        this.hora = phora;
        this.tipoEvento = pTipoEvento;
        this.capacidadMaximaEvento = pCapacidadMaximaEvento;
    }

    // Metodos
    public void mostrarDatosEvento() {
        StringBuffer datos = new StringBuffer();
        datos.append("--------------------").append("\n");
        datos.append("Nombre Evento").append(this.nombreEvento).append("\n");
        datos.append("Ubicación Evento").append(this.ubicacionEvento).append("\n");
        datos.append("Fecha Evento").append(this.fecha).append(" ").append(this.hora).append("\n");
        datos.append("Capacidad Evento").append(this.capacidadMaximaEvento).append("\n");
        datos.append("Tipo Evento").append(this.tipoEvento).append("\n");
        SistemaEventos.mostrarJOptioneMessage(datos.toString());

    }
    //SIN USAR

    public void realizarEvento() {

    }

    public void venderEntradas() {

    }
    //

    

    //getters y setters
    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public String getUbicacionEvento() {
        return ubicacionEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public int getCapacidadMaximaEvento() {
        return capacidadMaximaEvento;
    }

    
}
