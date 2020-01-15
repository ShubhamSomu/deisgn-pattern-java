package com.designpattern.behavioral.mediatorpattern.impl;

import com.designpattern.behavioral.mediatorpattern.model.ChatMediatorQueue;
import com.designpattern.behavioral.mediatorpattern.model.User;
/**
 * JMS, Executor execute(), schedule()
 * @author java-supadhay
 *
 */
public class MediatorPatterRunnerClazz {

	public static void main(String [] args) {
		ChatMediatorQueue chatMediatorQueue = new ChatMediatorImpl();
		User user = new UserImpl(chatMediatorQueue, "Shubham");
		User user2 = new UserImpl(chatMediatorQueue, "Harish");
		User user3 = new UserImpl(chatMediatorQueue,"Manish");
		User userHR = new UserImpl (chatMediatorQueue,"Richa");
		
		chatMediatorQueue.addUserToChat(user);
		chatMediatorQueue.addUserToChat(user2);
		chatMediatorQueue.addUserToChat(user3);
		chatMediatorQueue.addUserToChat(userHR);
		
		userHR.send("Hi, Freshers!! notice: you all are fired!!");
	}
}
