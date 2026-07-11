package com.finverse.common.exception.dto;

import com.finverse.common.exception.enums.ErrorCode;
import lombok.Getter;
import lombok.Builder;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Builder
public class ApiError {
    private LocalDateTime timestamp;

    private int status;

    private String error;

    private String message;

    private ErrorCode errorCode;

    private String path;

    private Map<String, String> validationErrors;
}
