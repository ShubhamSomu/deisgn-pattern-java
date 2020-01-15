package com.designpattern.behavioral.templatemethod;
/**
 * 
 * @author java-supadhay
 * used when we want abstraction but also serial steps
 * so parent is final such that they run in a serially
 */
public class TemplateMethodRunner {
	public static void main(String[] args) {
		HouseTemplate ht1 = new GlassWindowHouse();
		ht1.buildHouse();
		
		
		HouseTemplate ht2 = new WoodenHouseTemplate();
		ht2.buildHouse();
	}

}
