//package com.programme.ProgramMe.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable()) // Disable CSRF protection
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().permitAll() // Permit all requests without authentication
//                )
//                .formLogin(form -> form.disable()) // Disable form login
//                .httpBasic(httpBasic -> httpBasic.disable()); // Disable HTTP basic authentication
//        return http.build();
//    }
//}
