package custom_exception;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception {
	public BookNotFoundException (String msg) {
		super(msg);
	}
}
