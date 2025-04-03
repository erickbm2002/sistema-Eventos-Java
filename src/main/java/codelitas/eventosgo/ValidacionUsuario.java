package codelitas.eventosgo;

class ValidacionUsuario {
    
    private String claveAdmin = "Admin1234";
    private int intentosClaveAdmin = 1;
    int intentosMaximos = 3;

    //Metodo para validar si el usuario tiene acceso a crear un usuario admin
    public boolean autorizarCrearAdmin(String contraseniaIngresada, StringBuilder mensaje, MenuSistema menuSistema) {
        boolean acceso = false;
        while (this.intentosClaveAdmin <= 4) {
            //Se valida si alcanzó el limite de intento para mostrar el mensaje
            if (this.intentosClaveAdmin > intentosMaximos) {
                mensaje.append(" Limite de intentos alcanzados volviendo al menú principal\n");
                menuSistema.mostrarJOptioneMessage(mensaje.toString());
                return false;
            }
            //Si la clave es correcta ingresa al if en caso contrario se vuelve a validar en un total de 3 intentos
            if (contraseniaIngresada.equals(this.claveAdmin)) {
            mensaje.replace(0, mensaje.length(), "Acceso validado");
            menuSistema.mostrarJOptioneMessage(mensaje.toString());
            return true;
        } else {
            mensaje.replace(0, mensaje.length(), "Contraseña incorrecta, intente de nuevo");
            mensaje.append("\nIntento ").append(this.intentosClaveAdmin).append(" de ")
                    .append(this.intentosMaximos);
            menuSistema.mostrarJOptioneInput(mensaje.toString());
            this.setIntentosClaveAdmin();
        }
            System.out.println(this.intentosClaveAdmin);

        }
        
        return acceso;
  

    }
    


    public void setIntentosClaveAdmin() {
        this.intentosClaveAdmin++;
    }
    
}