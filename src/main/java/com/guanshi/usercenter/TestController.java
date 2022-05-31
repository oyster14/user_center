package com.guanshi.usercenter;

import com.guanshi.usercenter.dao.user.UserMapper;
import com.guanshi.usercenter.domain.entity.user.User;
import com.guanshi.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class TestController {
    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/test")
    public User testInsert() {
        User user = new User();
        user.setWxNickname("asdfadsff");
        user.setAvatarUrl("xxx");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);
        return user;
    }

    @PostMapping("/add")
    public User testAdd(@RequestParam("WxNickname") String WxNickname, @RequestParam("AvatarUrl") String AvatarUrl) {
        User user = new User();
        user.setWxNickname(WxNickname);
        user.setAvatarUrl(AvatarUrl);
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);
        return user;
    }

    @PutMapping("users/{id}")
    public User updateAvatarUrl(@PathVariable Integer id, @RequestParam("AvatarUrl") String AvatarUrl) {
        User user = this.userMapper.selectByPrimaryKey(id);
        user.setAvatarUrl(AvatarUrl);
        this.userMapper.updateByPrimaryKey(user);
        return user;
    }

    @GetMapping("users")
    public List<User> getAllUsers() {
        log.info("我想找全部的users");
        return this.userService.getAllUsers();
    }

    @PostMapping("users")
    public User addOneUser(@RequestBody User user) {
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        this.userMapper.insertSelective(user);
        return user;
    }


    @GetMapping("/q")
    public User query(User user) {
        return user;
    }
}
