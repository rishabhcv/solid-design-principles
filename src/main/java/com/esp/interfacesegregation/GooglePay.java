package com.esp.interfacesegregation;

public class GooglePay implements IUPIPayments {

	@Override
	public void payMoney(int accountId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getScratchCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCashback() {
		//Gpay doesn't support this feature of the interface IUPIPayments. This violates the interface segregation principle
		//Solution? Segregate the interfaces!!

	}

}
