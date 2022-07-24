package com.guanshi.usercenter.controller.user;

import com.guanshi.usercenter.domain.dto.messaging.UserAddBonusMsgDTO;
import com.guanshi.usercenter.domain.dto.user.UserAddBonusDTO;
import com.guanshi.usercenter.domain.entity.user.User;
import com.guanshi.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BonusController {
    private final UserService userService;

    @PutMapping("/add-bonus")
    public User addBonus(@RequestBody UserAddBonusDTO userAddBonusDTO) {
        Integer userId = userAddBonusDTO.getUserId();
        this.userService.addBonus(
            UserAddBonusMsgDTO.builder()
                    .userId(userId)
                    .bonus(userAddBonusDTO.getBonus())
                    .description("兑换分享")
                    .event("BUY")
                    .build()
        );
        return this.userService.findById(userId);
    }
}
