package com.hao.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServiceException(String msg) {
		super(msg);
	}

	public ServiceException(String msg, Throwable e) {
		super(msg, e);
	}

	public ServiceException(Throwable e) {
		super(e);
	}

}
