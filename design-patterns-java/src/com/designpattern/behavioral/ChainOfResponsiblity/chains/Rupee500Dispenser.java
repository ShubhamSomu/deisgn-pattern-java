package com.designpattern.behavioral.ChainOfResponsiblity.chains;

import com.designpattern.behavioral.ChainOfResponsiblity.model.Currency;
import com.designpattern.behavioral.ChainOfResponsiblity.model.DispenseChain;

public class Rupee500Dispenser implements DispenseChain {

	private DispenseChain dispenseChain;
	
	@Override
	public void setNextChain(DispenseChain dispenseChain) {
		this.dispenseChain = dispenseChain;
		
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 500) {
		
			int num = currency.getAmount() / 500 ;
			int remainder = currency.getAmount() % 500;
			System.out.println("Dispensing "+num+ " notes of 500 rupees");
			
			if(remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
		}
		else {
			this.dispenseChain.dispense(currency);
		}
		
		
	}

}
