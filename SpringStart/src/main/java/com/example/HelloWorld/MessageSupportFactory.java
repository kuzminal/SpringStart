package com.example.HelloWorld;
import java.util.Properties;
import java.io.FileInputStream;

public class MessageSupportFactory {
	private static MessageSupportFactory instance;
	private Properties props;
	private MessageRenderer renderer; 
	private MessageProvider provider;
	
	private MessageSupportFactory() {
	    props = new Properties();
	    try {
	    	props.load(new FileInputStream(
	    	"com/apress/prospring4/ch2/msf.properties"));
	    	String rendererClass = props.getProperty("renderer.class"); String providerClass = props.getProperty("provider.class");
	    	renderer = (MessageRenderer)
	    	Class.forName(rendererClass).newInstance(); provider = (MessageProvider)
	    	Class.forName(providerClass).newInstance();
	    }catch (Exception ex) {
	    	ex.printStackTrace();
	    }
	}
	
	static {
	instance = new MessageSupportFactory();
	}
	
	public static MessageSupportFactory getinstance() {return instance;}
	public MessageRenderer getMessageRenderer() {return renderer;}
	public MessageProvider getMessageProvider() {return provider;}

}
