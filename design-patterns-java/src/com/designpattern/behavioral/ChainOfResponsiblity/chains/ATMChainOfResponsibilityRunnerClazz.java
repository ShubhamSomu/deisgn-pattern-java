package com.designpattern.behavioral.ChainOfResponsiblity.chains;

import java.util.Scanner;

import com.designpattern.behavioral.ChainOfResponsiblity.model.Currency;
import com.designpattern.behavioral.ChainOfResponsiblity.model.DispenseChain;
/**
 * javax filter , java util logging log uses them
 * @author java-supadhay
 *
 */
public class ATMChainOfResponsibilityRunnerClazz {
// This is same as a ATM interface
	
	private DispenseChain initialDispenseChain;
	
	public ATMChainOfResponsibilityRunnerClazz() {
		 this.initialDispenseChain = new Rupee2000Dispenser();
		 DispenseChain chain2 = new Rupee500Dispenser();
		 DispenseChain chain3 = new Rupee100Dispenser();
		 
		 initialDispenseChain.setNextChain(chain2);
		 chain2.setNextChain(chain3);
	}
	public static void main(String [] args) {
		
		while(true) {
			int amount;
			System.out.println("Enter amount. \n");
			Scanner scanner = new Scanner(System.in);
			amount = scanner.nextInt();
			
			if(amount%100!=0) { 
				System.out.println("Amount should be a multiple of 100. "); 
				scanner.close();
				return;
			}
			ATMChainOfResponsibilityRunnerClazz atmChainOfResponsibilityRunnerClazz = 
					new ATMChainOfResponsibilityRunnerClazz();
			
			atmChainOfResponsibilityRunnerClazz.initialDispenseChain.dispense(new Currency(amount));
			//scanner.close();
		}
	}
}
