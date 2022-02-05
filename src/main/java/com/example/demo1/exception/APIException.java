package com.example.demo1.exception;
public class APIException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public APIException(String message)
	{
		super(message);
	}

}

