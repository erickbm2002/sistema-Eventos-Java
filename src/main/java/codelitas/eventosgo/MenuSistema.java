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
    private boolean parar = false;

    public void menuPrincipal() {
        String[] opcionesMenu = { "Registrar Usuarios", "Crear Evento", "Comprar Entradas", "Mostrar Usuarios",
                "Mostar Eventos" };
        String[] opcionesInicio = { "Iniciar Sesión", "Crear Usuario" };
        int seleccion = JOptionPane.showOptionDialog(null, "Elige una opción", "EVENTOS GO",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesInicio, opcionesInicio[0]);
        switch (seleccion) {
            case 0:
                mostrarJOptioneMessage("A ingresado a  Inicio de Sesion");
                mostrarInicioSesion();
                break;
            case 1:
                mostrarJOptioneMessage("A ingresado a crear usuario");
                break;
            default:
                mostrarJOptioneMessage("Cerrando sistema");
                break;
        }

    }
    
    public String mostrarInicioSesion() {
        MenuSistema menuSistema = new MenuSistema();
        String contraseniaIngresada = "";
        mensaje.append("Ingrese el tipo usuario a crear:").append("\n").append("Administrador o Cliente");
        while (!parar) {
            String roll = menuSistema.mostrarJOptioneInput(mensaje.toString()).toUpperCase();
            System.out.println(roll);
            if (!roll.equals("ADMINISTRADOR") && !roll.equals("CLIENTE")) {
                menuSistema.mostrarJOptioneMessage("Tipo de usuario ingresado inválido");
            } else {
                if (roll.equals("ADMINISTRADOR")) {
                    System.out.println("Entró en el else");
                    mensaje.replace(0, mensaje.length(), "Ingrese la clave del ADMINISTRADOR MASTER");
                    contraseniaIngresada = menuSistema.mostrarJOptioneInput(mensaje.toString());
                    // Quedamos acá seguir la logica

                }
                parar = true;
            }
        }
        return contraseniaIngresada;

    }
    
    public String mostrarJOptioneInput(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarJOptioneMessage(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
