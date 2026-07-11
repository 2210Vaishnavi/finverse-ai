package com.finverse.common.exception.enums;

//public enum ErrorCode {
//
//    INTERNAL_SERVER_ERROR,
//    VALIDATION_ERROR,
//    RESOURCE_NOT_FOUND,
//    BAD_REQUEST,
//    UNAUTHORIZED,
//    FORBIDDEN,
//    CONFLICT
//}


import org.springframework.http.HttpStatus;

public enum ErrorCode {

    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR),

    VALIDATION_ERROR(HttpStatus.BAD_REQUEST),

    RESOURCE_NOT_FOUND(HttpStatus.NOT_FOUND),

    BAD_REQUEST(HttpStatus.BAD_REQUEST),

    UNAUTHORIZED(HttpStatus.UNAUTHORIZED),

    FORBIDDEN(HttpStatus.FORBIDDEN),

    CONFLICT(HttpStatus.CONFLICT);

    private final HttpStatus httpStatus;

    ErrorCode(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
