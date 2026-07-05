package com.finverse.discovery.controller;

import com.finverse.discovery.logging.LogMessages;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@Tag(name = "System APIs", description = "System monitoring endpoints")
public class SystemController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SystemController.class);

    @Operation(summary = "Application Information")
    @GetMapping("/system/info")
    public Map<String, Object> info(){

        LOGGER.info(LogMessages.SYSTEM_INFO_REQUESTED);

        return Map.of(
            "application", "FinVerse Discovery Service",
            "status", "UP",
            "timestamp", LocalDateTime.now()
        );
    }
}
