package com.guanshi.usercenter.domain.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRespDTO {
    /**
     * 用户id
     */
    private Integer id;
    private String avatarUrl;
    private Integer bonus;
    private String wxNickname;
}
