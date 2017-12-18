package conception.ui.actions;

public class UiUserException extends RuntimeException {

	private static final long serialVersionUID = 1L;

    public UiUserException() {
        super();
    }

    public UiUserException(String message) {
        super(message);
    }

    public UiUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UiUserException(Throwable cause) {
        super(cause);
    }

}
