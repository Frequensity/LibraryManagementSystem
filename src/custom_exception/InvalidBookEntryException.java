package custom_exception;

@SuppressWarnings("serial")
public class InvalidBookEntryException extends Exception {
	public InvalidBookEntryException (String msg) {
		super(msg);
	}
}
