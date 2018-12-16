package com.li.adapter.demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap=new HashMap<>();
		baseInfoMap.put("userName", "这个员工叫混世魔王...");
		baseInfoMap.put("mobileNumber", "这个员工的电话是...");
		return baseInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap=new HashMap<>();
		officeInfoMap.put("jobPosition", "这个员工的职位是BOSS...");
		officeInfoMap.put("officeNumber", "员工办公室的电话是...");
		return officeInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap=new HashMap<>();
		homeInfoMap.put("homeTelNumber", "员工的家庭电话是...");
		homeInfoMap.put("homeAdress", "员工的家庭住址是...");
		return homeInfoMap;
	}

}
