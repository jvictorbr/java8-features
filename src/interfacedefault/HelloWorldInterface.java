package interfacedefault;

public interface HelloWorldInterface {
	
	default String sayHello() {
		return "This is my default implementation of 'Say Hello'";
	}
	

}
