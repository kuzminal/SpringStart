package com.example.HelloWorld;

public class HelloWorldDecoupled {
	public static void main(String[] args) {
		MessageRenderer mr = MessageSupportFactory.getinstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getinstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}
}
