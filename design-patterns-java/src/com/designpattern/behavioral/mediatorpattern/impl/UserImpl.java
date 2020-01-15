package com.designpattern.behavioral.mediatorpattern.impl;

import com.designpattern.behavioral.mediatorpattern.model.ChatMediatorQueue;
import com.designpattern.behavioral.mediatorpattern.model.User;

public class UserImpl extends User{

	public UserImpl(ChatMediatorQueue chatMediatorQueue, String name) {
		super(chatMediatorQueue, name);
	}

	@Override
	public void send(String message) {
		System.out.println(super.name+" Sendin messages to all!!!");
		super.chatMediatorQueue.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(super.name+" Received message :- "+message);
		
	}

}
