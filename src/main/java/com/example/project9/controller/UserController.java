package com.example.project9.controller;

import com.example.project9.entity.KakaoProfile;
import com.example.project9.entity.OAuthToken;
import com.example.project9.entity.User;
import com.example.project9.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RequiredArgsConstructor
@Controller
public class UserController {



    @GetMapping("/auth/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }

    @GetMapping("/auth/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }



//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserService userService;
//
//
//
//    @GetMapping("/auth/kakao/callback")
//    public @ResponseBody String kakaoCallback(String code){
//
//        RestTemplate rt = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
//
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        params.add("grant_type", "authorization_code");
//        params.add("client_id", "e2a74f79d2813eab9b23add1bb2f531a");
//        params.add("redirect_uri", "http://localhost:8080/auth/kakao/callback");
//        params.add("code", code);
//
//        HttpEntity<MultiValueMap<String, String>> kakaoTokenRequest = new HttpEntity<>(params, headers);
//
//        ResponseEntity<String> response = rt.exchange(
//                "https://kauth.kakao.com/oauth/token",
//                HttpMethod.POST,
//                kakaoTokenRequest,
//                String.class
//        );
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        OAuthToken oAuthToken = null;
//        try{
//            oAuthToken = objectMapper.readValue(response.getBody(), OAuthToken.class);
//        } catch (JsonMappingException e){
//            e.printStackTrace();
//        } catch (JsonProcessingException e){
//            e.printStackTrace();
//        }
//
//        System.out.println("카카오 엑세스 토른 : " + oAuthToken.getAccess_token());
//
//
//        RestTemplate rt2 = new RestTemplate();
//
//        HttpHeaders headers2 = new HttpHeaders();
//        headers2.add("Authorization", "Bearer " + oAuthToken.getAccess_token());
//        headers2.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
//
//        HttpEntity<MultiValueMap<String, String>> kakaoProfileRequest2 = new HttpEntity<>(headers2);
//
//        ResponseEntity<String> response2 = rt2.exchange(
//                "https://kapi.kakao.com/v2/user/me",
//                HttpMethod.POST,
//                kakaoProfileRequest2,
//                String.class
//        );
//
//        System.out.println(response2.getBody());
//
//
//        ObjectMapper objectMapper2 = new ObjectMapper();
//        KakaoProfile kakaoProfile = null;
//        try{
//            kakaoProfile = objectMapper2.readValue(response2.getBody(), KakaoProfile.class);
//        } catch (JsonMappingException e){
//            e.printStackTrace();
//        } catch (JsonProcessingException e){
//            e.printStackTrace();
//        }
//
//        System.out.println("카카오 아이디(번호) : " + kakaoProfile.getId());
//        System.out.println("카카오 이메일 : " + kakaoProfile.getKakao_account().getEmail());
//
//        System.out.println("카카오 유저네임 : " + kakaoProfile.getKakao_account().getEmail()+"_"+kakaoProfile.getId());
//        System.out.println("블로그 서버 이메일 : " + kakaoProfile.getKakao_account().getEmail());
//        UUID garbagePassword = UUID.randomUUID();
//        System.out.println("블로그서버 패스워드 : " + garbagePassword);
//
//        User kakaoUser = User.builder()
//                .username(kakaoProfile.getKakao_account().getEmail()+"_"+kakaoProfile.getId())
//                .password(garbagePassword.toString())
//                .email(kakaoProfile.getKakao_account().getEmail())
//                .build();
//
//        User originUser = userService.userFind(kakaoUser.getUsername());
//
//        if(originUser.getUsername() == null){
//            System.out.println("기존 회원이 아닙니다.");
//            userService.join(kakaoUser);
//        }
//
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(kakaoUser.getUsername(), kakaoUser.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//
//
//        return "/redirect:/";
//    }
}

