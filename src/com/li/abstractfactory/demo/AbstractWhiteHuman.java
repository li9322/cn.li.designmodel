package com.li.abstractfactory.demo;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ�ģ�");
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ��ǵ��ֽڡ�");
	}
}
