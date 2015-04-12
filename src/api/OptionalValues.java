package api;

import java.util.Optional;

public class OptionalValues {
	
	public static void main(String[] args) {
		
		Optional<String> opt = Optional.ofNullable("Minha string");
		System.out.println(opt);
		System.out.println(opt.isPresent());
				
		Optional<String> opt2 = Optional.ofNullable(null);
		System.out.println(opt2);
		System.out.println(opt2.isPresent());		
				
		System.out.println(Optional.ofNullable("Minha String").orElse("Input is Null"));
		System.out.println(Optional.ofNullable(null).orElse("Input is Null"));
		
		System.out.println(Optional.ofNullable("Minha String").orElseGet(() -> "Input is Null"));
		System.out.println(Optional.ofNullable(null).orElseGet(() -> "Input is Null"));
		
		System.out.println(Optional.of("Minha String").map(s -> "String eh: " + s + "!"));
		System.out.println(Optional.of("Minha String").filter(s-> "Minha String".equals(s)).orElse("Doesn't match"));
		System.out.println(Optional.of("Minha String").filter(s-> "Minha String2".equals(s)).orElse("Doesn't match"));
				
	}
	

}
