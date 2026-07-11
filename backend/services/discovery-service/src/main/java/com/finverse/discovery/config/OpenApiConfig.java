package com.finverse.discovery.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

  @Bean
  public OpenAPI finverseOpenAPI() {
    return new OpenAPI()
        .info(
            new Info()
                .title("FinVerse AI Discovery Service API")
                .description("Enterprise Discovery Service for FinVerse AI Platform")
                .version("v1.0.0")
                .contact(new Contact().name("Vaishnavi K").email("vaishnavi22bk@gmail.com"))
                .license(
                    new License()
                        .name("Apache 2.0")
                        .url("https://www.apache.org/licenses/LICENSE-2.0")))
        .externalDocs(
            new ExternalDocumentation()
                .description("Project Documentation")
                .url("https://github.com/2210Vaishnavi/finverse-ai"));
  }
}
