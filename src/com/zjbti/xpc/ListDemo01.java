package com.zjbti.xpc;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lists=null;
		lists=new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("A");
		for(int i=0;i<lists.size();i++)
		{
			System.out.println(lists.get(i));
		}
		lists.remove(0);
		System.out.println("ɾ��֮�� - - - - - -");
		for(int i=0;i<lists.size();i++)
		{
			System.out.println(lists.get(i));
		}
		System.out.println("�����Ƿ�Ϊ�գ�"+lists.isEmpty());
		System.out.println("B�Ƿ����:"+lists.indexOf("A"));
	}

}
