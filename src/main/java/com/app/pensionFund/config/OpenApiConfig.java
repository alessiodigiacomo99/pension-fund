package com.app.pensionFund.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The type Open api config.
 */
@Configuration
public class OpenApiConfig {

    /**
     * Custom open api open api.
     *
     * @return the open api
     */
    @Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Pension Funds").description("Pension Funds"));
	}

}