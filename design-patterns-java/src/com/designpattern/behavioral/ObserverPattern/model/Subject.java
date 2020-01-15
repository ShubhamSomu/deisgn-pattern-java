package com.designpattern.behavioral.ObserverPattern.model;

public interface Subject {
	void register(Observer observer);
	void unregister(Observer observer);
	
	public void notifyObservers();
	public Object getUpdate(Observer obj);
}
