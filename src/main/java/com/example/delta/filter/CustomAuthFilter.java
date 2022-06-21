package com.example.delta.filter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


@Slf4j
public class CustomAuthFilter extends UsernamePasswordAuthenticationFilter {;
    private final AuthenticationManager authenticationManager;
    public CustomAuthFilter(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        ObjectMapper mapper=new ObjectMapper();
        response.setContentType("application/json");
        Gson gson = new Gson();
        String username;
        String password;


        try {
            User c1 = gson.fromJson(request.getReader(), User.class);

            username = c1.getUsername();
            password = c1.getPassword();
            log.info(username, "username");
            log.info(password, "password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        log.info(username,"username");log.info(password,"password");
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        return authenticationManager.authenticate(authenticationToken);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {

        //        User user = (User) authResult.getPrincipal();
//        Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
//        String accessToken = JWT.create().withSubject(user.getUsername())
//                .withExpiresAt(new Date(System.currentTimeMillis() +1*6*10))
//                .withIssuer(request.getRequestURL().toString())
//                .withClaim("roles",user.getAuthorities().stream()
//                        .map(GrantedAuthority::getAuthority).collect(Collectors.joining()))
//                .sign(algorithm);

//        String refreshToken = JWT.create().withSubject(user.getUsername())
//                .withExpiresAt(new Date(System.currentTimeMillis() +1*6*10))
//                .withIssuer(request.getRequestURL().toString())
//                .sign(algorithm);
//
//        response.setHeader("accessToken",accessToken);
//        response.setHeader("refreshToken",refreshToken);
        System.out.printf("muqemmel");
//        LoginController.login();
    }
}
