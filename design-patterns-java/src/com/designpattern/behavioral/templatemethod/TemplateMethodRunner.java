package com.designpattern.behavioral.templatemethod;

public class TemplateMethodRunner {
	public static void main(String[] args) {
		HouseTemplate ht1 = new GlassWindowHouse();
		ht1.buildHouse();
		
		
		HouseTemplate ht2 = new WoodenHouseTemplate();
		ht2.buildHouse();
	}

}
