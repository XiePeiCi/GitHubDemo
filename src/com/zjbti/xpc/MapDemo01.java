package com.zjbti.xpc;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("key1","zjbti_xpc");
		map.put("key2","0.0zjbti_xpc");
		map.put("key3","2.2zjbti_xpc");
		map.put("key4","3.3zjbti_xpc");
		map.put("key5","5.5zjbti_xpc");
		map.put("key6","8.8zjbti_xpc");
		System.out.println();
		String str=map.get("key1");
		System.out.println(str);
	}

}
