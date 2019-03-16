package exceptions;

public class AuthenticationException extends RuntimeException {

    private static final long serialVersionUID = 546616541L;

    public AuthenticationException(String message) {
        super(message);
    }

}
