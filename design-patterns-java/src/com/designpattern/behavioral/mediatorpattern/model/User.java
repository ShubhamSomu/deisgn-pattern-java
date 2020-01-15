package com.designpattern.behavioral.mediatorpattern.model;

/**
 * 
 * @author java-supadhay
 * just a abstract of what user can do
 */
public abstract class User {

	protected ChatMediatorQueue chatMediatorQueue;
	protected String name;
	public User(ChatMediatorQueue chatMediatorQueue, String name) {
		this.chatMediatorQueue = chatMediatorQueue;
		this.name = name;
	}
	
	
	public abstract void send(String message);
	public abstract void receive(String message);
}
