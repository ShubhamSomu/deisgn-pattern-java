package com.designpattern.behavioral.templatemethod;

public  class WoodenHouseTemplate extends HouseTemplate{

	@Override
	protected void buildRoof() {
		// TODO Auto-generated method stub
		System.out.println("building wooden roof");
	}

	@Override
	protected void buildWindows() {
		// TODO Auto-generated method stub
		System.out.println("building Wooden windows");
	}

	@Override
	protected void makePillars() {
		// TODO Auto-generated method stub
		System.out.println("making wood pillars");
	}

}
