package codelitas.eventosgo;

public class Main {
  /*   public static void main(String[] args) {
    SistemaEventos.mostrarJOptioneMessage("Bienvenido al Sistema de Eventos de EventosGO\n" +
            "Derechos Resevas por CODELITAS");
    SistemaEventos sistema = new SistemaEventos();
    SistemaEventos.mostrarMenuPrincipal(sistema);
  
  } */
   
  public static void main(String[] args) {
      MenuSistema menuSistema = new MenuSistema();
      menuSistema.mostrarJOptioneMessage("Bienvenidos al Sistema de Eventos\n Derechos reservados CODELITAS");
      menuSistema.menuPrincipal();
  }


}
