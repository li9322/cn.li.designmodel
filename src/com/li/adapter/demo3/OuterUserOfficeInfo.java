package com.li.adapter.demo3;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap=new HashMap<>();
		officeInfoMap.put("jobPosition", "���Ա����ְλ��BOSS...");
		officeInfoMap.put("officeNumber", "Ա���칫�ҵĵ绰��...");
		return officeInfoMap;
	}


}
