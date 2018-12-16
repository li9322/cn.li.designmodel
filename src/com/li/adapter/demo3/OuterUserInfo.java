package com.li.adapter.demo3;

import java.util.Map;

import com.li.adapter.demo.IUserInfo;

public class OuterUserInfo implements IUserInfo {
	//ԴĿ�����
	private IOuterUserBaseInfo baseInfo=null;
	private IOuterUserHomeInfo homeInfo=null;
	private IOuterUserOfficeInfo officeInfo=null;
	//���ݴ���
	private  Map baseMap=null;
	private  Map homeMap=null;
	private  Map officeMap=null;
	
	public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, 
			IOuterUserOfficeInfo officeInfo) {
		super();
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;
		
		this.baseMap = this.baseInfo.getUserBaseInfo();
		this.homeMap = this.homeInfo.getUserHomeInfo();
		this.officeMap = this.officeInfo.getUserOfficeInfo();
	}

	@Override
	public String getUsername() {
		String userName=(String) (this.baseMap).get("userName");
		System.out.println(userName);
		return userName;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress=(String) this.homeMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String mobileNumber=(String) this.baseMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber=(String) this.officeMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	@Override
	public String getJobPosition() {
		String jobPosition=(String) this.officeMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	@Override
	public String getHomeTelNumber() {
		String homeTelNumber=(String) this.homeMap.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

}
