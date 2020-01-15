package com.designpattern.behavioral.ObserverPattern.impl;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.behavioral.ObserverPattern.model.Observer;
import com.designpattern.behavioral.ObserverPattern.model.Subject;

public class MyTopic implements Subject {

	private List<Observer> listOfObservers;
	private Object MUTEX = new Object();
	private boolean changed =false;
	private String message;
	
	@Override
	public void register(Observer observer) {

		if (observer == null)
			throw new NullPointerException("Observer Cannot be NULL");

		if (listOfObservers != null) {
			synchronized (MUTEX) {
				if (!listOfObservers.contains(observer))
					listOfObservers.add(observer);
			}
		} else {
			listOfObservers = new ArrayList<Observer>();
			synchronized (MUTEX) {
				listOfObservers.add(observer);
			}
		}

	}

	@Override
	public void unregister(Observer observer) {
		if (observer == null)
			throw new NullPointerException("Observer cannot be NULL");

		synchronized (MUTEX) {
			if (listOfObservers.contains(observer)) {
				listOfObservers.remove(observer);
			} else
				throw new NullPointerException("Observer is not registered");
		}

	}

	@Override
	public void notifyObservers() {
		List<Observer> observersToUpdate = null;
		
		synchronized(MUTEX){
			if(!changed) return;
			else {
					observersToUpdate = new ArrayList<Observer>(listOfObservers);
					this.changed = false;
			}
			
			observersToUpdate.stream().forEach(k -> k.update());
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
			return this.message;
	}
	
	//method to post message to the topic
		public void postMessage(String msg){
			System.out.println("Message Posted to Topic:"+msg);
			this.message=msg;
			this.changed=true;
			notifyObservers();
		}
}
