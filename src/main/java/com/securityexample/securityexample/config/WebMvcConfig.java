package com.securityexample.securityexample.config;/**
 * @author yonrun
 * @Title: WebMvcConfig
 * @ProjectName securityexample
 * @Description: TODO
 * @date 2019/8/23 17:39
 */

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author
 * @description
 * @date 2019/8/23
 */
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}
