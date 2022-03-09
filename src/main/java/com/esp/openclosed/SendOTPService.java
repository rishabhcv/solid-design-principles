package com.esp.openclosed;


//Classes/Functions should be open to extension but closed to modification
//Why Open-Closed? Change to one of your classes also requires you to adapt all depending classes
//Solution? Use interfaces! Don't extend from this class. 

public class SendOTPService{

	public void sendOTPOnPhone(int accountId, int phone) {
		//
	}
	
	public void sendOTPOnEmail(int accountId, String emailId) {
		//
	}
	
	//This method should not be added here as the class should be closed to changes.
	/*
	 * public void sendOTPOnWhatsapp(int accountId, int phone) { // }
	 */
}
