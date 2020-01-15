package com.designpattern.behavioral.ObserverPattern.topicsubscribers;

import com.designpattern.behavioral.ObserverPattern.model.Observer;
import com.designpattern.behavioral.ObserverPattern.model.Subject;

public class MyTopicSubscriber implements Observer{

	private String name;
	private Subject subject; 
	
	public MyTopicSubscriber(String name){
		this.name = name;
	}
	
	@Override
	public void update() {
		String update = (String) subject.getUpdate(this);
		if(update==null) System.out.println(name +" No new message present");
		else System.out.println(name+" Consuming message "+update);
	}

	@Override
	public void setSubject(Subject sub) {
		// TODO Auto-generated method stub // subscribing on this subject
		this.subject = sub;
	}

}
