package com.li.adapter.demo3;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap=new HashMap<>();
		baseInfoMap.put("userName", "���Ա���л���ħ��...");
		baseInfoMap.put("mobileNumber", "���Ա���ĵ绰��...");
		return baseInfoMap;
	}

}
