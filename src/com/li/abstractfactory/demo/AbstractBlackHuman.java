package com.li.abstractfactory.demo;

public abstract class AbstractBlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("���˵�Ƥ���Ǻ�ɫ�ģ�");
	}

	@Override
	public void talk() {
		System.out.println("���˻�˵����һ������������");
	}
}
