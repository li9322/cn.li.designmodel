package com.li.abstractfactory.demo;

public class NvWa {

	public static void main(String[] args) {
		HumanFactory maleHumanFactory=new MaleFactory();
		HumanFactory femaleHumanFactory=new FemaleFactory();
		
		Human maleYelloHumman=maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman=femaleHumanFactory.createYellowHuman();
		System.out.println("---生产第一个黄色女性---");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		System.out.println("---生产第一个黄色男性---");
		maleYelloHumman.getColor();
		maleYelloHumman.talk();
		maleYelloHumman.getSex();
	}

}
