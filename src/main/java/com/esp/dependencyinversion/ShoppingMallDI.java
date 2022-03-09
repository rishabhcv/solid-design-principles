package com.esp.dependencyinversion;


//Dependency inversion principle helps us to write loosely coupled code.
// high level modules should not depend on low level modules; both should depend on abstractions.
//Abstractions should not depend on details. Details should depend upon abstractions.
//Here the ShoppingMall is tightly coupled to the DebitCard class
//What if we want to use a CreditCard to do the transaction?
//We will have to make a lot of changes due to the tight coupling.
//Solution? Abstraction.
public class ShoppingMallDI {

	IBankCard card;

	public ShoppingMallDI(IBankCard card) {
		super();
		this.card = card;
	}
	
	public void purchaseSomething() {
		card.doTransaction();
	}
	
	public static void main(String[] args) {
		
		//Runtime polymorphism
		IBankCard debitCard = new DebitCardDI();
		
		ShoppingMallDI mall= new ShoppingMallDI(debitCard);
		mall.purchaseSomething();
	}
}
