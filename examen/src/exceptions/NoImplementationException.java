package exceptions;

public class NoImplementationException extends Exception {
	private int code;
	private String message;
	
	public NoImplementationException() {
		this.code = -1;
		this.message = null;
	}
	
	public NoImplementationException(String message) {
		this.code = 1;
		this.message = message;
	}
	
	public NoImplementationException(int code, String message) {
		super(message);
		this.code = code;
	}
}
