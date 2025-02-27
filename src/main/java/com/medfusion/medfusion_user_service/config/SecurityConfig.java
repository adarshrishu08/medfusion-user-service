package com.medfusion.medfusion_user_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
//@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers(
//                                "/v3/api-docs/**",  // Allow Swagger API Docs
//                                "/swagger-ui/**",   // Allow Swagger UI
//                                "/swagger-ui.html"  // Allow Swagger HTML
//                        ).permitAll()
//                        .anyRequest().authenticated()
//                )
//                .csrf(csrf -> csrf.disable())  // Disable CSRF for simplicity
//                .formLogin(Customizer.withDefaults()); // Enable form-based login if needed
//
//        return http.build();
//    }
}