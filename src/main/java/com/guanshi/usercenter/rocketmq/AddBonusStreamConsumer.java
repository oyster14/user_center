package com.guanshi.usercenter.rocketmq;

import com.guanshi.usercenter.domain.dto.messaging.UserAddBonusMsgDTO;
import com.guanshi.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddBonusStreamConsumer {
    private final UserService userService;

    @StreamListener(Sink.INPUT)
    public void receive(UserAddBonusMsgDTO message) {
        message.setEvent("CONTRIBUTE");
        message.setDescription("投稿加积分");
        this.userService.addBonus(message);
    }


}
