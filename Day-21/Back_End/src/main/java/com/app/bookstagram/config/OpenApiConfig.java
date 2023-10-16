package com.app.bookstagram.config;

import com.app.bookstagram.constant.Api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(contact = @Contact(name = "CHITHARANJAN T", email = "chithuc051@gmail.com", url = "https://some-url.com"), description = "This is open api documentation for Student_Collaboration_Platform", title = "TeamConnect", version = "1.0", license = @License(name = "MIT", url = "https://some-url.com"), termsOfService = "Terms of service"), servers = @Server(description = "DEV ENV", url = Api.DEFAULT))
@SecurityScheme(name = "bearerAuth", description = "JWT auth description", scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", in = SecuritySchemeIn.HEADER)
public class OpenApiConfig {
    
}
