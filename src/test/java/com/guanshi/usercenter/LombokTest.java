package com.guanshi.usercenter;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokTest {
    public static void main(String[] args) {
        UserRegisterDTO build = UserRegisterDTO.builder()
                .email("adfasdf")
                .password("fadsdfad")
                .confirmPassword("fasdfafaa")
                .build();

        log.info("沟造出来的UserRegisterDTO = {}", build);
    }

}

@Data
@Builder
class UserRegisterDTO {
    private String email;
    private String password;
    private String confirmPassword;
    private String mobile;
    private boolean agreement;

}