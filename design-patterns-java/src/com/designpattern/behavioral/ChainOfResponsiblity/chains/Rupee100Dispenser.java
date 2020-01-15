package com.designpattern.behavioral.ChainOfResponsiblity.chains;

import com.designpattern.behavioral.ChainOfResponsiblity.model.Currency;
import com.designpattern.behavioral.ChainOfResponsiblity.model.DispenseChain;

public class Rupee100Dispenser implements DispenseChain {

	private DispenseChain dispenseChain;
	
	@Override
	public void setNextChain(DispenseChain dispenseChain) {
		this.dispenseChain = dispenseChain;
		
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 100) {
		
			int num = currency.getAmount() / 100 ;
			int remainder = currency.getAmount() % 100;
			System.out.println("Dispensing "+num+ " notes of 100 rupees");
			
			if(remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
		}
		else {
			this.dispenseChain.dispense(currency);
		}
		
		
	}

}
