package com.lojac.demo.service.execption;

public class ObjectNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String text) {
		super(text);
	}
	public ObjectNotFoundException(String text, Throwable er) {
		super(text, er);
	}

}
