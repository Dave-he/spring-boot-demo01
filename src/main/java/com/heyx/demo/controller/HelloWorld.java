package com.heyx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Respoody 这个方法或者类所有方法返回的数据直接写给浏览器，如果是对象转为Json
 */

@Controller
public class HelloWorld {


	//代表GET和POST----Mapping
	@RequestMapping(value = "/hello")
	public String hello(){
		return "hello world";
	}
}
