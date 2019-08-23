package com.securityexample.securityexample.dao;/**
 * @author yonrun
 * @Title: UserDao
 * @ProjectName securityexample
 * @Description: TODO
 * @date 2019/8/23 17:28
 */

import com.securityexample.securityexample.entity.Sysuser;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @description
 * @date 2019/8/23
 */
@Repository
public interface UserDao {
    public Sysuser findByUserName(String username);
}
