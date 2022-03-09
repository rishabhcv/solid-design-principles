package com.esp.liskov;

//Derived classed must be completely substitutable for their base classes
//Liskov Substitution Principle in practical software development. 
//The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
public abstract class SocialMedia {

	 public abstract void publishPost(String post);
	 
	 public abstract void chatWithFriends(int friendId, String message);
	 
	 public abstract void videoCall(int friendId);
}
