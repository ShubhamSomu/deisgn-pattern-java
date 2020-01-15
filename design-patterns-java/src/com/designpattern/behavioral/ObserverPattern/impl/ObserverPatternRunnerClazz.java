package com.designpattern.behavioral.ObserverPattern.impl;

import com.designpattern.behavioral.ObserverPattern.model.Observer;
import com.designpattern.behavioral.ObserverPattern.topicsubscribers.MyTopicSubscriber;

public class ObserverPatternRunnerClazz {
	public static void main(String[] args) {
		MyTopic topic = new MyTopic();
		
		Observer ob1 = new MyTopicSubscriber("Observer 1");
		Observer ob2 = new MyTopicSubscriber("Observer 2");
		Observer ob3 = new MyTopicSubscriber("Observer 3");
		
		Observer ob4 = new MyTopicSubscriber("Observer 4");
		Observer ob5 = new MyTopicSubscriber("Observer 5");
		
		topic.register(ob1);
		topic.register(ob2);
		topic.register(ob3);
		topic.register(ob4);
		topic.register(ob5);
		
		ob1.setSubject(topic);
		ob2.setSubject(topic);
		ob3.setSubject(topic);
		ob4.setSubject(topic);
		ob5.setSubject(topic);
		
		
		ob1.update();
		topic.postMessage("Hey ya'all");
	}
}
