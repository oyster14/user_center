package com.guanshi.usercenter.controller.user;


import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.guanshi.usercenter.auth.CheckLogin;
import com.guanshi.usercenter.domain.dto.user.JwtTokenRespDTO;
import com.guanshi.usercenter.domain.dto.user.LoginRespDTO;
import com.guanshi.usercenter.domain.dto.user.UserLoginDTO;
import com.guanshi.usercenter.domain.dto.user.UserRespDTO;
import com.guanshi.usercenter.domain.entity.user.User;
import com.guanshi.usercenter.service.user.UserService;
import com.guanshi.usercenter.util.JwtOperator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {
    private final UserService userService;
    private final WxMaService wxMaService;

    private final JwtOperator jwtOperator;
    @GetMapping("/{id}")
    @CheckLogin
    public User findById(@PathVariable Integer id) {
        log.info("findById 被请求了");
        return this.userService.findById(id);
    }

    @GetMapping("")
    public List<User> findAllUsers() {
        log.info("findAllUsers 被请求了");
        return this.userService.findAllUsers();
    }

    /**
     * 模拟假的登录
     * @param
     * @return
     * @throws WxErrorException
     */
    @GetMapping("/gen-token")
    public String genToken() {
        Map<String, Object> userInfo = new HashMap<>(3);
        userInfo.put("id", 1);
        userInfo.put("wxNickName", "汪汪汪");
        userInfo.put("role", "admin");
        return this.jwtOperator.generateToken(userInfo);
    }


    @PostMapping("/login")
    public LoginRespDTO login(@RequestBody UserLoginDTO loginDTO) throws WxErrorException {
//        微信小程序服务端校验是否登录
        WxMaJscode2SessionResult result = this.wxMaService.getUserService()
                .getSessionInfo(loginDTO.getCode());

//        微信的openId
        String openId = result.getOpenid();

//        看用户是否注册，没注册就注册一下，注册了就颁发token
        User user = this.userService.login(loginDTO, openId);

//        颁发token
        Map<String, Object> userInfo = new HashMap<>(3);
        userInfo.put("id", user.getId());
        userInfo.put("wxNickName", user.getWxNickname());
        userInfo.put("role", user.getRoles());

        String token = jwtOperator.generateToken(userInfo);
        log.info("用户：{}登录成功， 生成的token：{}，有效期到：{}",
                loginDTO.getWxNickname(),
                token,
                jwtOperator.getExpirationDateFromToken(token)
        );
//        构建响应
        return LoginRespDTO.builder()
                .user(
                        UserRespDTO.builder()
                                .id(user.getId())
                                .avatarUrl(user.getAvatarUrl())
                                .bonus(user.getBonus())
                                .wxNickname(user.getWxNickname())
                                .build()
                )
                .token(
                        JwtTokenRespDTO.builder()
                                .expirationTime(jwtOperator.getExpirationDateFromToken(token).getTime())
                                .token(token)
                                .build()
                )
                .build();
    }
}
