package com.designpattern.behavioral.ChainOfResponsiblity.chains;

import com.designpattern.behavioral.ChainOfResponsiblity.model.Currency;
import com.designpattern.behavioral.ChainOfResponsiblity.model.DispenseChain;

public class Rupee2000Dispenser implements DispenseChain{

	private DispenseChain dispenseChain;
	@Override
	public void setNextChain(DispenseChain nextDispenseChain) {
		this.dispenseChain = nextDispenseChain;
		
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 2000) {
			/**
				if this chain can hande this then
				handle else give responsiblity to next chain
		**/
			int num = currency.getAmount() /2000;
			int remainder = currency.getAmount() % 2000;
			System.out.println("Dispensing "+num+ " notes of 2000 rupees");
			/**
			 * this chain has done work now move to next chain
			 */
			if(remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
		}
		else {
			this.dispenseChain.dispense(currency);
		}
		
	}

}
