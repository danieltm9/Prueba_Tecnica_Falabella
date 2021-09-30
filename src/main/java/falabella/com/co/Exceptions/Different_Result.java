package falabella.com.co.Exceptions;

public class Different_Result extends AssertionError {

    private static final String ErrorCompra= "Error compra incompleta";

    public static String MensajeError() {
        return ErrorCompra;
    }

    public Different_Result(String message, Throwable cause) {
        super(message, cause);
    }

}
