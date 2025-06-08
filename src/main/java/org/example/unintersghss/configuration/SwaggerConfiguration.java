package org.example.unintersghss.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;


public class SwaggerConfiguration {

  @Bean
  public OpenAPI openAPI() {

    var info = new Info()
        .title("Uninter SGHSS")
        .description("Sistema de Gestão Hospitalar e de Serviços de Saúde da instituição VidaPlus")
        .version("v0.0.1");

    return new OpenAPI()
        .info(info);
  }
}
