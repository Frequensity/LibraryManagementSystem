package custom_exception;

@SuppressWarnings("serial")
public class BookNotAvailableException extends Exception {
	public BookNotAvailableException (String msg) {
		super(msg);
	}
}
