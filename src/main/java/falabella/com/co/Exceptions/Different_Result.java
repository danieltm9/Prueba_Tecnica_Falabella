package falabella.com.co.Exceptions;

public class Different_Result extends AssertionError {

    private static final String PurchaseError= "Error compra incompleta";

    public static String ErrorMessage() {
        return PurchaseError;
    }

    public Different_Result(String message, Throwable cause) {
        super(message, cause);
    }

}
