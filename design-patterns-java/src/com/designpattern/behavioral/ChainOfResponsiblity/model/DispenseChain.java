package com.designpattern.behavioral.ChainOfResponsiblity.model;

public interface DispenseChain {
	void setNextChain(DispenseChain dispenseChain);
	void dispense(Currency currency);
}
