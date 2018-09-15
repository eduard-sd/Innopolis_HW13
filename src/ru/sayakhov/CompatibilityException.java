package ru.sayakhov;

public class CompatibilityException extends Exception {
    public CompatibilityException() {
    }

    public CompatibilityException(String message) {
        super(message);
    }

    public CompatibilityException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompatibilityException(Throwable cause) {
        super(cause);
    }

    public CompatibilityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
