package codelitas.eventosgo;

import javax.swing.JOptionPane;
import codelitas.eventosgo.Usuario.RollUsuario;

public class SistemaEventos {

    private ListasSistemaEvento listas;
    public Boolean parar = false;
    public StringBuilder datos;

    public SistemaEventos() {
        listas = new ListasSistemaEvento();
        datos = new StringBuilder();
    }

    
    //Metodos
    
    public Usuario generarUsuario(SistemaEventos sistema) {
        String nombre = mostrarJOptioneInput("Ingrese el nombre del usuario");
        String cedula = mostrarJOptioneInput("Ingrese la identifación del Usuario");
        String correo = mostrarJOptioneInput("Ingrese el correo del usuario");
        RollUsuario tipoUsuario = null;
        while (!sistema.parar) {
            String tipoUsuarioIngresado = mostrarJOptioneInput("Tipo de usuario\nADMINISTRADOR o CLIENTE");
            if (!tipoUsuarioIngresado.equals("ADMINISTRADOR") && !tipoUsuarioIngresado.equals("CLIENTE")) {
                mostrarJOptioneMessage("Tipo de usuario ingresado inválido");
            } else {
                tipoUsuario = RollUsuario.valueOf(tipoUsuarioIngresado);
                sistema.parar = true;
            }
        }
        Usuario usuario = new Usuario(nombre, cedula, correo, GenerarID.generarIDUsuario("USR"), tipoUsuario);
        JOptionPane.showMessageDialog(null, "Usuario " + usuario.getNombre() + " creado exitosamente");
        sistema.parar = false;
        return usuario;
    }
   
    public Evento generarEvento(SistemaEventos sistema) {

        String pnombreEvento = mostrarJOptioneInput("Ingrese el nombre del evento");
        String pubicacionEvento = mostrarJOptioneInput("Ingrese la ubicación del evento:");
        String pfecha = mostrarJOptioneInput("Ingrese la Fecha del evento");
        String phora = mostrarJOptioneInput("Ingrese la hora del evento");
        String ptipoEvento = mostrarJOptioneInput("Ingrese el tipo del evento:");
        int pCapacidadMaximaEvento = Integer.parseInt(mostrarJOptioneInput("Ingrese la capacidad máxima del evento"));
        Evento evento = new Evento(pnombreEvento, GenerarID.generarIDUsuario("EVT"), pubicacionEvento,
                pfecha, phora, ptipoEvento, pCapacidadMaximaEvento);
        JOptionPane.showMessageDialog(null, "Evento " + evento.getNombreEvento() + "Se ha creado exitosamente");
        return evento;
    }
    
    public void imprimirUsuarios() {
        listas.mostrasListaUsuarios();
    }

    public void imprimirEventos() {
        listas.mostrarListaEventos();
    }

    //sin usar
    public void venderEntradas() {

    }
    
    //funciones
    public static void mostrarMenuPrincipal(SistemaEventos sistema) {
        String[] opcionesMenu = { "Registrar Usuarios", "Crear Evento", "Comprar Entradas", "Mostrar Usuarios", "Mostar Eventos" };
        while (!sistema.parar) {
            int seleccionMenuPrincipal = JOptionPane.showOptionDialog(null, "Elige una opción", "EVENTOS GO",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);
            validarOpcionesMenu(seleccionMenuPrincipal, sistema);
        }
        
    }

    public static void validarOpcionesMenu(int opcionSeleccionada, SistemaEventos sistema) {
        // Controlamos si no ingresa una opción
        validarMensajeCierre(opcionSeleccionada, sistema);
            switch (opcionSeleccionada) {
                case 0:
                    mostrarJOptioneMessage("Ingresando al modulo registro de Usuarios");
                    sistema.listas.agregarUsuarioLista(sistema.generarUsuario(sistema));
                    break;
                case 1:
                    mostrarJOptioneMessage("Ingresando al modulo Crear Evento");
                    sistema.listas.agregarEventoLista(sistema.generarEvento(sistema));
                    break;
                
                case 2:
                    mostrarJOptioneMessage("Menu en desarrollo");
                    
                    break;

                case 3:
                    sistema.imprimirUsuarios();
                    break;
                
                case 4:
                    sistema.imprimirEventos();
                    break;


                default:
                    mostrarJOptioneMessage("No se ha ingresado ninguna opcion");
                    break;
        }
        

    }
    
    public static void mostrarJOptioneMessage(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static String mostrarJOptioneInput(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public static void validarMensajeCierre(int opcionIngresada, SistemaEventos sistema) {
        // Controlamos si no ingresa una opción
        if (opcionIngresada == JOptionPane.CLOSED_OPTION) {
            mostrarJOptioneMessage("Se cerró el menú de opciones sin escojer una opción\\n" +
                    "SALIENDO DEL SISTEMA");
            sistema.parar = true;
        }
    }

}
    