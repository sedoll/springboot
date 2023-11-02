package com.chunjae.test03.exception;

import org.springframework.security.core.AuthenticationException;

public class UserIdException extends AuthenticationException {

    private static final long serialVersionUID = 1L;

    public UserIdException(String msg, Throwable t) {
        super(msg, t);
    }

    public UserIdException(String msg) {
        super(msg);
    }
}
