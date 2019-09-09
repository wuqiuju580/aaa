package com.wuqiuju.commin.test;

import org.junit.Test;

import com.wuqiuju.common.utils.StringUtil;

public class FormTest {

	@Test
	public void test01(){
		boolean phone = StringUtil.isPhone("13235297654");
		System.out.println(phone);
	}
	@Test
	public void test02(){
		boolean email = StringUtil.isEmail("27583491@qq.com");
		System.out.println(email);
	}
}
