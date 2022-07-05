package fahrenheitexception;

public class TemperatureException extends Exception {
    public TemperatureException(String msg){
        super(msg);
    }

    public TemperatureException(){
        super("Erro de temperatura!");
    }
}