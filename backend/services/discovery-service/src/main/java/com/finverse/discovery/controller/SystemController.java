package com.finverse.discovery.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@Tag(name = "System APIs", description = "System monitoring endpoints")
public class SystemController {

    @Operation(summary = "Application Information")
    @GetMapping("/system/info")
    public Map<String, Object> info(){
        return Map.of(
            "application", "FinVerse Discovery Service",
            "status", "UP",
            "timestamp", LocalDateTime.now()
        );
    }
}
