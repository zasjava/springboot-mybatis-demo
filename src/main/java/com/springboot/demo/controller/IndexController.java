package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author zhaoasong
 * @Date 2020-2-26 17:12
 **/

@RestController
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "hello world !";
	}
}
