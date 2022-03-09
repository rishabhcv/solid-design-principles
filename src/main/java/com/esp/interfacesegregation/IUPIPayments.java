package com.esp.interfacesegregation;


//Clients should not be forced to depend upon interfaces that they do not use.
//The goal of this principle is to reduce the side effects of using larger interfaces
//by breaking application interfaces into smaller ones
public interface IUPIPayments {

	public void payMoney(int accountId);
	
	public void getScratchCard();
	
	public void getCashback();
}
