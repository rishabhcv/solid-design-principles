package com.esp.singlresp;


//Too many responsibilities have been assigned to a single class
//This violates the Single Responsibility Principle
//It makes sense to have the sendOTP responsibility in a a separate class and printing functionality in another class
//Solution? Separate the logic in separate classes
public class BankService {

	public void deposit(double amount) {
		//
	}
	
	public void withdraw(double amount) {
		//
	}
	
	
	//Moved to PrinterService class
	/*
	 * public void printPassbook(int accountId) { // }
	 * 
	 * public void printMiniStatement(int accountId) { // }
	 */
	
	//Moved to SendOTPService class
	/*
	 * public void sendOTPOnPhone(int accountId, int phone) { // }
	 * 
	 * public void sendOTPOnEmail(int accountId, String emailId) { // }
	 */
}
