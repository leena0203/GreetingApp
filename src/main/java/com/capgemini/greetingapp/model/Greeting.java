package com.capgemini.greetingapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Greetings")
public class Greeting {
	@Id
	public long greetingId;
	public String greetingMsg;

	public Greeting() {

	}

	public Greeting(long incrementAndGet, String template) {
		greetingId = incrementAndGet;
		greetingMsg = template;
	}

	public long getGreetingId() {
		return greetingId;
	}

	public void setGreetingId(long greetingId) {
		this.greetingId = greetingId;
	}

	public String getGreetingMsg() {
		return greetingMsg;
	}

	public void setGreetingMsg(String greetingMsg) {
		this.greetingMsg = greetingMsg;
	}
}
