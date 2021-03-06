package com.freddiemac.saprmm;

/**
 * Generic SAPRMM-related exception.
 */
public class SAPRMMException extends RuntimeException {
    public SAPRMMException(String message) { super(message); }
    public SAPRMMException(String message, Throwable cause) { super(message, cause); }
    public SAPRMMException() { super(); }
}
