package com.zjbti.xpc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>lists= new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("C");
		lists.add("D");
		lists.add("E");
		lists.add("F");
		Iterator<String> iter=lists.iterator();
		while(iter.hasNext())
		{
			//lists.remove(2);�ڵ��������ͬʱ���ܶԼ��Ͻ���ɾ��Ԫ�ء�
			System.out.println(iter.next());
		}
	}
}
