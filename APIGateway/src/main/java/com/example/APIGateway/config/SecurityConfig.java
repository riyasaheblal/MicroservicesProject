//package com.example.APIGateway.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
//@EnableWebFluxSecurity
//public class SecurityConfig {
//
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http){
//
//        http
//                .authorizeExchange(
//                        auth -> auth
//                                .anyExchange()
//                                .authenticated())
//                .oauth2ResourceServer(
//                        a2rs -> a2rs.
//                )
//                .
//        ;
//
//        return http.build();
//    }
//
//}
