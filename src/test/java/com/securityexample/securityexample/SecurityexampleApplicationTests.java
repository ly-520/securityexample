package com.securityexample.securityexample;

import com.securityexample.securityexample.dao.UserDao;
import com.securityexample.securityexample.entity.Sysuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityexampleApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    public void contextLoads() {
        Sysuser user = userDao.findByUserName("admin");
        System.out.println(user.toString());

    }

}
