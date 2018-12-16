package com.li.adapter.demo2;

public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomething();
	}

}
