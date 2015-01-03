package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class Lambdas {
	
	public static void main(String[] args) throws Exception { 
		
		/* inferred type */
		Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
		
		/* declared type */
		Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e));
		
		/* command block */
		Arrays.asList("a", "b", "d").forEach(e -> { 
			System.out.print(e);
			System.out.print("\r\n");
		});
		
		/* multiple params with implicit return */		
		final List<String> list1 = Arrays.asList("b", "d", "a"); 
		list1.sort((e1, e2) -> e1.compareTo(e2));
		System.out.println(list1);
		
		/* multiple params with explicit return */
		final List<String> list2= Arrays.asList("b", "d", "a");
		list2.sort((e1,e2) -> {
			int result = e1.compareTo(e2);
			return result;
		});
		System.out.println(list2);
		
		
		/* old style callable*/
		Callable<String> oldStyleCallable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Callable says Hello!";
			}
		};
		System.out.println(oldStyleCallable.call());		
		
		/* callable functional interface example */
		Callable<String> callable = () -> "Callable says Hello!";
		System.out.println(callable.call());
		
		
		
		
		
	}

}
