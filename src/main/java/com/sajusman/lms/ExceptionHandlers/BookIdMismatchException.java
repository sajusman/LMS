package com.sajusman.lms.ExceptionHandlers;

public class BookIdMismatchException extends RuntimeException {

    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}