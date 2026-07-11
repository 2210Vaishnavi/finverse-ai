package com.finverse.common.exception.exception;

import com.finverse.common.exception.enums.ErrorCode;

public class ResourceNotFoundException extends BusinessException{

    public ResourceNotFoundException(String message){
        super(ErrorCode.RESOURCE_NOT_FOUND, message);
    }
}
