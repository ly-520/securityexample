package com.securityexample.securityexample.controller;/**
 * @author yonrun
 * @Title: TestController
 * @ProjectName securityexample
 * @Description: TODO
 * @date 2019/8/23 17:47
 */

import com.securityexample.securityexample.dao.UserDao;
import com.securityexample.securityexample.entity.Sysuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @description
 * @date 2019/8/23
 */
@RestController
public class TestController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/test")
    public String test(){
        System.out.println("====================================");
        Sysuser user = userDao.findByUserName("admin");
        return "user";
    }
}
