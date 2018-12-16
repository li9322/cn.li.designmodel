package com.li.abstractfactory.demo;

public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new MaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return new MaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new MaleWhiteHuman();
	}

}
