package com.example.RedditBackend.exception;

public class SpringException extends RuntimeException {
    public SpringException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringException(String exMessage) {

    }
}
