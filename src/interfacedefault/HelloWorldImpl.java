package interfacedefault;

public class HelloWorldImpl {
	
	static class HelloWorldImpl1 implements HelloWorldInterface { 
		
	}
	
	static class HelloWorldImpl2 implements HelloWorldInterface { 
		
		@Override
		public String sayHello() { 
			return "Tailor-made say hello";
		}
		
	}
	
	public static void main(String[] args) { 
		
		HelloWorldInterface hello1 = new HelloWorldImpl1();
		System.out.println(hello1.sayHello());
		
		HelloWorldInterface hello2 = new HelloWorldImpl2();
		System.out.println(hello2.sayHello());
				
	}
	

}
