package com.designpattern.behavioral.mediatorpattern.impl;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.behavioral.mediatorpattern.model.ChatMediatorQueue;
import com.designpattern.behavioral.mediatorpattern.model.User;

public class ChatMediatorImpl implements ChatMediatorQueue{

	private List<User> userList;
	
	public ChatMediatorImpl(){
		this.userList = new ArrayList<User>();
	}
	@Override
	public void sendMessage(String msg, User user) {
		userList.stream().forEach(u -> {
			if(user!= u) u.receive(msg);
		});
		
	}

	@Override
	public void addUserToChat(User user) {
		if(user!=null)
		userList.add(user);
	}

}
