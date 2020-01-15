package com.designpattern.behavioral.mediatorpattern.model;

public interface ChatMediatorQueue {
	public void sendMessage(String msg, User user);
	void addUserToChat(User user);
}
