package com.liuyujie.springboot_jpa;

import com.liuyujie.springboot_jpa.dao.UserRepository;
import com.liuyujie.springboot_jpa.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @program: springboot-test
 * @description:
 * @author: liuyishou
 * @create: 2020-06-10 23:07
 **/
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class MyTest {
@Autowired
    private UserRepository userRepository;

    @Test
    public void test01() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }
}
