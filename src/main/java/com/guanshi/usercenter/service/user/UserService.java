package com.guanshi.usercenter.service.user;

import com.guanshi.usercenter.dao.bonus.BonusEventLogMapper;
import com.guanshi.usercenter.dao.user.UserMapper;
import com.guanshi.usercenter.domain.dto.messaging.UserAddBonusMsgDTO;
import com.guanshi.usercenter.domain.entity.bonus.BonusEventLog;
import com.guanshi.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserService {
    private final UserMapper userMapper;

    private final BonusEventLogMapper bonusEventLogMapper;

    public User findById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> findAllUsers() {
        return this.userMapper.selectAll();
    }

    @Transactional(rollbackFor = Exception.class)
    public void addBonus(UserAddBonusMsgDTO userAddBonusMsgDTO) {
        // 1. 为用户加积分
        Integer userId = userAddBonusMsgDTO.getUserId();
        Integer bonus = userAddBonusMsgDTO.getBonus();
        User user = this.userMapper.selectByPrimaryKey(userId);

        user.setBonus(user.getBonus() + bonus);
        this.userMapper.updateByPrimaryKeySelective(user);

        // 2. 记录日志到bonus_event_log表里面
        this.bonusEventLogMapper.insert(
                BonusEventLog.builder()
                        .userId(userId)
                        .value(bonus)
                        .event(userAddBonusMsgDTO.getEvent())
                        .createTime(new Date())
                        .description(userAddBonusMsgDTO.getDescription())
                        .build()
        );
        log.info("积分添加完毕...");
    }
}
