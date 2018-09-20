package com.stackroute.socketpoc.domain;

public class GreetingMessage {

	private String content;

	public GreetingMessage() {
		super();
	}

	public GreetingMessage(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
