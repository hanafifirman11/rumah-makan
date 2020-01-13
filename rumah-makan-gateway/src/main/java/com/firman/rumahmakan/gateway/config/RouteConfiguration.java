package com.firman.rumahmakan.gateway.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class RouteConfiguration {

//    @Bean
//    public RouteLocator routes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/warung-padang/**")
//                        .uri("http://localhost:8081"))
//                .route(c -> c
//                        .path("/warung-sunda/**")
//                        .uri("http://localhost:8082"))
//                .build();
//    }

}
