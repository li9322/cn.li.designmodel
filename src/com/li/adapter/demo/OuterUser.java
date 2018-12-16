package com.li.adapter.demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap=new HashMap<>();
		baseInfoMap.put("userName", "���Ա���л���ħ��...");
		baseInfoMap.put("mobileNumber", "���Ա���ĵ绰��...");
		return baseInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap=new HashMap<>();
		officeInfoMap.put("jobPosition", "���Ա����ְλ��BOSS...");
		officeInfoMap.put("officeNumber", "Ա���칫�ҵĵ绰��...");
		return officeInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap=new HashMap<>();
		homeInfoMap.put("homeTelNumber", "Ա���ļ�ͥ�绰��...");
		homeInfoMap.put("homeAdress", "Ա���ļ�ͥסַ��...");
		return homeInfoMap;
	}

}
