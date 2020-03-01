package com.springboot.demo.service.impl;

import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.SysUser;
import com.mybatis.test.BaseMapperTest;
import com.springboot.demo.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author zhaoasong
 * @Date 2020-2-27 21:10
 */

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public SysUser findById(Long id) {
		return userMapper.selectById(id);
	}

	@Override
	public List<SysUser> findAll() {
		return userMapper.selectAll();
	}
}
