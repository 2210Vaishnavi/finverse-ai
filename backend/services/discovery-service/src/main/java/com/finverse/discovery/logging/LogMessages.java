package com.finverse.discovery.logging;

public final class LogMessages {
  // Singleton class --> final class, private ctor
  private LogMessages() {}

  public static final String APPLICATION_STARTED = "Discovery Service Started Successfully";
  public static final String SYSTEM_INFO_REQUESTED = "System information endpoint invoked";
  public static final String APPLICATION_STOPPED = "Discovery Service Stopped";
  public static final String HEALTH_CHECK = "Health endpoint accessed";
  public static final String REQUEST_RECEIVED = "Incoming HTTP request received";
  public static final String RESPONSE_SENT = "HTTP response sent successfully";
  public static final String EXCEPTION_OCCURRED = "Unexpected exception occurred";
}
