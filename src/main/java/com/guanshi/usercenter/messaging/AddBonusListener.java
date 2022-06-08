package com.guanshi.usercenter.messaging;

import com.guanshi.usercenter.dao.bonus.BonusEventLogMapper;
import com.guanshi.usercenter.dao.user.UserMapper;
import com.guanshi.usercenter.domain.dto.messaging.UserAddBonusMsgDTO;
import com.guanshi.usercenter.domain.entity.bonus.BonusEventLog;
import com.guanshi.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.base.select.SelectByPrimaryKeyMapper;

import java.util.Date;

@Service
@RocketMQMessageListener(consumerGroup = "consumer-group", topic = "add-bonus")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class AddBonusListener implements RocketMQListener<UserAddBonusMsgDTO> {
    private final UserMapper userMapper;
    private final BonusEventLogMapper bonusEventLogMapper;

    @Override
    public void onMessage(UserAddBonusMsgDTO userAddBonusMsgDTO) {
//        当收到消息执行的业务
//        1. 为用户加积分
        Integer userId = userAddBonusMsgDTO.getUserId();
        Integer bonus = userAddBonusMsgDTO.getBonus();
        User user = this.userMapper.selectByPrimaryKey(userId);

        user.setBonus(user.getBonus() + bonus);
        this.userMapper.updateByPrimaryKeySelective(user);

//        2. 记录到bonus_event_log

        this.bonusEventLogMapper.insert(
                BonusEventLog.builder()
                        .userId(userId)
                        .value(bonus)
                        .event("CONTRIBUTION")
                        .createTime(new Date())
                        .description("投稿加积分")
                        .build()
        );
        log.info("积分添加完毕。。。。。");

    }
}
