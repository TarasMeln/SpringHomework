package com.taras.exhibition.service.exception;

import com.taras.exhibition.service.model.ErrorType;

public class ExhibitionNotFoundException extends ServiceException{
    private static final String DEFAULT_MESSAGE = "Exhibition is not found!";

    public ExhibitionNotFoundException() {
        super(DEFAULT_MESSAGE);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DATABASE_ERROR_TYPE;
    }

    public ExhibitionNotFoundException(String message) {
        super(message);
    }
}
