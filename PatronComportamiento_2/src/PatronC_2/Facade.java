package PatronC_2;


public class Facade {
    private Autenticacion usuario;
    private BD registro;
    private Notificacion notificacion;

    public Facade(Autenticacion usuario, BD registro, Notificacion notificacion) {
        this.usuario = usuario;
        this.registro = registro;
        this.notificacion = notificacion;
    }
    
    public void Login(String user){
        System.out.println("Usuario obtenido");
        usuario.verificar();
        registro.consultarBD(usuario);
        notificacion.notificar();
    }
}
