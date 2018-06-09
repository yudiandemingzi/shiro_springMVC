package com.jincou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jincou.model.SysPermission;
import com.jincou.model.SysUser;
@Service
public interface SysService {
		
	   //根据用户账号查询用户信息
		public SysUser findSysUserByUserCode(String userCode)throws Exception;
		
		//根据用户id查询权限范围的菜单
		public List<SysPermission> findMenuListByUserId(String userid) throws Exception;
		
		//根据用户id查询权限范围的url
		public List<SysPermission> findPermissionListByUserId(String userid) throws Exception;
}
