package com.bilgeadam.boost.course02;

public class IllegalMariageException extends Exception {
	private static final long serialVersionUID = 8686880247954721905L;

	public IllegalMariageException(String message) {
		super(message);
	}

	@Override
	public String getLocalizedMessage() {
		String retval = "Özelleştirilmiş mesaj\n" + super.getLocalizedMessage();
		return retval;
	}
}
