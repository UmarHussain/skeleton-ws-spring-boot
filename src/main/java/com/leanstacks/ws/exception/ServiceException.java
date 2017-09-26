package com.leanstacks.ws.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	private String code;
    private String message;

    public ServiceException() {
    }

    public ServiceException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ServiceException(ExceptionType exceptionType ) {
        this.code = exceptionType.getCode();
        this.message = exceptionType.getMessage();
    }

    public ServiceException(ExceptionType exceptionType,Class<?> clazz) {
        this.code = exceptionType.getCode();
        this.message = exceptionType.getMessage()+" "+clazz.getName();
    }

    public ServiceException(ExceptionType exceptionType, String customMessage, Class<?> clazz) {
        this.code = exceptionType.getCode();
        this.message = exceptionType.getMessage() + " " + customMessage + " " + clazz.getName();
    }

    public ServiceException(ExceptionType exceptionType,String customMessage) {
        this.code = exceptionType.getCode();
        this.message = exceptionType.getMessage()+" "+customMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Service Exception[ Code: " + code + ", Message: " + message + "]";
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
