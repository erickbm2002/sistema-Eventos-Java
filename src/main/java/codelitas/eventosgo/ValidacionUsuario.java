package codelitas.eventosgo;

import javax.swing.JOptionPane;

class ValidacionUsuario {
    
    private String claveAdmin = "Admin1234";
    private int intentosClaveAdmin = 1;
    public static void main(String[] args) {
        ValidacionUsuario validacion = new ValidacionUsuario();
        validacion.autorizarCrearAdmin(validacion);
        System.out.println();

        
    }
 
    public boolean autorizarCrearAdmin(/* String contraseniaIngresada */ ValidacionUsuario validacion) {//RECPRDAR QUE SE VA A RECIBIR LA CONTRASEÑA 
        boolean acceso = false;
        System.out.println(this.claveAdmin);
        if (this.intentosClaveAdmin > 3) {
            System.out.println("Limite de intentos alcanzados volviendo al menú principal");
            return false;
        }  
        String contraseniaIngresada = JOptionPane.showInputDialog("Ingrese la contraseña");
        //Se crea la logica para valiadr si el usuario puede crear un usuario de tipo ADMIN
        if (contraseniaIngresada.equals(this.claveAdmin)) {
            System.out.println("Acceso permitido Ingresando en MODO ADMINISTRADOR");
            return true;
        } else {
            while (this.intentosClaveAdmin <= 3) {
                System.out.println("Contraseña incorrecta, intente de nuevo \nIntentos disponibles "
                        + this.intentosClaveAdmin + " de " + "3");
                validacion.setIntentosClaveAdmin();
                //autorizarCrearAdmin(validacion);

            }

        }
        return acceso;
    
    }

    public void validarClaveAdmin() {

    }


    public void setIntentosClaveAdmin() {
        this.intentosClaveAdmin++;
    }
    
}