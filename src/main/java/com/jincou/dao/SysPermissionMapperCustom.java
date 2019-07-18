package com.jincou.dao;

import java.util.List;

import com.jincou.model.SysPermission;


public interface SysPermissionMapperCustom {


    /**
     * 根据用户id查询菜单
     */
    List<SysPermission> findMenuListByUserId(String userid) throws Exception;

    /**
     * 根据用户id查询权限url
     */
    List<SysPermission> findPermissionListByUserId(String userid) throws Exception;
}