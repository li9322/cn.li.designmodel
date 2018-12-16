package com.li.adapter.demo3;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap=new HashMap<>();
		officeInfoMap.put("jobPosition", "这个员工的职位是BOSS...");
		officeInfoMap.put("officeNumber", "员工办公室的电话是...");
		return officeInfoMap;
	}


}
