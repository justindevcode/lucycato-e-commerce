package org.lucycato.mvc.exceptionhandler;

import org.lucycato.common.api.Erroresponse;
import org.lucycato.common.error.ErrorCodeImpl;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Order(Integer.MAX_VALUE)
@RestControllerAdvice
public class WebMvcGlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Erroresponse<Object>> handlerGlobalException(Exception ex) {
        // TODO: Refactoring
        ex.printStackTrace();

        return ResponseEntity
                .status(ErrorCodeImpl.INTERNAL_SERVER.getHttpCode())
                .body(Erroresponse.ERROR(ErrorCodeImpl.INTERNAL_SERVER));
    }
}
