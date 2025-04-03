package codelitas.eventosgo;

import javax.swing.JOptionPane;

public class MenuSistema {
/* 
public static void main(String[] args) {
MenuSistema menu = new MenuSistema();
menu.menuPrincipal();
}
 */
    
    ValidacionUsuario validacionUsuario = new ValidacionUsuario();
    StringBuilder mensaje = new StringBuilder();
    SistemaEventos sistemaEventos = new SistemaEventos();
    private boolean parar = false;

    public void menuPrincipal() {
        String[] opcionesMenu = { "Registrar Usuarios", "Crear Evento", "Comprar Entradas", "Mostrar Usuarios",
                "Mostar Eventos" };
        String[] opcionesInicio = { "Iniciar Sesión", "Crear Usuario" };
        int seleccion = JOptionPane.showOptionDialog(null, "Elige una opción", "EVENTOS GO",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesInicio, opcionesInicio[0]);
        while (!parar) {
            switch (seleccion) {
                case 0:
                    mostrarJOptioneMessage("A ingresado a  Inicio de Sesion");
                    mostrarInicioSesion(validacionUsuario);
                    break;
                case 1:
                    mostrarJOptioneMessage("A ingresado a crear usuario");
                    break;
                default:
                    mostrarJOptioneMessage("Cerrando sistema");
                    parar = true;
                    break;
            }
        }
        
        
    }
    
    public String mostrarInicioSesion(ValidacionUsuario validacionUsuario) {
        MenuSistema menuSistema = new MenuSistema();
        String contraseniaIngresada = "";
        mensaje.append("Ingrese el tipo usuario a crear:").append("\n").append("Administrador o Cliente");
        while (!parar) {
            String roll = menuSistema.mostrarJOptioneInput(mensaje.toString()).toUpperCase();
            if (!roll.equals("ADMINISTRADOR") && !roll.equals("CLIENTE")) {
                menuSistema.mostrarJOptioneMessage("Tipo de usuario ingresado inválido");
            } else {
                if (roll.equals("ADMINISTRADOR")) {
                    mensaje.replace(0, mensaje.length(), "Ingrese la clave del ADMINISTRADOR MASTER");
                    contraseniaIngresada = menuSistema.mostrarJOptioneInput(mensaje.toString());
                    boolean respuestaAcceso = validacionUsuario.autorizarCrearAdmin(contraseniaIngresada, mensaje,
                            menuSistema);
                    if (respuestaAcceso) {

                    }

                }
                parar = true;
            }
        }
        this.eliminarMensaje(mensaje);
        parar = false;
        return contraseniaIngresada;
    }

    
    
    public String mostrarJOptioneInput(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarJOptioneMessage(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void eliminarMensaje(StringBuilder mensaje) {
        mensaje.delete(0, mensaje.length());

    }
}
