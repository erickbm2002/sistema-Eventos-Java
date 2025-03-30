package codelitas.eventosgo;

import codelitas.eventosgo.Usuario.RollUsuario;

class ValidacionUsuario {
    private boolean parar = false;
    private String claveAdmin = "Admin1234";

    public static void main(String[] args) {
        ValidacionUsuario validacion = new ValidacionUsuario();
        MenuSistema menuSistema = new MenuSistema();
        validacion.autorizarCrearAdmin(menuSistema);
    }

    public void autorizarCrearAdmin(MenuSistema menuSistema) {
        //Se crea la logica para valiadr si el usuario puede crear un usuario de tipo ADMIN
        StringBuilder mensaje = new StringBuilder();
        Usuario usuario = new Usuario();
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
                    menuSistema.mostrarJOptioneInput(mensaje.toString());
                    //Quedamos acá seguir la logica

                }
                parar = true;
            }
        }
    }


    
}