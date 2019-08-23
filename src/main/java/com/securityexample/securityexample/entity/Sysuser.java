package com.securityexample.securityexample.entity;/**
 * @author yonrun
 * @Title: Sysuser
 * @ProjectName securityexample
 * @Description: TODO
 * @date 2019/8/23 17:26
 */

import lombok.Data;

import java.util.List;

/**
 * @author
 * @description
 * @date 2019/8/23
 */
@Data
public class Sysuser {
    private Integer id;
    private String username;
    private String password;

    private List<SysRole> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
