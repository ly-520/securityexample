package com.securityexample.securityexample.controller;/**
 * @author yonrun
 * @Title: HomeController
 * @ProjectName securityexample
 * @Description: TODO
 * @date 2019/8/23 17:38
 */

import com.securityexample.securityexample.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 * @description
 * @date 2019/8/23
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model){
        System.out.println("+========================================================================");
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }
}
