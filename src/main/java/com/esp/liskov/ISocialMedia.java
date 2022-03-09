package com.esp.liskov;

public interface ISocialMedia {

	public void chatWithFriends(int friendId, String message);
	
	public void videoCall(int friendId);
}
