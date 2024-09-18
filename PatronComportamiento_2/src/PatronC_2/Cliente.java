package PatronC_2;

public class Cliente {
    public static void main(String[] args) {
        //Crear Subsistemas
        Autenticacion u1 = new Autenticacion();
        BD r1 = new BD();
        Notificacion n1 = new Notificacion();
    
        //Crear Facade
        Facade facade = new Facade(u1, r1, n1);
    
        facade.Login("Faraon Love Shady");
    }
}
