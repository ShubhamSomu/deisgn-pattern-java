package com.designpattern.behavioral.templatemethod;

public abstract class HouseTemplate {
	
	public final void buildHouse() {
		layFoudation();
		makePillars();
		buildWindows();
		buildRoof();
		System.out.println("***************House is built************************");
	}

	protected abstract void buildWindows();
	
	protected void buildRoof() {
		// TODO Auto-generated method stub
		System.out.println("building roof");
	}
	
	protected void makePillars() {
		// TODO Auto-generated method stub
		System.out.println("making pillars");
	}

	private void layFoudation() {
		System.out.println("Laying foundation");
		
	}
}
