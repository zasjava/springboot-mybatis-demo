package com.springboot.demo.controller;


import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.SysUser;
import com.mybatis.test.BaseMapperTest;
import com.springboot.demo.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @ClassName UserController
 * @Description TODO
 * @Author zhaoasong
 * @Date 2020-2-27 21:13
 **/

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("users/{id}")
	SysUser getUserById(@PathVariable("id") Long id) {
		return userService.findById(id);
	}

	@RequestMapping("users")
	List<SysUser> findAll(){
		return userService.findAll();
	}

}

