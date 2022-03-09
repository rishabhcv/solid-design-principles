package com.esp.liskov;

public class Whatsapp extends SocialMedia {

	@Override
	public void publishPost(String post) {
		// THIS METHOD IS NOT APPLICABLE TO WHATSAPP
		//throw NotImplemetedException()
	    //because of this, this child class WHATSAPP is not substitutable for the super class Social Media
		//Solution? Create an interface and separate out the logic which is common to all
	}

	@Override
	public void chatWithFriends(int friendId, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void videoCall(int friendId) {
		// TODO Auto-generated method stub
		
	}

}
