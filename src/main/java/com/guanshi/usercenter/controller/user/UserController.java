package com.guanshi.usercenter.controller.user;


import com.guanshi.usercenter.domain.entity.user.User;
import com.guanshi.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {
    private final UserService userService;
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        log.info("findById 被请求了");
        return this.userService.findById(id);
    }

    @GetMapping("")
    public List<User> findAllUsers() {
        log.info("findAllUsers 被请求了");
        return this.userService.findAllUsers();
    }
}
