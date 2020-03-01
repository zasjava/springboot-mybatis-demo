package com.springboot.demo.service;


import com.mybatis.pojo.SysUser;

import java.util.List;


/**
 * @ClassName UserService
 * @Description TODO
 * @Author zhaoasong
 * @Date 2020-2-27 21:08
 **/

public interface UserService {
	SysUser findById(Long id);

	List<SysUser> findAll();
}

