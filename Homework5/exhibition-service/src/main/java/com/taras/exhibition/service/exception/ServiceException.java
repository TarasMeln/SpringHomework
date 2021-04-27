package com.taras.exhibition.service.exception;

import com.taras.exhibition.service.model.ErrorType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode()
public class ServiceException extends RuntimeException {
    private ErrorType errorType;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ErrorType getErrorType() {
        return ErrorType.FATAL_ERROR_TYPE;
    }
}
