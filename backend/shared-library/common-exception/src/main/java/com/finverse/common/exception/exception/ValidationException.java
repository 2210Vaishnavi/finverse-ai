package com.finverse.common.exception.exception;

import com.finverse.common.exception.enums.ErrorCode;

public class ValidationException extends BusinessException{

    public ValidationException(String message) {
        super(ErrorCode.VALIDATION_ERROR, message);
    }
}
