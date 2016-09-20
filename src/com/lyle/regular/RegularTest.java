package com.lyle.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTest {

	public static void main(String[] args) {
		//目标字符串
		String target = "18512541254";
		//正则规则
		String pattern = "1[358][0-9]\\d{8}";
			
		//create Pattern Object
		Pattern p = Pattern.compile(pattern);
		//create Matcher Object
		Matcher m = p.matcher(target);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
