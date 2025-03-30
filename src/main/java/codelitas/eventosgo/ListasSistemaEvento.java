package codelitas.eventosgo;

import java.util.ArrayList;

import codelitas.eventosgo.Usuario.RollUsuario;

public class ListasSistemaEvento {
    //Atributops
    public ArrayList<Usuario> listaUsuarios;
    public ArrayList<Usuario> listaAdministradores;
    public ArrayList<Evento> listaEventos;

    
    
    //Constructor
    public ListasSistemaEvento() {
        listaUsuarios = new ArrayList<>();
        listaAdministradores = new ArrayList<>();
        listaEventos = new ArrayList<>();
    }
     
    //Metodos
    public void agregarUsuarioLista(Usuario usuario) {
        if (usuario.getRollUsuario() == RollUsuario.ADMINISTRADOR) {
            listaAdministradores.add(usuario);
        }
        if (usuario.getRollUsuario() == RollUsuario.CLIENTE) {
            listaUsuarios.add(usuario);
        }
    }
    
    public void agregarEventoLista(Evento evento) {
        listaEventos.add(evento);
    }


    public void mostrasListaUsuarios() {
        int tipoUsuario = Integer.parseInt(SistemaEventos
                .mostrarJOptioneInput("¿Qué tipo de usuarios desea imprmir:\n1.Administradores\n2.Clientes"));
        if (tipoUsuario == 1) {
            for (int i = 0; i < listaAdministradores.size(); i++) {
                Usuario usuariAdmin = listaAdministradores.get(i);
                usuariAdmin.mostrarDatos();
            }
        } else if (tipoUsuario == 2) {
            for (int i = 0; i < listaUsuarios.size(); i++) {
                Usuario usuarioCliente = listaUsuarios.get(i);
                usuarioCliente.mostrarDatos();
            }
        } else {
            SistemaEventos.mostrarJOptioneMessage("Tipo ingresado incorrecto");
        }

    }
    
    public void mostrarListaEventos() {
        for (int i = 0; i < listaEventos.size(); i++) {
            Evento evento = listaEventos.get(i);
            evento.mostrarDatosEvento();
        }
        

    }

}