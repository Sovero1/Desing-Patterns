package inicial.ejercicio01;

public class Logger {
    
    private static Logger instance;
    // Constructor
    private Logger() {}
    
    public static Logger createInstance(){
        if(instance==null){
            return new Logger();
        }
        else
            return instance;
    }

    public void log(String mensaje) {
        System.out.println("Log: " + mensaje);
    }
}
