package com.taras.exhibition.service.exception;

import com.taras.exhibition.service.model.ErrorType;

public class UserNotFoundException extends ServiceException {
    private static final String DEFAULT_MESSAGE = "User is not found!";

    public UserNotFoundException() {
        super(DEFAULT_MESSAGE);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DATABASE_ERROR_TYPE;
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
