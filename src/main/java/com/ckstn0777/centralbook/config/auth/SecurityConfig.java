package com.ckstn0777.centralbook.config.auth;

import com.ckstn0777.centralbook.entity.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class SecurityConfig  {
    private final CustomOAuth2UserService customOAuthUserService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .headers().frameOptions().sameOrigin()
        .and()
            //////// 권한 설정
            .authorizeRequests() // URL 별 권한 관리를 설정하는 옵션의 시작점.
            .antMatchers("/").permitAll() // 해당 경로는 모두에게 허용
            .antMatchers("/api/v1/**").hasRole(Role.USER.name()) // 해당 경로는 특정 권한에게만 허용
            .anyRequest().authenticated() // 나머지에 대해서는 인증만 했다면 허용
        .and()
            //////// 로그아웃 설정
            .logout()
            .logoutSuccessUrl("/")
        .and()
            ////////// oauth2 로그인
            .oauth2Login() // oauth2 로그인 기능에 대한 여러 설정의 시작점.
            .userInfoEndpoint() // oauth2 로그인 성공 이후 사용자 정보를 가져올 때의 설정
            .userService(customOAuthUserService) // 로그인 성공 시 후속 조치를 진행할 구현체 등록
        ;

        return http.build();
    }
}
