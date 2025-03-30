package codelitas.eventosgo;

public class Usuario {
    private String nombre;
    private String identificacion;
    private String correo;
    private String idUsuario;
    private RollUsuario rollUsuario;
  

    public enum RollUsuario {
        ADMINISTRADOR,
        CLIENTE
    }
    //Constructor
    public Usuario(String pNombre, String pidentificacion, String pcorreo, String pidUsuario,
            RollUsuario prollUsuario) {
        this.nombre = pNombre;
        this.identificacion = pidentificacion;
        this.correo = pcorreo;
        this.idUsuario = pidUsuario;
        this.rollUsuario = prollUsuario;
    }

    public Usuario() {
        
    }

    



    // metodos
    public void mostrarDatos() {
        StringBuffer datos = new StringBuffer();
        datos.append("-------------------").append("\n");
        datos.append("Nombre:").append(this.nombre).append("\n");
        datos.append("nIdentificación:").append(this.identificacion).append("\n");
        datos.append("Correo Electrónico:").append(this.correo).append("\n");
        datos.append("ID Usuari:").append(this.idUsuario).append("\n");
        datos.append("Roll").append(this.rollUsuario).append("\n");
        datos.append("-------------------").append("\n");
        SistemaEventos.mostrarJOptioneMessage(datos.toString());
    }

    //sin usar
    public void comprarEntrada() {

    }

    // getters y setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public RollUsuario getRollUsuario() {
        return rollUsuario;
    }

    public void setRollUsuario(RollUsuario rollUsuario) {
        this.rollUsuario = rollUsuario;
    }

    
    

    

}
