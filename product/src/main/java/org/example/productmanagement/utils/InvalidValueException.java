package org.example.productmanagement.utils;

public class InvalidValueException extends Exception {
    public InvalidValueException() {}

    public InvalidValueException(String message) {
        super(message);
    }
}
