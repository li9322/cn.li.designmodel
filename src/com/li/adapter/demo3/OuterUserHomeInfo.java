package com.li.adapter.demo3;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	
	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap=new HashMap<>();
		homeInfoMap.put("homeTelNumber", "Ա���ļ�ͥ�绰��...");
		homeInfoMap.put("homeAdress", "Ա���ļ�ͥסַ��...");
		return homeInfoMap;	}

}
