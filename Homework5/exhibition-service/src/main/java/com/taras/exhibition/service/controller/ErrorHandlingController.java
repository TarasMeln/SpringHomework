package com.taras.exhibition.service.controller;

import com.taras.exhibition.service.exception.ServiceException;
import com.taras.exhibition.service.exception.UserNotFoundException;
import com.taras.exhibition.service.model.Error;
import com.taras.exhibition.service.model.ErrorType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class ErrorHandlingController {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<Error> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        log.error("HandleMethodArgumentNotValidException: message{}",ex.getMessage());
        return ex.getBindingResult().getAllErrors().stream()
        .map(err ->new Error(err.getDefaultMessage(),ErrorType.VALIDATION_ERROR_TYPE,LocalDateTime.now()))
                .collect(Collectors.toList());
    }
    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleServiceException(ServiceException ex) {
        log.error("HandleServiceException: message{}",ex.getMessage());
        return new Error(ex.getMessage(),ex.getErrorType(),LocalDateTime.now());
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleException(Exception ex) {
        log.error("HandleException: message{}",ex.getMessage());
        return new Error(ex.getMessage(),ErrorType.FATAL_ERROR_TYPE,LocalDateTime.now());
    }
}
