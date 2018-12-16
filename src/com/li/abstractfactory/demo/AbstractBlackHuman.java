package com.li.abstractfactory.demo;

public abstract class AbstractBlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑人的皮肤是黑色的！");
	}

	@Override
	public void talk() {
		System.out.println("黑人会说话，一般人听不懂。");
	}
}
