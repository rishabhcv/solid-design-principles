package com.esp.interfacesegregation;

public interface IUPIPaymentsCommon {

	//These methods are common to all the classes, so separated out
	public void payMoney(int accountId);
	
	public void getScratchCard();

}
