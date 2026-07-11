package com.finverse.discovery.health;

import java.time.Instant;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DiscoveryHealthIndicator implements HealthIndicator {
  @Override
  public Health health() {
    return Health.up()
        .withDetail("service", "Discovery Service")
        .withDetail("version", "0.1.0")
        .withDetail("timestamp", Instant.now())
        .build();
  }
}
