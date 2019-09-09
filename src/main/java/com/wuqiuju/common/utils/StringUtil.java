package com.wuqiuju.common.utils;

public class StringUtil {

	public static String toHtml(String text){
		return text;
		/*String replaceAll = text.replaceAll("\\\\n\\\\r", "<p><p>");
		String replaceAll =text.replaceAll("\\\\r", "<b>");*/
		}
	//电话号
	public static boolean isPhone(String phone){
		return phone.matches("^1[3|5|7|8|9]\\d{9}$");
		
	}
	//邮箱
	public static boolean isEmail(String email){
		return email.matches("\\w+@+\\w+(com.cm)");
		
	}
	//内容不能为空
	public static boolean hasText(String str){
		if (str==null && "null".equals(str) && "".equals(str.trim())) {
			return true;
		}
		return false;
	}

}
