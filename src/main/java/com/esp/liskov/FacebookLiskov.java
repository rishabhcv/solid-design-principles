package com.esp.liskov;


//This class follows the Liskov's substitution principle as this is substitutable for the base classes/interfaces
public class FacebookLiskov implements ISocialMedia, ISupportPosts {

	@Override
	public void publishPost(String post) {
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
