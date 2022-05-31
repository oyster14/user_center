package com.guanshi.usercenter.service.user;

import com.guanshi.usercenter.dao.user.UserMapper;
import com.guanshi.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final UserMapper userMapper;

    public User findById(Integer id) {
        User user = this.userMapper.selectByPrimaryKey(id);
        if (user == null) {
            throw new IllegalArgumentException("id不能找不到用户");
        } else {
            return user;
        }
    }

    public List<User> getAllUsers() {return this.userMapper.selectAll();}

}
