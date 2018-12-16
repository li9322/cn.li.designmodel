package com.li.abstractfactory.demo;

public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new FemaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return new FemaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new FemaleWhiteHuman();
	}

}
