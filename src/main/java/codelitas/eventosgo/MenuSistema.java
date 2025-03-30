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

    public void menuPrincipal() {
        String[] opcionesMenu = { "Registrar Usuarios", "Crear Evento", "Comprar Entradas", "Mostrar Usuarios",
                "Mostar Eventos" };
        String[] opcionesInicio = { "Iniciar Sesión", "Crear Usuario" };
        int seleccion = JOptionPane.showOptionDialog(null, "Elige una opción", "EVENTOS GO",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesInicio, opcionesInicio[0]);
        switch (seleccion) {
            case 0:
                mostrarJOptioneMessage("A ingresado a  Inicio de Sesion");
                break;
            case 1:
                mostrarJOptioneMessage("A ingresado a crear usuario");
                break;
            default:
                mostrarJOptioneMessage("Cerrando sistema");
                break;
        }
        

    }
    
    public String mostrarJOptioneInput(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarJOptioneMessage(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
