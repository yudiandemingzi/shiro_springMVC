package com.jincou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jincou.model.SysPermission;
import com.jincou.model.SysUser;

/**
 * @Description: 用户系统
 *
 * @author xub
 * @date 2018/7/18 上午11:42
 */
@Service
public interface SysService {


    /**
     * @Description: 根据用户账号查询用户信息
     * @author xub
     */
    SysUser findSysUserByUserCode(String userCode) throws Exception;


    /**
     * @Description: 根据用户id查询权限范围的菜单
     * @author xub
     */
    List<SysPermission> findMenuListByUserId(String userid) throws Exception;

    /**
     * @Description: 根据用户id查询权限范围的url
     * @author xub
     */
    List<SysPermission> findPermissionListByUserId(String userid) throws Exception;
}
