package com.wuqiuju.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuqiuju.common.utils.StringUtil;

@Controller
public class TestController {

	@RequestMapping("testutil.do")
	@ResponseBody
	public int testutil(String test,String phone,String email){
		System.out.println("132456789123");
		if (StringUtil.isPhone(phone)) {
			return 1;
		}
		
		if (StringUtil.isEmail(email)) {
			return 1;
		} 
		return 0;
	}
}
