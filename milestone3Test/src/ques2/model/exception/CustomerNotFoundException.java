package ques2.model.exception;

public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 685025442025149581L;

	public CustomerNotFoundException(String s) {
		super(s);
	}
}
